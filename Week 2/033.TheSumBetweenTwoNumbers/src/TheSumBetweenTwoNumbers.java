
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        
        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
        
        System.out.print("Second: ");
        int second = Integer.parseInt(reader.nextLine());
        
        while (first <= second){
            sum = sum + first;
            first++;
        }
        
        System.out.println("The sume is " + sum);
    }
}
