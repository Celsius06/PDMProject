package model;

public class Model_ApprovedCustomer {

    public Model_Name getName() {
        return name;
    }

    public void setName(Model_Name name) {
        this.name = name;
    }

    public int getLoanID() {
        return loanID;
    }

    public void setLoanID(int loanID) {
        this.loanID = loanID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    private Model_Name name;
    private int loanID;
    private int amount;
    private int months;
    private LoanType loanType;

    public Model_ApprovedCustomer(Model_Name name, int loanID, int amount, int months, LoanType loanType) {
        this.name = name;
        this.loanID = loanID;
        this.amount = amount;
        this.months = months;
        this.loanType = loanType;
    }
}
