class StudentInformation
{
	private String studId;
	private String course;
	private String surname;
	private String firstName;
	private String middleName;
	private String sex;
	private String bday;
	private String address;

	public StudentInformation(String id, String c, String s, String fn, String mn, String sx, String bdy, String add) {
		studId = id;
		course = c;
		surname = s;
		firstName = fn;
		middleName = mn;
		sex = sx;
		bday = bdy;
		address = add;
	}

	public void setStudId(String si) {
		studId = si;
	}

	public String getStudId() {
		return(studId);
	}

	public void setCourse(String c) {
		course = c;
	}

	public String getCourse() {
		return(course);
	}

	public void setSurname(String s) {
		surname = s;
	}

	public String getSurname() {
		return(surname);
	}

	public void setFirstName(String fn) {
		firstName = fn;
	}

	public String getFirstName() {
		return(firstName);
	}

	public void setMiddleName(String mn) {
		middleName = mn;
	}

	public String getMiddleName() {
		return(middleName);
	}

	public void setSex(String sx) {
		sex = sx;
	}

	public String getSex() {
		return(sex);
	}

	public void setBday(String bdy) {
		bday = bdy;
	}

	public String getBday() {
		return(bday);
	}

	public void setAddress(String add) {
		address = add;
	}

	public String getAddress() {
		return(address);
	}
}
