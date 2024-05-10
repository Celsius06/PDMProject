package entity;

import model.GenderType;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Customer {

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDateOfBrith() {
        return dateOfBrith;
    }

    public void setDateOfBrith(String dateOfBrith) {
        this.dateOfBrith = dateOfBrith;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public int getCitizenNum() {
        return citizenNum;
    }
    
    public void setCitizenNum(int citizenNum) {
        this.citizenNum = citizenNum;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public double getAsset() {
        return asset;
    }

    public void setAsset(double asset) {
        this.asset = asset;
    }

    public Customer(int customerID, String fName, String mName, String lName, String dateOfBrith, GenderType gender, int phoneNum, String address, int citizenNum, double debt, double asset) {
        this.customerID = customerID;
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.dateOfBrith = dateOfBrith;
        this.gender = gender;
        this.phoneNum = phoneNum;
        this.address = address;
        this.citizenNum = citizenNum;
        this.debt = debt;
        this.asset = asset;
    }

    public Customer() {
    }
    
    private int customerID;
    private String fName;
    private String mName;
    private String lName;
    private String dateOfBrith;
    private GenderType gender; 
    private int phoneNum;
    private String address;
    private int citizenNum;
    private double debt;
    private double asset;
}
