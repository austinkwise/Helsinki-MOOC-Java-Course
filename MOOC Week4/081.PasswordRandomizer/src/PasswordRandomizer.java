import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
		private Random random;
		private String password;
		private int value;

    public PasswordRandomizer(int length) {
        // Initialize the variable
    	for (int i = 0; i < length; i++) {
    		this.value = this.random.nextInt(26);
    		this.password += "abcdefghijklmnopqrstuvwxyz".charAt(value);
    	}
    }

    public String createPassword() {
        // write code that returns a randomized password
    	return this.password;
    }
}
