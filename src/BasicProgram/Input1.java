package BasicProgram;

import java.util.Scanner;
public class Input1 {
        public static void main(String[] args) {
            System.out.println("Basic input program to add two numbers");

            Scanner input = new Scanner(System.in);

            while (true) {
                System.out.println("Do you want to add?");
                String G = input.nextLine();

                if (G.equalsIgnoreCase("Yes")) {
                    System.out.println("Let's begin this");

                    System.out.print("Enter the first number: ");
                    int num1 = input.nextInt();

                    System.out.print("Enter the second number: ");
                    int num2 = input.nextInt();

                    int result = num1 + num2;
                    System.out.println("The sum of two numbers is: " + result);

                    // Clear newline left by nextInt()
                    input.nextLine();

                    System.out.println("Do you want to add more numbers?");
                    String F = input.nextLine();
                    if (!F.equalsIgnoreCase("Yes")) {
                        System.out.println("Okay, ending the program.");
                        break;
                    }

                } else {
                    System.out.println("Let it be. Exiting the program.");
                    break;
                }
            }

            input.close();
        }
    }


