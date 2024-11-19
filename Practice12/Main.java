import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Var1
        Scanner input = new Scanner(System.in);
        AppSettings settings;
        settings = AppSettings.getInstance();

        String key = "", value = "";
        System.out.println("Enter 'lang' to edit your language\n" +
                "Enter 'theme' to edit your theme\n" +
                "Enter 'fileName' to edit your file name\n");
        key = input.nextLine();
        System.out.println("Enter new data for your chosen setting\n");
        value = input.nextLine();

        AppSettings.setSetting(key,value);
        System.out.println("Enter what setting you want to retrieve\nlang\ntheme\nfileName");
        key = input.nextLine();
        System.out.println(AppSettings.getSetting(key));
    }
}
