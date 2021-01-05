package murachsJavaProg.ch5Apps;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FutureValueExceptionApp {
	public static void main(String[] args) {
		System.out.println("Welcome to the Future Value App");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			double monthlyInvestment = 0.0;
			double interestRate = 0.0;
			int years = 0;
			try {
				System.out.print("Enter monthly investment: ");
				monthlyInvestment = sc.nextDouble();
				System.out.print("Enter yearly interest rate: ");
				interestRate = sc.nextDouble();
				System.out.print("Enter number of years: ");
				years = sc.nextInt();
			} catch (InputMismatchException e) {
				sc.next();
				System.out.print("Error! Invalid number. Try again.\n ");
				continue;
			}
			double monthlyInterestRate = interestRate/12/100;
			int months = years * 12;
			double futureValue = calculateFutureValue(monthlyInvestment, monthlyInterestRate, months);

			NumberFormat currency = NumberFormat.getCurrencyInstance();
			System.out.println("Future value: " + currency.format(futureValue) + "\n");
			System.out.print("continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
	}
	private static double calculateFutureValue(double monthlyInvestment, double monthlyInterestRate, int months) {
		double futureValue = 0;
		for (int i = 1; i <= months; i++) {
			futureValue = (futureValue + monthlyInvestment) * (1 + monthlyInterestRate);
		}
		return futureValue;

	}

}

/*
*OUTPUT
*Welcome to the Future Value App
Enter monthly investment: d
Error! Invalid number. Try again.
 Enter monthly investment: 300
Enter yearly interest rate: t
Error! Invalid number. Try again.
 Enter monthly investment: 56
Enter yearly interest rate: 4
Enter number of years: 12
Future value: $10,362.81

continue? (y/n): n


*
*
*/