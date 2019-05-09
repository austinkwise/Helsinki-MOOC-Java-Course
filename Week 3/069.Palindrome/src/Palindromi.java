import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        String reverseText = reverse(text);
        if (text.contentEquals(reverseText)){
            return true;
        }
        return false;
    }
    
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
        return helper;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
