/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modals;

import java.sql.Date;

/**
 *
 * @author nhviet171
 */
public class User {
   private int userID;
    private String userEmail;
    private String userPassword;
    private String userName;
    private Date userDayOfBirth;
    private String userPhone;
    private String userAddress;

    public User() {
    }

    public User(int userID, String userEmail, String userPassword, String userName, Date userDayOfBirth, String userPhone, String userAddress) {
        this.userID = userID;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userDayOfBirth = userDayOfBirth;
        this.userPhone = userPhone;
        this.userAddress = userAddress;
    }
    
//      public User(String userEmail, String userPassword, String userName, Date userDayOfBirth, String userPhone, String userAddress) {
//        this.userEmail = userEmail;
//        this.userPassword = userPassword;
//        this.userName = userName;
//        this.userDayOfBirth = userDayOfBirth;
//        this.userPhone = userPhone;
//        this.userAddress = userAddress;
//    }
//    
//    

    public User(String userEmail, String userPassword) {
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getUserDayOfBirth() {
        return userDayOfBirth;
    }

    public void setUserDayOfBirth(Date userDayOfBirth) {
        this.userDayOfBirth = userDayOfBirth;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    } 
}
