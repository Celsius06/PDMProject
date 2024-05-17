/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import Main.Main;
import connection.DatabaseConnection;
import java.awt.Color;
import model.AccountType;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
/**
 *
 * @author Asus
 */
public class Form_UserInfo extends javax.swing.JPanel {

    Main main;
    public Form_UserInfo(Main main) {
        this.main = main;
        initComponents();
        setUserInfo();
    }
    
    public void setUserInfo(){
        lbUsername.setText(main.user.getUsername());
        lbUserID.setText(main.user.getUserID()+"");
        if(main.user.getRole() == AccountType.CUSTOMER){
            textFname.setText(main.customer.getfName());
            textLname.setText(main.customer.getlName());
            textMname.setText(main.customer.getmName());
            textBirth.setText(main.customer.getDateOfBrith());
            boxGender.setSelectedItem(main.customer.getGender().toString());
            textPhone.setText(main.customer.getPhoneNum()+"");
            textAddress.setText(main.customer.getAddress());
            textCitizen.setText(main.customer.getCitizenNum()+"");
        } else {
            textFname.setText(main.employee.getfName());
            textLname.setText(main.employee.getlName());
            textMname.setText(main.employee.getmName());
            textBirth.setText(main.employee.getDateOfBrith());
            boxGender.setSelectedItem(main.employee.getGender().toString());
            textPhone.setText(main.employee.getPhoneNum()+"");
            textAddress.setText(main.employee.getAddress());
            textCitizen.setText(main.employee.getCitizenNum()+"");
        }
        setDisableSetting();
    }
    
