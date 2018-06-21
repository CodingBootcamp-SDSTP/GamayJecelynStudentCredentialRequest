import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.ArrayList;

class StudentInformationServlet extends HttpServlet
{
	StudentInformationCollection studInf;

	public void init() throws ServletException {
		StudentDatabase studDb = new StudentDatabase();
		studInf = studDb.getStudentInformationCollection();
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {
		res.setContentType("text/xml");
		PrintWriter out = res.getWriter();
		out.print(exportToXML());
	}

	public String exportToXML() {
		StringBuilder sb = new StringBuilder("<students>");
		ArrayList<StudentInformation> gi = studInf.getAllStudents();
		for(StudentInformation g : gi) {
			sb.append("<student><studid>");
			sb.append(g.getStudId());
			sb.append("</studid><course>");
			sb.append(g.getCourse());
			sb.append("</course><surname>");
			sb.append(g.getSurname());
			sb.append("</surname><firstname>");
			sb.append(g.getFirstName());
			sb.append("</firstname><middlename>");
			sb.append(g.getMiddleName());
			sb.append("</middlename><sex>");
			sb.append(g.getSex());
			sb.append("</sex><birthday>");
			sb.append(g.getBday());
			sb.append("</birthday><address>");
			sb.append(g.getAddress());
			sb.append("</address></student>");
		}
		sb.append("</students>");
		return(sb.toString());
	}

	public void destroy() {
		studInf = null;
	}
}
