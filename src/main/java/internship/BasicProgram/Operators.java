package main.java.internship.BasicProgram;
import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner Take = new Scanner(System.in);
        while (true) {
              System.out.println("Add (Yes/No)");
              String F = Take.nextLine();
            if(F.equalsIgnoreCase("Yes")) {
                System.out.println("Enter 1 :");
                int num1 = Take.nextInt();
                System.out.println("Enter 2 :");
                int num2 = Take.nextInt();
                int result = num1 + num2;
                System.out.println("The sum of two num is : " + result );
                Take.nextLine();
            }else{
                System.out.println("Ending this program");
                  break;
            }
        }
        Take.close();
    }
}