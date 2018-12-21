
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
    	
    	System.out.println("Top Ten Players by Goals.");
    	NHLStatistics.sortByGoals();
    	NHLStatistics.top(10);
    	
    	System.out.println("\n");
    	
    	System.out.println("Top 25 Players by Penalties");
    	NHLStatistics.sortByPenalties();
    	NHLStatistics.top(25);
    
    	System.out.println("\n");
    	
    	System.out.println("Sidney Crosby Statistics");
    	NHLStatistics.searchByPlayer("Sidney Crosby");
    	
    	System.out.println("\n");
    	
    	System.out.println("Philadelphia stats.");
    	NHLStatistics.teamStatistics("PHI");
    	
    	System.out.println("\n");
    	
    	System.out.println("Anaheim Ducks Point Statistics");
    	NHLStatistics.sortByPoints();
    	NHLStatistics.teamStatistics("ANA");
    	
    }
}
