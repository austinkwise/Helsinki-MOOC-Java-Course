
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
        
        int div = year % 4;
        int div1 = year % 100;
        int div2 = year % 400;
        
        if((div == 0 && div1 != 0) || div2 == 0){
            System.out.println("The year is a leap year");
        }
        else{
            System.out.println("The year is not a leap year");
        }
        
    }
}
