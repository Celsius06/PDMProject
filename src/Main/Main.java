package Main;

import Login.Login;
import connection.DatabaseConnection;
import entity.Account;
import entity.Customer;
import entity.Employee;
import event.EventMenuSelected;
import form.Form_AccountDatabase;
import form.Form_Home;
import form.Form_HomeEmp;
import form.Form_LoanApplication;
import form.Form_LoanDatabase;
import form.Form_Payment;
import form.Form_LoanVerification;
import form.Form_TransactionDatabase;
import form.Form_TransactionRecord;
import form.Form_UserInfo;
import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JComponent;
import javax.swing.JPanel;
import model.AccountType;
import model.GenderType;
import model.GenerateIDType;
import model.LoanType;
import model.RecordType;
import model.StatusType;
import model.TransactionType;

public class Main extends javax.swing.JFrame {

    public Login login;
    public Account user;
    public Customer customer;
    public Employee employee;
    private LocalDate currentDate = LocalDate.now();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public String today = currentDate.format(formatter);
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

    public void setForm(JComponent com) {
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    public void setDashboard() throws SQLException, ClassNotFoundException {
        if(user.getRole()==AccountType.CUSTOMER){
            menu.initCustomer();
            setForm(new Form_Home(this));
        } else {
            menu.initEmployee();
            setForm(new Form_HomeEmp());
        }
        menu.initMoving(Main.this);
        menu.addEventMenuSelected(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                try {
                    if(user.getRole() == AccountType.CUSTOMER){
                        if (index == 0) {
                            setAccountData();
                            setForm(new Form_Home(Main.this));                
                        } else if (index == 1) {
                            setAccountData();
                            setForm(new Form_UserInfo(Main.this));
                        } else if (index == 5) {
                            setForm(new Form_LoanApplication(Main.this));
                        } else if (index == 6) {
                            setAccountData();
                            setForm(new Form_Payment(Main.this));       
                        } else if (index == 7) {
                            setForm(new Form_TransactionRecord(Main.this));
                        } else if (index == 11) {
                            setVisible(false);
                            login = new Login(Main.this);
                            login.setVisible(true);
                        }
                    } else {
                        if (index == 0) {
                            setForm(new Form_HomeEmp());
                        } else if (index == 1){
                            setAccountData();
                            setForm(new Form_UserInfo(Main.this));
                        } else if (index == 5){
                            setForm(new Form_LoanVerification(Main.this));
                        } else if (index == 6){
                            setForm(new Form_LoanDatabase());
                        } else if (index == 10){
                            setForm(new Form_AccountDatabase());
                        } else if (index == 11){
                            setForm(new Form_TransactionDatabase());
                        } else if (index == 15){
                            setVisible(false);
                            login = new Login(Main.this);
                            login.setVisible(true);
                        }
                    }
                } catch (ClassNotFoundException | SQLException e) {
                    e.printStackTrace();
                }
            }
        });
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

    public void insertLoanData(int id, int amount, StatusType status, String date, double interest, int term, double monthlyPayment, LoanType type, double payRequire, double amountPaid) throws SQLException, ClassNotFoundException {
        PreparedStatement p = DatabaseConnection.getInstance().getConnection().prepareStatement("insert into loan(loanID, loanAmount, loanStatus, loanDate, interestRate, loanTerm, monthlyPayment, loanType, payRequire, amountPaid, customerID)values(?,?,?,?,?,?,?,?,?,?,?)");
        p.setInt(1, id);
        p.setInt(2, amount);
        p.setString(3, status.toString());
        p.setString(4, date);
        p.setDouble(5, interest);
        p.setInt(6, term);
        p.setDouble(7, monthlyPayment);
        p.setString(8, type.toString());
        p.setDouble(9, payRequire);
        p.setDouble(10, amountPaid);
        p.setInt(11, customer.getCustomerID());
        p.executeUpdate();    
    }
    
