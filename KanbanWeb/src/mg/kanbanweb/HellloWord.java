package mg.kanbanweb;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class HellloWord extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.print("<html>" + "<body>"
				+ "<form action=\"ReceiverServlet\" method=\"post\">"
				+ "<table>"
				+ "<tr>"
				+ "<td>"
				+ "Codigo:"
				+ "</td>"
				+ "<td>"
				+ "<textarea rows=\"20\" cols=\"100\" name=\"codigo\"></textarea>"
				+ "</td>"
				+ "<tr>"
				+ "<td>"
				+ "<input type=\"submit\" value=\"Enviar\">"
				+ "</td>"
				+ "</tr>"
				+ "</form>"
				+ "</body>" + "</html>");
	}

}
