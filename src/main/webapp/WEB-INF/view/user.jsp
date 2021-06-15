<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/15/2021
  Time: 11:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>User</title>
</head>
<body>
<center>
    <h1>Welcome</h1>
    <h3>Account: ${user.account}</h3>
    <h3>Name: ${user.name}</h3>
    <h3>Email: ${user.email}</h3>
    <h3>Age: ${user.age}</h3>
</center>
</body>
</html>
