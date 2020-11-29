package com.home;

import com.utils.Database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Database db = new Database();

        db.connect();

        db.select("SELECT * FROM cuenta_usuario");

        while (db.getResultSet().next())  System.out.println( db.getResultSet().getString("email"));

        db.disconnect();

    }
}
