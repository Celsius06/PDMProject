package form;

import Main.Main;
import connection.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;

public class Form_PayMethod extends javax.swing.JPanel {
    Main main;
    String type;
    double amount = 0;
    private LocalDate currentDate = LocalDate.now();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private String formattedDate = currentDate.format(formatter);
    public Form_PayMethod(Main main, String type) {
        this.main = main;
        this.type = type;
        initComponents();
        lbFName.setText(main.customer.getfName());
        lbLName.setText(main.customer.getlName());
        lbUserID.setText(main.user.getUserID()+"");
        lbBalance.setText(main.customer.getAsset()+" $");
        lbDate.setText(formattedDate);
        if(type.equals("deposit")){
            lbTitle.setText("Deposit Form");
            lbIcon.setIcon(new ImageIcon(getClass().getResource("/Graphics/deposit.png")));
            lbTypeAmount.setText("Deposit amount:");
        } else if (type.equals("withdrawal")){
            lbTitle.setText("Withdrawal Form");
            lbIcon.setIcon(new ImageIcon(getClass().getResource("/Graphics/cash-withdrawal.png")));
            lbTypeAmount.setText("Withdrawal amount:");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        panelBorderGradient1 = new swing.PanelBorderGradient();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbFName = new javax.swing.JLabel();
        lbLName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbUserID = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbBalance = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbAfterTrans = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        lbIcon = new javax.swing.JLabel();
        lbTypeAmount = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        textAmount = new javax.swing.JTextField();
        textCardNum = new javax.swing.JTextField();
        buttonApply = new swing.Button();
        lbStatus = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(798, 511));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setOpaque(false);

        lbTitle.setFont(new java.awt.Font("Barlow", 1, 36)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Title Form");

        panelBorderGradient1.setColor1(new java.awt.Color(0, 0, 204));
        panelBorderGradient1.setColor2(new java.awt.Color(0, 0, 102));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First name:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last name:");

        lbFName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbFName.setForeground(new java.awt.Color(255, 255, 255));

        lbLName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbLName.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("User ID:");

        lbUserID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbUserID.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Current balance:");

        lbBalance.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbBalance.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("After transaction:");

        lbAfterTrans.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbAfterTrans.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Transaction Date:");

        lbDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbDate.setForeground(new java.awt.Color(255, 255, 255));

        lbTypeAmount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbTypeAmount.setForeground(new java.awt.Color(255, 255, 255));
        lbTypeAmount.setText("Type amount:");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Credit card number:");

        textAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAmountActionPerformed(evt);
            }
        });

        buttonApply.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonApply.setForeground(new java.awt.Color(255, 255, 255));
        buttonApply.setText("Apply");
        buttonApply.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApplyActionPerformed(evt);
            }
        });

        lbStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelBorderGradient1Layout = new javax.swing.GroupLayout(panelBorderGradient1);
        panelBorderGradient1.setLayout(panelBorderGradient1Layout);
        panelBorderGradient1Layout.setHorizontalGroup(
            panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbLName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbFName, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbAfterTrans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonApply, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTypeAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                    .addComponent(textCardNum))
                .addGap(31, 31, 31))
        );
        panelBorderGradient1Layout.setVerticalGroup(
            panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorderGradient1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbFName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbTypeAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbLName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCardNum)
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorderGradient1Layout.createSequentialGroup()
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonApply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbAfterTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorderGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(panelBorderGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAmountActionPerformed
        try {
            amount = Integer.parseInt(textAmount.getText());
            if(type.equals("deposit")){
                lbAfterTrans.setText(main.customer.getAsset()+amount+" $");
            } else {
                if(main.customer.getAsset()>=amount){
                    lbAfterTrans.setText(main.customer.getAsset()-amount+" $");
                } else {
                    lbAfterTrans.setText("Invalid value!");
                }
            } 
        } catch (NumberFormatException ex) {
            lbAfterTrans.setText("Invalid value!");
        }
    }//GEN-LAST:event_textAmountActionPerformed

    private void buttonApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApplyActionPerformed
        try{
            if(lbAfterTrans.getText().equals("Invalid value!")){
                lbStatus.setIcon(new ImageIcon(getClass().getResource("/Graphics/cross (1).png")));
            } else {
                PreparedStatement p =  DatabaseConnection.getInstance().getConnection().prepareStatement("UPDATE customer SET asset = ? WHERE customerID = ?");
                p.setInt(2, main.customer.getCustomerID());
                if(type.equals("deposit")){
                    p.setDouble(1, main.customer.getAsset()+amount);
                } else {
                    p.setDouble(1, main.customer.getAsset()-amount);
                }
                p.executeUpdate();
                p.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_buttonApplyActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button buttonApply;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAfterTrans;
    private javax.swing.JLabel lbBalance;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbFName;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbLName;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbTypeAmount;
    private javax.swing.JLabel lbUserID;
    private swing.PanelBorderGradient panelBorderGradient1;
    private javax.swing.JTextField textAmount;
    private javax.swing.JTextField textCardNum;
    // End of variables declaration//GEN-END:variables
}
