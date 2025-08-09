package BasicProgram;

import java.util.Scanner;

public class WhileT1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Do you want to add 3 numbers ? (Yes/No): ");
            String answer = input.nextLine();

            if (answer.equalsIgnoreCase("Yes")) {
                System.out.println("Enter 1");
                int n1 = input.nextInt();
                System.out.println("Enter 2");
                int n2 = input.nextInt();
                System.out.println("Enter 3");
                int n3 = input.nextInt();
                System.out.println("The result of 3 numbers is : "+(n1+n2+n3));
            } else {
                System.out.println("Let it be. Ending program.");
                break;
            }
        }

        input.close();
    }
}
