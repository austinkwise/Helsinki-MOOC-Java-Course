
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = Integer.parseInt(reader.nextLine());
        
        if(age >= 0 && age <= 120) {
        	System.out.print("ok.");
        }
        else {
        	System.out.print("Impossible!!!!");
        }
    }
}