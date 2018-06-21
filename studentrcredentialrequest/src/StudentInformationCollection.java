import java.util.ArrayList;

public class StudentInformationCollection
{
	ArrayList<StudentInformation> studInf;

	public StudentInformationCollection() {
		studInf = new ArrayList<StudentInformation>();
	}

	public void addStudent(StudentInformation stud) {
		studInf.add(stud);
	}

	public void removeStudent(StudentInformation stud) {
		studInf.remove(stud);
	}

	public ArrayList<StudentInformation> getAllStudents() {
		return(studInf);
	}
}
