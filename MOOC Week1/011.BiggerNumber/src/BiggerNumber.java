
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.print("Type a number: ");
        int x = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int y = Integer.parseInt(reader.nextLine());
        
        
        int z = Math.max(x, y);
        System.out.print("The bigger number of the two numbers given was: " + z);
        
    }
}
