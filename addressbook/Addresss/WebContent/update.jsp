<%
String usern = (String)session.getAttribute("sunm");
if(usern == null){
	response.sendRedirect("login.jsp");
}
%>
<!DOCTYPE html>
<html>
<head>
<%
//read parameters
String id = request.getParameter("id");
String name = request.getParameter("nm");
String email = request.getParameter("email");
String phone = request.getParameter("phone");
%>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Update Contact</title>
</head>
<marquee behavior="scroll" direction="left" ><h1>WELCOME <%= usern %></h1></marquee>
<body>
<div class="container">
<div class="row">
<div class="col-sm-6 col-md-4 col-md-offset-4">
<h1 class="text-center login-title">UPDATE CONTACT</h1>
<div class="account-wall">

<form class="well form-horizontal" action = "updateContact" role = "form">
<label for = "Friend Name">Friend Name:</label><br>
<input type="text" class="form-control"name = "name" value="<%=name%>" required autofocus>
<br>
<label for = "Friend Name">Phone Number:</label><br>
<input type="text" class="form-control bfh-phone" value="<%=phone%>"  name = "phno" pattern = "^\d{10}$" required>
<br>
<label for = "Friend Name">Email Id:</label><br>
<input type="email" class="form-control" name = "email" value="<%=email%>" required>
<br>
<label for = "Friend Name">ID:</label><br>
<input type="text" class="form-control" name = "id" value="<%=id%>" readonly="readonly" required>
<br>
<button class="btn btn-lg btn-primary btn-block" type="submit">
Update</button>
</form>

</div>
</div>
</div>
</div>

</body>
</html>
<jsp:include page = "link.html"></jsp:include>