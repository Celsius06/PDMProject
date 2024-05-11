package cell;

import Employee.cell.*;
import com.raven.table.TableCustom;
import com.raven.table.cell.TableCustomCell;
import com.raven.table.model.TableRowData;
import form.Form_LoanVerification;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import model.LoanType;
import model.ModelCustomer;
import model.Model_ApprovedCustomer;
import model.Model_Name;

public class CellApproval extends TableCustomCell {

    public CellApproval(Form_LoanVerification table2) {
        this.table2 = table2;
        initComponents();
    }

    private void addEvent(TableCustom table, TableRowData data, int row) {
        cmdApproval.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Approval button clicked!");
                if (data instanceof ModelCustomer) {
                    ModelCustomer customerData = (ModelCustomer) data;
                    Model_Name name = customerData.getName();
                    int loanID = customerData.getLoanID();
                    int amount = customerData.getAmount();
                    int months = customerData.getMonths();
                    LoanType loanType = customerData.getLoanType();

                    table2.addApprovedCustomer(name, loanID, amount, months, loanType);
                    table2.repaint();
                }
            }
        });
    }

    private void checkIcon(TableRowData data) {
        if (data.isEditing()) {
            cmdApproval.setIcon(new ImageIcon(getClass().getResource("/Employee/icon/approve.png")));
        }
    }

    private final Form_LoanVerification table2;

    public void addApprovedCustomer(Model_Name name, int loanID, int amount, int months, LoanType loanType) {
        Model_ApprovedCustomer approve = new Model_ApprovedCustomer(name, loanID, amount, months, loanType);
        System.out.println("Adding new approved customer: " + approve.getName());
        table2.addRow(approve);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        cmdApproval = new Employee.swing.Button();

        cmdApproval.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employee/icon/approve.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cmdApproval, javax.swing.GroupLayout.PREFERRED_SIZE, 19,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmdApproval, javax.swing.GroupLayout.PREFERRED_SIZE, 19,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    }// </editor-fold>

    @Override
    public void setData(Object o) {

    }

    @Override
    public Object getData() {
        return null;
    }

    @Override
    public Component createComponentCellRender(TableCustom table, TableRowData data, int row, int column) {
        CellApproval cell = new CellApproval(table2);
        cell.checkIcon(data);
        cell.addEvent(table, data, row);
        return cell;
    }

    @Override
    public Component createComponentCellRenderOnEditor(TableCustom table, TableRowData data, int row, int column) {
        return null;
    }

    @Override
    public TableCustomCell createComponentCellEditor(TableCustom table, TableRowData data, Object o, int row, int column) {
        CellApproval cell = new CellApproval(table2);
        cell.checkIcon(data);
        cell.addEvent(table, data, row);
        return cell;
    }

    // Variables declaration - do not modify
    private Employee.swing.Button cmdApproval;
    // End of variables declaration
}
