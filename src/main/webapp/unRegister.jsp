<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UnRegister</title>
</head>
<body>
<p>Hello <%= request.getAttribute("name") %></p>
<p>Your Account ID is: <%= request.getAttribute("id") %></p>
<p> Press delete to permanently delete your account </p>
<form action="unRegister" method="post">
    <input type="submit" value="Delete Account">
</form>
 <%= request.getAttribute("message1") %><br>
 <%= request.getAttribute("message2") %>
</body>
</html>