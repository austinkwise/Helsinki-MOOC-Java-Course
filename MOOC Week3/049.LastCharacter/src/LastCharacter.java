import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        System.out.print("Last Character: " + lastCharacter(name));
    }
    public static char lastCharacter(String text){
    	int first = text.length();
    	return text.charAt(first - 1);
    }
}
