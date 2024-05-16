/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import Main.Main;
import connection.DatabaseConnection;
import entity.Loan;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import model.GenerateIDType;
import model.LoanType;
import model.RecordType;
import model.StatusType;
import model.TransactionType;

/**
 *
 * @author Asus
 */
public class Form_Applications extends javax.swing.JPanel {

    Main main;
    private LoanType type;
    private double interestRate;
    private double monthlyPayment;
    private double payRequire;
    private Loan loan;
    public Form_Applications(Main main, LoanType type) {
        initConnection();
        this.main = main;
        this.type = type;
        initComponents();
        if(type == LoanType.PERSONAL){
            lbType.setText(type.toString()+" LOAN");
            lbIcon.setIcon(new ImageIcon(getClass().getResource("/Graphics/personal.png")));
            lbInterestRate.setText("8%");
            interestRate = 0.08;
        } else if (type == LoanType.AUTO){
            lbType.setText(type.toString()+" LOAN");
            lbIcon.setIcon(new ImageIcon(getClass().getResource("/Graphics/car-loan.png")));
            lbInterestRate.setText("4.5%");
            interestRate = 0.045;
        } else if (type == LoanType.BUSINESS){
            lbType.setText(type.toString()+" LOAN");
            lbIcon.setIcon(new ImageIcon(getClass().getResource("/Graphics/deal.png")));
            lbInterestRate.setText("6%");
            interestRate = 0.06;
        } else if (type == LoanType.INSTALLMENT){
            lbType.setText(type.toString()+" LOAN");
            lbIcon.setIcon(new ImageIcon(getClass().getResource("/Graphics/credit.png")));
            lbInterestRate.setText("10%");
            interestRate = 0.1;
        } else if (type == LoanType.PAYDAY){
            lbType.setText(type.toString()+" LOAN");
            lbIcon.setIcon(new ImageIcon(getClass().getResource("/Graphics/clock.png")));
            lbInterestRate.setText("20%");
            interestRate = 0.2;
        }
    }
    
