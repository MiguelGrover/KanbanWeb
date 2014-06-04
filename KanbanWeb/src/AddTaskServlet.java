

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mg.proyecto.evolutivo.kanban.model.*;
/**
 * Servlet implementation class AddTaskServlet
 */
public class AddTaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			writer.print("<html>"
					+ "<head>"
					+ "<title>Add task</title>"
					+ "</head>"
					+ "<body>"
					+ "<form method=\"POST\">"
					+ "<table>"
					
					+ "<tr>"
					+ "<td>Title:</td>"
					+ "<td>"
					+ "<input type=\"text\"name=\"title\"/>"
					+ "</td>"
					+ "</tr>"
					
					+ "<tr>"
					+ "<td>Description:</td>"
					+ "<td>"
					+ "<input type=\"text\"name=\"description\"/>"
					+ "</td>"
					+ "</tr>"
					
					+ "<tr>"
					+ "<td>State:</td>"
					+ "<td>"
					+"<select name=\"state\">"
					+ "<option value=\"BACKLOG\">Backlog</option>"
					+ "<option value=\"TO_DO\">To do</option>"
					+ "<option value=\"IN_PROGRESS\">In progress</option>"
					+ "<option value=\"DONE\">Done</option>"
					+ "</select>"
					+ "</td>"
					+ "</tr>"
					
					+ "<tr>"
					+ "<td>Category:</td>"
					+ "<td>"
					+ "<input type=\"text\"name=\"category\"/>"
					+ "</td>"
					+ "</tr>"
					
					+ "<tr>"
					+ "<td>Priority:</td>"
					+ "<td>"
					+ "<input type=\"text\"name=\"priority\"/>"
					+ "</td>"
					+ "</tr>"
					
					+ "<tr>"
					+ "<td>Owner:</td>"
					+ "<td>"
					+ "<input type=\"text\"name=\"owner\"/>"
					+ "</td>"
					+ "</tr>"
					
					+ "<tr>"
					+ "<td>Due date:</td>"
					+ "<td>"
					+ "<input type=\"text\"name=\"dueDate\"/>"
					+ "</td>"
					+ "</tr>"
					
					+ "<tr>"
					+ "<td>Create Date:</td>"
					+ "<td>"
					+ "<input type=\"text\"name=\"createDate\"/>"
					+ "</td>"
					+ "</tr>"
					
					+ "<tr>"
					+ "<td>Add Task:</td>"
					+ "<td>"
					+ "<input type=\"submit\"value=\"Add Task\"/>"
					+ "</td>"
					+ "</tr>"
					
					+ "</table>"
					+ "</form>"
					+ "</body>"
					+ "</html>"
					);
	}
	
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String category = request.getParameter("category");
		String priority = request.getParameter("priority");
		String owner = request.getParameter("owner");
		String duedate = request.getParameter("dueDate");
		String createdate = request.getParameter("createDate");
		// Falta el state
		String state = request.getParameter("state");
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.print("<html>"
				+ "<body>"
				+"Title: "+title 
				+"</BR>"
				+"Description: "+description
				+"</BR>"
				//state
				+"State: " + state
				+"</BR>"
				+"Category: "+category
				+"</BR>"
				+"Priority: "+priority
				+"</BR>"
				+"Owner: "+owner
				+"</BR>"
				+"Due_date: "+duedate
				+"</BR>"
				+"Create_date: "+createdate
				
				+ "</body>"
				+ "</html>");
	}
	
	
	

}