<%
String usern = (String)session.getAttribute("sunm");
if(usern == null){
	response.sendRedirect("login.jsp?error= Please Login");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>CreateContact</title>
</head>
<marquee behavior="scroll" direction="left" ><h1>Welcome <%= usern %></h1></marquee>
<body>
<div class="container">
<div class="row">
<div class="col-sm-6 col-md-4 col-md-offset-4">
<h1 class="text-center login-title">ADD CONTACT</h1>
<div class="account-wall">

<form class="form-signin" action = "createContact">
<label for = "Friend Name">Friend Name:</label><br>
<input type="text" class="form-control" name = "name" placeholder="Friend Name" required autofocus>
<br>
<label for = "Friend Name">Phone Number:</label><br>
<input type="text" class="form-control bfh-phone" name = "phno" pattern = "^\d{10}$" placeholder="Phone Number (Ex: 9999999999)" required>
<br>
<label for = "Friend Name">Email Id:</label><br>
<input type="email" class="form-control" name = "email" placeholder="Email ID (Ex: xyz@somemail.com)" required>
<br>
<label for = "Friend Name">ID:</label><br>
<input type="text" class="form-control" name = "id" placeholder="ID" required>
<br>
<button class="btn btn-lg btn-primary btn-block" type="submit">
ADD</button>
</form>

</div>
</div>
</div>
</div>
</body>
</html>
<br>
<jsp:include page = "link.html"></jsp:include>