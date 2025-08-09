package BasicProgram;
import java.util.Scanner;
public class PrintUntil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("DO you want to print more");
            String F= input.nextLine();
            if(F.equalsIgnoreCase("yes")) {
                System.out.println("This is the end of line");

                input.nextLine();
                System.out.println("do you want to print more");
                String F1 = input.nextLine();
                if(F1.equalsIgnoreCase("yes")){
                    System.out.println("ending program");
                    break;
                }
            }else{
                System.out.println("let it be");

        } input.close();
            }
    }
}
