
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 1;
        int result = 0;
        System.out.print("Until what? ");
        int userNum = Integer.parseInt(reader.nextLine());
        
        while (i <= userNum){
            result = result + i;
            i++;
        }
        
        System.out.println("Sum is " + result);
    }
}
