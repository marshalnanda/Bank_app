<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register</title>
    <link rel="stylesheet" href="css/register.css">
</head>
<body>
<h2>Welcome to Register page</h2>
<form action="register" method="post">
    <span> Enter your Username : </span><input type="text" name="uname"><br>
    <span> Enter your Phone No : </span><input type="text" name="phoneNumber"><br>
    <span> Enter your Password : </span><input type="text" name="password"><br>
    <input type="submit" value="Register" class='register'>
    <a href="index.html">Back to Login page</a>
</form>
    <%= request.getAttribute("message") %><br>
    <%= request.getAttribute("AccountID") %>
</body>
</html>