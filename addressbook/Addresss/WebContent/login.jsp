<%
String unm = request.getParameter("username");
String error = request.getParameter("error");
if(unm != null)
{
   out.print("Please check your UserName and Password "+ unm);
}
if(error != null)
{
   out.print("<h3><font color = red>"+ error +"</font></h3>");
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
<title>Login</title>
</head>
<body>
<div class="container">
<div class="row">
<div class="col-sm-6 col-md-4 col-md-offset-4">
<br>
<div class="jumbotron" width = "100%">
<h3 class="text-center login-title">LOGIN </h3>
</div>
<div class="account-wall">

<form class="form-signin" action = "login">
<label for = "Friend Name">User Name:</label><br>
<input type="text" name = "user" class="form-control" placeholder="User name" required autofocus>
<br>
<label for = "Friend Name">Password:</label><br>
<input type="password" name = "password" class="form-control" placeholder="Password" required>
<br>
<button class="btn btn-lg btn-primary btn-block" type="submit">
Login</button><br>
<a href = "signup.jsp">
<button type="button" class="btn btn-lg btn-primary btn-block">SignUp</button><br></a>
<a href = "#">
<button type="button" class="btn btn-link">Forgot Password?</button></a>
</form>

</div>
</div>

</body>
</html>