<%--
  Created by IntelliJ IDEA.
  User: TrungNguyen
  Date: 7/9/2026
  Time: 4:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Department List Page</title>
</head>
<body>

    <h1>DepartmentList</h1>
    <a href="">Add Department Page</a>

<form action="departments" method="get">
    <label>Tìm Phòng Ban</label>
    <input name="name">
    <button type="submit">Search</button>
</form>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Action</th>
    </tr>

    <c:forEach items="${departments}" var="d">
        <tr>
            <td>
                ${d.id}
            </td>
            <td>
                ${d.name}
            </td>
            <td>
                <a href="">Edit</a>
                <form action="departments" method="post">
                    <input type="hidden" name="action" value="DELETE">
                    <input type="hidden" name="id" value="${d.id}">
                    <button>DELETE</button>
                </form>
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
