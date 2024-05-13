package cell;

import Main.Main;
import com.raven.table.TableCustom;
import com.raven.table.cell.TableCustomCell;
import com.raven.table.model.TableRowData;
import form.Form_LoanVerification;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class CellAccept_verify extends TableCustomCell {

    Main main;
    private Form_LoanVerification table3;

    public CellAccept_verify(Form_LoanVerification table3) {
        this.main = main;
        initComponents();
    }

    private void addEvent(TableCustom table, TableRowData data, int row) {
        cmdAccept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Approve18x_verify button clicked!");
                if (!data.isEditing()) {
                    cmdAccept.setIcon(new ImageIcon(getClass().getResource("/Employee/icon/approve_18px.png")));
                }
            }
        });
    }

    private void checkIcon(TableRowData data) {
        if (!data.isEditing()) {
            cmdAccept.setIcon(new ImageIcon(getClass().getResource("/Employee/icon/approve_18px.png")));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdAccept = new Employee.swing.Button();

        cmdAccept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employee/icon/approve_18px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdAccept, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        CellAccept_verify cell = new CellAccept_verify(table3);
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
        CellAccept_verify cell = new CellAccept_verify(table3);
        cell.checkIcon(data);
        cell.addEvent(table, data, row);
        return cell;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Employee.swing.Button cmdAccept;
    // End of variables declaration//GEN-END:variables
}
