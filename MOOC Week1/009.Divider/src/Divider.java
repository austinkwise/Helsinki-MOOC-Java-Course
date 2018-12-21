
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
     // Implement your program here. Remember to ask the input from user.
        
        System.out.print("Type a number: ");
        int x = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type a another number: ");
        int y = Integer.parseInt(reader.nextLine());
        
        double z;
        z = 1.0 * x / y;
        
        System.out.println("Division: " + x + " / " + y + " = " + z);

        
    }
}
