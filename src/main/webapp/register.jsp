<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register</title>
</head>
<body>
<h2>Welcome to Register page</h2>
<form method="post">
    Enter your username : <input type="text" name="uname"><br>
    Enter your phoneNumber : <input type="text" name="phoneNumber"><br>
    Enter your password : <input type="text" name="password"><br>
    <input type="submit" value="Register">
    <a href="login.jsp">Back to Login page</a>
</form>
    <%= request.getAttribute("message") %><br>
    <%= request.getAttribute("AccountID") %>
</body>
</html>