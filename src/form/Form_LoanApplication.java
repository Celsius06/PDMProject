
package form;

import Main.Main;
import model.LoanType;
import model.Model_Option;

public class Form_LoanApplication extends javax.swing.JPanel {
    Main main;
    private LoanType type;
    public Form_LoanApplication(Main main) {
        this.main = main;
        initComponents();
        option1.setData(new Model_Option("Personal",type.PERSONAL.toString()));
        option2.setData(new Model_Option("Auto",type.AUTO.toString()));
        option3.setData(new Model_Option("Business",type.BUSINESS.toString()));
        option4.setData(new Model_Option("Installment",type.INSTALLMENT.toString()));
        option5.setData(new Model_Option("Payday",type.PAYDAY.toString()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        option1 = new component.Option();
        option2 = new component.Option();
        option3 = new component.Option();
        option4 = new component.Option();
        option5 = new component.Option();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setOpaque(false);

        option1.setColor1(new java.awt.Color(51, 153, 255));
        option1.setColor2(new java.awt.Color(255, 255, 255));
        option1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option1MouseClicked(evt);
            }
        });

        option2.setColor1(new java.awt.Color(51, 153, 255));
        option2.setColor2(new java.awt.Color(255, 255, 255));
        option2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option2MouseClicked(evt);
            }
        });

        option3.setColor1(new java.awt.Color(51, 153, 255));
        option3.setColor2(new java.awt.Color(255, 255, 255));
        option3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option3MouseClicked(evt);
            }
        });

        option4.setColor1(new java.awt.Color(51, 153, 255));
        option4.setColor2(new java.awt.Color(255, 255, 255));
        option4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option4MouseClicked(evt);
            }
        });

        option5.setColor1(new java.awt.Color(51, 153, 255));
        option5.setColor2(new java.awt.Color(255, 255, 255));
        option5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option5MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Loan Application,");

        jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel2.setText("Choose a type to apply!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(option1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(option5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(option4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(option2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(option3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(option1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(option2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(option4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(option3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(option5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void option1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option1MouseClicked
        main.setForm(new Form_Applications(main,type.PERSONAL));
    }//GEN-LAST:event_option1MouseClicked

    private void option2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option2MouseClicked
        main.setForm(new Form_Applications(main,type.AUTO));
    }//GEN-LAST:event_option2MouseClicked

    private void option3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option3MouseClicked
        main.setForm(new Form_Applications(main,type.BUSINESS));
    }//GEN-LAST:event_option3MouseClicked

    private void option4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option4MouseClicked
        main.setForm(new Form_Applications(main,type.INSTALLMENT));
    }//GEN-LAST:event_option4MouseClicked

    private void option5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option5MouseClicked
        main.setForm(new Form_Applications(main,type.PAYDAY));
    }//GEN-LAST:event_option5MouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private component.Option option1;
    private component.Option option2;
    private component.Option option3;
    private component.Option option4;
    private component.Option option5;
    // End of variables declaration//GEN-END:variables
}
