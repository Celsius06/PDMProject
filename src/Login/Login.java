
package Login;
import Main.Main;
import connection.DatabaseConnection;
import entity.Account;
import entity.Customer;
import entity.Employee;
import java.awt.*;
import java.math.BigDecimal;
import javax.swing.*;
import java.sql.*;
import model.AccountType;
import model.GenderType;
import model.GenerateIDType;
public class Login extends javax.swing.JFrame {
    
    
    private ButtonGroup buttonGroup;
    private String username, password, conPassword;
    public Account user;
    private Customer customer = new Customer();
    private Employee employee = new Employee();
    private int id;
    private GenerateIDType GType;
    static Main main;
    public Login(Main main) {
        this.main = main;
        initComponents();
        initConnection();
        jPanel1.setVisible(false);
        buttonGroup = new ButtonGroup();
        buttonGroup.add(buttonEmployee);
        buttonGroup.add(buttonCustomer);
        buttonCustomer.setSelected(true);
        lbDiffPassword.setVisible(false);
        lbUserExist.setVisible(false); 
        lbLoginNull.setVisible(false);
        lbIncorrectLogin.setVisible(false);
        lbUserNotExist.setVisible(false);
        lbRegNull.setVisible(false);
    }
    
    public Account getUser(){
        return user;
    }
    
