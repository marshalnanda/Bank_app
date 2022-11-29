<html>
<body>
<head>
 <link rel="stylesheet" href="css/addMoney.css">
</head>
<div class="Section">
  <div class="info">
    <h2>Credit Union Bank</h2>
    <p>Deposit cash</p>
    <div class="brand-logo"></div>
  </div>
  <form action="addMoney" method="post" class="credential">
    <h2>Enter Credentials</h2>
      <input type="text" class="inputFields" placeholder="Account ID" name="idFromAddMoneyPage" required/>
      <input type="text" class="inputFields" placeholder="Password" name="passwordFromAddMoneyPage" required/>
      <input type="text" class="inputFields" placeholder="Deposit amount" name="addMoney" required/>
      <p><%= request.getAttribute("message1") %></p>
      <input type="submit" id="upd-btn"  value="Update Balance">
  </form>
  <form action="addMoney" method="get">
    <input type="submit"  id="back" value="X"><br>
  </form>
</div>
</body>
</html>