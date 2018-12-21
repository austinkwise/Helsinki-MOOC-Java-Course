
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class NhlStatisticsPart2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");

        while (true) {
            System.out.println("Enter one of the following commands. ");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                System.out.println("Top Ten by Points");
                NHLStatistics.sortByPoints();
                NHLStatistics.top(10);
            } else if (command.equals("goals")) {
            	System.out.println("Top Ten by Goals");
            	NHLStatistics.sortByGoals();
                NHLStatistics.top(10);
                // Print the top ten players sorted by goals.
            } else if (command.equals("assists")) {
            	System.out.println("Top Ten by Assists");
            	NHLStatistics.sortByAssists();
                NHLStatistics.top(10);
                //  Print the top ten players sorted by assists.
            } else if (command.equals("penalties")) {
            	System.out.println("Top Ten by Assists");
            	NHLStatistics.sortByPenalties();
                NHLStatistics.top(10);
                //  Print the top ten players sorted by penalties.
            } else if (command.equals("player")) {
            	System.out.print("Which player? ");
            	String name = reader.nextLine();
            	NHLStatistics.searchByPlayer(name);
                // Ask the user first which player's statistics are needed and then print them.
            } else if (command.equals("club")) {
            	System.out.print("Which club? ");
            	String teamName = reader.nextLine();
            	NHLStatistics.sortByPoints();
            	NHLStatistics.teamStatistics(teamName);
                // Ask the user first which club's statistics are needed and then print them.
                // Note: When printing statistics they should be ordered by points (so the players with the most points come first).
            }

        }
    }
}
