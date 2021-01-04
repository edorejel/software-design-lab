package deitel.java.ch13.atm.transaction;

import deitel.java.ch13.atm.BankDatabase;
import deitel.java.ch13.atm.CashDispencer;
import deitel.java.ch13.atm.Keypad;
import deitel.java.ch13.atm.Screen;

public class Withdrawal extends Transaction {
	
	private int amount;//amount to withdraw
	private Keypad keypad;//reference to keypad
	private CashDispencer cashDispencer;//reference to cash dispencer
	
	private final static int CANCELED = 6;

	public Withdrawal(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase, Keypad atmKeypad,
		CashDispencer atmCashDispencer){
			super(userAccountNumber, atmScreen, atmBankDatabase);

			keypad = atmKeypad;
			cashDispencer = atmCashDispencer;
	
	}
	
	public void execute() {
		boolean cashDispensed = false;//cash was not dispensed yet
		double availableBalance;//amount available for withdrawal
		
	//get references to bank database and screen
		BankDatabase bankDatabase = getBankDatabase();
		Screen screen = getScreen();
		
		//loop until cash is dispensed or user cancels
		do {
			amount = displayMenuOfAmounts();
			
			if (amount != CANCELED) {
				availableBalance = bankDatabase.getAvailabelBalance(getAccountNumber());
				
				//check whether the user has enough money in the account
				if (amount <= availableBalance) {
					if ( cashDispencer.isSuffificentCashAvailable(amount)) {
						bankDatabase.debit(getAccountNumber(), amount);
						cashDispencer.dispenceCash(amount);
						cashDispensed = true;
						
						//instruct user to take cash
						screen.displayMessageLine("\n Your cash has been" + " dispensed. Please take your cash now.");
					}
					else {
						screen.displayMessageLine("\nInsufficient cash available in the ATM." + "Please "
								+ " choose a smaller amount.");
					}}
					else {
						screen.displayMessageLine("\nInsufficient funds in your account." + "\n\nPlease choose a smaller amount.");
					}
						
				}else {
					screen.displayMessageLine("\nCancelin transaction...");
					return;
				}
			} while ( !cashDispensed );
		
	}

	private int displayMenuOfAmounts() {
		int userChoice = 0;
		Screen screen = getScreen();
		
		int[] amounts = {0, 20, 40, 60, 100, 200};
		
		while (userChoice == 0) {
			screen.displayMessageLine("\nWithdrawal Menu:");
			screen.displayMessageLine("1 - $20");
			screen.displayMessageLine("2 - $40");
			screen.displayMessageLine("3 - $60");
			screen.displayMessageLine("4 - $100");
			screen.displayMessageLine("5 - $200");
			screen.displayMessageLine("6 - Cancel transaction");
			screen.displayMessage("\nChoose a withdrawal amount: " );
			int input = keypad.getInput();//get user input through keypad
			
			switch(input) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				userChoice = amounts[input];
				break;
			case CANCELED:
				userChoice = CANCELED;
				break;
				default:
					screen.displayMessageLine("\nInvalid selection. Try again!");
			}
			
		}
		
		return userChoice;
	}//end method execute
}
		