    public void setDisableSetting(){
        buttonSaveInfo.setVisible(false);
        buttonCancelInfo.setVisible(false);
        buttonSavePass.setVisible(false);
        buttonCancelPass.setVisible(false);
        lbPass.setVisible(false);
        textPass.setVisible(false);
        lbNPass.setVisible(false);
        textNPass.setVisible(false);
        lbCPass.setVisible(false);
        textCPass.setVisible(false);
        lbInvalid1.setVisible(false);
        lbInvalid2.setVisible(false);
        lbInvalid3.setVisible(false);
        textFname.setEditable(false);
        textLname.setEditable(false);
        textMname.setEditable(false);
        textBirth.setEditable(false);
        boxGender.setEnabled(false);
        textPhone.setEditable(false);
        textAddress.setEditable(false);
        textCitizen.setEditable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorderGradient1 = new swing.PanelBorderGradient();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        textFname = new javax.swing.JTextField();
        textMname = new javax.swing.JTextField();
        textLname = new javax.swing.JTextField();
        textBirth = new javax.swing.JTextField();
        textPhone = new javax.swing.JTextField();
        textAddress = new javax.swing.JTextField();
        textCitizen = new javax.swing.JTextField();
        lbUsername = new javax.swing.JLabel();
        lbUserID = new javax.swing.JLabel();
        buttonEdit = new swing.Button();
        buttonChange = new swing.Button();
        lbPass = new javax.swing.JLabel();
        textPass = new javax.swing.JTextField();
        lbNPass = new javax.swing.JLabel();
        textNPass = new javax.swing.JTextField();
        lbCPass = new javax.swing.JLabel();
        textCPass = new javax.swing.JTextField();
        buttonSaveInfo = new swing.Button();
        buttonCancelInfo = new swing.Button();
        buttonSavePass = new swing.Button();
        buttonCancelPass = new swing.Button();
        lbInvalid2 = new javax.swing.JLabel();
        lbInvalid3 = new javax.swing.JLabel();
        lbInvalid1 = new javax.swing.JLabel();
        boxGender = new javax.swing.JComboBox<>();

        setOpaque(false);

        panelBorderGradient1.setColor1(new java.awt.Color(51, 51, 255));
        panelBorderGradient1.setColor2(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First Name:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Middle Name:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date of birth:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone number:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Citizen number:");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Username:");

        jLabel18.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("User ID:");

        textFname.setEditable(false);
        textFname.setBackground(new Color(0,0,0,0));
        textFname.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        textFname.setForeground(new java.awt.Color(255, 255, 255));
        textFname.setBorder(null);

        textMname.setEditable(false);
        textMname.setBackground(new Color(0,0,0,0));
        textMname.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        textMname.setForeground(new java.awt.Color(255, 255, 255));
        textMname.setBorder(null);

        textLname.setEditable(false);
        textLname.setBackground(new Color(0,0,0,0));
        textLname.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        textLname.setForeground(new java.awt.Color(255, 255, 255));
        textLname.setBorder(null);

        textBirth.setEditable(false);
        textBirth.setBackground(new Color(0,0,0,0));
        textBirth.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        textBirth.setForeground(new java.awt.Color(255, 255, 255));
        textBirth.setBorder(null);

        textPhone.setEditable(false);
        textPhone.setBackground(new Color(0,0,0,0));
        textPhone.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        textPhone.setForeground(new java.awt.Color(255, 255, 255));
        textPhone.setBorder(null);

        textAddress.setEditable(false);
        textAddress.setBackground(new Color(0,0,0,0));
        textAddress.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        textAddress.setForeground(new java.awt.Color(255, 255, 255));
        textAddress.setBorder(null);

        textCitizen.setEditable(false);
        textCitizen.setBackground(new Color(0,0,0,0));
        textCitizen.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        textCitizen.setForeground(new java.awt.Color(255, 255, 255));
        textCitizen.setBorder(null);

        lbUsername.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbUsername.setForeground(new java.awt.Color(255, 255, 255));

        lbUserID.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbUserID.setForeground(new java.awt.Color(255, 255, 255));

        buttonEdit.setForeground(new java.awt.Color(255, 255, 255));
        buttonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/edit-info.png"))); // NOI18N
        buttonEdit.setText("Edit User Info");
        buttonEdit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonChange.setForeground(new java.awt.Color(255, 255, 255));
        buttonChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/password-manager.png"))); // NOI18N
        buttonChange.setText("Change Password");
        buttonChange.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChangeActionPerformed(evt);
            }
        });

        lbPass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbPass.setForeground(new java.awt.Color(255, 255, 255));
        lbPass.setText("Current Password:");

        textPass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lbNPass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbNPass.setForeground(new java.awt.Color(255, 255, 255));
        lbNPass.setText("New Password:");

        textNPass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lbCPass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbCPass.setForeground(new java.awt.Color(255, 255, 255));
        lbCPass.setText("Confirm Password:");

        textCPass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        buttonSaveInfo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        buttonSaveInfo.setForeground(new java.awt.Color(255, 255, 255));
        buttonSaveInfo.setText("SAVE");
        buttonSaveInfo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        buttonSaveInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveInfoActionPerformed(evt);
            }
        });

        buttonCancelInfo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        buttonCancelInfo.setForeground(new java.awt.Color(255, 255, 255));
        buttonCancelInfo.setText("CANCEL");
        buttonCancelInfo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        buttonCancelInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelInfoActionPerformed(evt);
            }
        });

        buttonSavePass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        buttonSavePass.setForeground(new java.awt.Color(255, 255, 255));
        buttonSavePass.setText("SAVE");
        buttonSavePass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonSavePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSavePassActionPerformed(evt);
            }
        });

        buttonCancelPass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        buttonCancelPass.setForeground(new java.awt.Color(255, 255, 255));
        buttonCancelPass.setText("CANCEL");
        buttonCancelPass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonCancelPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelPassActionPerformed(evt);
            }
        });

        lbInvalid2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbInvalid2.setForeground(new java.awt.Color(255, 0, 0));
        lbInvalid2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbInvalid2.setText("Invalid!");

        lbInvalid3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbInvalid3.setForeground(new java.awt.Color(255, 0, 0));
        lbInvalid3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbInvalid3.setText("Invalid!");

        lbInvalid1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbInvalid1.setForeground(new java.awt.Color(255, 0, 0));
        lbInvalid1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbInvalid1.setText("Invalid!");

        boxGender.setBackground(new Color(0,0,0,0));
        boxGender.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        boxGender.setForeground(new java.awt.Color(255, 255, 255));
        boxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NONE", "MALE", "FEMALE" }));
        boxGender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        javax.swing.GroupLayout panelBorderGradient1Layout = new javax.swing.GroupLayout(panelBorderGradient1);
        panelBorderGradient1.setLayout(panelBorderGradient1Layout);
        panelBorderGradient1Layout.setHorizontalGroup(
            panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFname, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textMname, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textLname, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(textAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(boxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCitizen, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addComponent(buttonSaveInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCancelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(89, 89, 89)
                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                            .addComponent(buttonSavePass, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(69, 69, 69)
                            .addComponent(buttonCancelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(textCPass, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                            .addComponent(lbCPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbInvalid3))
                        .addComponent(textPass, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(buttonChange, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                            .addComponent(lbNPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbInvalid2))
                        .addComponent(textNPass)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorderGradient1Layout.createSequentialGroup()
                            .addComponent(lbPass, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbInvalid1))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        panelBorderGradient1Layout.setVerticalGroup(
            panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textMname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textLname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbInvalid1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCitizen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonSaveInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCancelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbNPass, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(lbInvalid2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textNPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbCPass, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(lbInvalid3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonSavePass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonCancelPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(22, 22, 22))
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
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        buttonSaveInfo.setVisible(true);
        buttonCancelInfo.setVisible(true);
        textFname.setEditable(true);
        textLname.setEditable(true);
        textMname.setEditable(true);
        textBirth.setEditable(true);
        boxGender.setEnabled(true);
        textPhone.setEditable(true);
        textAddress.setEditable(true);
        textCitizen.setEditable(true);
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChangeActionPerformed
        buttonSavePass.setVisible(true);
        buttonCancelPass.setVisible(true);
        lbPass.setVisible(true);
        textPass.setVisible(true);
        lbNPass.setVisible(true);
        textNPass.setVisible(true);
        lbCPass.setVisible(true);
        textCPass.setVisible(true);
    }//GEN-LAST:event_buttonChangeActionPerformed

    private void buttonSaveInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveInfoActionPerformed
        //"UPDATE loan SET amountPaid = ? WHERE loanID = ?
        String querySaveInfo = null;
        if(main.user.getRole() == AccountType.CUSTOMER){
            querySaveInfo = "UPDATE customer SET fName = ?, mName = ?, lName = ?, date_of_birth = ?, gender = ?, phone_number = ?, address = ?, citizen_number = ? WHERE userID = ?";
        } else {
            querySaveInfo = "UPDATE employee SET fName = ?, mName = ?, lName = ?, date_of_birth = ?, gender = ?, phone_number = ?, address = ?, citizen_number = ? WHERE userID = ?";
        }
        try{
            int phoneNumber;
            int citizenNumber;
            try {
                phoneNumber = Integer.parseInt(textPhone.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Phone number must be an integer.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                citizenNumber = Integer.parseInt(textCitizen.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Citizen number must be an integer.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            PreparedStatement p = DatabaseConnection.getInstance().getConnection().prepareStatement(querySaveInfo);
            p.setString(1, textFname.getText());
            p.setString(2, textMname.getText());
            p.setString(3, textLname.getText());
            p.setString(4, textBirth.getText());
            p.setString(5, (String) boxGender.getSelectedItem());
            p.setInt(6, phoneNumber);
            p.setString(7, textAddress.getText());
            p.setInt(8, citizenNumber);
            p.setInt(9, main.user.getUserID());
            p.executeUpdate();
            JOptionPane.showMessageDialog(null, "Your informations have been updated", null, JOptionPane.OK_OPTION);
        } catch (SQLException e) {
                e.printStackTrace();
        }
    }//GEN-LAST:event_buttonSaveInfoActionPerformed

    private void buttonSavePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSavePassActionPerformed
        try{
            PreparedStatement p = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT password FROM account WHERE userID = ?");
            p.setInt(1, main.user.getUserID());
            ResultSet r = p.executeQuery();
            int password = r.getInt("password");
            int password0 = Integer.parseInt(textPass.getText());
            int password1 = Integer.parseInt(textNPass.getText());
            int password2 = Integer.parseInt(textCPass.getText());
            if(password != password0){
                lbInvalid1.setVisible(true);
                lbInvalid2.setVisible(false);
                lbInvalid3.setVisible(false);
            } else if(password1 != password2){
                lbInvalid1.setVisible(false);
                lbInvalid2.setVisible(true);
                lbInvalid3.setVisible(true);
            } else {
                lbInvalid1.setVisible(false);
                lbInvalid2.setVisible(false);
                lbInvalid3.setVisible(false);
                p = DatabaseConnection.getInstance().getConnection().prepareStatement("UPDATE user SET password = ? WHERE userID = ?");
                p.setInt(1, password1);
                p.setInt(2, main.user.getUserID());
                p.executeUpdate();
                JOptionPane.showMessageDialog(null, "Your password has been changed", null, JOptionPane.OK_OPTION);
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
    }//GEN-LAST:event_buttonSavePassActionPerformed

    private void buttonCancelPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelPassActionPerformed
        setDisableSetting();
    }//GEN-LAST:event_buttonCancelPassActionPerformed

    private void buttonCancelInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelInfoActionPerformed
        setDisableSetting();
    }//GEN-LAST:event_buttonCancelInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxGender;
    private swing.Button buttonCancelInfo;
    private swing.Button buttonCancelPass;
    private swing.Button buttonChange;
    private swing.Button buttonEdit;
    private swing.Button buttonSaveInfo;
    private swing.Button buttonSavePass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbCPass;
    private javax.swing.JLabel lbInvalid1;
    private javax.swing.JLabel lbInvalid2;
    private javax.swing.JLabel lbInvalid3;
    private javax.swing.JLabel lbNPass;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbUserID;
    private javax.swing.JLabel lbUsername;
    private swing.PanelBorderGradient panelBorderGradient1;
    private javax.swing.JTextField textAddress;
    private javax.swing.JTextField textBirth;
    private javax.swing.JTextField textCPass;
    private javax.swing.JTextField textCitizen;
    private javax.swing.JTextField textFname;
    private javax.swing.JTextField textLname;
    private javax.swing.JTextField textMname;
    private javax.swing.JTextField textNPass;
    private javax.swing.JTextField textPass;
    private javax.swing.JTextField textPhone;
    // End of variables declaration//GEN-END:variables
}
