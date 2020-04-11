
public class EmployeeTest {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		System.out.printf("Employees before instantiation: %d%n", 
				Employee.getCount());
		
		Date birth = new Date (12, 12, 1944);
		Date hire = new Date (1, 3, 2020);
		Date birth1 = new Date (12, 12, 1944);
		Date hire1 = new Date (1, 3, 2020);
		Date birth2 = new Date (12, 12, 1944);
		Date hire2 = new Date (1, 3, 2020);
		Date birth3 = new Date (12, 12, 1944);
		Date hire3 = new Date (1, 3, 2020);
		Employee employee = new Employee ("Bob", "Ruby", birth, hire); 
		Employee employee1 = new Employee ("Frankie", "Ruby", birth1, hire1);
		Employee employee2 = new Employee ("Bob", "Ruby", birth2, hire2); 
		Employee employee3 = new Employee ("Frankie", "Ruby", birth3, hire3);
		System.out.printf("Employees *after* instantiation: %d%n", 
				Employee.getCount());
		System.out.printf("Employee getCount: %d%n", 
				employee.getCount());
		System.out.printf("Employee1 getCount: %d%n", 
				employee1.getCount());
		System.out.printf("Employee1 getCount: %d%n", 
				employee2.getCount());
		System.out.printf("Employee1 getCount: %d%n", 
				employee3.getCount());
		
		System.out.println(employee);
		System.out.println(employee1);
	}
}
