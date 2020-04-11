
public class Employee {
	private static int count = 0;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date hireDate;
	
	public Employee(String firstName, String lastName, Date birthDate, 
			Date hireDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.hireDate = hireDate;
		++count;
		System.out.printf("Employee object constructor for employee %s%n", this);
		
	}
	
	public static int getCount() {
		return count;
	}
	
	public String toString() {
		return String.format("%s %s Hired: %s Birthday: %s", 
				lastName, firstName, hireDate, birthDate);
	}
	
}
