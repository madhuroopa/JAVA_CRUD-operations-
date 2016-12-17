<%
String usern = (String)session.getAttribute("sunm");
if(usern == null){
	response.sendRedirect("login.jsp?error = Please Login");
}else
	out.print("<marquee behavior = scroll direction = left> <h1> Welcome "+ usern + "</h1></marquee>");
%>
<%@page import="com.bvrit.addressbook.beans.ContactBean"%>
<%@page import="com.bvrit.addressbook.dao.ContactDAO"%> 
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@page import="java.util.*"%>
<%
String message = request.getParameter("message");
if(message != null){
	out.print("<h2><font color=green> "+message+" </font></h2>");
}
HttpSession hs = request.getSession();
String user = (String)hs.getAttribute("sunm");
ContactDAO cdao = new ContactDAO();
List<ContactBean> list = cdao.listContacts(user);
ListIterator<ContactBean> lt = list.listIterator();
%>
<!DOCTYPE>
<html>
<head>
<title></title>
</head>
<body>
<div align="center">
		<h2 align="center"><font><strong>LIST OF CONTACTS</strong></font></h2>
		<table align="center" cellpadding="5" cellspacing="5" border="1" style = "width:100%">
            <tr bgcolor = #99ccff height = 40>
            	<th>Id</th>
                <th>Name</th>
                <th>Email</th>
                <th>Contact</th>
                <th>Delete</th>
                <th>Update</th>
            </tr>
            <% while(lt.hasNext()) {
            	ContactBean cb = lt.next();
            	out.print("<tr height = 20>");
            	out.print("<td>" + cb.getId());
            	out.print("<td>" + cb.getName());
            	out.print("<td>" + cb.getEmail());
            	out.print("<td>" + cb.getPhno());
            	out.println("<td><a href=deleteContact?id="+cb.getId()+"><center><img src = ./IMG/delete.png height = 20 width = 20></center></a></td>");
            	out.print("<td><a href=update.jsp?id="+cb.getId()+"&nm="+cb.getName()+"&email="+cb.getEmail()+"&phone="+cb.getPhno()+"><center><img src= ./IMG/update.png height = 20 width = 20></center></a></td>");
            	out.print("</tr>");
            }
            %>
            <script>
function myFunction() {
    if (confirm("Do you want to delete?")) {
    } else {
    	return false;
    }
}
</script>
        </table>
        <br>
        <br>
        <a href="createcontact.jsp">
        <button type = "submit" class="btn btn-info btn-lg">
          <span class="glyphicon glyphicon-plus"></span>ADD
        </button></a>
        <br><br>
    </div>
</body>
</html>
<jsp:include page = "link.html"></jsp:include>