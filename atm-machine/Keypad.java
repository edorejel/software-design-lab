package deitel.java.ch13.atm;

import java.util.Scanner;

//simulate the ATM keypad
public class Keypad {
	private Scanner input;
	
	public Keypad() {
		input = new Scanner(System.in);
	}
	
	public int getInput() {
		return input.nextInt();
	}

}
