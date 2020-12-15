package main.com.utils.database;


import main.com.utils.database.factory.ConexionPG;
import main.com.utils.database.factory.ConexionVacia;
import main.com.utils.database.interfaces.IDatabase;

import java.util.Properties;

public class Database {

    public IDatabase getConexion(Properties Pproperties) {

        if (Pproperties.getProperty("MOTOR").equalsIgnoreCase("POSTGRE")) {
            return new ConexionPG(Pproperties);
        } else {
            return new ConexionVacia();
        }

    }
}