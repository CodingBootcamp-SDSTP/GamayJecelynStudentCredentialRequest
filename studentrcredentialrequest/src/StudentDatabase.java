// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.BufferedReader;
// import java.io.BufferedWriter;
import java.util.ArrayList;
import java.sql.*;

public class StudentDatabase
{
	private StudentInformationCollection studInf;
	// ArrayList<GeneralInformation> gi;

	public StudentDatabase() {
		studInf = new StudentInformationCollection();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/studentrecordsdb?user=jecelyn&password=jes&serverTimezone=UTC&useSSL=false");
			readFromDB(conn);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public boolean readFromDB(Connection conn) {
		Statement stmt = null;
		ResultSet rs = null;
		boolean v = false;
		try {
			stmt = conn.createStatement();
			// rs = stmt.executeQuery("SELECT * FROM students_login;");
			// while(rs.next()) {
			// 	String[] str = {
			// 		rs.getString("stud_id"),
			// 		rs.getString("password"),
			// 	};
			// 	createObject(str);
			// }
			// rs = stmt.executeQuery("SELECT * FROM unclaimed_documents;");
			// while(rs.next()) {
			// 	String[] str = {
			// 		rs.getString("stud_id"),
			// 		rs.getString("req_doc"),
			// 		rs.getString("date_req"),
			// 		rs.getString("remarks"),
			// 	};
			// 	createObject(str);
			// }
			// rs = stmt.executeQuery("SELECT * FROM clearance_checklist;");
			// while(rs.next()) {
			// 	String[] str = {
			// 		rs.getString("stud_id"),
			// 		rs.getString("department"),
			// 		rs.getString("remarks"),
			// 	};
			// 	createObject(str);
			// }
			rs = stmt.executeQuery("SELECT * FROM stud_inf;");
			while(rs.next()) {
				String[] str = {
					rs.getString("stud_id"),
					rs.getString("course"),
					rs.getString("surname"),
					rs.getString("firstname"),
					rs.getString("middlename"),
					rs.getString("sex"),
					rs.getString("bday"),
					rs.getString("address")
				};
				createObject(str);
			}
			v = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try { if ( rs != null) rs.close(); } catch (Exception e) {};
			try { if ( stmt != null) stmt.close(); } catch (Exception e) {};
		}
		return(v);
	}

	public StudentInformationCollection getStudentInformationCollection() {
		return(studInf);
	}

	public void createObject(String... details) {
		int len = details.length-1;
		String d = details[len];
			StudentInformation gi = new StudentInformation(details[0], details[1], details[2], (details[3]), details[4], (details[5]), details[6], details[7]);
			studInf.addStudent(gi);
	}
}
