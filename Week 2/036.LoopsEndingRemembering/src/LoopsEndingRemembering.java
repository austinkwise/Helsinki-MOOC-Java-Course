import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        int i = 0;
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type number: ");
        
        while(i != -1){
            i = Integer.parseInt(reader.nextLine());
            if(i != -1){
               sum = sum + i;
            count++;
            
            int temp = i % 2;
            if(temp == 1){
                odd++;
            }else{
                even++;
            } 
            }
            
        }
        
        double average = (double) sum/count;
        
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd number: " + odd);
    }
}
