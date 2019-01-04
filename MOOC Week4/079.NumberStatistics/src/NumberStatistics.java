
public class NumberStatistics {
	private int amountOfNumbers;
	private int sum;
	
	public NumberStatistics(){
		
	}
	
	public void addNumber(int number) {
		amountOfNumbers++;
		this.sum = this.sum + number;
	}
	
	public int amountOfNumbers() {
		return this.amountOfNumbers;
	}
	
	public int sum() {
		return this.sum;
	}
	
	public double average() {
		if(amountOfNumbers > 0) {
			return (double) this.sum / this.amountOfNumbers;
		}
		else {
			return 0.0;
		}
		
	}
}
