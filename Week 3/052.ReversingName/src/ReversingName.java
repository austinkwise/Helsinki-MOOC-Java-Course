import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int i = 0;
        int length = name.length();
        
        System.out.print("In reverse order: ");
        while(i < length){
            length--;
            char k = name.charAt(length);
            System.out.print(k);
        }
    }
}
