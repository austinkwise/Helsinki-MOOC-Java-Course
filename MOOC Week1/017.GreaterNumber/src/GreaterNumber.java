import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the first number: ");
        int numberOne = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type the second number: ");
        int numberTwo = Integer.parseInt(reader.nextLine());
        
        if(numberOne > numberTwo) {
        	System.out.print("Greater number: " + numberOne);
        }
        else if(numberOne < numberTwo) {
        	System.out.print("Greater number: " + numberTwo);
        }
        else{
        	System.out.print("The numbers are equal!");
        }
    }
}
