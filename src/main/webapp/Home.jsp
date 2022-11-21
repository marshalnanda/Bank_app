<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home</title>
</head>
<body>
welcome to home page
Hello <%= request.getAttribute("name") %>
<br>
<br>
<br>
<form action="addMoney"  method="get">
    <input type="submit" value="Add Money">
</form>
<br>
<form action="withdrawMoney"  method="get">
    <input type="submit" value="Withdraw Money">
</form>
<br>
<form action="logout"  method="get">
    <input type="submit" value="Logout">
</form>
</body>
</html>