package form;

public class Form_About extends javax.swing.JPanel {

    public Form_About() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PaymentForm = new javax.swing.JLabel();
        Name1 = new javax.swing.JLabel();
        Name2 = new javax.swing.JLabel();
        Name3 = new javax.swing.JLabel();
        PhoneNumberBox = new javax.swing.JTextField();
        EmailAddressBox = new javax.swing.JTextField();
        CloseBox = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        HeadOfficeBox = new javax.swing.JTextField();

        Name.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        Name.setText("Name");

        setBackground(new java.awt.Color(153, 204, 255));
        setForeground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        PaymentForm.setFont(new java.awt.Font("Barlow", 1, 36)); // NOI18N
        PaymentForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PaymentForm.setText("About");

        Name1.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        Name1.setText("Phone Number:");

        Name2.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        Name2.setText("Head Office:");

        Name3.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        Name3.setText("Email Address:");

        PhoneNumberBox.setFont(new java.awt.Font("Helvetica Neue", 2, 18)); // NOI18N
        PhoneNumberBox.setText("1800 2468 357 (ext. 9)");
        PhoneNumberBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberBoxActionPerformed(evt);
            }
        });

        EmailAddressBox.setFont(new java.awt.Font("Helvetica Neue", 2, 18)); // NOI18N
        EmailAddressBox.setText("Call_center@loanonlinesystem.com");
        EmailAddressBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailAddressBoxActionPerformed(evt);
            }
        });

        CloseBox.setBackground(new java.awt.Color(51, 153, 255));
        CloseBox.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Close");

        javax.swing.GroupLayout CloseBoxLayout = new javax.swing.GroupLayout(CloseBox);
        CloseBox.setLayout(CloseBoxLayout);
        CloseBoxLayout.setHorizontalGroup(
            CloseBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CloseBoxLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        CloseBoxLayout.setVerticalGroup(
            CloseBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CloseBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        HeadOfficeBox.setFont(new java.awt.Font("Helvetica Neue", 2, 18)); // NOI18N
        HeadOfficeBox.setText("Loan Online System Tower");
        HeadOfficeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeadOfficeBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(PaymentForm, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CloseBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(261, 261, 261))))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PhoneNumberBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HeadOfficeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailAddressBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 85, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(PaymentForm)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name1)
                            .addComponent(PhoneNumberBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name3)
                    .addComponent(EmailAddressBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HeadOfficeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(CloseBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PhoneNumberBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberBoxActionPerformed

    private void EmailAddressBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailAddressBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailAddressBoxActionPerformed

    private void HeadOfficeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeadOfficeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HeadOfficeBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CloseBox;
    private javax.swing.JTextField EmailAddressBox;
    private javax.swing.JTextField HeadOfficeBox;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Name1;
    private javax.swing.JLabel Name2;
    private javax.swing.JLabel Name3;
    private javax.swing.JLabel PaymentForm;
    private javax.swing.JTextField PhoneNumberBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
