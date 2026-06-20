<%--
  Created by IntelliJ IDEA.
  User: TrungNguyen
  Date: 6/20/2026
  Time: 11:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <link href="<%= request.getContextPath() %>/resources/bootstrap.min.css">
</head>
<body class="bg-light">

    <div class="container py-5">
        <form action="${pageContext.request.contextPath}/processFormUpload"
              method="post" enctype="multipart/form-data">
            <label for="name">Name:</label>
            <input type="text" name="name"/>
            <br/>
            <br/>

            <label for="name">Password:</label>
            <input type="password" name="password"/>
            <br/>
            <br/>

            <label for="name">Gender:</label>

            <input type="radio" name="male"/>
            <label for="male">Male</label>

            <input type="text" name="female"/>
            <label for="female">Female:</label>
            <br/>
            <br/>

            <label for="name">Name:</label>
            <input type="text" name="name"/>
            <br/>
            <br/>
        </form>
    </div>

</body>
</html>
