<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/9
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>首页</title>
</head>
<body>
<form action="/login" method="post">
  <table>
    <tr>
      <td>用户名</td>
      <td><input type="text" name="username"></td>
    </tr>
    <tr>
      <td>密码</td>
      <td><input type="password" name="password"></td>
    </tr>
    <tr>
      <td><input type="submit" value="登录"></td>
      <td><a href="${pageContext.request.contextPath}/reg.jsp">注册</a></td>
    </tr>
  </table>

</form>
</body>
</html>