    public void insertTransactionData(int id, double amount, String date, TransactionType type, int targetID) throws SQLException, ClassNotFoundException{
        PreparedStatement p;
        if(type == TransactionType.DEPOSIT){
            p = DatabaseConnection.getInstance().getConnection().prepareStatement("insert into transaction(transactionID, deposit, date, transType, customerID)values(?,?,?,?,?)");
            p.setInt(1, id);
            p.setDouble(2, amount);
            p.setString(3, date);
            p.setString(4, type.toString());
            p.setInt(5, customer.getCustomerID());
            p.executeUpdate();
        } else if (type == TransactionType.WITHDRAWAL){
            p = DatabaseConnection.getInstance().getConnection().prepareStatement("insert into transaction(transactionID, withdrawal, date, transType, customerID)values(?,?,?,?,?)");
            p.setInt(1, id);
            p.setDouble(2, amount);
            p.setString(3, date); 
            p.setString(4, type.toString());
            p.setInt(5, customer.getCustomerID());
            p.executeUpdate();
        } else if (type == TransactionType.PAY){
            p = DatabaseConnection.getInstance().getConnection().prepareStatement("insert into transaction(transactionID, payLoan, date, transType, loanID, customerID)values(?,?,?,?,?,?)");
            p.setInt(1, id);
            p.setDouble(2, amount);
            p.setString(3, date);
            p.setString(4, type.toString());
            p.setInt(5, targetID);
            p.setInt(6, customer.getCustomerID());
            p.executeUpdate();
        }        
    }
    
    public void insertRecordData(int recordID, int targetID, RecordType type) throws SQLException, ClassNotFoundException{
        String queryInsertRec = null;
        if(type == RecordType.LOAN){
            queryInsertRec = "insert into record(recordID, loanID, recordType, customerID)values(?,?,?,?)";
        } else if(type == RecordType.TRANSACTION){
            queryInsertRec = "insert into record(recordID, transactionID, recordType, customerID)values(?,?,?,?)";
        }
        if(queryInsertRec != null){
            PreparedStatement p = DatabaseConnection.getInstance().getConnection().prepareStatement(queryInsertRec);
            p.setInt(1, recordID);
            p.setInt(2, targetID);
            p.setString(3, type.toString());
            p.setInt(4, customer.getCustomerID());
            p.executeUpdate();
        }
    }

    
    public int generateID(GenerateIDType type) throws SQLException, ClassNotFoundException {
        String queryGenerate = null;
        if(type == GenerateIDType.LOAN){
            queryGenerate = "SELECT loanID FROM loan ORDER BY loanID DESC LIMIT 1";
        } else if (type == GenerateIDType.RECORD) {
            queryGenerate = "SELECT recordID FROM record ORDER BY recordID DESC LIMIT 1";
        } else if (type == GenerateIDType.TRANSACTION){
            queryGenerate = "SELECT transactionID FROM transaction ORDER BY transactionID DESC LIMIT 1";
        } else if (type == GenerateIDType.CUSTOMER) {
            queryGenerate = "SELECT customerID FROM customer ORDER BY customerID DESC LIMIT 1";
        } else if (type == GenerateIDType.EMPLOYEE) {
            queryGenerate = "SELECT employeeID FROM employee ORDER BY employeeID DESC LIMIT 1";
        } else if (type == GenerateIDType.USER) {
            queryGenerate = "SELECT userID FROM account ORDER BY userID DESC LIMIT 1";
        }    
        if(queryGenerate != null){
            PreparedStatement p =  DatabaseConnection.getInstance().getConnection().prepareStatement(queryGenerate);
            ResultSet r = p.executeQuery();
            if (r.next()) {
                int selectedId = r.getInt(1);
                selectedId++;
                return selectedId;
            }
        } 
        return 1;
    }

//    public void setTransactionRecord() throws SQLException, ClassNotFoundException {
//        PreparedStatement p = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT recordID, loanID, transactionID, recordType FROM record WHERE customerID = ? ORDER BY recordID DESC");
//        p.setInt(1, customer.getCustomerID());
//        ResultSet r = p.executeQuery();
//        trans.removeAllRow();
//        while (r.next()) {
//            RecordType type = RecordType.valueOf(r.getString("recordType"));
//            if(type == RecordType.LOAN){
//                PreparedStatement p1 = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT loanType, loanAmount, loanDate, loanStatus FROM loan WHERE loanID = ?");
//                p1.setInt(1, r.getInt("loanID"));
//                ResultSet r1 = p1.executeQuery();
//                r1.next();
//                trans.addRecord(r1.getString("loanType"), r1.getInt("loanAmount"), r1.getString("loanDate"), r1.getString("loanStatus"), TransactionType.LOAN);
//            }
//            if (type == RecordType.TRANSACTION){
//                PreparedStatement p2 = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT loanID, deposit, withdrawal, payLoan, transType, date FROM transaction WHERE transactionID = ?");
//                p2.setInt(1, r.getInt("transactionID"));
//                ResultSet r2 = p2.executeQuery();
//                r2.next();
//                if(r2.getString("transType").equals(TransactionType.PAY.toString())){
//                    PreparedStatement p3 = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT loanType, payRequire FROM loan WHERE loanID = ?");
//                    p3.setInt(1, r2.getInt("loanID")); 
//                    ResultSet r3 = p3.executeQuery();
//                    r3.next();
//                    trans.addRecord("PAY BACK "+r3.getString("loanType"), r3.getInt("payRequire"), r2.getString("date"),"Loan ID "+r2.getInt("loanID")+" | Paid: "+ r2.getInt("payLoan"), TransactionType.PAY);
//                }
//                if(r2.getString("transType").equals(TransactionType.DEPOSIT.toString())){
//                    trans.addRecord(r2.getString("transType"), r2.getInt("deposit"), r2.getString("date"), "SUCCESS", TransactionType.DEPOSIT);
//                }
//                if(r2.getString("transType").equals(TransactionType.WITHDRAWAL.toString())){
//                    trans.addRecord(r2.getString("transType"), r2.getInt("withdrawal"), r2.getString("date"), "SUCCESS", TransactionType.WITHDRAWAL);
//                }
//            }
//        }
//    }
    
