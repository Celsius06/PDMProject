/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import Main.Main;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import model.Model_Record;
import swing.ScrollBar;
import component.Record;
import connection.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.RecordType;
import model.TransactionType;

/**
 *
 * @author Asus
 */
public class Form_TransactionRecord extends javax.swing.JPanel {

    Main main;
    
    public Form_TransactionRecord(Main main) {
        this.main = main;
        initComponents();
        
        
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
        try {
            setTransactionRecord();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    
    public void addRecord(String type, int amount, String date, String status, TransactionType transactionType) {
        Record rc = new Record();
        rc.setData(new Model_Record(type, amount, date, status, transactionType));
        table.addRow(rc);
    }
    public void removeAllRow(){
        table.removeAllRows();
    }
    
    public void setTransactionRecord() throws SQLException, ClassNotFoundException {
        String sql = "SELECT " +
                     "    r.recordID, r.recordType, l.loanType AS loanLoanType, l.loanAmount, l.loanDate, l.loanStatus, " +
                     "    t.loanID AS transLoanID, t.deposit, t.withdrawal, t.payLoan, t.transType, t.date AS transDate, " +
                     "    l2.loanType AS payLoanType, l2.payRequire " +
                     "FROM record r " +
                     "LEFT JOIN loan l ON r.loanID = l.loanID AND r.recordType = 'LOAN' " +
                     "LEFT JOIN transaction t ON r.transactionID = t.transactionID AND r.recordType = 'TRANSACTION' " +
                     "LEFT JOIN loan l2 ON t.loanID = l2.loanID AND t.transType = 'PAY' " +
                     "WHERE r.customerID = ? " +
                     "ORDER BY r.recordID DESC";

        PreparedStatement p = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
        p.setInt(1, main.customer.getCustomerID());
        ResultSet r = p.executeQuery();
        removeAllRow();

        while (r.next()) {
            RecordType type = RecordType.valueOf(r.getString("recordType"));
            if (type == RecordType.LOAN) {
                addRecord(
                    r.getString("loanLoanType"),
                    r.getInt("loanAmount"),
                    r.getString("loanDate"),
                    r.getString("loanStatus"),
                    TransactionType.LOAN
                );
            } else if (type == RecordType.TRANSACTION) {
                String transType = r.getString("transType");
                if (transType.equals(TransactionType.PAY.toString())) {
                    addRecord(
                        "PAY BACK " + r.getString("payLoanType"),
                        r.getInt("payRequire"),
                        r.getString("transDate"),
                        "Loan ID " + r.getInt("transLoanID") + " | Paid: " + r.getInt("payLoan")+"$",
                        TransactionType.PAY
                    );
                } else if (transType.equals(TransactionType.DEPOSIT.toString())) {
                    addRecord(
                        transType,
                        r.getInt("deposit"),
                        r.getString("transDate"),
                        "SUCCESS",
                        TransactionType.DEPOSIT
                    );
                } else if (transType.equals(TransactionType.WITHDRAWAL.toString())) {
                    addRecord(
                        transType,
                        r.getInt("withdrawal"),
                        r.getString("transDate"),
                        "SUCCESS",
                        TransactionType.WITHDRAWAL
                    );
                }
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        panelBorder1 = new swing.PanelBorder();
        spTable = new javax.swing.JScrollPane();
        table = new swing.TableRecord();
        panelBorder2 = new swing.PanelBorder();
        jLabel2 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setOpaque(false);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        spTable.setBorder(null);
        spTable.setOpaque(false);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Transaction Records");

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents
 
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private swing.PanelBorder panelBorder1;
    private swing.PanelBorder panelBorder2;
    private javax.swing.JScrollPane spTable;
    private swing.TableRecord table;
    // End of variables declaration//GEN-END:variables
}
