package murachsJavaProg.ch2Apps;

import java.util.Scanner;

public class InvoiceApp2 {
	
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Invoice Calculator 2!");
		System.out.println();
	     
		Scanner sc = new Scanner(System.in);
		
		
		//--perform invoice calculations until the choice is not "y"
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {//--begin while
		
		//--get the invoice subtotal from the user
		System.out.print("Enter a subtotal: " );
		double subtotal = sc.nextDouble();
		
		//--calculate the discount amount and total
		double discountPercent = 0.0;
		if (subtotal >= 200) {
		discountPercent = .2;
		} else if (subtotal >= 100) {
			discountPercent = .1;
		} else {
			discountPercent = 0.0;
		}
		double discountAmount = subtotal * discountPercent;
		double total = subtotal - discountAmount;
		
		//--display the discount amount and total
		String message = "Discount Percent: $ " + discountPercent + "\n"
				       + "Discount Amount: $ " + discountAmount + "\n"
				       + "Invoice total: $ " + total + "\n";
		System.out.println(message);
		
		//--see if user wants to continue
		System.out.println("Continue? (y/n)" );
		choice = sc.next();
		if (choice.equalsIgnoreCase("n")) {
			System.out.println("Program stopped!");
		}
		System.out.println();
		}//--end while
	}//--end main method

}
