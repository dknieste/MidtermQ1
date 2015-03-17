public class Staff extends Employee {

	// new data relevant to staff
	private String jobTitle;

	// constructor with all attributes of Employee plus the new data fields
	public Staff(String name, String address, String phoneNumber,
			String emailAddress, String salary, String office, MyDate date,
			String jobTitle) {
		super(name, address, phoneNumber, emailAddress, salary, office, date);
		this.jobTitle = jobTitle;
	}

	// overriding the toString method
	@Override
	public String toString() {
		return "The name is " + this.getName() + "in 'Staff'";
	}

}
