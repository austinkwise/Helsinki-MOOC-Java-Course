
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("");

        System.out.print("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());

        double quo = (double) (number1) / number2;

        System.out.println("Division: " + number1 + " / " + number2 + " = " + quo);
        // Implement your program here. Remember to ask the input from user.
    }
}
