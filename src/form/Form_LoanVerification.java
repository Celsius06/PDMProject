package form;

import Employee.cell.CellAction;
import Employee.cell.CellName;
import Employee.model.ModelName;
import Employee.model.ModelStaff;
import Main.Main;
import cell.CellAmount;
import cell.CellLoanID;
import cell.CellLoanType;
import cell.CellMonths;
import entity.Loan;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import model.LoanType;
import model.Model_ApprovedCustomer;
import model.Model_Name;

public class Form_LoanVerification extends javax.swing.JPanel {

    Main main;

    public Form_LoanVerification(Main main) {
        this.main = main;
        initComponents();
        setOpaque(false);
        table1.addTableStyle(jScrollPane1);
        table2.addTableStyle(jScrollPane2);
        initDataTable();
    }

    private void initDataTable() {
        table1.addTableCell(new CellName(), 0);
        table1.addTableCell(new CellLoanID(), 1);
        table1.addTableCell(new CellAmount(), 2);
        table1.addTableCell(new CellMonths(), 3);
        table1.addTableCell(new CellLoanType(), 4);
        table1.addTableCell(new CellAction(this), 5);

        table1.addRow(new ModelStaff(new ModelName("Thien", "An", new ImageIcon(getClass().getResource("/Employee/icon/profile.jpg")), ""), "1", 20000, "12", "Personal Loans"), false);
        table1.addRow(new ModelStaff(new ModelName("John", "Cena", new ImageIcon(getClass().getResource("/Employee/icon/profile.jpg")), ""), "1", 30000, "24", "Payday Loans"), false);
        table1.addRow(new ModelStaff(new ModelName("Minh", "Thuan", new ImageIcon(getClass().getResource("/Employee/icon/profile.jpg")), ""), "1", 40000, "36", "Auto Loans"), false);
    }

    public DefaultTableModel getModel() {
        return (DefaultTableModel) table2.getModel();
    }

    public void addRow(Loan loan) {
        DefaultTableModel model = (DefaultTableModel) table2.getModel();
        Object[] rowData = new Object[]{
            loan.getName(),
            loan.getLoanID(),
            loan.getAmount(),
            loan.getMonths(),
            loan.getLoanType()
        };
        model.addRow(rowData);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new swing.RoundPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new swing.TableVerify();
        roundPanel2 = new swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new swing.TableVerify();
        jLabel1 = new javax.swing.JLabel();

        roundPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Approved Customers");

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Loan ID", "Amount", "Months", "Type of Loan"
            }
        ));
        table2.setSelectionBackground(new java.awt.Color(204, 204, 204));
        table2.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(table2);

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE))
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roundPanel2.setBackground(new java.awt.Color(153, 204, 255));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Loan ID", "Amount", "Months", "Type of Loan", "Action"
            }
        ));
        table1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        table1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setPreferredWidth(150);
            table1.getColumnModel().getColumn(4).setPreferredWidth(120);
        }

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Customer Loan Information");

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private swing.RoundPanel roundPanel1;
    private swing.RoundPanel roundPanel2;
    private swing.TableVerify table1;
    private swing.TableVerify table2;
    // End of variables declaration//GEN-END:variables
}
