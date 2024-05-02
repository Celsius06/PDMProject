package form;

public class Form_Support extends javax.swing.JPanel {
    public Form_Support() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SupportForm1 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        CustomerInformation2 = new javax.swing.JLabel();
        FullName1 = new javax.swing.JLabel();
        NameBox1 = new javax.swing.JTextField();
        Email1 = new javax.swing.JLabel();
        EmailBox1 = new javax.swing.JTextField();
        PhoneNumber1 = new javax.swing.JLabel();
        PhoneBox1 = new javax.swing.JTextField();
        SubmitButton1 = new javax.swing.JButton();
        CustomerInformation3 = new javax.swing.JLabel();
        LoanID1 = new javax.swing.JLabel();
        LoanIDBox1 = new javax.swing.JTextField();
        LoanType1 = new javax.swing.JLabel();
        LoanTypeSelection1 = new javax.swing.JComboBox<>();
        LoanAmount1 = new javax.swing.JLabel();
        LoanAmountBox1 = new javax.swing.JTextField();
        CustomerID1 = new javax.swing.JLabel();
        CustomerIDBox1 = new javax.swing.JTextField();
        DateofLoan1 = new javax.swing.JLabel();
        DateofLoanBox1 = new javax.swing.JTextField();
        IssueDescription1 = new javax.swing.JLabel();
        IssueBox1 = new javax.swing.JTextField();
        SupportForm = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        CustomerInformation = new javax.swing.JLabel();
        FullName = new javax.swing.JLabel();
        NameBox = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        EmailBox = new javax.swing.JTextField();
        PhoneNumber = new javax.swing.JLabel();
        PhoneBox = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();
        CustomerInformation1 = new javax.swing.JLabel();
        LoanID = new javax.swing.JLabel();
        LoanIDBox = new javax.swing.JTextField();
        LoanType = new javax.swing.JLabel();
        LoanTypeSelection = new javax.swing.JComboBox<>();
        LoanAmount = new javax.swing.JLabel();
        LoanAmountBox = new javax.swing.JTextField();
        CustomerID = new javax.swing.JLabel();
        CustomerIDBox = new javax.swing.JTextField();
        DateofLoan = new javax.swing.JLabel();
        DateofLoanBox = new javax.swing.JTextField();
        IssueDescription = new javax.swing.JLabel();
        IssueBox = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(798, 511));

        SupportForm1.setBackground(new java.awt.Color(153, 204, 255));
        SupportForm1.setFont(new java.awt.Font("Barlow", 1, 36)); // NOI18N
        SupportForm1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SupportForm1.setText("Support Form");

        jLayeredPane2.setBackground(new java.awt.Color(153, 204, 255));
        jLayeredPane2.setPreferredSize(new java.awt.Dimension(798, 511));

        CustomerInformation2.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        CustomerInformation2.setText("Customer Information");

        FullName1.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        FullName1.setText("Full Name");

        NameBox1.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        NameBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameBox1ActionPerformed(evt);
            }
        });

        Email1.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        Email1.setText("Email");

        EmailBox1.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        EmailBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailBox1ActionPerformed(evt);
            }
        });

        PhoneNumber1.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        PhoneNumber1.setText("Phone Number");

        PhoneBox1.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N

        SubmitButton1.setBackground(new java.awt.Color(255, 153, 153));
        SubmitButton1.setFont(new java.awt.Font("Barlow", 1, 36)); // NOI18N
        SubmitButton1.setText("Submit");
        SubmitButton1.setBorderPainted(false);
        SubmitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButton1ActionPerformed(evt);
            }
        });

        CustomerInformation3.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        CustomerInformation3.setText("Loan Information");

        LoanID1.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        LoanID1.setText("Loan ID");

        LoanIDBox1.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        LoanIDBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanIDBox1ActionPerformed(evt);
            }
        });

        LoanType1.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        LoanType1.setText("Loan Type");

        LoanTypeSelection1.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        LoanTypeSelection1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personal Loans", "Business Loans", "Payday Loans", "Installment Loans", "Auto Loans" }));
        LoanTypeSelection1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanTypeSelection1ActionPerformed(evt);
            }
        });

        LoanAmount1.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        LoanAmount1.setText("Loan Amount");

        LoanAmountBox1.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N

        CustomerID1.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        CustomerID1.setText("Customer ID");

        CustomerIDBox1.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N

        DateofLoan1.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        DateofLoan1.setText("Date of Loan");

        DateofLoanBox1.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        DateofLoanBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateofLoanBox1ActionPerformed(evt);
            }
        });

        IssueDescription1.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        IssueDescription1.setText("Issue Description");

        IssueBox1.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N

        jLayeredPane2.setLayer(CustomerInformation2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(FullName1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(NameBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(Email1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(EmailBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(PhoneNumber1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(PhoneBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(SubmitButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(CustomerInformation3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(LoanID1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(LoanIDBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(LoanType1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(LoanTypeSelection1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(LoanAmount1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(LoanAmountBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(CustomerID1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(CustomerIDBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(DateofLoan1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(DateofLoanBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(IssueDescription1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(IssueBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(FullName1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(361, 361, 361)
                        .addComponent(PhoneNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Email1)
                            .addComponent(EmailBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DateofLoan1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DateofLoanBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)))
                        .addGap(75, 75, 75)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CustomerID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(LoanAmountBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CustomerIDBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LoanAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PhoneBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CustomerInformation3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustomerInformation2)))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(SubmitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoanID1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoanIDBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LoanTypeSelection1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LoanType1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(111, 111, 111)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IssueDescription1)
                                    .addComponent(IssueBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CustomerInformation2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(CustomerInformation3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LoanID1)
                            .addComponent(LoanAmount1)
                            .addComponent(DateofLoan1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LoanIDBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhoneNumber1)
                            .addComponent(FullName1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustomerID1)
                            .addComponent(Email1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustomerIDBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoanAmountBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(DateofLoanBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IssueDescription1)
                    .addComponent(LoanType1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IssueBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoanTypeSelection1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(SubmitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SupportForm1, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SupportForm1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBackground(new java.awt.Color(153, 204, 255));
        setPreferredSize(new java.awt.Dimension(798, 511));

        SupportForm.setBackground(new java.awt.Color(153, 204, 255));
        SupportForm.setFont(new java.awt.Font("Barlow", 1, 36)); // NOI18N
        SupportForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SupportForm.setText("Support Form");

        jLayeredPane1.setBackground(new java.awt.Color(153, 204, 255));
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(798, 511));

        CustomerInformation.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        CustomerInformation.setText("Customer Information");

        FullName.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        FullName.setText("Full Name");

        NameBox.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        NameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameBoxActionPerformed(evt);
            }
        });

        Email.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        Email.setText("Email");

        EmailBox.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        EmailBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailBoxActionPerformed(evt);
            }
        });

        PhoneNumber.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        PhoneNumber.setText("Phone Number");

        PhoneBox.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N

        SubmitButton.setBackground(new java.awt.Color(0, 153, 255));
        SubmitButton.setFont(new java.awt.Font("Barlow", 1, 36)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton.setText("Submit");
        SubmitButton.setBorderPainted(false);
        SubmitButton.setVerifyInputWhenFocusTarget(false);
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        CustomerInformation1.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        CustomerInformation1.setText("Loan Information");

        LoanID.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        LoanID.setText("Loan ID");

        LoanIDBox.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        LoanIDBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanIDBoxActionPerformed(evt);
            }
        });

        LoanType.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        LoanType.setText("Loan Type");

        LoanTypeSelection.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        LoanTypeSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personal Loans", "Business Loans", "Payday Loans", "Installment Loans", "Auto Loans" }));
        LoanTypeSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanTypeSelectionActionPerformed(evt);
            }
        });

        LoanAmount.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        LoanAmount.setText("Loan Amount");

        LoanAmountBox.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N

        CustomerID.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        CustomerID.setText("Customer ID");

        CustomerIDBox.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N

        DateofLoan.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        DateofLoan.setText("Date of Loan");

        DateofLoanBox.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        DateofLoanBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateofLoanBoxActionPerformed(evt);
            }
        });

        IssueDescription.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N
        IssueDescription.setText("Issue Description");

        IssueBox.setFont(new java.awt.Font("Barlow", 0, 14)); // NOI18N

        jLayeredPane1.setLayer(CustomerInformation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(FullName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NameBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Email, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(EmailBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(PhoneNumber, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(PhoneBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(SubmitButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(CustomerInformation1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(LoanID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(LoanIDBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(LoanType, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(LoanTypeSelection, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(LoanAmount, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(LoanAmountBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(CustomerID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(CustomerIDBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DateofLoan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DateofLoanBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(IssueDescription, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(IssueBox, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(389, 389, 389)
                                .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Email)
                            .addComponent(EmailBox, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CustomerInformation1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustomerInformation))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LoanType, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LoanTypeSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(110, 110, 110)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IssueDescription)
                                    .addComponent(IssueBox, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoanID, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoanIDBox, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(129, 129, 129)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateofLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateofLoanBox, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CustomerID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(LoanAmountBox, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CustomerIDBox, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LoanAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PhoneBox, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CustomerInformation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumber)
                    .addComponent(FullName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerID)
                    .addComponent(Email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerIDBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CustomerInformation1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LoanID)
                            .addComponent(LoanAmount)
                            .addComponent(DateofLoan))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoanAmountBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(DateofLoanBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LoanIDBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IssueDescription)
                    .addComponent(LoanType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IssueBox, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoanTypeSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SupportForm, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SupportForm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameBoxActionPerformed

    private void EmailBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailBoxActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void LoanIDBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanIDBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoanIDBoxActionPerformed

    private void LoanTypeSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanTypeSelectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoanTypeSelectionActionPerformed

    private void DateofLoanBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateofLoanBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateofLoanBoxActionPerformed

    private void NameBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameBox1ActionPerformed

    private void EmailBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailBox1ActionPerformed

    private void SubmitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitButton1ActionPerformed

    private void LoanIDBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanIDBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoanIDBox1ActionPerformed

    private void LoanTypeSelection1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanTypeSelection1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoanTypeSelection1ActionPerformed

    private void DateofLoanBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateofLoanBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateofLoanBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustomerID;
    private javax.swing.JLabel CustomerID1;
    private javax.swing.JTextField CustomerIDBox;
    private javax.swing.JTextField CustomerIDBox1;
    private javax.swing.JLabel CustomerInformation;
    private javax.swing.JLabel CustomerInformation1;
    private javax.swing.JLabel CustomerInformation2;
    private javax.swing.JLabel CustomerInformation3;
    private javax.swing.JLabel DateofLoan;
    private javax.swing.JLabel DateofLoan1;
    private javax.swing.JTextField DateofLoanBox;
    private javax.swing.JTextField DateofLoanBox1;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Email1;
    private javax.swing.JTextField EmailBox;
    private javax.swing.JTextField EmailBox1;
    private javax.swing.JLabel FullName;
    private javax.swing.JLabel FullName1;
    private javax.swing.JTextField IssueBox;
    private javax.swing.JTextField IssueBox1;
    private javax.swing.JLabel IssueDescription;
    private javax.swing.JLabel IssueDescription1;
    private javax.swing.JLabel LoanAmount;
    private javax.swing.JLabel LoanAmount1;
    private javax.swing.JTextField LoanAmountBox;
    private javax.swing.JTextField LoanAmountBox1;
    private javax.swing.JLabel LoanID;
    private javax.swing.JLabel LoanID1;
    private javax.swing.JTextField LoanIDBox;
    private javax.swing.JTextField LoanIDBox1;
    private javax.swing.JLabel LoanType;
    private javax.swing.JLabel LoanType1;
    private javax.swing.JComboBox<String> LoanTypeSelection;
    private javax.swing.JComboBox<String> LoanTypeSelection1;
    private javax.swing.JTextField NameBox;
    private javax.swing.JTextField NameBox1;
    private javax.swing.JTextField PhoneBox;
    private javax.swing.JTextField PhoneBox1;
    private javax.swing.JLabel PhoneNumber;
    private javax.swing.JLabel PhoneNumber1;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JButton SubmitButton1;
    private javax.swing.JLabel SupportForm;
    private javax.swing.JLabel SupportForm1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
