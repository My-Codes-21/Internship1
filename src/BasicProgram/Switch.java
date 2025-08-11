package BasicProgram;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner Take = new Scanner(System.in);
        System.out.println("Choose any one Option \n 1.today \n 2.monday \n 3.tuesday");
        int num = Take.nextInt();

        switch (num){
            case 1:
                System.out.println("Today");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("invalid");

        }
    }

}
