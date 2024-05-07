/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import model.AccountType;

/**
 *
 * @author Asus
 */
public class Account {

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountType getRole() {
        return role;
    }

    public void setRole(AccountType role) {
        this.role = role;
    }
    
    private int userID;
    private String username;
    private String password;
    private AccountType role;

    public Account(int userID, String username, String password, AccountType role) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Account() {
    }
}
