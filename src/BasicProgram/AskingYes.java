package BasicProgram;
import java.util.Scanner;
public class AskingYes {
    public static void main(String[] args) {
        Scanner Take = new Scanner(System.in);
        while (true) {
            System.out.println("Do you want to add 3s numbers");
            String G = Take.nextLine();
            if(G.equalsIgnoreCase("yes")) {
                System.out.println("Enter the first number");
                int num1 = Take.nextInt();
                System.out.println("Enter the second number");
                int num2 = Take.nextInt();
                System.out.println("Enter the third number");
                int num3 = Take.nextInt();
                int result = num1 + num2 + num3;
                System.out.println("The sum of 3 numbers is : " + result);
                Take.nextLine();
            }else{
                System.out.println("May be next time");
                break;
            }
        }
        Take.close();
    }
}
