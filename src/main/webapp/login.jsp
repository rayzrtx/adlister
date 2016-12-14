<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <meta charset="UTF-8">
    <title>Login Form</title>
</head>
<body>
<form action="login.jsp" method="post">
    <div>
        <label><b>Username</b></label>
        <br>
        <input type="text" placeholder="Enter Username" name="username" required>
        <br>

        <label><b>Password</b></label>
        <br>
        <input type="password" placeholder="Enter Password" name="psw" required>
        <br>

        <button type="submit">Login</button>
    </div>

</form>
</body>
</html>