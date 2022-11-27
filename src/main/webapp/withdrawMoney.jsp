<html>
<body>
Add cash page
<br>
 <form action="withdrawMoney" method="post">
    <input type="text" placeholder="Account ID" name="idFromWithdrawMoneyPage"/><br>
    <input type="text" placeholder="Password" name="passwordFromWithdrawMoneyPage"/><br>
    <input type="text" placeholder="Withdrawal amount" name="withdrawMoney"/><br>
    <input type="submit" value="update balance"><br>
    <%= request.getAttribute("message1") %><br>
 </form>

  <form action="addMoney" method="get">
  <input type="submit" value="Back to Home"><br>
   </form>
</body>
</html>