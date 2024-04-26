package model;

import javax.swing.Icon;
import model.TransactionType;

public class Model_Record {
    
    private String type;
    private String date;
    private String status;
    private String note;
    private String amount;
    private TransactionType trans;
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public TransactionType getTrans() {
        return trans;
    }

    public void setTrans(TransactionType trans) {
        this.trans = trans;
    }
    
    public Model_Record() {
    }

    public Model_Record(String type, String amount, String date, String status, String note, TransactionType trans) {
        this.type = type;
        this.date = date;
        this.status = status;
        this.note = note;
        this.amount = amount;
        this.trans = trans;
    }       
}
