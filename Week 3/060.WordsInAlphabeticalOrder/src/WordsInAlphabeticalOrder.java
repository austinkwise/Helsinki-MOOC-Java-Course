
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> artists = new ArrayList<String>();
        
        while(true){
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            
            if(word.isEmpty()){
                System.out.println("You typed the following words: ");
                Collections.sort(artists);
                
                for(String a : artists){
                    System.out.println(a);
                }
                break;
            }
            
            artists.add(word);
        }
    }
}
