package form;

import Main.Main;
import form.Form_PayMethod;
import form.Form_PayLoan;
import model.Model_Option;

public class Form_Payment extends javax.swing.JPanel {
    Main main;
    public Form_Payment(Main main) {
        this.main = main;
        initComponents();
        
        // Add mouse click event listener to card1
        option1.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option1MouseClicked(evt);
            }
        });
        
        // Add mouse click event listener to card2
        option2.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option2MouseClicked(evt);
            }
        });
        
        option3.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option3MouseClicked(evt);
            }
        });
        
        option1.setData(new Model_Option("Pay Loan","bank (5)"));
        option2.setData(new Model_Option("Withdrawal","cash-withdrawal"));
        option3.setData(new Model_Option("Deposit","deposit"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        option1 = new component.Option();
        option2 = new component.Option();
        option3 = new component.Option();

        setBackground(new java.awt.Color(102, 204, 255));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(798, 511));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Financial Transactions,");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel1.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Choose a payment method!");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        option1.setColor1(new java.awt.Color(51, 153, 255));
        option1.setColor2(new java.awt.Color(255, 255, 255));

        option2.setColor1(new java.awt.Color(51, 153, 255));
        option2.setColor2(new java.awt.Color(255, 255, 255));

        option3.setColor1(new java.awt.Color(51, 153, 255));
        option3.setColor2(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(option2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(option3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(option1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                        .addGap(110, 110, 110))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(option1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(option2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(option3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void option1MouseClicked(java.awt.event.MouseEvent evt) {                                     
//        Form_Deposit depositForm = new Form_Deposit(main);
//        main.setForm(depositForm);
    } 
    
    private void option2MouseClicked(java.awt.event.MouseEvent evt) {  
        Form_PayMethod payMethodForm = new Form_PayMethod(main,"withdrawal");
        main.setForm(payMethodForm);
    } 
    
    private void option3MouseClicked(java.awt.event.MouseEvent evt) {                                     
        Form_PayMethod payMethodForm = new Form_PayMethod(main,"deposit");
        main.setForm(payMethodForm);
    } 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private component.Option option1;
    private component.Option option2;
    private component.Option option3;
    // End of variables declaration//GEN-END:variables
}
