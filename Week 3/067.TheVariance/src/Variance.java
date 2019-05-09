import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        
        for(int l : list){
            sum = sum + l;
        }
        
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int sum = sum(list);
        int length = list.size();
        
        double avg = (double) sum/length;
        
        return avg;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double avg = average(list);
        int length = list.size();
        double x = 0;
        double v = 0;
        double sum = 0;
        
        for(int l : list){
            double i = l - avg;
            x = Math.pow(i, 2);
            sum = sum + x;
        }
        
        v = sum/(length - 1);
        
        return v;
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