    public void setUser(Account user){
        this.user = user;
    }
    private void initConnection() {
        try {
            DatabaseConnection.getInstance().connectToDatabase();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
//    private int generateUserID() throws SQLException, ClassNotFoundException {     
//        PreparedStatement p =  DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT userID FROM account ORDER BY userID DESC LIMIT 1");
//        ResultSet r = p.executeQuery(); 
//        if (r.next()) {
//            int selectedId = r.getInt(1);
//            selectedId++;
//            return selectedId;
//        }
//        return 1;
//    }
//    
//    private int generateCustomerID() throws SQLException, ClassNotFoundException {     
//        PreparedStatement p =  DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT customerID FROM customer ORDER BY customerID DESC LIMIT 1");
//        ResultSet r = p.executeQuery(); 
//        if (r.next()) {
//            int selectedId = r.getInt(1);
//            selectedId++;
//            return selectedId;
//        }
//        return 1;
//    }
//    
//    private int generateEmployeeID() throws SQLException, ClassNotFoundException {     
//        PreparedStatement p =  DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT employeeID FROM employee ORDER BY employeeID DESC LIMIT 1");
//        ResultSet r = p.executeQuery(); 
//        if (r.next()) {
//            int selectedId = r.getInt(1);
//            selectedId++;
//            return selectedId;
//        }
//        return 1;
//    }
    
    public boolean isUsernameNotExist(String username) throws SQLException, ClassNotFoundException {
        PreparedStatement p =  DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT COUNT(*) FROM account WHERE username = ?");
        p.setString(1, username);
        ResultSet r = p.executeQuery(); 
        if (r.next()) {
            int count = r.getInt(1);
            return count == 0;
        }  
        return true;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent (Graphics g) {
                super.paintComponent (g) ;
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint (RenderingHints. KEY_ANTIALIASING, RenderingHints. VALUE_ANTIALIAS_ON) ;
                GradientPaint gp = new GradientPaint (0, 0, new Color(51, 102, 255), 0, getHeight (), new Color(102, 195, 254));
                g2.setPaint (gp);
                g2.fillRoundRect (0, 0, getWidth (), getHeight (), 15, 15);
            }
        };
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        textLogUsername = new javax.swing.JTextField();
        textLogPassword = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbUserNotExist = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lbIncorrectLogin = new javax.swing.JLabel();
        lbLoginNull = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent (Graphics g) {
                super.paintComponent (g) ;
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint (RenderingHints. KEY_ANTIALIASING, RenderingHints. VALUE_ANTIALIAS_ON) ;
                GradientPaint gp = new GradientPaint (0, 0, new Color(102, 195, 254), 0, getHeight (), new Color(51, 102, 255));
                g2.setPaint (gp);
                g2.fillRoundRect (0, 0, getWidth (), getHeight (), 15, 15);
            }
        };
        jLabel4 = new javax.swing.JLabel();
        lbDiffPassword = new javax.swing.JLabel();
        textRegUsername = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        textRegPassword2 = new javax.swing.JPasswordField();
        jLabel19 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buttonRegister = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        textRegPassword1 = new javax.swing.JPasswordField();
        jLabel24 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        buttonEmployee = new javax.swing.JRadioButton();
        buttonCustomer = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        lbUserExist = new javax.swing.JLabel();
        lbRegNull = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Password:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Forget Password?");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("________________________________________");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 295, 31));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Welcome Back!");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 223, 40));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Username:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        textLogUsername.setBackground(new Color(0, 0, 0, 1));
        textLogUsername.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textLogUsername.setForeground(new java.awt.Color(255, 255, 255));
        textLogUsername.setBorder(null);
        jPanel2.add(textLogUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 280, 30));

        textLogPassword.setBackground(new Color(0, 0, 0, 0));
        textLogPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textLogPassword.setForeground(new java.awt.Color(255, 255, 255));
        textLogPassword.setBorder(null);
        jPanel2.add(textLogPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 280, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/user.png"))); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, 31));

        buttonLogin.setBackground(new Color(0, 0, 0, 0));
        buttonLogin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonLogin.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogin.setText("Login");
        buttonLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        buttonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonLoginMouseExited(evt);
            }
        });
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        jPanel2.add(buttonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 325, 35));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("________________________________________");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 295, 27));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/eye (1).png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, 30));

        lbUserNotExist.setBackground(new java.awt.Color(255, 255, 255));
        lbUserNotExist.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbUserNotExist.setForeground(new java.awt.Color(255, 51, 51));
        lbUserNotExist.setText("Username not exists!");
        jPanel2.add(lbUserNotExist, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 280, -1));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Password:");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        lbIncorrectLogin.setBackground(new java.awt.Color(255, 255, 255));
        lbIncorrectLogin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbIncorrectLogin.setForeground(new java.awt.Color(255, 51, 51));
        lbIncorrectLogin.setText("Username or password isn't correct!");
        jPanel2.add(lbIncorrectLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 280, -1));

        lbLoginNull.setBackground(new java.awt.Color(255, 255, 255));
        lbLoginNull.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbLoginNull.setForeground(new java.awt.Color(255, 51, 51));
        lbLoginNull.setText("Username and password must not null!");
        jPanel2.add(lbLoginNull, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 280, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 440));

        jPanel1.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Welcome To Our Application!");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 460, 40));

        lbDiffPassword.setBackground(new java.awt.Color(255, 255, 255));
        lbDiffPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbDiffPassword.setForeground(new java.awt.Color(255, 51, 51));
        lbDiffPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDiffPassword.setText("Password is not same as above!");
        jPanel1.add(lbDiffPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 220, -1));

        textRegUsername.setBackground(new Color(0, 0, 0, 1));
        textRegUsername.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textRegUsername.setForeground(new java.awt.Color(255, 255, 255));
        textRegUsername.setBorder(null);
        jPanel1.add(textRegUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 280, 30));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Register as:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 90, -1));

        textRegPassword2.setBackground(new Color(0, 0, 0, 0));
        textRegPassword2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textRegPassword2.setForeground(new java.awt.Color(255, 255, 255));
        textRegPassword2.setBorder(null);
        jPanel1.add(textRegPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 280, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/eye (1).png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/user.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, 31));

        buttonRegister.setBackground(new Color(0, 0, 0, 0));
        buttonRegister.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonRegister.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegister.setText("Sign Up");
        buttonRegister.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        buttonRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonRegisterMouseExited(evt);
            }
        });
        buttonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(buttonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 325, 35));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("________________________________________");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 295, 27));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("________________________________________");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 295, 27));

        textRegPassword1.setBackground(new Color(0, 0, 0, 0));
        textRegPassword1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textRegPassword1.setForeground(new java.awt.Color(255, 255, 255));
        textRegPassword1.setBorder(null);
        jPanel1.add(textRegPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 280, 30));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("________________________________________");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 295, 27));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/eye (1).png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Password:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Confirm Password:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        buttonEmployee.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        buttonEmployee.setForeground(new java.awt.Color(255, 255, 255));
        buttonEmployee.setText("Employee");
        buttonEmployee.setBorder(null);
        buttonEmployee.setContentAreaFilled(false);
        buttonEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(buttonEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

        buttonCustomer.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        buttonCustomer.setForeground(new java.awt.Color(255, 255, 255));
        buttonCustomer.setText("Customer");
        buttonCustomer.setBorder(null);
        buttonCustomer.setFocusable(false);
        jPanel1.add(buttonCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Username:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        lbUserExist.setBackground(new java.awt.Color(255, 255, 255));
        lbUserExist.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbUserExist.setForeground(new java.awt.Color(255, 51, 51));
        lbUserExist.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbUserExist.setText("Username already exists!");
        jPanel1.add(lbUserExist, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 200, -1));

        lbRegNull.setBackground(new java.awt.Color(255, 255, 255));
        lbRegNull.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbRegNull.setForeground(new java.awt.Color(255, 51, 51));
        lbRegNull.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbRegNull.setText("Username and password must not null!");
        jPanel1.add(lbRegNull, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 260, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 430));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/loginlogotrueee-removebg-preview.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 114, 366, 268));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/bank (1).png"))); // NOI18N
        jLabel3.setText("ONLINE LOAN SYSTEM");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 366, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 102, 255));
        jLabel12.setText("Don't have an account?");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 102, 255));
        jLabel13.setText("Sign up");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/exit.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 460, 430));

        setSize(new java.awt.Dimension(914, 431));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void buttonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisterActionPerformed
        username = textRegUsername.getText();
        password = textRegPassword1.getText();
        conPassword = textRegPassword2.getText();
        try {
            id = main.generateID(GType.USER);
            if(username == "" || password == "" || conPassword == ""){
                lbUserExist.setVisible(false);
                lbDiffPassword.setVisible(false);
                lbRegNull.setVisible(true);
            }
            if(!isUsernameNotExist(username)){
                lbUserExist.setVisible(true);
                lbDiffPassword.setVisible(false);
                lbRegNull.setVisible(false);
            } else if(!textRegPassword1.getText().equals(textRegPassword2.getText())) {
                lbUserExist.setVisible(false);
                lbDiffPassword.setVisible(true);
                lbRegNull.setVisible(false);
            } else {
                lbUserExist.setVisible(false);
                lbDiffPassword.setVisible(false);
                lbRegNull.setVisible(false);
                user = new Account(main.generateID(GType.USER), username, password, null);
                if(buttonCustomer.isSelected()){
                    customer.setCustomerID(main.generateID(GType.CUSTOMER));
                    customer.setDebt(0);
                    customer.setAsset(0);
                    user.setRole(AccountType.CUSTOMER);
                    PreparedStatement p =  DatabaseConnection.getInstance().getConnection().prepareStatement("insert into account(userID, username, password, role)values(?,?,?,?)");
                    p.setInt(1, id);
                    p.setString(2, username);
                    p.setString(3, password);
                    p.setString(4, AccountType.CUSTOMER.toString());
                    p.executeUpdate();
                    p = DatabaseConnection.getInstance().getConnection().prepareStatement("insert into customer(customerID,userID,debt,asset)values(?,?,?,?)");
                    p.setInt(1, main.generateID(GType.CUSTOMER));
                    p.setInt(2, id);
                    p.setBigDecimal(3, BigDecimal.ZERO);
                    p.setBigDecimal(4, BigDecimal.ZERO);
                    p.executeUpdate();
                    main.setCustomer(customer);
                } else {
                    employee.setEmployeeID(main.generateID(GType.EMPLOYEE));
                    user.setRole(AccountType.EMPLOYEE);
                    PreparedStatement p =  DatabaseConnection.getInstance().getConnection().prepareStatement("insert into account(userID, username, password, role)values(?,?,?,?)");
                    p.setInt(1, id);
                    p.setString(2, username);
                    p.setString(3, password);
                    p.setString(4, AccountType.EMPLOYEE.toString());
                    p.executeUpdate();
                    p = DatabaseConnection.getInstance().getConnection().prepareStatement("insert into employee(employeeID,userID)values(?,?)");
                    p.setInt(1, main.generateID(GType.EMPLOYEE));
                    p.setInt(2, id);
                    p.executeUpdate();
                    main.setEmployee(employee);
                }
                main.setUser(user);
                dispose();                     
                main.setVisible(true);
                main.setDashboard();
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_buttonRegisterActionPerformed

    private void buttonRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRegisterMouseEntered
        buttonRegister.setBackground(Color.LIGHT_GRAY);
        buttonRegister.setBorder(null);
    }//GEN-LAST:event_buttonRegisterMouseEntered

    private void buttonRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRegisterMouseExited
        buttonRegister.setBackground(new Color(0, 0, 0, 0));
        buttonRegister.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegister.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
    }//GEN-LAST:event_buttonRegisterMouseExited
    
    private boolean isEyeOpen1 = true;
    
    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        if(isEyeOpen1) {
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/eye.png")));
            textLogPassword.setEchoChar((char)0);
        }
        else {
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/eye (1).png")));
            textLogPassword.setEchoChar('*');
        }
        isEyeOpen1=!isEyeOpen1;
    }//GEN-LAST:event_jLabel11MouseClicked
    
    private boolean isSignUp = true;
    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        if(isSignUp) {
            jPanel1.setVisible(true);
            jPanel2.setVisible(false);
            jLabel12.setText("Already have an account?");
            jLabel13.setText("Login");
        }
        else{
            jPanel1.setVisible(false);
            jPanel2.setVisible(true);
            jLabel12.setText("Don't have an account?");
            jLabel13.setText("Sign up");
        }
        isSignUp = !isSignUp;
    }//GEN-LAST:event_jLabel13MouseClicked
    
    private boolean isEyeOpen2 = true;
    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        if(isEyeOpen2) {
            jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/eye.png")));
            textRegPassword1.setEchoChar((char)0);
        }
        else {
            jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/eye (1).png")));
            textRegPassword1.setEchoChar('*');
        }
        isEyeOpen2=!isEyeOpen2;
    }//GEN-LAST:event_jLabel18MouseClicked
    
    private boolean isEyeOpen3 = true;
    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        if(isEyeOpen3) {
            jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/eye.png")));
            textRegPassword2.setEchoChar((char)0);
        }
        else {
            jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/eye (1).png")));
            textRegPassword2.setEchoChar('*');
        }
        isEyeOpen3=!isEyeOpen3;
    }//GEN-LAST:event_jLabel19MouseClicked

    private void buttonLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMouseEntered
        buttonLogin.setBackground(Color.LIGHT_GRAY);
        buttonLogin.setBorder(null);
    }//GEN-LAST:event_buttonLoginMouseEntered

    private void buttonLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMouseExited
        buttonLogin.setBackground(new Color(0, 0, 0, 0));
        buttonLogin.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
    }//GEN-LAST:event_buttonLoginMouseExited

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        username = textLogUsername.getText();
        password = textLogPassword.getText();
        try{
            if((username=="") || (password=="")){
                lbLoginNull.setVisible(true);
                lbUserNotExist.setVisible(false);
                lbIncorrectLogin.setVisible(false);
            } else if (isUsernameNotExist(username)){
                lbUserNotExist.setVisible(true);
                lbLoginNull.setVisible(false);
                lbIncorrectLogin.setVisible(false);                
            } else {
                PreparedStatement p = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT password FROM account WHERE username = ?");
                p.setString(1, username);
                ResultSet r = p.executeQuery(); 
                if(r.next()){
                    if(password.equals(r.getString("password"))){
                        p = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT userID,role FROM account WHERE username = ?");
                        p.setString(1, username);
                        r = p.executeQuery();
                        r.next();
                        id = r.getInt("userID");
                        AccountType role;
                        if(r.getString("role").equals("CUSTOMER")){
                            role = AccountType.CUSTOMER;
                            p = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT customerID, fName, mName, lName, date_of_birth, gender, phone_number, address, citizen_number, debt, asset FROM customer WHERE userID = ?");
                            p.setInt(1, id);
                            r = p.executeQuery();
                            r.next();
                            customer = new Customer(r.getInt("customerID"), r.getString("fName"), r.getString("mName"), r.getString("lName"), r.getString("date_of_birth"), null, r.getInt("phone_number"), r.getString("address"), r.getInt("citizen_number"), r.getDouble("debt"), r.getDouble("asset"));
                            if(r.getString("gender") != null) {
                                customer.setGender(GenderType.valueOf(r.getString("gender")));
                            } else {
                                customer.setGender(GenderType.NONE);
                            }
                            main.setCustomer(customer);
                        } else {
                            role = AccountType.EMPLOYEE;
                            p = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT employeeID, fName, mName, lName, date_of_birth, gender, phone_number, address, citizen_number FROM employee WHERE userID = ?");
                            p.setInt(1, id);
                            r = p.executeQuery();
                            r.next();
                            employee = new Employee(r.getInt("employeeID"), r.getString("fName"), r.getString("mName"), r.getString("lName"), r.getString("date_of_birth"), null, r.getInt("phone_number"), r.getString("address"), r.getInt("citizen_number"));
                            if(r.getString("gender") != null){
                                employee.setGender(GenderType.valueOf(r.getString("gender")));
                            } else {
                                employee.setGender(GenderType.NONE);
                            }
                            main.setEmployee(employee);
                        }
                        main.setUser(new Account(id,username,password,role));
                        main.setHeader();
                        dispose();                     
                        main.setVisible(true);
                        main.setDashboard();
                    } else {
                        lbUserNotExist.setVisible(false);
                        lbLoginNull.setVisible(false);
                        lbIncorrectLogin.setVisible(true);
                    }
                } else {
                    lbUserNotExist.setVisible(true);
                    lbLoginNull.setVisible(false);
                    lbIncorrectLogin.setVisible(false);  
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_buttonLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login(main).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton buttonCustomer;
    private javax.swing.JRadioButton buttonEmployee;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbDiffPassword;
    private javax.swing.JLabel lbIncorrectLogin;
    private javax.swing.JLabel lbLoginNull;
    private javax.swing.JLabel lbRegNull;
    private javax.swing.JLabel lbUserExist;
    private javax.swing.JLabel lbUserNotExist;
    private javax.swing.JPasswordField textLogPassword;
    private javax.swing.JTextField textLogUsername;
    private javax.swing.JPasswordField textRegPassword1;
    private javax.swing.JPasswordField textRegPassword2;
    private javax.swing.JTextField textRegUsername;
    // End of variables declaration//GEN-END:variables
}
