/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import connection.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import model.Model_Card;

/**
 *
 * @author Asus
 */
public class Form_HomeEmp extends javax.swing.JPanel {

    public Form_HomeEmp() {
        initComponents();
        try {
            setHomEmp();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } 
    }
    
    public void setHomEmp()throws SQLException, ClassNotFoundException{
        PreparedStatement p = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT COUNT(customerID) AS cc FROM customer");
        ResultSet r = p.executeQuery();
        r.next();
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/Graphics/group.png")), "Total customer", r.getInt("cc")+" users", ""));
        p = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT SUM(amountPaid - loanAmount) AS sp FROM loan WHERE amountPaid>loanAmount");
        r = p.executeQuery();
        r.next();
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/Graphics/financial-profit.png")), "Company profit", r.getDouble("sp")+"$", ""));
        String sql = "SELECT COUNT(loanID) AS cl, "+
                     "SUM(CASE WHEN loanStatus = 'APPROVED' THEN 1 ELSE 0 END) AS sa, "+
                     "SUM(CASE WHEN loanStatus = 'REJECTED' THEN 1 ELSE 0 END) AS sr "+
                     "FROM loan";
        p = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
        r = p.executeQuery();
        r.next();
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/Graphics/loan (3).png")), "Total loan request", r.getInt("cl")+" requests", "Approved: "+r.getInt("sa")+" | Reject: "+r.getInt("sr")));
        sql = "SELECT COUNT(transactionID) AS ct, "+
              "SUM(CASE WHEN transType = 'DEPOSIT' THEN 1 ELSE 0 END) AS sd, "+
              "SUM(CASE WHEN transType = 'WITHDRAWAL' THEN 1 ELSE 0 END) AS sw, "+
              "SUM(CASE WHEN transType = 'PAY' THEN 1 ELSE 0 END) AS sp "+  
              "FROM transaction";
        p = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
        r = p.executeQuery();
        r.next();
        card4.setData(new Model_Card(new ImageIcon(getClass().getResource("/Graphics/transfer.png")), "Total transaction", r.getInt("ct")+" times", "Deposit: "+r.getInt("sd")+" | Withdrawal: "+r.getInt("sw")+" | Pay: "+r.getInt("sp")));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card1 = new component.Card();
        card2 = new component.Card();
        card3 = new component.Card();
        card4 = new component.Card();

        setOpaque(false);

        card1.setColor2(new java.awt.Color(0, 102, 255));

        card2.setColor2(new java.awt.Color(0, 102, 255));

        card3.setColor2(new java.awt.Color(0, 102, 255));

        card4.setColor2(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(card1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(card3, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.Card card1;
    private component.Card card2;
    private component.Card card3;
    private component.Card card4;
    // End of variables declaration//GEN-END:variables
}
