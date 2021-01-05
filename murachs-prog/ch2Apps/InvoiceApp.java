package murachsJavaProg.ch2Apps;

import java.util.Scanner;

public class InvoiceApp {
	public static void main(String[] args) {
		//--display a welcome message
		System.out.println("Welcome to the Invoice Calculator I!");
		System.out.println();
		
		//--get the input from the user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a subtotal: " );
		double subtotal = sc.nextDouble();
		System.out.print("Enter the discount amount: ");
		//--calculate the discount amount and the total
		double discountPercent = sc.nextDouble();
		
		double discountAmount = subtotal * discountPercent;
		
		double invoiceTotal = subtotal - discountAmount;
		
		//--format and display the results
		String message = "Discount Percent: $ " + discountPercent + "\n"
				       + "Discount Amount: $ "  + discountAmount + "\n"
				       + "Invoice Total: $ "    + invoiceTotal + "\n";
	    System.out.println(message);
  		
	}

}
