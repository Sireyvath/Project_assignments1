package com.example.project_assignment;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Collections;

public class DatabaseConnection {
public Collection databaselink;

    public Collection getDBConnection() {
        String databaseName="Search";
        String databaseUser="Nut Sakana";
        String databasePassword="sakana";
        String url="jdbc:mysql://localhost/"+databaseName;
        try {
Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                databaselink= Collections.singleton(DriverManager.getConnection(url, databaseUser, databasePassword));
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return databaselink;

    }
}
