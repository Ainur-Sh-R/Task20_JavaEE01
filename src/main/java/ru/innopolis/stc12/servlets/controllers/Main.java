package ru.innopolis.stc12.servlets.controllers;

import ru.innopolis.stc12.servlets.pojo.City;
import ru.innopolis.stc12.servlets.repository.dao.CityDaoImpl;
import ru.innopolis.stc12.servlets.service.CityService;
import ru.innopolis.stc12.servlets.service.CityServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CityService service = new CityServiceImpl();
        List<City> jol = service.getAllCity();

        for (City city: jol){
            System.out.println(city);
        }
    }
}
