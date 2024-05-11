package model;

import com.raven.table.model.TableRowData;      // This import comes from the table-custom.jar library

public class Model_Staff extends TableRowData {

    public Model_Staff(Model_Name name, int loanID, int amount, int months, LoanType loanType) {
        this.name = name;
        this.loanID = loanID;
        this.amount = amount;
        this.months = months;
        this.loanType = loanType;
    }

    public Model_Staff() {
    }

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

    @Override
    public Object[] toTableRow() {
        return new Object[]{name, loanID, amount, months, loanType};
    }

    public Object getTypeOfLoan() {
        return loanType;
    }
}
