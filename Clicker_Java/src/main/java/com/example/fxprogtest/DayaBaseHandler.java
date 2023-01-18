package com.example.fxprogtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DayaBaseHandler extends Config {
    Connection dbConnection;

    public Connection getDbConnection()
            throws ClassNotFoundException, SQLException{
        String connectionString = "jdbc:mysql://" + dbHost + ":"
                + dbPort + "/" + dbName;

        Class.forName("com.mysql.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionString, dbUser,
                dbPass);

        return dbConnection;
    }

    public void signUpUser(String firstName
                           ) throws SQLException, ClassNotFoundException {
        String insert = "INSERT INTO" +
                Const.USER_TABLE + "(" +
                Const.USER_FIRSTNAME + ")" +

                "VALUES(?,?)";


        try{
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1,firstName);


        prSt.executeUpdate();}
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
