<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath %>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>表单</title>
</head>
<body>
<form action="/SpringMVC-day01/MyServlet/ZhuCe.do" method="post">
<table>
    <tr>
        <td>用户名</td>
        <td><input type="text" name="uName"></td>
    </tr>
    <tr>
        <td>年龄</td>
        <td><input type="text" name="age"></td>
    </tr>
    <tr>
        <td>身高</td>
        <td><input type="text" name="height"></td>
    </tr>
    <tr>
        <td><input type="submit" value="提交"></td>
        <td><input type="reset" value="重置"></td>
    </tr>
</table>
</form>
</body>
</html>