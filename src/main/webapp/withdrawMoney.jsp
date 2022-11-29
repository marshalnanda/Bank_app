<html>
<body>
<head>
 <link rel="stylesheet" href="css/withdrawMoney.css">
</head>
<div class="Section">
  <div class="info">
    <h2>Credit Union Bank</h2>
    <p>Withdraw cash</p>
    <div class="brand-logo"></div>
  </div>
  <form action="withdrawMoney" method="post" class="credential">
    <h2>Enter Credentials</h2>
      <input type="text" class="inputFields" placeholder="Account ID" name="idFromWithdrawMoneyPage" required/>
      <input type="password" class="inputFields" placeholder="Password" name="passwordFromWithdrawMoneyPage" required/>
      <input type="text" class="inputFields" placeholder="Deposit amount" name="withdrawMoney" required/>
      <p><%= request.getAttribute("message1") %></p>
      <input type="submit" id="upd-btn"  value="Update Balance">
  </form>
  <form action="addMoney" method="get">
    <input type="submit"  id="back" value="X"><br>
  </form>
</div>
</body>
</html>