/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import model.GenderType;

/**
 *
 * @author Asus
 */
public class Employee {

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getCitizenNum() {
        return citizenNum;
    }

    public void setCitizenNum(String citizenNum) {
        this.citizenNum = citizenNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    private int employeeID;
    private String fName;
    private String mName;
    private String lName;
    private String dateOfBrith;
    private GenderType gender; 
    private String phoneNum;
    private String address;
    private String citizenNum;

    public Employee(int employeeID, String fName, String mName, String lName, String dateOfBrith, GenderType gender, String phoneNum, String address, String citizenNum) {
        this.employeeID = employeeID;
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.dateOfBrith = dateOfBrith;
        this.gender = gender;
        this.phoneNum = phoneNum;
        this.address = address;
        this.citizenNum = citizenNum;
    }

    public Employee() {
    }
    
}
