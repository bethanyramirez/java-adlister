package com.codeup.adlister.dao;

public class Config {
    private String url = "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";
    private String user = "adlister_test";
    private String password = "test";

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

}



