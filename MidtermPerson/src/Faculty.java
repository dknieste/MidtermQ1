public class Faculty extends Employee {

	// new data relevant to faculty
	private String officeHours;
	private String rank;

	// constructor with all attributes of Employee plus the new data field
	public Faculty(String name, String address, String phoneNumber,
			String emailAddress, String salary, String office, MyDate date,
			String officeHours, String rank) {
		super(name, address, phoneNumber, emailAddress, salary, office, date);
		this.officeHours = officeHours;
		this.rank = rank;

	}

	// overriding the toString method
	@Override
	public String toString() {
		return "The name is " + this.getName() + "in 'Faculty'";
	}

}