    public void setAccountData() throws SQLException, ClassNotFoundException {
        if(user.getRole() == AccountType.CUSTOMER){
            PreparedStatement p = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT customerID, fName, mName, lName, date_of_birth, gender, phone_number, address, citizen_number, debt, asset FROM customer WHERE userID = ?");
            p.setInt(1, user.getUserID());
            ResultSet r = p.executeQuery();
            r.next();
            customer = new Customer(r.getInt("customerID"), r.getString("fName"), r.getString("mName"), r.getString("lName"), r.getString("date_of_birth"), null, r.getInt("phone_number"), r.getString("address"), r.getInt("citizen_number"), r.getDouble("debt"), r.getDouble("asset"));
            if(r.getString("gender") != null) {
                customer.setGender(GenderType.valueOf(r.getString("gender")));
            } else {
                customer.setGender(GenderType.NONE);
            }
        } else {
            PreparedStatement p = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT employeeID, fName, mName, lName, date_of_birth, gender, phone_number, address, citizen_number FROM employee WHERE userID = ?");
            p.setInt(1, user.getUserID());
            ResultSet r = p.executeQuery();
            r.next();
            employee = new Employee(r.getInt("employeeID"), r.getString("fName"), r.getString("mName"), r.getString("lName"), r.getString("date_of_birth"), null, r.getInt("phone_number"), r.getString("address"), r.getInt("citizen_number"));
            if(r.getString("gender") != null){
                employee.setGender(GenderType.valueOf(r.getString("gender")));
            } else {
                employee.setGender(GenderType.NONE);
            }            
        }
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
