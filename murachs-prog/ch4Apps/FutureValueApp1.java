package murachsJavaProg.ch4Apps;

import java.text.NumberFormat;
import java.util.Scanner;

public class FutureValueApp1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while(!choice.equalsIgnoreCase("n")) {
			//--get the input from the user
			System.out.print("Welcome to the Future Value App #1");
			System.out.println();
			System.out.println("Enter Monthly investment: $ ");
			double monthlyInvestment = sc.nextDouble();
			System.out.println("Enter Yearly interest rate: $ ");
			double interestRate = sc.nextDouble();
			System.out.println("Enter Number of Years: $ ");
			int years = sc.nextInt();
			
			//convert yearly to monthly values and initialize future values
			double monthlyInterestRate = interestRate/12/100;
			int months = years * 12;
			double futureValue = 0.0;
			
			//use a for loop to calculate the future value
			for (int i = 1; i <= months; i++) {//begin for loop
				futureValue = (futureValue + monthlyInvestment) * (1 + monthlyInterestRate);
			}//end for loop
			
			//format and display the result
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			System.out.println("Future value: " +
			                                    currency.format(futureValue));
			System.out.println();
			
			//see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			if (choice.equalsIgnoreCase("n")) {
				System.out.println("Program stopped!");
			}
			System.out.println();
		}
	}

}
/*
 * OUTPUT
 * Welcome to the Future Value App #1
Enter Monthly investment: $ 
100
Enter Yearly interest rate: $ 
3
Enter Number of Years: $ 
3
Future value: $3,771.46

Continue? (y/n): n
Program stopped!



 * 
 * 
 */
