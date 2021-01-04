package deitel.java.ch13.atm;

import deitel.java.ch13.atm.transaction.Deposit;
import deitel.java.ch13.atm.transaction.Transaction;
import deitel.java.ch13.atm.transaction.Withdrawal;

public class ATM {

	//attributes
	private boolean userAuthenticated;
	private int currentAccountNumber;

	//references to other objects
	private Screen screen;
	private Keypad keypad;
	private CashDispencer cashDispencer;
	private DepositSlot depositSlot;
	private BankDatabase bankDatabase;

	//constants corresponding to the main menu
	private static final int BALANCE_INQUIRY = 1;
	private static final int WITHDRAWAL = 2;
	private static final int DEPOSIT = 3;
	private static final int EXIT = 4;

	//no-arg ATM constructor that initializes instance variables/attributes
	public ATM() {
		userAuthenticated = false;
		currentAccountNumber = 0;
		screen = new Screen();
		keypad = new Keypad();
		cashDispencer = new CashDispencer();
		depositSlot = new DepositSlot();
		bankDatabase = new BankDatabase();
	}// end no-arg constructor

	//start ATM
	public void run() {
		while (true) {
			while (!userAuthenticated) {
				screen.displayMessageLine( "\nWelcome!" );
				authenticateUser();//authenticate user
			}//end while

			performTransactions();
			userAuthenticated = false;
			currentAccountNumber = 0;
			screen.displayMessageLine( "\nThank you! Goodbye!" );
		}//end while
	}//end method run

	private void authenticateUser() {
		screen.displayMessage( "\nPlease enter your account number: ");
		int accountNumber = keypad.getInput();
		screen.displayMessage("\nEnter your PIN: ");
		int pin = keypad.getInput();

		//set userAuthenticated to boolean value returned by database
		userAuthenticated = bankDatabase.authenticateUser( accountNumber, pin);

		//check whether authentication succeeded
		if (userAuthenticated) {
			currentAccountNumber = accountNumber;//save user's account#
		}//end if
		else {
			screen.displayMessageLine("Invalid account number or PIN. Please try again!");
		}//end else		
	}//end method authenticateUser

	private void performTransactions() {
		//local variable to store transaction currently being processed
		Transaction currentTransaction = null;
		boolean userExited = false;

		while (!userExited) {
			int mainMenuSelection = displayMainMenu();

			switch(mainMenuSelection) {
			case BALANCE_INQUIRY:
			case WITHDRAWAL:
			case DEPOSIT:

				//initialize as new object of chosen type
				currentTransaction = createTransaction( mainMenuSelection);

				currentTransaction.execute();
				break;
			case EXIT:
				screen.displayMessageLine("\nExiting the system...");
				userExited = true;
				break;
			default:
				screen.displayMessageLine("\nYou did not enter a valid selection. Try again.");
				break;
			}//end switch
		}//end while
	}//end method performTransactions

	//display the main menu and return an input selection
	private int displayMainMenu() {
		screen.displayMessageLine( "\nMain menu: ");
		screen.displayMessageLine( "1 - View my balance" );
		screen.displayMessageLine( "2 - Withdraw cash" );
		screen.displayMessageLine( "3 - Deposit funds" );
		screen.displayMessageLine( "4 - Exit\n" );
		screen.displayMessageLine( "Enter choice" );
		return keypad.getInput();
	}//end method displayMainMenu

	private Transaction createTransaction (int type) {
		Transaction temp = null;//temporary transaction variable

		//determine which type of transaction to create
		switch(type) {
		case BALANCE_INQUIRY:
			temp = new BalanceInquiry(currentAccountNumber, screen, bankDatabase);
			break;
		case WITHDRAWAL:
			temp = new Withdrawal(currentAccountNumber, screen, bankDatabase, keypad, cashDispencer);
			break;
		case DEPOSIT://create new Deposit transaction
			temp = new Deposit(currentAccountNumber, screen, bankDatabase, keypad, depositSlot);
			break;
		}//end switch

		return temp;

	}
}

