package BasicProgram;

import java.util.Scanner;

public class InputUsage {
    public static void main(String[] args) {
        System.out.println("Basic input program to add two numbers");

        Scanner input = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter the first number: ");
            int num1 = input.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = input.nextInt();

            int result = num1 + num2;
            System.out.println("The sum of two numbers is: " + result);

            // Clear the leftover newline from nextInt()
            input.nextLine();

            System.out.print("Do you want to add more numbers? (Yes/No): ");
            choice = input.nextLine();

        } while (choice.equalsIgnoreCase("Yes"));

        System.out.println("Program ended.");
        input.close();
    }
}
