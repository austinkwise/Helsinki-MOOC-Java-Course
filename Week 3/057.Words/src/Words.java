import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String word = "0";
        
        while(true){
            System.out.print("Type a word: ");
            word = reader.nextLine(); 
            
            if(word.isEmpty()){
                System.out.println("You typed the following words: ");
                for(String w : words){
                    System.out.println(w);
                }
                break;
            }
            
            words.add(word);
        }
        
    }
}
