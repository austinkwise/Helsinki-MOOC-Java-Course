
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        	System.out.print("Give me a year: ");
        	int year = Integer.parseInt(reader.nextLine());
        		
        	int check = year % 4;
        	int checkTwo = year % 100;
        	int checkThree= year % 400;
        			
        	if (check == 0 && checkTwo != 0 || checkThree == 0 ) {
        		System.out.print("This is a leap year!");
        	}
        	else {
        		System.out.print("This is not a leap year..");
        	}
    }
}
