package com.Bank_app;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBUtils {
    //TESTING GIT COMMIT AMEND
    // COMMIT 2
    // Commit 3
    private static final String DB_URL = "jdbc:mysql://localhost:3306/";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "NI@ma5678";
    public static Connection getMysqlConnection(String schemaName){
        MysqlDataSource mysqlDS = null;
        Connection conn = null;
        try {
            mysqlDS = new MysqlDataSource();
            mysqlDS.setURL(DB_URL + schemaName);
            mysqlDS.setUser(USER_NAME);
            mysqlDS.setPassword(PASSWORD);
            conn = mysqlDS.getConnection();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}