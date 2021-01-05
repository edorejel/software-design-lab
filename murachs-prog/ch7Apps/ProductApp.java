package murachsJavaProg.ch7Apps;

import java.util.Scanner;

public class ProductApp {
	public static void main(String[] args) {
		//display welcome message
		System.out.println("Welcome to the Product Selector");
		System.out.println();
		
		//display 1 or more products
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {
			
			//get the input from the user
			System.out.print("Enter the product code: ");
			String productCode = sc.next();
			sc.hasNextLine();
			
			//get the Product object
			Product product = ProductDB.getProduct(productCode);
			
			//display the output
			System.out.println();
			System.out.println("SELECTED PRODUCT");
			System.out.println("Description: " + product.getDescription());
			System.out.println("Price: " + product.getFormattedPrice());
			System.out.println();
			
			//see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			if (choice.equalsIgnoreCase("n"))
				System.out.println("Program stopped!");
			System.out.println();
		}
	}

}

/*
 * OUTPUT
 * Welcome to the Product Selector

Enter the product code: c++

SELECTED PRODUCT
Description: Unknown
Price: $0.00

Continue? (y/n): y

Enter the product code: java

SELECTED PRODUCT
Description: Murach's Beginning Java
Price: $49.50

Continue? (y/n): y

Enter the product code: jsps

SELECTED PRODUCT
Description: Murach's Java Servlets and JSP
Price: $49.50

Continue? (y/n): n
Program stopped!


 * 
 * 
 * 
 * 
 */
