
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while(true){
            System.out.print("Enter a number: ");
            double num = Double.parseDouble(reader.nextLine());
            
            if(num >= -30 && num <= 40){
                Graph.addNumber(num);
            }
        }
        
        // Remove or comment out these lines above before trying to run the tests.
    }
}
