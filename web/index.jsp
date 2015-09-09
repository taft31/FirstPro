<%--
  Created by IntelliJ IDEA.
  User: taft
  Date: 15/9/7
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+":"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <base href="<%=basePath%>"/>
    <title></title>
  </head>
  <body>
    <h1 align="center">我的首页面</h1>
  </body>
</html>
