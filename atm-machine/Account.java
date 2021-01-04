package deitel.java.ch13.atm;

public class Account {
	
	private int accountNumber;
	private int pin;
	private double availableBalance;
	private double totalBalance;
	
	public Account(int theAccountNumber, int thePin, double theAvailableBalance, 
			double theTotalBalance) {
		this.accountNumber = theAccountNumber;
		this.pin = thePin;
		this.availableBalance = theAvailableBalance;
		this.totalBalance = theTotalBalance;
	}
	
	public boolean validatePin( int userPin ) {
		if (userPin == pin) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public double getAvailableBalance() {
		return availableBalance;
	}
	
	public double getTotalBalance() {
		return totalBalance;
	}
	
	public void credit( double amount) {
		availableBalance -= amount;
		totalBalance -= amount;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void debit(double amount) {
		availableBalance -= amount;
		totalBalance -= amount;
	}
}
