import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask for a string input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Ask for a number input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Display the input back to the user
        System.out.println("Hello " + name + ", you are " + age + " years old!");

        // Always close the scanner
        scanner.close();
    }
}

