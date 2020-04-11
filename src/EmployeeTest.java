
public class EmployeeTest {

	public static void main(String[] args) {
		Date birth = new Date (12, 12, 1944);
		Date hire = new Date (1, 3, 2020);
		Date birth1 = new Date (12, 12, 1944);
		Date hire1 = new Date (1, 3, 2020);
		Employee employee = new Employee ("Bob", "Ruby", birth, hire); 
		Employee employee1 = new Employee ("Frankie", "Ruby", birth1, hire1);
		
		System.out.println(employee);
		System.out.println(employee1);
	}
}
