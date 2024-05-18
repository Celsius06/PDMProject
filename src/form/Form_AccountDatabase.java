/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import connection.DatabaseConnection;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import swing.ScrollBar;
/**
 *
 * @author Asus
 */
public class Form_AccountDatabase extends javax.swing.JPanel {

    /**
     * Creates new form Form_LoanDatabase
     */
    public Form_AccountDatabase() {
        initComponents();
        try {
            setAccountDatabase();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        setScrollBar();
    }

    public void setAccountDatabase() throws SQLException, ClassNotFoundException{
        PreparedStatement p = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT a.userID, a.username, c.fName, c.lName, c.date_of_birth, c.gender, c.phone_number, c.address, c.citizen_number, c.debt, c.asset FROM account a, customer c WHERE a.userID = c.userID ORDER BY a.userID" );
        ResultSet r = p.executeQuery();
        while(r.next()){
            table1.addRow(new Object[]{r.getInt("a.userID"), r.getString("a.username"), r.getString("c.fName")+" "+r.getString("c.lName"), r.getString("c.date_of_birth"), r.getString("c.gender"), r.getString("c.phone_number"), r.getString("c.address"), r.getString("c.citizen_number"), r.getDouble("c.asset")+"$", r.getDouble("c.debt")+"$"});
        }
        p = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT a.userID, a.username, e.fName, e.lName, e.date_of_birth, e.gender, e.phone_number, e.address, e.citizen_number FROM account a, employee e WHERE a.userID = e.userID ORDER BY a.userID");
        r = p.executeQuery();
        while(r.next()){
            table2.addRow(new Object[]{r.getInt("a.userID"), r.getString("a.username"), r.getString("e.fName")+" "+r.getString("e.lName"), r.getString("e.date_of_birth"), r.getString("e.gender"), r.getString("e.phone_number"), r.getString("e.address"), r.getString("e.citizen_number")});
        }
    }
    public void setScrollBar(){
        sp1.setVerticalScrollBar(new ScrollBar());
        sp1.getVerticalScrollBar().setBackground(Color.WHITE);
        sp1.getViewport().setBackground(Color.WHITE);
        sp2.setVerticalScrollBar(new ScrollBar());
        sp2.getVerticalScrollBar().setBackground(Color.WHITE);
        sp2.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        sp1.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        sp2.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp1 = new javax.swing.JScrollPane();
        table1 = new swing.TableDatabase();
        panelBorderGradient1 = new swing.PanelBorderGradient();
        jLabel2 = new javax.swing.JLabel();
        panelBorderGradient3 = new swing.PanelBorderGradient();
        jLabel1 = new javax.swing.JLabel();
        sp2 = new javax.swing.JScrollPane();
        table2 = new swing.TableDatabase();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        sp1.setBackground(new java.awt.Color(255, 255, 255));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "Name", "DoB", "Gender", "Phone", "Address", "Citizen number", "Asset", "Debt"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setGridColor(new java.awt.Color(255, 255, 255));
        table1.setSelectionBackground(new java.awt.Color(51, 153, 255));
        sp1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setMinWidth(1);
            table1.getColumnModel().getColumn(0).setPreferredWidth(2);
            table1.getColumnModel().getColumn(1).setPreferredWidth(45);
            table1.getColumnModel().getColumn(2).setPreferredWidth(60);
            table1.getColumnModel().getColumn(3).setPreferredWidth(40);
            table1.getColumnModel().getColumn(4).setPreferredWidth(15);
            table1.getColumnModel().getColumn(5).setPreferredWidth(35);
            table1.getColumnModel().getColumn(6).setPreferredWidth(45);
            table1.getColumnModel().getColumn(7).setPreferredWidth(50);
            table1.getColumnModel().getColumn(8).setPreferredWidth(20);
            table1.getColumnModel().getColumn(9).setPreferredWidth(20);
        }

        panelBorderGradient1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Customer account database");

        javax.swing.GroupLayout panelBorderGradient1Layout = new javax.swing.GroupLayout(panelBorderGradient1);
        panelBorderGradient1.setLayout(panelBorderGradient1Layout);
        panelBorderGradient1Layout.setHorizontalGroup(
            panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorderGradient1Layout.setVerticalGroup(
            panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBorderGradient3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee account database");

        javax.swing.GroupLayout panelBorderGradient3Layout = new javax.swing.GroupLayout(panelBorderGradient3);
        panelBorderGradient3.setLayout(panelBorderGradient3Layout);
        panelBorderGradient3Layout.setHorizontalGroup(
            panelBorderGradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorderGradient3Layout.setVerticalGroup(
            panelBorderGradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        sp2.setBackground(new java.awt.Color(255, 255, 255));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "Name", "DoB", "Gender", "Phone", "Address", "Citizen number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.setGridColor(new java.awt.Color(255, 255, 255));
        table2.setSelectionBackground(new java.awt.Color(51, 153, 255));
        sp2.setViewportView(table2);
        if (table2.getColumnModel().getColumnCount() > 0) {
            table2.getColumnModel().getColumn(0).setMinWidth(1);
            table2.getColumnModel().getColumn(0).setPreferredWidth(2);
            table2.getColumnModel().getColumn(1).setPreferredWidth(45);
            table2.getColumnModel().getColumn(2).setPreferredWidth(60);
            table2.getColumnModel().getColumn(3).setPreferredWidth(40);
            table2.getColumnModel().getColumn(4).setPreferredWidth(15);
            table2.getColumnModel().getColumn(5).setPreferredWidth(35);
            table2.getColumnModel().getColumn(6).setPreferredWidth(45);
            table2.getColumnModel().getColumn(7).setPreferredWidth(50);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp1, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBorderGradient3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBorderGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(sp2, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(panelBorderGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sp1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(panelBorderGradient3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(sp2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private swing.PanelBorderGradient panelBorderGradient1;
    private swing.PanelBorderGradient panelBorderGradient3;
    private javax.swing.JScrollPane sp1;
    private javax.swing.JScrollPane sp2;
    private swing.TableDatabase table1;
    private swing.TableDatabase table2;
    // End of variables declaration//GEN-END:variables
}
