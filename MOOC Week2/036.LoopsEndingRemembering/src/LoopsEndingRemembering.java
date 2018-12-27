import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type numbers: ");
        int number;
        int x = 0;
        int i = 0;
        int even = 0;
		int odd = 0;
        
        while(true) {
        	number = Integer.parseInt(reader.nextLine());
        	if (number != -1) {
        		x += number;
        		i++;
        		
        		int test = number % 2;
        		if (test == 0) {
        			even++;
        		}
        		else {
        			odd++;
        		}
        	}
        	else {
        		System.out.println("Thank you and see you later!");
        		System.out.println("The sum is " + x);
        		System.out.println("How many numbers?: " + i);
        		double average = (double) x / i;
        		System.out.println("Average: " + average);
        		
        		System.out.println("Even number: " + even);
        		System.out.println("Odd numbers: " + odd);
        		break;
        	}
        } 
    }
}
