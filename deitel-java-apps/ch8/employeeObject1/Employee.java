package employeeObject1;
public class Employee {
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date hireDate;
	
	
	public Employee(String first, String last, Date dateOfBirth, Date dateOfHire) {//end constructor
		firstName = first;
		lastName = last;
		birthDate = dateOfBirth;
		hireDate = dateOfHire;
	}// end constructor
	
	public String toString() {
		return String.format( "\"%s, %s Hired: %s Birthday: %s\",\r\n",  
				 lastName, firstName, hireDate, birthDate);
	}

}
