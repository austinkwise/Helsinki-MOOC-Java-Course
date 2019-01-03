
public class LyyraCard {
	private double balance;
	
	public LyyraCard(double balanceAtStart) {
		this.balance = balanceAtStart;
	}
	public String toString() {
		String result = "The card has " + this.balance + " euros";
		return result;
	}
	
	public void payEconomical(){
		if (this.balance < 2.50) {
			//do nothing
		}
		else {
			this.balance = this.balance - 2.50; 
		}
		
	}
	
	public void payGourmet() {
		if (this.balance < 4.0) {
			//do nothing
		}
		else {
			this.balance = this.balance - 4.0;
		}
		
	}
	
	public void loadMoney(double amount) {
		if((this.balance + amount) >= 150 && amount > 0) {
			this.balance = 150;
		}
		else if(amount < 0) {
			//do nothing
		}
		else {
			this.balance = this.balance + amount;
		}
	}
}
