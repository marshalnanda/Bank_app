<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin page</title>
     <link rel="stylesheet" href="css/admin.css">
</head>
<body>
<h1>This is Credit Union Bank Admin Page</h1>
<br>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% Queue<String> allData = (Queue<String>)request.getAttribute("data"); %>
<% Iterator<String> itr = allData.iterator(); %>
<br>
<div class="container">
    <div class="table">
        <div class="table-header">
            <div class="header">All Requests</div>
        </div>
        <div class="table-data">
            <%while (itr.hasNext()) { %>
            <% out.println(itr.next()); %><br>
            <%}%>
        </div>
    </div>
</div>
<div class="action">
<form action="admin" method="post">
    Enter Account ID to Delete <input type="text" placeholder="Account ID" name="idToDelete" required/>
    <input type="submit" value="Delete">
</form>
</div>
<%= request.getAttribute("Message") %>
</body>
</html>