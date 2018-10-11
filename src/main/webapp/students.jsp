<%@ page import="java.util.List" %>
<%@ page import="ru.innopolis.stc12.servlets.pojo.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Список студентов: </title>
</head>
<body>
<%
    List<Student> list = (List<Student>) request.getAttribute("list");
    for (Student student : list) {
%>
<%=student.getFamily_name()%> <%=student.getName()%> <%=student.getCity()%><BR>
<%
    }
%>
</body>
</html>
