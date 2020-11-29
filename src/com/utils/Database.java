package com.utils;

import java.sql.*;
import java.util.Properties;

public class Database extends SQLException {

    // init database constants
    private static final String DATABASE_DRIVER = "org.postgresql.Driver";
    private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/Athena";
    private static final String USERNAME = "admin_db";
    private static final String PASSWORD = "admin_12345678";
    private static final String MAX_POOL = "250";

    // init connection object
    private Connection connection;

    // init properties object
    private Properties properties;

    // init the statement
    private Statement statement;

    private ResultSet resultSet;

    // create properties
    private Properties getProperties() {
        if (properties == null) {
            properties = new Properties();

            properties.setProperty("user", USERNAME);

            properties.setProperty("password", PASSWORD);
        }

        return properties;
    }

    /**
     * Connect to the database
     *
     * @return Connection
     */
    public Connection connect() {
        if (connection == null) {
            try {
                Class.forName(DATABASE_DRIVER);
                connection = (Connection) DriverManager.getConnection(DATABASE_URL, getProperties());
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    /**
     * Disconnect database
     */
    public void disconnect() {
        if (connection != null) {
            try {
                connection.close();
                resultSet.close();

                resultSet = null;
                connection = null;

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Return the result set when a correct SQL statement is provided
     *
     * @param query
     * @return
     * @throws SQLException
     */
    public ResultSet select(String query)  {



        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultSet;
    }

    /**
     * Return the status when a SQL query is provided for INSERT, UPDATE or DELETE
     *
     * @param query
     * @return
     * @throws SQLException
     */
    public int createOrUpdateOrDelete(String query) throws SQLException {
        statement = connection.createStatement();
        int result = statement.executeUpdate(query);
        return result;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }


}