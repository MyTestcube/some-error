<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/12
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="student" class="beans.Student" scope="request"/>
<%
    out.println("页面2<HR>学生姓名是："+student.getStuname());
%>