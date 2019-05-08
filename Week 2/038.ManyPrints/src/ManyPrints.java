
import java.util.Scanner;

public class ManyPrints {
    // NOTE: do not change the method definition, e.g. add parameters to method
    public static void printText(int i) {
        // Write your code here
        int j = 1;
        while(j <= i){
            System.out.println("In the beginning there were the swamp, the hoe and Java.");
            j++;
        } 
    }

    public static void main(String[] args) {
        // ask the user how many times the text should be printed
        // use the while structure to call the printText method several times
        Scanner reader = new Scanner(System.in);
        System.out.println("How many? ");
        int num = Integer.parseInt(reader.nextLine());
        printText(num);
    }
}
