<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <link rel="stylesheet" href="css/Home.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">
</head>
<body>
<div class="content">
    <h2>Welcome to Credit Union Bank</h2>
    <div class="container d-flex justify-content-center mt-5">
        <div class="card">
            <div class="ml-3">
                <h5 class="name"><%= request.getAttribute("name") %></h5>
            </div>
            <div class="middle-container d-flex justify-content-between align-items-center mt-3 p-2">
                <div class="icon-background px-3">
                    <div class="icon">ID</div>
                </div>
                <div class="d-flex flex-column text-right mr-2">
                    <span class="Account-info">Account ID</span>
                    <span class="Account-info-result"><%= request.getAttribute("accountID") %></span>
                </div>
            </div>
            <div class="middle-container d-flex justify-content-between align-items-center mt-3 p-2">
                <div class="icon-background px-3">
                    <div class="icon"><i class="fa fa-rupee"></i></div>
                </div>
                <div class="d-flex flex-column text-right mr-2">
                    <span class="Account-info">Current Balance</span>
                    <span class="Account-info-result"><span class="sign"><i class="fa fa-rupee"></i></span><%= request.getAttribute("balance") %></span>
                </div>
            </div>
            <div class="middle-container d-flex justify-content-between align-items-center mt-3 p-2">
                <div class="icon-background px-3">
                    <div class="icon">&#9990;</div>
                </div>
                <div class="d-flex flex-column text-right mr-2">
                    <span class="Account-info">Phone Number</span>
                    <span class="Account-info-result"><span class="sign">&#9990;</span><%= request.getAttribute("phoneNumber") %></span>
                </div>
            </div>
        </div>
    </div>

</div>
<div class="sidenav">
    <div class="brand-logo"></div><br>
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
</div>
</body>
</html>