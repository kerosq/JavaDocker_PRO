package main.com.utils.database.factory;

import main.com.utils.database.interfaces.IDatabase;

import java.sql.Connection;

public class ConexionVacia implements IDatabase {

    @Override
    public Connection Connect() {
        System.out.println("Conectando... NO SE ESPECIFICÓ PROVEEDOR");
        return null;
    }

    @Override
    public void Disconnect() {
        System.out.println("Desconectando...NO SE ESPECIFICÓ PROVEEDOR");
    }
}
