<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home</title>
</head>
<body>
<h2>Hello <%= request.getAttribute("name") %> welcome to XXXX Bank</h2>
<p>Account ID: <%= request.getAttribute("accountID") %></p>
<p>Phone Number: <%= request.getAttribute("phoneNumber") %></p>
<p>Your balance is <%= request.getAttribute("balance") %></p>
<br>
<br>
<form action="login"  method="post">
    <input type="submit" value="Add Money" name="formRequest">
</form>
<br>
<form action="login"  method="post">
    <input type="submit" value="Withdraw Money" name="formRequest">
</form>
<br>
<form action="logout"  method="get">
    <input type="submit" value="Logout">
</form>
<br>
<form action="login"  method="post">
    <input type="submit" value="Delete Account" name="formRequest">
</form>
</body>
</html>