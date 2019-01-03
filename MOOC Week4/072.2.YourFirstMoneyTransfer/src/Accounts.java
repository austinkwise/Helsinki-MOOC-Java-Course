
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
    	double transfer = 100.00;
    	
    	Account mattsAccount = new Account("Matt's account",1000);
        Account myAccount = new Account("My Account",0.0);
        
        mattsAccount.withdrawal(transfer);
        myAccount.deposit(transfer);
        
        System.out.println(myAccount.toString());
        System.out.println(mattsAccount.toString());
    }

}
