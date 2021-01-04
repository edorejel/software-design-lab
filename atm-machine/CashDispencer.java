package deitel.java.ch13.atm;

public class CashDispencer {
	
	private final static int INITIAL_COUNT = 500;
	private int count;
	
	public CashDispencer() {
		count = INITIAL_COUNT;
	}
	
	public void dispenceCash( int amount) {
		int billsRequired = amount/20;//dispence 20 dollar amounts
		count -= billsRequired;
	}
	
	public boolean isSuffificentCashAvailable(int amount) {
		int billsRequired = amount/20;
		if (count >= billsRequired) {
			return true;
		}
			else {
				return false;
	}
  }
}
