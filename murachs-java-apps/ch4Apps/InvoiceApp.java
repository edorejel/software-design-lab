package murachsJavaProg.ch4Apps;

import java.text.NumberFormat;
import java.util.Scanner;

public class InvoiceApp {
	public static void main(String[] args) {
		final double SALES_TAX_PCT = .05;
		System.out.println("Welcome to the Invoice Calculator 4!");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (!choice.equalsIgnoreCase("n")) {
			//--get the input from the user
			System.out.print("Enter customer type (r/c): ");
			String customerType = sc.next();
			System.out.print("Enter a subtotal: ");
			double subtotal = sc.nextDouble();
			
			//--get the discount percent
			double discountPercent = 0.0;
			if (customerType.equalsIgnoreCase("R")) {
				if (subtotal < 100)
					discountPercent = 0;
				else if (subtotal >= 100 && subtotal < 250)
					discountPercent = .1;
				else if (subtotal >= 250)
					discountPercent = .2;
			}
			else if (customerType.equalsIgnoreCase("C")) {
				if (subtotal < 250) {
					discountPercent = .2;
				} else {
					discountPercent = .3;
			}
			discountPercent = .1;
				
				}
			double discountAmount = subtotal * discountPercent;
			double totalBeforeTax = subtotal - discountAmount;
			double salesTax = totalBeforeTax * SALES_TAX_PCT;
			double total = totalBeforeTax + salesTax;
			
			
			//format and display the results
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();
			String message = 
					"Discount percent: $ " + percent.format(discountPercent) + "\n"
					+ "Discount amount: $ " + currency.format(discountAmount) + "\n"
					+ "Total before tax: $ " + currency.format(totalBeforeTax) + "\n"
					+ "Sales tax: $ "        + currency.format(salesTax) + "\n"
					+ "Invoice total: $ " + currency.format(total) + "\n";
			System.out.println(message);
			
			//--see if the user wants to continue
			System.out.println("Continue? (y/n): ");
			choice = sc.next();
			if (choice.equalsIgnoreCase("n"))
				System.out.println("Program has stopped!");
			System.out.println();
			}
		}
		
	}


/*
 *Sample Output 
 * Welcome to the Invoice Calculator 4!

Enter customer type (r/c): c
Enter a subtotal: 250
Discount percent: $ 10%
Discount amount: $ $25.00
Total before tax: $ $225.00
Sales tax: $ $11.25
Invoice total: $ $236.25

Continue? (y/n): 
y

Enter customer type (r/c): r
Enter a subtotal: 300
Discount percent: $ 20%
Discount amount: $ $60.00
Total before tax: $ $240.00
Sales tax: $ $12.00
Invoice total: $ $252.00

Continue? (y/n): 
n
Program has stopped!


 * 
 * 
 */
