<%--<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>--%>
<%--<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">--%>

<%--<!DOCTYPE html>--%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Books Store</title>
</head>
<body>
<center>
    <h1>
        Select the type of Book
    </h1>
    <form method="post" action="SelectBooks">
        <br>
        <select name="Language" size="1">
            <option>CPP</option>
            <option>JAVA</option>
            <option>PYTHON</option>
            <option>GOLANG</option>

        </select>
        <br><br>
        <input type="submit">
    </form>
</center>


</body>
</html>