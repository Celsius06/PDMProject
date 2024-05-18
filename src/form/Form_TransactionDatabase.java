/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import connection.DatabaseConnection;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import model.TransactionType;
import swing.ScrollBar;
/**
 *
 * @author Asus
 */
public class Form_TransactionDatabase extends javax.swing.JPanel {

    /**
     * Creates new form Form_LoanDatabase
     */
    public Form_TransactionDatabase() {
        initComponents();
        try {
            setTransactionDatabase();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        setScrollBar();
    }

    public void setTransactionDatabase() throws SQLException, ClassNotFoundException{
        PreparedStatement p = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT transactionID, deposit, withdrawal, payLoan, date, transType, loanID, customerID FROM transaction");
        ResultSet r = p.executeQuery();
        while(r.next()){
            if(r.getString("transType").equals(TransactionType.DEPOSIT.toString())){
                table1.addRow(new Object[]{r.getInt("transactionID"), r.getDouble("deposit")+"$", r.getString("date"), r.getInt("customerID")});
            } else if (r.getString("transType").equals(TransactionType.WITHDRAWAL.toString())){
                table2.addRow(new Object[]{r.getInt("transactionID"), r.getDouble("withdrawal")+"$", r.getString("date"), r.getInt("customerID")});
            } else if (r.getString("transType").equals(TransactionType.PAY.toString())){
                PreparedStatement p1 = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT loanType, payRequire FROM loan WHERE loanID = ?");
                p1.setInt(1, r.getInt("loanID"));
                ResultSet r1 = p1.executeQuery();
                r1.next();
                table3.addRow(new Object[]{r.getInt("transactionID"), r.getInt("loanID"), r1.getString("loanType"), r1.getDouble("payRequire")+"$", r.getDouble("payLoan")+"$", r.getString("date"), r.getInt("customerID")});
            }
        }
    }
    public void setScrollBar(){
        sp1.setVerticalScrollBar(new ScrollBar());
        sp1.getVerticalScrollBar().setBackground(Color.WHITE);
        sp1.getViewport().setBackground(Color.WHITE);
        sp2.setVerticalScrollBar(new ScrollBar());
        sp2.getVerticalScrollBar().setBackground(Color.WHITE);
        sp2.getViewport().setBackground(Color.WHITE);
        sp3.setVerticalScrollBar(new ScrollBar());
        sp3.getVerticalScrollBar().setBackground(Color.WHITE);
        sp3.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        sp1.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        sp2.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        sp3.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp1 = new javax.swing.JScrollPane();
        table1 = new swing.TableDatabase();
        sp3 = new javax.swing.JScrollPane();
        table3 = new swing.TableDatabase();
        panelBorderGradient4 = new swing.PanelBorderGradient();
        jLabel3 = new javax.swing.JLabel();
        panelBorderGradient1 = new swing.PanelBorderGradient();
        jLabel2 = new javax.swing.JLabel();
        panelBorderGradient3 = new swing.PanelBorderGradient();
        jLabel1 = new javax.swing.JLabel();
        sp2 = new javax.swing.JScrollPane();
        table2 = new swing.TableDatabase();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        sp1.setBackground(new java.awt.Color(255, 255, 255));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Amount", "Date", "Customer ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setGridColor(new java.awt.Color(255, 255, 255));
        table1.setSelectionBackground(new java.awt.Color(51, 153, 255));
        sp1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setPreferredWidth(20);
            table1.getColumnModel().getColumn(1).setPreferredWidth(50);
            table1.getColumnModel().getColumn(2).setPreferredWidth(40);
            table1.getColumnModel().getColumn(3).setPreferredWidth(40);
        }

        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Loan ID", "Loan Type", "Require Payment", "Amount Paid", "Date", "Customer ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table3.setGridColor(new java.awt.Color(255, 255, 255));
        table3.setSelectionBackground(new java.awt.Color(51, 153, 255));
        sp3.setViewportView(table3);
        if (table3.getColumnModel().getColumnCount() > 0) {
            table3.getColumnModel().getColumn(0).setPreferredWidth(10);
            table3.getColumnModel().getColumn(1).setPreferredWidth(10);
            table3.getColumnModel().getColumn(5).setPreferredWidth(40);
            table3.getColumnModel().getColumn(6).setPreferredWidth(20);
        }

        panelBorderGradient4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Withdrawal database");

        javax.swing.GroupLayout panelBorderGradient4Layout = new javax.swing.GroupLayout(panelBorderGradient4);
        panelBorderGradient4.setLayout(panelBorderGradient4Layout);
        panelBorderGradient4Layout.setHorizontalGroup(
            panelBorderGradient4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorderGradient4Layout.setVerticalGroup(
            panelBorderGradient4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBorderGradient1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Deposit database");

        javax.swing.GroupLayout panelBorderGradient1Layout = new javax.swing.GroupLayout(panelBorderGradient1);
        panelBorderGradient1.setLayout(panelBorderGradient1Layout);
        panelBorderGradient1Layout.setHorizontalGroup(
            panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorderGradient1Layout.setVerticalGroup(
            panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBorderGradient3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Loan pay back database");

        javax.swing.GroupLayout panelBorderGradient3Layout = new javax.swing.GroupLayout(panelBorderGradient3);
        panelBorderGradient3.setLayout(panelBorderGradient3Layout);
        panelBorderGradient3Layout.setHorizontalGroup(
            panelBorderGradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorderGradient3Layout.setVerticalGroup(
            panelBorderGradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        sp2.setBackground(new java.awt.Color(255, 255, 255));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Amount", "Date", "Customer ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.setGridColor(new java.awt.Color(255, 255, 255));
        table2.setSelectionBackground(new java.awt.Color(51, 153, 255));
        sp2.setViewportView(table2);
        if (table2.getColumnModel().getColumnCount() > 0) {
            table2.getColumnModel().getColumn(0).setPreferredWidth(20);
            table2.getColumnModel().getColumn(1).setPreferredWidth(50);
            table2.getColumnModel().getColumn(2).setPreferredWidth(40);
            table2.getColumnModel().getColumn(3).setPreferredWidth(40);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sp1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelBorderGradient3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelBorderGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sp2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelBorderGradient4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))))
            .addComponent(sp3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBorderGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBorderGradient4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sp1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(panelBorderGradient3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sp3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private swing.PanelBorderGradient panelBorderGradient1;
    private swing.PanelBorderGradient panelBorderGradient3;
    private swing.PanelBorderGradient panelBorderGradient4;
    private javax.swing.JScrollPane sp1;
    private javax.swing.JScrollPane sp2;
    private javax.swing.JScrollPane sp3;
    private swing.TableDatabase table1;
    private swing.TableDatabase table2;
    private swing.TableDatabase table3;
    // End of variables declaration//GEN-END:variables
}
