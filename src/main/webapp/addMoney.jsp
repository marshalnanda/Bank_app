<html>
<body>
Add cash page
<br>
 <form action="addMoney" method="post">
    <input type="text" placeholder="Account ID" name="idFromAddMoneyPage"/><br>
    <input type="text" placeholder="Password" name="passwordFromAddMoneyPage"/><br>
    <input type="text" placeholder="Deposit amount" name="addMoney"/><br>
    <input type="submit" value="update balance"><br>
    <%= request.getAttribute("message1") %><br>
 </form>

  <form action="addMoney" method="get">
  <input type="submit" value="Back to Home"><br>
   </form>
</body>
</html>