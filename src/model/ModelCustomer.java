package model;

import com.raven.table.model.TableRowData;

public class ModelCustomer extends TableRowData {

    public ModelCustomer(Model_Name name, int loanID, int amount, int months, LoanType loanType) {
        this.name = name;
        this.loanID = loanID;
        this.amount = amount;
        this.months = months;
        this.loanType = loanType;
    }

    public ModelCustomer() {
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

    public void setData(Model_ApprovedCustomer approve) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
