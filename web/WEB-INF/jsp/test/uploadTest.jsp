<%--
  ~ Copyright (c) 2019.
  ~ created by lw
  --%>

<%--
  Created by IntelliJ IDEA.
  User: lw
  Date: 2019-05-28
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传测试</title>
</head>
<body>
    <p>${stu.id}</p>
    <form action="/HelloMVC/user/upload" method="post" enctype="multipart/form-data">
        <input type="file" name="uploadFile" />
        <input type="submit" value="上传" />
    </form>
</body>
</html>
