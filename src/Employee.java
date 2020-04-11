
public class Employee {
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
		System.out.printf("Employee object constructor for employee %s%n", this);
		
	}
	
	public String toString() {
		return String.format("%s %s Hired: %s Birthday: %s", 
				lastName, firstName, hireDate, birthDate);
	}
	
}
