<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/9
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>登录成功</title>
</head>
<style>

    table tr:hover {background-color:yellow;}

    table {font-family: verdana,arial,sans-serif;font-size:22px;color: black;border-width: 1px;border-color: #666666;border-collapse: collapse;}

    table th {border-width: 1px;padding: 8px;border-style: solid;border-color: #666666;background-color: #80bdff;}

    table td {border-width: 1px;padding: 8px;border-style: solid;border-color: #666666;background-color: plum;}

    .button1{border-width: 1px;padding: 8px;border-style: solid;border-color: #666666;background-color: #80bdff;font-size: 22px}

    .int1{border: none;width: 200px;height: 60px}
    #chaxun{
        font-size: 10px;
        text-align: center;
        width: 40px;
        height: 25px;
        margin-top: 5px;
    }



</style>
<body>
<h1 style="color: green">登录成功！！！</h1>
<form action="/empnoselect" method="get" id="empno">
    <input name="empno" id="input1" type="text" placeholder="请输入员工号">
    <input id="chaxun" type="submit" value="查询">
</form>
<form action="/selectall" method="post">
   <input class="button1" type="submit" value="全部员工">
</form>

<table>
    <tr>
        <th>员工编号</th>
        <th>员工姓名</th>
        <th>工资</th>
        <th>入职时间</th>
        <th>部门编号</th>
        <th>直属领导编号</th>
        <th>工资提成</th>
        <th>分数</th>
        <th>工种</th>
        <th colspan="2">操作</th>

    </tr>
    <c:forEach items="${requestScope.byPage}" var="b">
    <tr>
        <td>${b.empno}</td>
        <td>${b.ename}</td>
        <td>${b.sal}</td>
        <td>${b.hiredate}</td>
        <td>${b.deptno}</td>
        <td>${b.mgr}</td>
        <td>${b.comm}</td>
        <td>${b.score}</td>
        <td>${b.job}</td>
        <td><span><a href="#" style="color: green">修改</a></span></td>
        <td><span><a href="#" style="color: red">删除</a></span></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
