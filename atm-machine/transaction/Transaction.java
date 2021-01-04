package deitel.java.ch13.atm.transaction;

import deitel.java.ch13.atm.BankDatabase;
import deitel.java.ch13.atm.Screen;

public abstract class Transaction {
	
	//references and fields using in this class
	private int accountNumber;
	private Screen screen;
	private BankDatabase bankDatabase;
	
	public Transaction(int userAccountNumber, Screen atmScreen, 
			BankDatabase atmBankDatabase) {
		accountNumber = userAccountNumber;
		screen = atmScreen;
		bankDatabase = atmBankDatabase;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public Screen getScreen() {
		return screen;
	}
	
	public BankDatabase getBankDatabase() {
		return bankDatabase;
	}
	
	abstract public void execute();
	

}
