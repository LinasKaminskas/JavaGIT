<%--
  Created by IntelliJ IDEA.
  User: Nemesis
  Date: 2019-01-29
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Start</title>
</head>
<body>
<h1>Prasome uzsiregistruoti </h1>

<form name="loginForm" method="post" action="EmployeesServlet">
    Username:<br>
    <input type="text" name="username"/> <br/>
    Password:<br>
    <input type="password" name="password"/> <br/>
    <br><br>
    <input type="submit" value="Login" />
</form>
<%--<jsp:useBean id="date" class="java.util.Date"/>--%>
<%--<h1>Starting ${date} </h1>--%>

</body>
</html>
