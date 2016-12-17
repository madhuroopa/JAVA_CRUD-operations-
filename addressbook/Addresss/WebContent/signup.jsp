<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>SignUp</title>
</head>
<body>
<div class="container">
<div class="row">
<div class="col-sm-6 col-md-4 col-md-offset-4">
<h1 class="text-center login-title">SIGNUP</h1>
<br><br>
<div class="account-wall">

<form class="form-signin" action = "signUp">
<input type="text" class="form-control" name = "user" placeholder="User name" required autofocus>
<br>
<input type="password" class="form-control" name = "password" placeholder="Password" required>
<br>
<button class="btn btn-lg btn-primary btn-block" type="submit">
SignUp</button>
<h6>Already User?</h6>
<a href = "login.jsp">
<button type="button" class="btn btn-primary">Login</button>
</form>

</div>
</div>

</body>
</html>