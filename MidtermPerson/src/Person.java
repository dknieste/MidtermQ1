public abstract class Person {

	// setting the private data fields
	private String name;
	private String address;
	private String phoneNumber;
	private String emailAddress;

	// no-arg constructor
	public Person() {
	}

	// constructor with arguments
	public Person(String name, String address, String phoneNumber,
			String emailAddress) {
		setName(name);
		setAddress(address);
		setPhoneNumber(phoneNumber);
		setEmailAddress(emailAddress);
	}

	// toString method
	public String toString() {
		return "The name is " + this.getName() + "in 'Person'";
	}

	// all getters and setters if needed
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
