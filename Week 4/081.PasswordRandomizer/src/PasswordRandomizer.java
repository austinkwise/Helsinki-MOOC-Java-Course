import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    int length;
    Random random = new Random();
    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        String password = "";
        
        while(i < length){
            int c = random.nextInt(25);
            char holder = alphabet.charAt(c);
            
            password = password + holder;
            
            i++;
        }
        
        return password;
    }
}
