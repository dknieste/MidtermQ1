public class Student extends Person {

	// constructor with all attributes of person plus the enum class year
	public Student(String name, String address, String phone, String email,
			eClassYear[] classYear) {
		super(name, address, phone, email);
		classYear = eClassYear.values();
	}

	// overriding the toString method
	@Override
	public String toString() {
		return "The name is " + this.getName() + "in 'Student'";
	}
	
}
