package employeeObject1;

public class Date {
	private int month;
	private int day;
	private int year;
	
	private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public Date(int theMonth, int theDay, int theYear) {
		month = checkMonth(theMonth);
		year = theYear;
		day = checkDay(theDay);
		
	    System.out.printf(
				 "Date object constructor for date %s\n", this );
		}
	
	private int checkMonth(int testMonth) {
		if (testMonth > 0 && testMonth <= 12){ //validate month
			return testMonth;
		}
		else { //month is invalid
			throw new IllegalArgumentException( "month must be 1-12");
			}
		}
	
	private int checkDay(int testDay) {
		if (testDay > 0 && testDay <= daysPerMonth[month])
			return testDay;
		
		if (month== 2 && testDay == 29 && (year % 400 == 0 || (year %4 ==0 && year % 10 != 0)))
			return testDay;
		
		throw new IllegalArgumentException("day out of range");
	
	}
	
	public String toString() {
		return String.format("%d/%d/%d", month, day, year);
	}
}//end class date