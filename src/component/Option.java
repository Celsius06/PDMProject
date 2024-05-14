/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import model.LoanType;
import model.Model_Option;

/**
 *
 * @author Asus
 */
public class Option extends javax.swing.JPanel {
    
    private LoanType loan;
    
    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    private Color color1;
    private Color color2;
    
    public Option() {
        initComponents();
        setOpaque(false);
        color1 = Color.WHITE;
        color2 = Color.BLACK;
    }
    
    public void setData(Model_Option data){
        lbTitle.setText(data.getTitle());
        if(data.getType() == "PERSONAL"){
           lbIcon.setIcon(new ImageIcon(getClass().getResource("/Graphics/personal.png")));
        } else if(data.getType() == "AUTO"){
           lbIcon.setIcon(new ImageIcon(getClass().getResource("/Graphics/car-loan.png")));
        } else if(data.getType() == "BUSINESS"){
           lbIcon.setIcon(new ImageIcon(getClass().getResource("/Graphics/deal.png")));
        } else if(data.getType() == "INSTALLMENT"){
           lbIcon.setIcon(new ImageIcon(getClass().getResource("/Graphics/credit.png")));
        } else if(data.getType() == "PAYDAY"){
           lbIcon.setIcon(new ImageIcon(getClass().getResource("/Graphics/clock.png")));
        } else {
           lbIcon.setIcon(new ImageIcon(getClass().getResource("/Graphics/"+data.getType()+".png")));
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIcon = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();

        lbTitle.setBackground(new java.awt.Color(255, 255, 255));
        lbTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setText("Title");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    @Override 
    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint (RenderingHints. KEY_ANTIALIASING, RenderingHints. VALUE_ANTIALIAS_ON) ;
        GradientPaint gp = new GradientPaint(0, getHeight(), color1, getWidth(), 0, color2);
        g2.setPaint(gp);
        g2.fillRoundRect (0, 0, getWidth (), getHeight (), 15, 15);
        g2.setColor(new Color(255,255,255,50));
        g2.fillOval(getWidth() - (getHeight() / 2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth() - (getHeight() / 2) -20, getHeight() / 2 + 20, getHeight(), getHeight());
        super.paintComponent(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbTitle;
    // End of variables declaration//GEN-END:variables
}
