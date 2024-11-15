import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random(); // for randomness

        StackOnQueue<Integer> intStack = new StackOnQueue<>();

        // creating 2 random numbers and pushing them into our stack
        intStack.push(rand.nextInt(64));
        intStack.push(rand.nextInt(64));

        // checking the first element, then checking + deleting the first element
        System.out.println("First element is: " + intStack.top());
        System.out.println("Deleting first element: " + intStack.pop());

        // checking for stacks emptiness
        if (intStack.empty()) System.out.println("\nStack is empty!\n");
        else System.out.println("\nStack isn't empty!\n");

        // printing the stack
        System.out.println("Data stored in stack: " + intStack.toString());
    }
}
