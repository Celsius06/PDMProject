package form;

import Main.Main;
import connection.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import model.GenerateIDType;
import model.Model_Card;
import model.RecordType;
import model.TransactionType;

public class Form_PayLoan extends javax.swing.JPanel {
    Main main;
    int amount = 0;
    double amountPaid = 0, payRequire = 0, payAmount = 0;
    public Form_PayLoan(Main main) {
        this.main = main;
        initComponents();
    }
    
    public void setPayLoanForm() throws SQLException, ClassNotFoundException{
        PreparedStatement p = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT loanID FROM loan WHERE customerID = ? AND amountPaid < payRequire AND loanStatus = 'APPROVED' ORDER BY loanID");
        p.setInt(1, main.customer.getCustomerID());
        ResultSet r = p.executeQuery();
        while(r.next()){
            boxLoan.addItem("LoanID: "+r.getInt("loanID"));
        }
        if(boxLoan.getItemCount()== 0){
            Model_Card data = new Model_Card(new ImageIcon(getClass().getResource("/Graphics/debt.png")), "", "You don't have any loan to pay!", "");
            cardLoan.setData(data);
        }
        lbBalance.setText(main.customer.getAsset()+"$");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorderGradient1 = new swing.PanelBorderGradient();
        jLabel2 = new javax.swing.JLabel();
        boxLoan = new javax.swing.JComboBox<>();
        cardLoan = new component.Card();
        jLabel3 = new javax.swing.JLabel();
        textPayAmount = new javax.swing.JTextField();
        buttonApply = new swing.Button();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbBalance = new javax.swing.JLabel();
        lbAfterTrans = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbPaid = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbPayReq = new javax.swing.JLabel();
        lbIcon = new javax.swing.JLabel();
        panelBorderGradient2 = new swing.PanelBorderGradient();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));
        setFont(new java.awt.Font("Barlow", 0, 12)); // NOI18N
        setOpaque(false);

        panelBorderGradient1.setColor1(new java.awt.Color(0, 0, 255));
        panelBorderGradient1.setColor2(new java.awt.Color(0, 51, 153));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Choose a loan to pay:");

        boxLoan.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        boxLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxLoanActionPerformed(evt);
            }
        });

        cardLoan.setColor1(new java.awt.Color(51, 153, 255));
        cardLoan.setColor2(new java.awt.Color(153, 204, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pay amount:");

        textPayAmount.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        textPayAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPayAmountActionPerformed(evt);
            }
        });

        buttonApply.setForeground(new java.awt.Color(255, 255, 255));
        buttonApply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/payment.png"))); // NOI18N
        buttonApply.setText(" Apply");
        buttonApply.setToolTipText("");
        buttonApply.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        buttonApply.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buttonApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApplyActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Current balance:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("After transaction:");

        lbBalance.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbBalance.setForeground(new java.awt.Color(255, 255, 255));

        lbAfterTrans.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbAfterTrans.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total Amount Repaid:");

        lbPaid.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbPaid.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total Pay Require:");

        lbPayReq.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbPayReq.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelBorderGradient1Layout = new javax.swing.GroupLayout(panelBorderGradient1);
        panelBorderGradient1.setLayout(panelBorderGradient1Layout);
        panelBorderGradient1Layout.setHorizontalGroup(
            panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPayReq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPaid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cardLoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(lbAfterTrans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorderGradient1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addComponent(buttonApply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPayAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                .addGap(32, 32, 32))
        );
        panelBorderGradient1Layout.setVerticalGroup(
            panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPayAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(lbAfterTrans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(39, 39, 39)
                        .addComponent(buttonApply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cardLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPayReq, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        panelBorderGradient2.setColor1(new java.awt.Color(0, 51, 255));
        panelBorderGradient2.setColor2(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Loan Payback");

        javax.swing.GroupLayout panelBorderGradient2Layout = new javax.swing.GroupLayout(panelBorderGradient2);
        panelBorderGradient2.setLayout(panelBorderGradient2Layout);
        panelBorderGradient2Layout.setHorizontalGroup(
            panelBorderGradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorderGradient2Layout.setVerticalGroup(
            panelBorderGradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(256, Short.MAX_VALUE)
                .addComponent(panelBorderGradient2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panelBorderGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(panelBorderGradient2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(panelBorderGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApplyActionPerformed
        String selectedItem = (String) boxLoan.getSelectedItem();
        int id = 0;
        if(selectedItem != null){
            id = Integer.parseInt(selectedItem.split(" ")[1]);
        }         
        if(lbAfterTrans.getText().equals("Invalid value!") || payAmount == 0 || id == 0){
            lbIcon.setIcon(new ImageIcon(getClass().getResource("/Graphics/cross (1).png")));
        } else {
            try {
                PreparedStatement p = DatabaseConnection.getInstance().getConnection().prepareStatement("UPDATE loan SET amountPaid = ? WHERE loanID = ?");
                p.setDouble(1, amountPaid+payAmount);
                p.setInt(2, id);
                p.executeUpdate();
                p = DatabaseConnection.getInstance().getConnection().prepareStatement("UPDATE customer SET asset = ?, debt = ? WHERE customerID = ?");
                p.setDouble(1, main.customer.getAsset()-payAmount);
                p.setDouble(2, main.customer.getDebt()-payAmount);
                p.setInt(3, main.customer.getCustomerID());
                p.executeUpdate();
                int transID = main.generateID(GenerateIDType.TRANSACTION);
                main.insertTransactionData(transID, payAmount, main.today, TransactionType.PAY, id);
                lbIcon.setIcon(new ImageIcon(getClass().getResource("/Graphics/tick.png")));
                main.insertRecordData(main.generateID(GenerateIDType.RECORD), transID, RecordType.TRANSACTION);
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }      
    }//GEN-LAST:event_buttonApplyActionPerformed

    private void boxLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxLoanActionPerformed
        String selectedItem = (String) boxLoan.getSelectedItem();
        int id = Integer.parseInt(selectedItem.split(" ")[1]);
        try {
            PreparedStatement p = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT loanType, loanAmount, monthlyPayment, payRequire, amountPaid FROM loan WHERE loanID = ?");
            p.setInt(1, id);
            ResultSet r = p.executeQuery();
            r.next();
            amount = r.getInt("loanAmount");
            amountPaid = r.getDouble("amountPaid");
            payRequire = r.getDouble("payRequire");
            Model_Card data = new Model_Card(new ImageIcon(getClass().getResource("/Graphics/debt.png")), r.getString("loanType"), "Amout: "+amount+"$", "Monthly payment require: "+r.getDouble("monthlyPayment")+"$");
            cardLoan.setData(data);
            lbPaid.setText(amountPaid+"");
            lbPayReq.setText(payRequire+"");
            textPayAmount.setText(payRequire-amountPaid+"");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_boxLoanActionPerformed

    private void textPayAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPayAmountActionPerformed
        try {
            payAmount = Double.parseDouble(textPayAmount.getText());
            if(payAmount == 0){
                lbAfterTrans.setText("Invalid value!");
            } else if(payAmount > main.customer.getAsset()){
                lbAfterTrans.setText("Invalid value!");
            } else if(payAmount > (payRequire-amountPaid)) {
                lbAfterTrans.setText("Invalid value!");
            } else {
                lbAfterTrans.setText(main.customer.getAsset()-payAmount+"$");
            }
        } catch (NumberFormatException ex) {
            lbAfterTrans.setText("Invalid value!");
        }
    }//GEN-LAST:event_textPayAmountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxLoan;
    private swing.Button buttonApply;
    private component.Card cardLoan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbAfterTrans;
    private javax.swing.JLabel lbBalance;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbPaid;
    private javax.swing.JLabel lbPayReq;
    private swing.PanelBorderGradient panelBorderGradient1;
    private swing.PanelBorderGradient panelBorderGradient2;
    private javax.swing.JTextField textPayAmount;
    // End of variables declaration//GEN-END:variables
}
