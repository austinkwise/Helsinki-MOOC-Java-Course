
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        int length = text.length();
        int i = 0;
        length = length -1;
        String helper = "";
        
        while(i <= length){
            char c = text.charAt(length);
            
            helper = helper + c;
            length--;
        }
        
        String reverse = helper;
        return reverse;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
