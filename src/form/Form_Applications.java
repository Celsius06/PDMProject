/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import Main.Main;
import javax.swing.ImageIcon;
import model.TransactionType;

/**
 *
 * @author Asus
 */
public class Form_Applications extends javax.swing.JPanel {

    Main main;
    private String type;
    private double interestRate;
    public Form_Applications(Main main, String type) {
        this.main = main;
        this.type = type;
        initComponents();
        if(type == "Personal"){
            lbIcon.setIcon(new ImageIcon(getClass().getResource("/Graphics/personal.png")));
            lbType.setText("PERSONAL LOAN");
            lbInterestRate.setText("8%");
            interestRate = 8;
        } else if (type == "Auto"){
            lbIcon.setIcon(new ImageIcon(getClass().getResource("/Graphics/car-loan.png")));
            lbType.setText("AUTO LOAN");
            lbInterestRate.setText("4.5%");
            interestRate = 4.5;
        } else if (type == "Business"){
            lbIcon.setIcon(new ImageIcon(getClass().getResource("/Graphics/deal.png")));
            lbType.setText("BUSINESS LOAN");
            lbInterestRate.setText("6%");
            interestRate = 6;
        } else if (type == "Installment"){
            lbIcon.setIcon(new ImageIcon(getClass().getResource("/Graphics/credit.png")));
            lbType.setText("INSTALLMENT LOAN");
            lbInterestRate.setText("10%");
            interestRate = 10;
        } else if (type == "Payday"){
            lbIcon.setIcon(new ImageIcon(getClass().getResource("/Graphics/clock.png")));
            lbType.setText("PAYDAY LOAN");
            lbInterestRate.setText("20%");
            interestRate = 20;
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
        sliderGradient1 = new swing.SliderGradient();
        jLabel5 = new javax.swing.JLabel();
        sliderGradient2 = new swing.SliderGradient();
        lbMonth = new javax.swing.JLabel();
        textMonth = new javax.swing.JTextField();
        textAmount = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lbInterestRate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbInterestPaid = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        buttonApply = new javax.swing.JButton();

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

        sliderGradient1.setForeground(new java.awt.Color(255, 255, 255));
        sliderGradient1.setMajorTickSpacing(1000);
        sliderGradient1.setMaximum(10000);
        sliderGradient1.setMinimum(1000);
        sliderGradient1.setPaintLabels(true);
        sliderGradient1.setOpaque(false);
        sliderGradient1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderGradient1StateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Month:");

        sliderGradient2.setForeground(new java.awt.Color(255, 255, 255));
        sliderGradient2.setMajorTickSpacing(2);
        sliderGradient2.setMaximum(36);
        sliderGradient2.setMinimum(6);
        sliderGradient2.setPaintLabels(true);
        sliderGradient2.setValue(6);
        sliderGradient2.setOpaque(false);
        sliderGradient2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderGradient2StateChanged(evt);
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
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbInterestPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(sliderGradient1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(sliderGradient2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelBorderGradient1Layout.setVerticalGroup(
            panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lbType, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(lbInterestRate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbInterestPaid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorderGradient1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(textAmount, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderGradient2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(buttonApply, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(49, Short.MAX_VALUE))))
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

    private void sliderGradient1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderGradient1StateChanged
        lbAmount.setText(sliderGradient1.getValue()+" $");
        lbInterestPaid.setText(sliderGradient1.getValue()*sliderGradient2.getValue()*interestRate/100+"");
    }//GEN-LAST:event_sliderGradient1StateChanged

    private void sliderGradient2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderGradient2StateChanged
        lbMonth.setText(sliderGradient2.getValue()+"");
        lbInterestPaid.setText(sliderGradient1.getValue()*sliderGradient2.getValue()*interestRate/100+"");
    }//GEN-LAST:event_sliderGradient2StateChanged

    private void textAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAmountActionPerformed
        int value1 = Integer.parseInt(textAmount.getText());
        sliderGradient1.setValue(value1);
    }//GEN-LAST:event_textAmountActionPerformed

    private void textMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMonthActionPerformed
        int value2 = Integer.parseInt(textMonth.getText());
        sliderGradient2.setValue(value2);
    }//GEN-LAST:event_textMonthActionPerformed

    private void buttonApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApplyActionPerformed
        lbStatus.setIcon(new ImageIcon(getClass().getResource("/Graphics/tick.png")));
        main.trans.addRecord("Personal", "$2000", "01/01/2024", "APPROVED", TransactionType.LOAN);
    }//GEN-LAST:event_buttonApplyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonApply;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbAmount;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbInterestPaid;
    private javax.swing.JLabel lbInterestRate;
    private javax.swing.JLabel lbMonth;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbType;
    private swing.PanelBorderGradient panelBorderGradient1;
    private swing.SliderGradient sliderGradient1;
    private swing.SliderGradient sliderGradient2;
    private javax.swing.JTextField textAmount;
    private javax.swing.JTextField textMonth;
    // End of variables declaration//GEN-END:variables
}
