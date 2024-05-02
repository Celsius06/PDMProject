package form;

public class Form_Pay extends javax.swing.JPanel {
    public Form_Pay() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PaymentForm = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        FirstNameBox = new javax.swing.JTextField();
        FirstName = new javax.swing.JLabel();
        LastNameBox = new javax.swing.JTextField();
        LastName = new javax.swing.JLabel();
        EmailAddress = new javax.swing.JLabel();
        EmailAddressBox = new javax.swing.JTextField();
        TypesofLoan = new javax.swing.JLabel();
        LoanTypeSelection = new javax.swing.JComboBox<>();
        Amount = new javax.swing.JLabel();
        AmountBox = new javax.swing.JTextField();
        ConfirmButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));
        setFont(new java.awt.Font("Barlow", 0, 12)); // NOI18N

        PaymentForm.setFont(new java.awt.Font("Barlow", 1, 36)); // NOI18N
        PaymentForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PaymentForm.setText("Payment Form");

        Name.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        Name.setText("Name");

        FirstNameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameBoxActionPerformed(evt);
            }
        });

        FirstName.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        FirstName.setText("First Name");

        LastNameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameBoxActionPerformed(evt);
            }
        });

        LastName.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        LastName.setText("Last Name");

        EmailAddress.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        EmailAddress.setText("Email Address");

        EmailAddressBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailAddressBoxActionPerformed(evt);
            }
        });

        TypesofLoan.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        TypesofLoan.setText("Type of Loans");

        LoanTypeSelection.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        LoanTypeSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personal Loans", "Business Loans", "Payday Loans", "Installment Loans", "Auto Loans" }));
        LoanTypeSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanTypeSelectionActionPerformed(evt);
            }
        });

        Amount.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        Amount.setText("Amount");

        AmountBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountBoxActionPerformed(evt);
            }
        });

        ConfirmButton.setBackground(new java.awt.Color(0, 153, 255));
        ConfirmButton.setFont(new java.awt.Font("Barlow", 1, 24)); // NOI18N
        ConfirmButton.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/payment.png"))); // NOI18N
        ConfirmButton.setText("Proceed Payment");
        ConfirmButton.setOpaque(true);
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EmailAddressBox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FirstNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LastNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoanTypeSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TypesofLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(214, 214, 214)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AmountBox)
                                .addGap(87, 87, 87))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(PaymentForm, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(PaymentForm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LastNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstName)
                    .addComponent(LastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(EmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailAddressBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TypesofLoan)
                            .addComponent(Amount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LoanTypeSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AmountBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FirstNameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameBoxActionPerformed

    private void AmountBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmountBoxActionPerformed

    private void EmailAddressBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailAddressBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailAddressBoxActionPerformed

    private void LastNameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameBoxActionPerformed

    private void LoanTypeSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanTypeSelectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoanTypeSelectionActionPerformed

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amount;
    private javax.swing.JTextField AmountBox;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JLabel EmailAddress;
    private javax.swing.JTextField EmailAddressBox;
    private javax.swing.JLabel FirstName;
    private javax.swing.JTextField FirstNameBox;
    private javax.swing.JLabel LastName;
    private javax.swing.JTextField LastNameBox;
    private javax.swing.JComboBox<String> LoanTypeSelection;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel PaymentForm;
    private javax.swing.JLabel TypesofLoan;
    // End of variables declaration//GEN-END:variables
}
