package main.java.internship.BasicProgram;

import java.util.Scanner;
public class Perfect3 {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            while (true) {
                System.out.print("Do you want to add 3 numbers? (Yes/No): ");
                String answer = input.nextLine();

                if (answer.equalsIgnoreCase("Yes")) {
                    System.out.print("Enter 1: ");
                    int n1 = input.nextInt();

                    System.out.print("Enter 2: ");
                    int n2 = input.nextInt();

                    System.out.print("Enter 3: ");
                    int n3 = input.nextInt();

                    int result = n1 + n2 + n3;
                    System.out.println("The result of 3 numbers is: " + result);

                    input.nextLine(); // Clear the newline left by nextInt()
                } else {
                    System.out.println("Let it be. Ending program.");
                    break;
                }
            }

            input.close();
        }
    }


