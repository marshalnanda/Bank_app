package com.Bank_app;

public class User {
    private int userID;
    private String userName;
    private String userPhoneNumber;
    private String userPassword;
    private int userBalance;

    public User(String userName, String userPhoneNumber, String userPassword) {
        this.userName = userName;
        this.userPhoneNumber = userPhoneNumber;
        this.userPassword = userPassword;
    }

    public User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


    @Override
    public String toString() {
        return  "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userPhoneNumber='" + userPhoneNumber + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userBalance=" + userBalance ;
    }
}
