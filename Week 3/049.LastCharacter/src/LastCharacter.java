import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        char name = lastCharacter(reader.nextLine());
        System.out.println("Last character: " + name);
    }
    
    public static char lastCharacter(String text){
        int i = text.length();
        char k = text.charAt(i - 1);
        return k;
    }
}
