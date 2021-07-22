<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 网中鱼
  Date: 2021/7/21
  Time: 1:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<table cellpadding="5" cellspacing="0" border="1">
    <tr>
        <th></th>
        <th>姓名</th>
        <th>性别</th>
        <th>邮箱</th>
    </tr>
        <c:forEach items="${requestScope.list}" var="emp">
     <tr>
            <td>${emp.id}</td>
            <td>${emp.empname}</td>
            <td>${emp.gender==0? "女":"男"}</td>
            <td>${emp.email}</td>
    </tr>
</c:forEach>


</table>

<h1>成功！</h1>
</body>
</html>
