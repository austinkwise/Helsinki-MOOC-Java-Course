
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        int length = name.length();
        int i = 0;
        
        while(i < length){
            char k = name.charAt(i);
            System.out.println((i +1) + ". character: " + k);
            i++;       
        }
        
    }
}
