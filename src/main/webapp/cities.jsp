<%@ page import="ru.innopolis.stc12.servlets.pojo.City" %>
<%@ page import="java.util.List" %>
<%@ page import="ru.innopolis.stc12.servlets.pojo.Student" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 11.10.2018
  Time: 9:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Список городов: </title>
</head>
<body>
<%
    List<City> cityList = (List<City>) request.getAttribute("cities");
    List<Student> studentList = (List<Student>) request.getAttribute("students");
    for (Student student: studentList){
    for (City city: cityList){
        if (student.getCity()==city.getId()){
        %>
<%=student.getName()%> <%=student.getFamily_name()%> <%=city.getName()%> <%=city.getCitizens()%> <BR>
<%
            }
    }
    }
%>
</body>
</html>
