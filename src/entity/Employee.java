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

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getCitizenNum() {
        return citizenNum;
    }

    public void setCitizenNum(int citizenNum) {
        this.citizenNum = citizenNum;
    }
    
    private int employeeID;
    private String fName;
    private String mName;
    private String lName;
    private String dateOfBrith;
    private GenderType gender; 
    private int phoneNum;
    private int citizenNum;

    public Employee(int employeeID, String fName, String mName, String lName, String dateOfBrith, GenderType gender, int phoneNum, int citizenNum) {
        this.employeeID = employeeID;
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.dateOfBrith = dateOfBrith;
        this.gender = gender;
        this.phoneNum = phoneNum;
        this.citizenNum = citizenNum;
    }

    public Employee() {
    }
    
}
