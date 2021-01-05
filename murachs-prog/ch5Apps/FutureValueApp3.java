package murachsJavaProg.ch5Apps;

import java.text.NumberFormat;
import java.util.Scanner;

public class FutureValueApp3 {
	public static void main(String[] args) {
		System.out.print("Welcome to the Future Value App Chapter 5");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {//begin while
			System.out.println("INVESTMENT DATA ENTRY");
			double monthlyInvestment = getDoubleWithinRange(sc, "Enter monthly investment: ", 0, 1000);
			double interestRate = getDoubleWithinRange(sc, "Enter yearly interest rate: ", 0, 30);
			int years = getIntWithinRange(sc, "Enter number of years: ", 0, 100);

			double monthlyInterestRate = interestRate/12/100;
			int months = years * 12;
			double futureValue = calculateFutureValue(monthlyInvestment, monthlyInterestRate, months);

			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();
			percent.setMinimumFractionDigits(1);

			String results = "Monthly investment:\t"
					+ currency.format(monthlyInvestment) + "\n"
					+ "Yearly Interest Rate:\t"
					+ percent.format(interestRate/100) + "\n"
					+ "Number of years:\t"
					+ years + "\n"
					+ "Futue value:\t\t"
					+ currency.format(futureValue) + "\n";
			System.out.println();
			System.out.println("FORMATTED RESULTS");
			System.out.println(results);

			//--see if the user wants to continue
			System.out.println("Continue? (y/n): ");
			choice = sc.next();
			if (choice.equalsIgnoreCase("n"))
				System.out.println("Program has stopped!");
			sc.hasNextLine();
			System.out.println();

		}//end while
		
	}

	public static double getDoubleWithinRange(Scanner sc, String prompt, double min, double max) {
		double d = 0.0;
		boolean isValid = false;
		while (isValid == false) {
			d = getDouble(sc, prompt);
			if (d <= min) {
				System.out.println("Error! Number must be greater than " + min + ".");
			}
			else if ( d >= max) {
				System.out.println("Error! Number must be less than " + max + ".");
			} else {
				isValid = true;
			}

		}
		return d;
	}//end method

	public static double getDouble(Scanner sc, String prompt) {
		double d = 0.0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.println(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid decimal value. Try again!");
			}
			sc.nextLine();
		}
		return d;
	}


	public static int getIntWithinRange(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			if (i <= min)
				System.out.println("Error! Number must be greater than " + min + ". ");
			else if ( i>= max)
				System.out.println("Error! Number must be less than " + max + ".");
			else {
				isValid = true;
			}
		}
		return i;
	}

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else
			{
				System.out.println("Error! Invalid integer value. Try again!");
			}
			sc.hasNextLine();
		}
		return i;
	}

	public static double calculateFutureValue(double monthlyInvestment, double monthlyInterestRate, int months) {
		double futureValue = 0;
		for (int i = 1; i <= months; i++) {
			futureValue = (futureValue + monthlyInvestment) * (1+ monthlyInterestRate);
		}
		return futureValue;
	}
}

/*
 * Output
 * Welcome to the Future Value App Chapter 5
INVESTMENT DATA ENTRY
Enter monthly investment: 
999
Enter yearly interest rate: 
10
Enter number of years: 5

FORMATTED RESULTS
Monthly investment:	$999.00
Yearly Interest Rate:	10.0%
Number of years:	5
Futue value:		$78,004.30

Continue? (y/n): 
n
Program has stopped!

 
 * 
 * 
 * 
 */



