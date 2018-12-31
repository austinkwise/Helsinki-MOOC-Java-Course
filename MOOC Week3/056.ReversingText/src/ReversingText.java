
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
    	int wordLength = text.length();
    	String help = "";
    	int i = 1;
    	
    	while(wordLength >= i) {
    	char backwards = text.charAt(wordLength - i);
    	help = help + backwards;
    	i++;
    	}
        return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
