import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
    	for(Integer number : list) {
        	sum = sum + number;
        }
    	return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double i = 0;
    	for (double number : list) {
    		i++;
    	}
    	
    	double average = sum(list) / i;
    	return average;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
    	int i = 0;
    	double var = 0;
    	double avg = average(list);
    	
    	for (Integer number : list) {
    		var = var + Math.pow(number - avg, 2);
    		i++;
    	}
    	
        return (var / (i - 1));
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
