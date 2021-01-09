package employeeObject1;
public class EmployeeTest {
	public static void main(String[] args) {
		
		Date birth = new Date(7, 21, 1949 );
		
		Date hire = new Date(3, 11, 1988 );
		
		Employee employee = new Employee("Bob", "Black", birth, hire);
		
		System.out.println(employee);
		
	}

}
