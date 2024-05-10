
package component;

import Main.Main;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import model.AccountType;


public class Header extends javax.swing.JPanel {
    
    public Header() {
        initComponents();
        setOpaque(false);
    }
    
    public void setUsername(String username){
        lbUsername.setText(username);
    }
    public void setIcon(String icon){
        lbIcon.setIcon(new ImageIcon(getClass().getResource("/Graphics/"+icon+".png")));
    }
    public void setAccountType(AccountType acc){
        lbAccountType.setText(acc.toString());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIcon = new swing.ImageAvatar();
        lbUsername = new javax.swing.JLabel();
        lbAccountType = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/user.png"))); // NOI18N

        lbUsername.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbUsername.setForeground(new java.awt.Color(255, 255, 255));
        lbUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbUsername.setText("Username");

        lbAccountType.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbAccountType.setForeground(new java.awt.Color(255, 255, 255));
        lbAccountType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbAccountType.setText("Customer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(255, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(lbAccountType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint (RenderingHints. KEY_ANTIALIASING, RenderingHints. VALUE_ANTIALIAS_ON) ;
        g2.setPaint(getBackground());
        GradientPaint gp = new GradientPaint(0, 0, new Color(3, 80, 173), 0, getHeight (), new Color(2, 24, 166));
        g2.setPaint(gp);
        g2.fillRoundRect (0, 0, getWidth (), getHeight (), 15, 15);
        g2.fillRect(0, 0, 25, getHeight());
        g2.fillRect(getWidth() - 25, getHeight() - 25, getWidth(), getHeight());
        super.paintComponent(g);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbAccountType;
    private swing.ImageAvatar lbIcon;
    private javax.swing.JLabel lbUsername;
    // End of variables declaration//GEN-END:variables
}
