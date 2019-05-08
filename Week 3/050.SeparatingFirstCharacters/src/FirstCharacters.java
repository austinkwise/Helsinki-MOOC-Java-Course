import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        if(name.length() >= 3){
            char c1 = name.charAt(0);
        System.out.println("1. character: " + c1);
        char c2 = name.charAt(1);
        System.out.println("2. character: " + c2);
        char c3 = name.charAt(2);
        System.out.println("3. character: " + c3);
        }
        
    }
}
