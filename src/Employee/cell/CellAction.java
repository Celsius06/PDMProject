package Employee.cell;

import com.raven.table.TableCustom;
import com.raven.table.cell.TableCustomCell;
import com.raven.table.model.TableRowData;
import entity.Loan;
import form.Form_LoanVerification;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import model.LoanType;

public class CellAction extends TableCustomCell {

    private Form_LoanVerification table2;

    public CellAction(Form_LoanVerification table2) {
        this.table2 = table2;
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
                table.deleteRowAt(getRow(), true);
            }
        });

        cmdApproval.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                table2.addRow(new Loan("Thien An", 1, 20000, 12, LoanType.PERSONAL));
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdViewClosed = new Employee.swing.Button();
        cmdDelete = new Employee.swing.Button();
        cmdApproval = new swing.Button();

        cmdViewClosed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/action/viewclosed_18px.png"))); // NOI18N

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

    @Override
    public void setData(Object o) {

    }

    @Override
    public Object getData() {
        return null;
    }

    @Override
    public Component createComponentCellRender(TableCustom table, TableRowData data, int row, int column) {
        CellAction cell = new CellAction(table2);
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
        CellAction cell = new CellAction(table2);
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
