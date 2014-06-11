<%@ page language="java" contentType="text/html"%>
    <%@ page import="java.util.Date" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Kanban Web</title>
<%@ include file = "Copyright.jsp" %>
</head>
<body>
<%-- Este es un comentario desde JSP --%>
<!-- Este es un comentario desde HTML -->


<script >
function validate(){
	var title = document.forms["task_form"]["title"].value;
	var description = document.forms["task_form"]["description"].value;
	var category = document.forms["task_form"]["category"].value;
	var priority = document.forms["task_form"]["priority"].value;
	var owner = document.forms["task_form"]["owner"].value;
	if(!title){
		alert("Title empty!!!");
		return false;
	}
	if(!description){
		alert("Description empty!!!");
		return false;
	}
	if(!category){
		alert("Category empty!!!");
		return false;
	}
	if(!priority){
		alert("Priority empty!!!");
		return false;
	}
	if(!owner){
		alert("Owner empty!!!");
		return false;
	}
	
	return true;
}
</script>
<Form name="task_form" method="POST" action="AddTaskServlet" 
onsubmit="return validate()">
					
					<table>
					
					<tr>
					<td>Title:</td>
					<td>
					<input type="text" name="title">
					</td>
					</tr>
					
					<tr>
					<td>Description:</td>
					<td>
					<input type="text" name="description">
					</td>
					</tr>
					
					<tr>
					<td>State:</td>
					<td>
					<select name="state">
					<option value="BACKLOG">Backlog</option>
					<option value="TO_DO">To do</option>
					<option value="IN_PROGRESS">In progress</option>
					<option value="DONE">Done</option>
					</select>
					</td>
					</tr>
					
					<tr>
					<td>Category:</td>
					<td>
					<input type="text"name="category"/>
					</td>
					</tr>
					
					<tr>
					<td>Priority:</td>
					<td>
					<input type="text" name="priority"/>
					</td>
					</tr>
					
					<tr>
					<td>Owner:</td>
					<td>
					<input type="text" name="owner"/>
					</td>
					</tr>
					
					<tr>
					<td>Due date:</td>
					<td>
					<input type="text" name="due_date" value="<%= new Date().toString() %>">
					</td>
					</tr>
										
					<tr>
					<td>Add Task:</td>
					<td>
					<input type="submit"value="Add Task"/>
					</td>
					</tr>
					
					</table>
					</form>


</body>
</html>