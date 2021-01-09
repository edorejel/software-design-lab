package employeeObject2;

public class Employee {
	private String firstName;
	private String lastName;
	private static int count = 0;//number of employees created
	
	//initialize the employee, add 1 to static count
	//output String indicating that constructor was called
	public Employee(String first, String last) {
		firstName = first;
		lastName = last;
		
		++count;//increment static count of employees
		System.out.printf("Employee constructor: %s %s; count =%d\n", firstName, lastName, count);
	}//end employee constructor

	
	//get first name
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public static int getCount() {
		return count;
	}
	
	
}
