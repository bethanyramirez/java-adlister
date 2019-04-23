package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ListUsersDao implements Users{
    private Connection connection = null;
    private List<User> users;

    public ListUsersDao(Config config) {
        try {
            DriverManager.registerDriver((new Driver()));
            connection = DriverManager.getConnection(
                    config.getUrl();
                    config.getUser();
                    config.getPassword();
            )
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public Long insert(User user) {
        String query = "INSERT INTO users(username, email, password) VALUES(?,?,?)";

    }

}


