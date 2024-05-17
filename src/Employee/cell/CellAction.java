package Employee.cell;

import com.raven.table.TableCustom;
import com.raven.table.cell.TableCustomCell;
import com.raven.table.model.TableRowData;
import entity.Loan;
import form.Form_LoanVerification;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.management.Query.lt;
import javax.swing.ImageIcon;
import javax.swing.table.TableModel;
import model.LoanType;

public class CellAction extends TableCustomCell {

    private Form_LoanVerification table1;

    public CellAction(Form_LoanVerification table2) {
        this.table1 = table2;
        initComponents();
    }

    private void addEvent(TableCustom table, TableRowData data, int row) {
        cmdViewClosed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (data.isEditing()) {
                    table.cancelEditRowAt(row);
                    cmdViewClosed.setIcon(new ImageIcon(getClass().getResource("/Graphics/action/viewclosed_18px.png")));
                } else {
                    table.editRowAt(row);
                    cmdViewClosed.setIcon(new ImageIcon(getClass().getResource("/Graphics/action/view_18px.png")));
                }
            }
        });
        cmdDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                table.deleteRowAt(getRow(), true);
            }
        });
        cmdDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                for (int col = 0; col < table.getColumnCount(); col++) {
                   System.out.print(table.getValueAt(row, col) + "\t");
                }
                table.deleteRowAt(getRow(), true);
                
            }
        });

        cmdApproval.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                table1.addRow(new Loan("Thien An", 1, 20000, 12, LoanType.PERSONAL));
                printTableData();
            }
        });

    }

    private void checkIcon(TableRowData data) {
        if (data.isEditing()) {
            cmdViewClosed.setIcon(new ImageIcon(getClass().getResource("/Graphics/action/view_18px.png")));
        } else {
            cmdViewClosed.setIcon(new ImageIcon(getClass().getResource("/Graphics/action/viewclosed_18px.png")));
        }
    }
    
    private void printTableData() {
        TableModel model = table1.getModel();
        int columnCount = model.getColumnCount();
        int rowCount = model.getRowCount();

        for (int col = 0; col < columnCount; col++) {
            System.out.print(model.getColumnName(col) + "\t");
        }
        System.out.println();

        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < columnCount; col++) {
                System.out.print(model.getValueAt(row, col) + "\t");
            }
            System.out.println();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdViewClosed = new Employee.swing.Button();
        cmdDelete = new Employee.swing.Button();
        cmdApproval = new swing.Button();

        cmdViewClosed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/action/viewclosed_18px.png"))); // NOI18N
        cmdViewClosed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdViewClosedActionPerformed(evt);
            }
        });

        cmdDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employee/icon/cancel.png"))); // NOI18N

        cmdApproval.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employee/icon/approve_18px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdViewClosed, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdApproval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdViewClosed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(cmdDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(cmdApproval, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdViewClosedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdViewClosedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdViewClosedActionPerformed

    @Override
    public void setData(Object o) {

    }

    @Override
    public Object getData() {
        return null;
    }

    @Override
    public Component createComponentCellRender(TableCustom table, TableRowData data, int row, int column) {
        CellAction cell = new CellAction(table1);
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
        CellAction cell = new CellAction(table1);
        cell.checkIcon(data);
        cell.addEvent(table, data, row);
        return cell;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button cmdApproval;
    private Employee.swing.Button cmdDelete;
    private Employee.swing.Button cmdViewClosed;
    // End of variables declaration//GEN-END:variables
}
