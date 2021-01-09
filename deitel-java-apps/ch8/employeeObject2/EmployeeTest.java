package employeeObject2;

public class EmployeeTest {
	
	public static void main(String[] args) {
	System.out.printf( "Employee before instantiation: %d\n", Employee.getCount());
	
	//create two employees: count should be 2
	Employee e1 = new Employee( "Susan", "Baker");
	Employee e2 = new Employee( "Bob", "Black");
	
	//show that count is 2 after creating two employees
	System.out.println("\nEmployees after instantiation: ");
	System.out.printf(" via e1.getCount(): %d\n", e1.getCount());
	System.out.printf(" via e1.getCount(): %d\n", e2.getCount());
	System.out.printf(" via Employee.getCount(): %d\n", Employee.getCount() );
	
	//get names of Employees
	System.out.printf( "\nEmployee 1: %s %s\nEmployee 2: %s %s\n", 
			e1.getFirstName(), e1.getLastName(),
			e2.getFirstName(), e2.getLastName() );

	e1 = null;
	e2 = null;	
	
	}
}
