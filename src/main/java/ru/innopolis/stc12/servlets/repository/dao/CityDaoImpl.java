package ru.innopolis.stc12.servlets.repository.dao;

import ru.innopolis.stc12.servlets.pojo.City;
import ru.innopolis.stc12.servlets.repository.connectionManager.ConnectionManager;
import ru.innopolis.stc12.servlets.repository.connectionManager.ConnectionManagerJdbcImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CityDaoImpl implements CityDao {
    private static ConnectionManager connectionManager = ConnectionManagerJdbcImpl.getInstance();
    @Override
    public List<City> getAllCity() {
        List<City> result = new ArrayList<>();
        Connection connection = connectionManager.getConnection();
        City city = null;
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT * from cities")
        ) {
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    result.add(new City(resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getInt("citizens")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return result;

    }
}
