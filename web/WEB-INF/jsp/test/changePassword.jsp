<%--
  ~ Copyright (c) 2019.
  ~ created by lw
  --%>

<%--
  Created by IntelliJ IDEA.
  User: lw
  Date: 2019-06-02
  Time: 23:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.bootcss.com/jquery/3.2.0/jquery.min.js"></script>
    <script type="text/javascript">
        function chpwd(){
            $.ajax({
                type:"POST" ,
                async:false,
                url:"<%=request.getContextPath()%>/user/chpwd.action" ,
                data:$("#chPwdForm").serialize(),
                success:function (data) {
                    console.log(data)
                    alert(data);
                },
                error:function (data) {
                    alert(data);
                }
            });
        }
    </script>
</head>
<body>
    <form id="chPwdForm">
        <input type="password" name="newPwd" id="newPwdFiled" placeholder="请输入新密码" />
        <button type="submit" id="chPwdBtn" onclick="chpwd()">修改</button>
    </form>
</body>
</html>
