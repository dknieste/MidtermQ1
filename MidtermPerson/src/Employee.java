public class Employee extends Person {

	// new data relevant to employees
	private String salary;
	private String office;
	private MyDate date;

	// constructor with all attributes of Person plus the new data fields
	public Employee(String name, String address, String phoneNumber,
			String emailAddress, String salary, String office, MyDate date) {
		super(name, address, phoneNumber, emailAddress);
		this.salary = salary;
		this.office = office;
		this.date = date;
	}

	// overriding the toString method
	@Override
	public String toString() {
		return "The name is " + this.getName() + "in 'Employee'";
	}

}
