package ru.innopolis.stc12.servlets.controllers;

import ru.innopolis.stc12.servlets.pojo.Student;
import ru.innopolis.stc12.servlets.repository.dao.StudentDao;
import ru.innopolis.stc12.servlets.repository.dao.StudentDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentInsertServlet extends HttpServlet {
    Student student = null;

    private String name;
    private String family_name;
    private int age;
    private String contact;
    private int city;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //  resp.getWriter().println("testString: " + testString);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        name = req.getParameter("name");
        family_name = req.getParameter("family_name");
        age = Integer.parseInt(req.getParameter("age"));
        contact = req.getParameter("contact");
        city = Integer.parseInt(req.getParameter("city"));
        StudentDao studentDao = new StudentDaoImpl();
        Student student = new Student(0, name, family_name, age, contact, city);
        studentDao.addStudent(student);
    }
}
