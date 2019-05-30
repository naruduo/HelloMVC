<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%--
  ~ Copyright (c) 2019.
  ~ created by lw
  --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>软件工程精品课</title>
</head>
<body>
<body>
  
<div class="page-wrapper">
		<!--个人信息-->

            <p>  欢迎您${user.name}!</p>
               <p>  工号${user.id}!</p>
				<p>  <a href="changepw.action?changeid=${sessionScope.value}">修改密码</a></p>
<div class="wrap">
    <div class="head">
        <div class="wraper">
            <div class="nav navigaTion" id="nav">
          <ul>     
           <li>                       
                        <a href=""  >                
                        <span>课程主页</span></a>
           </li>    
           <li>                                                 
                        <a href=""  >           
                        <span>习题作业</span></a>
           </li>  
           <li>                         
                        <a href=""  >
                        <span>实验教学</span></a>
           </li>
           <li>                    
                        <a href=""  >             
                        <span>在线练习</span></a>
           </li>   
           <li>                                  
                         <a href="" target='_blank' >                                                       
                         <span>资源中心</span></a>
           </li>     
           <li>                                                                                                                                    
                        <a href=""  target='_blank'>                                                                                  
                        <span>学习社区</span></a>
           </li>             
    </ul>
 </div>
        </div>
    </div>
</div>              
           		

</body>
</html>