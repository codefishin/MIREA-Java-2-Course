import java.io.*;
import java.net.*;
import java.util.*;
public class Server {
    private static final int PORT = 2626;
    // main
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT))
        {
            System.out.println("HTTP Server запущен на порту " + PORT);
            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    handleClient(clientSocket);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка запуска сервера: " +
                    e.getMessage());
        }
    }
    // functions
    private static void sendHttpResponse(PrintWriter out, int statusCode, String body) {
        out.println("HTTP/1.1 " + statusCode + " OK");
        out.println("Content-Type: text/html");
        out.println("Content-Length: " + body.length());
        out.println();
        out.println(body);
    }
    private static Map<String, String> queryToMap(String query) {
        Map<String, String> queryParams = new HashMap<>();
        if (query != null) {
            String[] pairs = query.split("&");
            for (String pair : pairs) {
                String[] keyValue = pair.split("=");
                if (keyValue.length > 1) {
                    queryParams.put(keyValue[0], keyValue[1]);
                }
            }
        }
        return queryParams;
    }
    private static void handleClient(Socket clientSocket) throws IOException {
        BufferedReader in = new BufferedReader
                (new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out =
                new PrintWriter(clientSocket.getOutputStream());
        String line = in.readLine();

        if (line == null) {
            System.err.println("line null");
            return;
        }

        String[] requestParts = line.split(" ");
        String method = requestParts[0];
        String query = requestParts[1];
        StringBuilder queryTemp = new StringBuilder().append(query);
        StringBuilder pageURL = new StringBuilder();
        for (int i = 0; i < query.length(); i++) {
            char currentChar = query.charAt(i);
            if (currentChar == '?') {
                break;
            }
            queryTemp.delete(0,1);
            pageURL.append(currentChar);
        }
        queryTemp.delete(0,1);
        Map <String, String> data = queryToMap(queryTemp.toString());
        if (method.equals("GET") && pageURL.toString().equals("/convert")) {
            if (data.get("from") == null
                    || data.get("to") == null ||
                    data.get("value") == null) {
                handleBadInput(out);
                System.err.println("400 error");
            } else {
                String from = data.get("from");
                String to = data.get("to");
                String valueStr = data.get("value");
                double value = Double.parseDouble(valueStr);
                System.out.println(from + to + value);
                handleGetConvert(out, from, to, value);
            }
        } else {
            System.err.println("404 path is " + query);
            handleNotFound(out);
        }
        out.flush();
    }
    private static void handleGetConvert
            (PrintWriter out, String from, String to, double value) {
        double valueRes = 0;
        if (from.equals("meters") && to.equals("kilometers")) {
            valueRes = value / 1000;
        } else {
            System.err.println("400 error");
            handleBadInput(out);
            return;
        }
        System.out.println("Values: " + value + " " + valueRes);
        String response = "<html><body><h1>Converting</h1><ul>" +
                value + " meters is equal to " +
                valueRes +
                " kilometers";
        sendHttpResponse(out, 200, response);

    }
    private static void handleBadInput(PrintWriter out) {
        sendHttpResponse(out, 400, "<html><body><h1 style=\"background-color:Tomato;\">bro wrong format ;-;</h1>" +
        "check if your url is equal to: /convert?value=(your value here)&from=meters&to=kilometers; handleBadInput activated!!!</body></html>");
    }
    private static void handleNotFound(PrintWriter out) {
        sendHttpResponse(out, 404,
                "<html><body><h1>lol its a 404!!!!!!!!</h1>" +
                        "handleNotFound activated!!!</body></html>");
    }
    /*private static void sendHttpRedirect(PrintWriter out, String location) {
        out.println("HTTP/1.1 302 Found");
        out.println("Location: " + location);
        out.println("Content-Length: 0");
        out.println();
        // never used
    }*/
}
