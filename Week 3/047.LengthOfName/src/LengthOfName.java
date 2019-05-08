
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        System.out.print("Type your name: ");
        int num = calculateCharacters(reader.nextLine());
        System.out.println("Number of characters: " + num);
    }
    
    // do here the method
    public static int calculateCharacters(String text){
        int num = text.length();
        return num;
    }
    
}
