package BasicProgram;
import java.util.Scanner;

public class WhileT {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            while (true) {
                System.out.print("Do you want to print? (Yes/No): ");
                String answer = input.nextLine();

                if (answer.equalsIgnoreCase("Yes")) {
                    System.out.println("Printing new...");
                    System.out.println("This is the end of line.");
                } else {
                    System.out.println("Let it be. Ending program.");
                    break;
                }
            }

            input.close();
        }
    }


