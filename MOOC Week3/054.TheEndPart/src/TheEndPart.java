import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
       System.out.print("Type a word: ");
       String word = reader.nextLine();
       
       System.out.print("Length of the end part: ");
       int endPart = Integer.parseInt(reader.nextLine());
       
       int wordLength = word.length();
       int length = wordLength - endPart;
       
     
       String result = word.substring(length);
       System.out.println("Result: " + result);
    }
}
