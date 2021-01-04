package deitel.java.ch13.atm;

import deitel.java.ch13.atm.transaction.Transaction;

public class BalanceInquiry extends Transaction {

	public BalanceInquiry(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase) {
		super(userAccountNumber, atmScreen, atmBankDatabase);
	}

	public void execute() {
		//get references to bank database and screen
		BankDatabase bankDatabase = getBankDatabase();
		Screen screen = getScreen();

		//get available balance for the account involved
		double availableBalance = bankDatabase.getAvailabelBalance(getAccountNumber());

		double totalBalance = bankDatabase.getTotalBalance(getAccountNumber());

		//display the balance information on the the screen
		screen.displayMessageLine("\nBalance Information: ");
		screen.displayMessage(" - Available balance: " );
		screen.displayDollarAmount(availableBalance);
		screen.displayMessage("\n - Total balance: " );
		screen.displayDollarAmount(totalBalance);
		screen.displayMessageLine("");

	}
}
