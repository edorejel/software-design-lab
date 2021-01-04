package deitel.java.ch13.atm;
//simulates the atm screen
public class Screen {
	public void displayMessage( String message ) {
		System.out.println( message );
	}
	
	public void displayMessageLine( String message ) {
		System.out.println( message );
	}
	
	public void displayDollarAmount( double amount ) {
		System.out.printf( "$%,.2f",  amount);
	}

}
