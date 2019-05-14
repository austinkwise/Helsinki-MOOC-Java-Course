
import java.util.ArrayList;


public class NumberStatistics {
    private int amountOfNumbers = 0;
    private int sum;
    
    public NumberStatistics(){
        this.amountOfNumbers = 0;
        this.sum = 0;
    }
    
    public void addNumber(int number){
        amountOfNumbers++;
        sum = sum + number;
    }
    
    public int sum(){
        return sum;
    }
    
    public double average(){
        double avg = 0.0;
        if(amountOfNumbers != 0){
            avg = (double) sum/amountOfNumbers;
        return avg;
        }else{
            return avg;
        }
        
    }
    
    public int amountOfNumbers(){
        return amountOfNumbers;
    }
}
