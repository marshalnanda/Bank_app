package com.Bank_app;

import java.sql.*;

public class DBMain {
    public static boolean insertIntoDB(User user) {
        boolean status=false;
        try(Connection conn=DBUtils.getMysqlConnection("bank_database")){
            String query="INSERT INTO accounts(User_Name,User_phoneNumber,Password) values (?,?,?)";
            PreparedStatement pst= conn.prepareStatement(query);
            pst.setString(1,user.getUserName());
            pst.setString(2,user.getUserPhoneNumber());
            pst.setString(3,user.getUserPassword());
            pst.executeUpdate();
            status=true;
        }catch (SQLException e){
            e.printStackTrace();
        }
    return status;
    }


    public static int showID(String name, String password) {
        int ID=-1;
        try(Connection conn=DBUtils.getMysqlConnection("bank_database")){
            String query="Select Account_ID from accounts WHERE User_Name="+"\""+name+"\""+" AND Password="+"\""+password+"\"";
            System.out.println(query);
            Statement stmt= conn.createStatement();
            ResultSet rs=stmt.executeQuery(query);

            while (rs.next()) {
                ID=rs.getInt("Account_ID");
                System.out.println("Account ID: " + rs.getInt("Account_ID"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return ID;
    }
}
