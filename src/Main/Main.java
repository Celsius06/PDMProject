package Main;

import Project.Login;
import connection.DatabaseConnection;
import entity.Account;
import entity.Customer;
import entity.Employee;
import event.EventMenuSelected;
import form.Form_About;
import form.Form_Home;
import form.Form_LoanApplication;
import form.Form_2Card;
import form.Form_LoanVerification;
import form.Form_TransactionRecord;
import form.Form_Support;
import form.Form_UserInfo;
import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComponent;
import javax.swing.JPanel;
import model.AccountType;
import model.LoanType;
import model.StatusType;
import model.TransactionType;

public class Main extends javax.swing.JFrame {

    // Declaration
    public Form_Home home;
    public Form_LoanApplication loanApp;
    public Form_2Card card;
    public Form_TransactionRecord trans;
    public Form_LoanVerification verify;
    public Login login;
    public Account user;
    public Customer customer;
    public Employee employee;
    //In case we want form to be static instead of new (reset when change form)
    // private form1 = new Form_Home();
    // setForm(form1);

    public Main() {
        initComponents();
        initConnection();
        login = new Login(this);
        login.setVisible(true);
        setBackground(new Color(0, 0, 0, 0));
    }

    public void switchToSupportForm() {
        setForm(new Form_Support());
    }

    public void setForm(JComponent com) {
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    public void setDashboard() throws SQLException, ClassNotFoundException {
        home = new Form_Home(this);
        loanApp = new Form_LoanApplication(this);
        card = new Form_2Card(this);
        trans = new Form_TransactionRecord(this);
        verify = new Form_LoanVerification(this);
        menu.initMoving(Main.this);
        menu.addEventMenuSelected(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                try {
                    if (index == 0) {
                        setForm(home);
                        setHome();
                    } else if (index == 1) {
                        setForm(new Form_UserInfo());
                    } else if (index == 5) {
                        setForm(loanApp);
                    } else if (index == 6) {
                        setForm(card);
                    } else if (index == 7) {
                        setForm(trans);
                        setTransactionRecord();
                    } else if (index == 11) {
                        setForm(new Form_Support());
                    } else if (index == 12) {
                        setForm(new Form_About());
                        System.out.println(user.getUsername());
                    } else if (index == 15) {
                        setForm(verify);
                    }
                } catch (ClassNotFoundException | SQLException e) {
                    e.printStackTrace();
                }
            }
        });
        setForm(home);
        setHome();
    }

    private void initConnection() {
        try {
            DatabaseConnection.getInstance().connectToDatabase();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public void setHeader() {
        headerBar.setUsername(user.getUsername());
        headerBar.setAccountType(user.getRole());
        if (user.getRole() == AccountType.CUSTOMER) {
            headerBar.setIcon("user (1)");
        } else {
            headerBar.setIcon("man");
        }

    }

    public void setUser(Account user) {
        this.user = user;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void insertLoanData(int id, int amount, StatusType status, String date, double interest, int term, double monthlyPayment, LoanType type) throws SQLException, ClassNotFoundException {
        PreparedStatement p = DatabaseConnection.getInstance().getConnection().prepareStatement("insert into loan(loanID, loanAmount, loanStatus, loanDate, interestRate, loanTerm, monthlyPayment, loanType, customerID)values(?,?,?,?,?,?,?,?,?)");
        p.setInt(1, id);
        p.setInt(2, amount);
        p.setString(3, status.toString());
        p.setString(4, date);
        p.setDouble(5, interest);
        p.setInt(6, term);
        p.setDouble(7, monthlyPayment);
        p.setString(8, type.toString());
        p.setInt(9, customer.getCustomerID());
        p.executeUpdate();
    }

    public int generateLoanID() throws SQLException, ClassNotFoundException {
        PreparedStatement p = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT loanID FROM loan ORDER BY loanID DESC LIMIT 1");
        ResultSet r = p.executeQuery();
        if (r.next()) {
            int selectedId = r.getInt(1);
            selectedId++;
            return selectedId;
        }
        return 1;
    }

    public void setTransactionRecord() throws SQLException, ClassNotFoundException {
        PreparedStatement p = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT loanID, loanAmount, loanStatus, loanDate, loanType FROM loan WHERE customerID = ? ORDER BY loanDate");
// addRecord(String type, String amount, String date, String status, TransactionType transactionType)
        p.setInt(1, customer.getCustomerID());
        ResultSet r = p.executeQuery();
        trans.removeAllRow();
        while (r.next()) {
            trans.addRecord(r.getString("loanType"), r.getInt("loanAmount"), r.getString("loanDate"), r.getString("loanStatus"), TransactionType.LOAN);
        }
    }

    public void setHome() throws SQLException, ClassNotFoundException {
        PreparedStatement p = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT loanID, loanAmount, loanStatus, loanDate, loanType, monthlyPayment FROM loan WHERE customerID = ? ORDER BY loanDate");
        p.setInt(1, customer.getCustomerID());
//addStatus(int id, String type, String date, int amount, String status)
        ResultSet r = p.executeQuery();
        home.removeAllRow();
        double totalMonthlyPayment = 0;
        while (r.next()) {
            home.addStatus(r.getInt("loanID"), r.getString("loanType"), r.getString("loanDate"), r.getInt("loanAmount"), StatusType.valueOf(r.getString("loanStatus")));
            totalMonthlyPayment += r.getDouble("monthlyPayment");
        }
        home.setCardData(customer.getAsset(), customer.getDebt(), user.getUserID(), totalMonthlyPayment);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new swing.PanelBorder();
        menu = new component.Menu();
        mainPanel = new javax.swing.JPanel();
        headerBar = new component.Header();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(212, 235, 255));
        panelBorder1.setForeground(new java.awt.Color(255, 255, 255));

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new javax.swing.BoxLayout(mainPanel, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
                    .addComponent(headerBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 599, Short.MAX_VALUE)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(headerBar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.Header headerBar;
    private javax.swing.JPanel mainPanel;
    private component.Menu menu;
    private swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
