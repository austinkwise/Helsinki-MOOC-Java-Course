
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account a = new Account("A account", 100.0);
        Account b = new Account ("B account", 0.0);
        Account c = new Account ("C account", 0.0);
        
        transfer(a, b, 50.0);
        transfer(b, c, 25.0);
    }

    public static void transfer(Account from, Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

}
