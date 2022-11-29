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

    public static String showName(int id, String password) {
        String nam = null;
        try(Connection conn=DBUtils.getMysqlConnection("bank_database")){
            String query="Select User_Name from accounts WHERE Account_ID="+"\""+id+"\""+" AND Password="+"\""+password+"\"";
            //System.out.println(query);
            Statement stmt= conn.createStatement();

            ResultSet rs=stmt.executeQuery(query);

            while (rs.next()) {
                nam=rs.getString("User_Name");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return nam;
    }
    public static int showID(String name, String password) {
        int ID=-1;
        try(Connection conn=DBUtils.getMysqlConnection("bank_database")){
            String query="Select Account_ID from accounts WHERE User_Name="+"\""+name+"\""+" AND Password="+"\""+password+"\"";
            //System.out.println(query);
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

    public static int showBalance(int id, String password) {
        int balance=-1;
        try(Connection conn=DBUtils.getMysqlConnection("bank_database")){
            String query="Select `Balance(₹)` from accounts WHERE Account_ID="+"\""+id+"\""+" AND Password="+"\""+password+"\"";
            Statement stmt= conn.createStatement();
            ResultSet rs=stmt.executeQuery(query);

            while (rs.next()) {
                balance=rs.getInt("Balance(₹)");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return balance;
    }

    public static String showPhoneNumber(int id, String password) {
        String pno = null;
        try(Connection conn=DBUtils.getMysqlConnection("bank_database")){
            String query="Select User_phoneNumber from accounts WHERE Account_ID="+"\""+id+"\""+" AND Password="+"\""+password+"\"";
            Statement stmt= conn.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while (rs.next()) {
                pno=rs.getString("User_phoneNumber");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return pno;
    }

    public static boolean checkUserValidation(int id, String password) {
        boolean flag=false;
        try(Connection conn=DBUtils.getMysqlConnection("bank_database")){
            String query="Select Account_ID,Password from accounts WHERE Account_ID="+"\""+id+"\""+" AND Password="+"\""+password+"\"";
            Statement stmt= conn.createStatement();
            ResultSet rs=stmt.executeQuery(query);

            while (rs.next()) {
                int idFromDB=rs.getInt("Account_ID");
                String passwordFromDB=rs.getString("Password");
                if(idFromDB==id && passwordFromDB.contains(password)){
                    flag=true;
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return flag;
    }

    public static boolean deleteUser(int id) {
        boolean flag=false;
        try(Connection conn=DBUtils.getMysqlConnection("bank_database")){
            String query="DELETE FROM accounts WHERE Account_ID=?";
            PreparedStatement pst= conn.prepareStatement(query);
            pst.setInt(1,id);
            pst.executeUpdate();
            System.out.println("Students is deleted with ID = "+id);
            flag=true;
        }catch (SQLException e){
            e.printStackTrace();
        }

        return flag;
    }

    public static void updateBalance(int newBalance, int id) {
        try(Connection conn=DBUtils.getMysqlConnection("bank_database")) {
            String query = "UPDATE accounts SET `Balance(₹)`="+newBalance+" WHERE Account_ID="+id;
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