    private void initConnection() {
        try {
            DatabaseConnection.getInstance().connectToDatabase();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorderGradient1 = new swing.PanelBorderGradient();
        lbType = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbIcon = new javax.swing.JLabel();
        lbAmount = new javax.swing.JLabel();
        sliderAmount = new swing.SliderGradient();
        jLabel5 = new javax.swing.JLabel();
        sliderMonth = new swing.SliderGradient();
        lbMonth = new javax.swing.JLabel();
        textMonth = new javax.swing.JTextField();
        textAmount = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lbInterestRate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbInterestPaid = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        buttonApply = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbMonthlyPayment = new javax.swing.JLabel();

        setOpaque(false);

        panelBorderGradient1.setColor1(new java.awt.Color(0, 0, 255));
        panelBorderGradient1.setColor2(new java.awt.Color(0, 0, 102));

        lbType.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbType.setForeground(new java.awt.Color(255, 255, 255));
        lbType.setText("Loan Type");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Amount:");

        lbAmount.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbAmount.setForeground(new java.awt.Color(255, 255, 255));

        sliderAmount.setForeground(new java.awt.Color(255, 255, 255));
        sliderAmount.setMajorTickSpacing(1000);
        sliderAmount.setMaximum(10000);
        sliderAmount.setMinimum(1000);
        sliderAmount.setPaintLabels(true);
        sliderAmount.setOpaque(false);
        sliderAmount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderAmountStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Month:");

        sliderMonth.setForeground(new java.awt.Color(255, 255, 255));
        sliderMonth.setMajorTickSpacing(2);
        sliderMonth.setMaximum(36);
        sliderMonth.setMinimum(6);
        sliderMonth.setPaintLabels(true);
        sliderMonth.setValue(6);
        sliderMonth.setOpaque(false);
        sliderMonth.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderMonthStateChanged(evt);
            }
        });

        lbMonth.setBackground(new java.awt.Color(255, 255, 255));
        lbMonth.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbMonth.setForeground(new java.awt.Color(255, 255, 255));

        textMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMonthActionPerformed(evt);
            }
        });

        textAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAmountActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Interest rate:");

        lbInterestRate.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        lbInterestRate.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Total Interest Paid:");

        lbInterestPaid.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lbInterestPaid.setForeground(new java.awt.Color(255, 255, 255));

        buttonApply.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonApply.setText("Apply");
        buttonApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApplyActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Monthly Payment:");

        lbMonthlyPayment.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lbMonthlyPayment.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelBorderGradient1Layout = new javax.swing.GroupLayout(panelBorderGradient1);
        panelBorderGradient1.setLayout(panelBorderGradient1Layout);
        panelBorderGradient1Layout.setHorizontalGroup(
            panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addComponent(buttonApply, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                            .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbInterestRate, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbInterestPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbMonthlyPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(lbType, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(59, 59, 59)
                            .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(342, 342, 342)
                                    .addComponent(textAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 393, Short.MAX_VALUE)
                                        .addComponent(textMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(sliderAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(sliderMonth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelBorderGradient1Layout.setVerticalGroup(
            panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                    .addComponent(lbInterestPaid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMonthlyPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorderGradient1Layout.createSequentialGroup()
                                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbInterestRate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                                .addGap(35, 35, 35))))
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(textAmount, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(buttonApply, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(56, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panelBorderGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panelBorderGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sliderAmountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderAmountStateChanged
        lbAmount.setText(sliderAmount.getValue()+" $");
        monthlyPayment = (sliderAmount.getValue()*(interestRate/12.0)*Math.pow((1+(interestRate/12.0)),sliderMonth.getValue()))/(Math.pow((1+(interestRate/12.0)),sliderMonth.getValue())-1);
        lbInterestPaid.setText(String.format("%.2f",monthlyPayment*sliderMonth.getValue()-sliderAmount.getValue())+" $");
        lbMonthlyPayment.setText(String.format("%.2f",monthlyPayment)+" $");
    }//GEN-LAST:event_sliderAmountStateChanged

    private void sliderMonthStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderMonthStateChanged
        lbMonth.setText(sliderMonth.getValue()+"");
        monthlyPayment = (sliderAmount.getValue()*(interestRate/12.0)*Math.pow((1+(interestRate/12.0)),sliderMonth.getValue()))/(Math.pow((1+(interestRate/12.0)),sliderMonth.getValue())-1);
        lbInterestPaid.setText(String.format("%.2f",monthlyPayment*sliderMonth.getValue()-sliderAmount.getValue())+" $");
        lbMonthlyPayment.setText(String.format("%.2f",monthlyPayment)+" $");
    }//GEN-LAST:event_sliderMonthStateChanged

    private void textAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAmountActionPerformed
        int value1 = Integer.parseInt(textAmount.getText());
        sliderAmount.setValue(value1);
    }//GEN-LAST:event_textAmountActionPerformed

    private void textMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMonthActionPerformed
        int value2 = Integer.parseInt(textMonth.getText());
        sliderMonth.setValue(value2);
    }//GEN-LAST:event_textMonthActionPerformed

    private void buttonApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApplyActionPerformed
        lbStatus.setIcon(new ImageIcon(getClass().getResource("/Graphics/tick.png")));
        try{
            int loanID = main.generateID(GenerateIDType.LOAN);
            payRequire = monthlyPayment*sliderMonth.getValue();
            main.insertLoanData(loanID, sliderAmount.getValue(), StatusType.PENDING, main.today, interestRate, sliderMonth.getValue(), monthlyPayment, type, payRequire, 0.0);   
            main.insertRecordData(main.generateID(GenerateIDType.RECORD), loanID, RecordType.LOAN);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_buttonApplyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonApply;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbAmount;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbInterestPaid;
    private javax.swing.JLabel lbInterestRate;
    private javax.swing.JLabel lbMonth;
    private javax.swing.JLabel lbMonthlyPayment;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbType;
    private swing.PanelBorderGradient panelBorderGradient1;
    private swing.SliderGradient sliderAmount;
    private swing.SliderGradient sliderMonth;
    private javax.swing.JTextField textAmount;
    private javax.swing.JTextField textMonth;
    // End of variables declaration//GEN-END:variables
}
