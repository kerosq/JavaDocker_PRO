package main.com.utils.database.interfaces;

import java.sql.Connection;
import java.util.Properties;

public interface IDatabase {
    Properties properties = null;

    Connection Connect();

    void Disconnect();
}