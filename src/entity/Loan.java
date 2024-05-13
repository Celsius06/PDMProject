package entity;

import model.LoanType;

public class Loan {

    private final String name;
    private final int loanID;
    private final int amount;
    private final int months;
    private final LoanType loanType;

    public Loan(String name, int loanID, int amount, int months, LoanType loanType) {
        this.name = name;
        this.loanID = loanID;
        this.amount = amount;
        this.months = months;
        this.loanType = loanType;
    }

    public String getName() {
        return name;
    }

    public int getLoanID() {
        return loanID;
    }

    public int getAmount() {
        return amount;
    }

    public int getMonths() {
        return months;
    }

    public LoanType getLoanType() {
        return loanType;
    }

}
