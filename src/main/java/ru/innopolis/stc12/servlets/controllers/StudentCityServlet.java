package ru.innopolis.stc12.servlets.controllers;

import ru.innopolis.stc12.servlets.pojo.City;
import ru.innopolis.stc12.servlets.pojo.Student;
import ru.innopolis.stc12.servlets.service.CityService;
import ru.innopolis.stc12.servlets.service.CityServiceImpl;
import ru.innopolis.stc12.servlets.service.StudentService;
import ru.innopolis.stc12.servlets.service.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class StudentCityServlet extends HttpServlet {
    private StudentService studentService;
    private CityService cityService;

    @Override
    public void init() throws ServletException {
        super.init();
        cityService = new CityServiceImpl();
        studentService = new StudentServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<City> cities = cityService.getAllCity();
        List<Student> students = studentService.getAllStudents();

        req.setAttribute("cities", cities);
        req.setAttribute("students", students);
        req.getRequestDispatcher("/cities.jsp").forward(req, resp);
    }
}
