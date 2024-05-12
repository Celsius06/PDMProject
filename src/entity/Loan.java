/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import model.LoanType;
import model.StatusType;

/**
 *
 * @author Asus
 */
public class Loan {
    private int loanID;
    private int loanAmount;
    private StatusType status;
    private String loanDate;
    private double interestRate;
    private int loanTerm;
    private LoanType type;

    public int getLoanID() {
        return loanID;
    }

    public void setLoanID(int loanID) {
        this.loanID = loanID;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    public LoanType getType() {
        return type;
    }

    public void setType(LoanType type) {
        this.type = type;
    }

    public Loan(int loanID, int loanAmount, StatusType status, String loanDate, double interestRate, int loanTerm, LoanType type) {
        this.loanID = loanID;
        this.loanAmount = loanAmount;
        this.status = status;
        this.loanDate = loanDate;
        this.interestRate = interestRate;
        this.loanTerm = loanTerm;
        this.type = type;
    }

    public Loan() {
    }

}
