<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UnRegister</title>
     <link rel="stylesheet" href="css/unRegister.css">
</head>
<body>
<div class="center">
    <form action="logout" method="get">
        <input type="submit"  id="back" value="X"><br>
    </form>
  <h1>Hello <%= request.getAttribute("name") %></h1>
  <form action="unRegister" method="post">
    <p>Your Account ID is: <%= request.getAttribute("id") %></p>
    <p> Press delete to permanently delete your account </p>
    <input type="submit" value="Delete Account">
  </form>
    <%= request.getAttribute("message1") %><br>
    <%= request.getAttribute("message2") %>
</div>
</body>
</html>