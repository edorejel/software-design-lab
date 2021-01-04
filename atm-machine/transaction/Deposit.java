package deitel.java.ch13.atm.transaction;

import deitel.java.ch13.atm.BankDatabase;
import deitel.java.ch13.atm.DepositSlot;
import deitel.java.ch13.atm.Keypad;
import deitel.java.ch13.atm.Screen;

public class Deposit extends Transaction {

	private double amount;//amount to deposit
	private Keypad keypad;//reference to keypad
	private DepositSlot depositSlot;//reference to deposit slot
	private final static int CANCELED = 0;
	
	//deposit constructor
	public Deposit(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase,
		Keypad atmKeypad, DepositSlot atmDepositSlot){
			super(userAccountNumber, atmScreen, atmBankDatabase);
		
			keypad = atmKeypad;
			depositSlot = atmDepositSlot;
			
		}//end constructor
	
	public void execute() {
		BankDatabase bankDatabase = getBankDatabase();//get reference
		Screen screen = getScreen();//get reference
		
		amount = promptForDepositAmount();//get deposit amount from user
		
		//check whether user entered a deposit amount or canceled
		if (amount != CANCELED) {
			screen.displayMessage("\nPlease insert a deposit envelope containing " );
			screen.displayDollarAmount(amount);
			screen.displayMessageLine(".");
			
			//receive deposit envelope
			boolean envelopeReceived = depositSlot.isEnvelopeReceived();
			
			//check whether deposit envelope was received
			if (envelopeReceived) {
				screen.displayMessageLine("\nYour envelope has been" + "received.\nNOTE: The money just"
						+ "deposited will not " + " be available until we verify the amount of any " +
						"enclosed cash and your checks clear.");
				
				//credit account to reflect the deposit
				bankDatabase.credit(getAccountNumber(), amount);
			}
			else {
				screen.displayMessageLine("\nYou did not insert an " + "envelope, so the ATM has canceled your" +
			" transaction.");
			}
		}
		else {
			screen.displayMessageLine("\nCanceling transaction...");
			}//end else
		}//end method execute
	
	private double promptForDepositAmount() {
		Screen screen = getScreen();
		
		//display the prompt
		screen.displayMessage("\nEnter a deposit amount in CENTS or 0 to cancel: ");
		int input = keypad.getInput();
		
		//check whether the user canceled or entered a valid amount
		if (input == CANCELED)
			return CANCELED;
		else {
			return (double ) input/100;//return dollar amount
		}
		
	}

}
