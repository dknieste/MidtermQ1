public enum eClassYear {

	FRESHMAN(1), SOPHOMORE(2), JUNIOR(3), SENIOR(4), GRADUATE(5);

	private int classYear;

	private eClassYear(int classYear) {
		this.classYear = classYear;
	}

	public int getClassYear() {
		return this.classYear;
	}

}
