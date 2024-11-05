import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyStackSequel<String> strings = new MyStackSequel<>();
        Scanner input = new Scanner(System.in);

        System.out.println("--- Enter 5 words or sentences ---");
        for (int i = 0; i < 5; i++) strings.push(input.nextLine());

        while(!strings.isEmpty()) {
            System.out.println(strings.pop());
        }
        // ---------------------------------------
        MyStack<String> stringsNew = new MyStack<>();
        for (int i = 0; i < 5; i++) stringsNew.push(String.valueOf(i));

        MyStack<String> stringsClone = stringsNew.clone();
        System.out.println("--- (m 0_0)m ---");

        while(!stringsClone.isEmpty()) {
            System.out.println(stringsClone.pop());
        }
    }
}
