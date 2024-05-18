package form;

import Main.Main;
import cellTable.TableActionCellEditor;
import cellTable.TableActionCellRender;
import cellTable.TableActionEvent;
import connection.DatabaseConnection;
import java.awt.Color;
import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.StatusType;
import swing.ScrollBar;
import swing.TableHeader;

public class Form_LoanVerification extends javax.swing.JPanel {

    Main main;

    public Form_LoanVerification(Main main) {
        this.main = main;
        initComponents();
        setOpaque(false);
        TableActionEvent event = new TableActionEvent(){
            @Override
            public void approve(int row) {
                if (table.isEditing()) {
                    table.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                int loanID = Integer.parseInt(model.getValueAt(row, 1).toString());
                model.removeRow(row);
                try {
                    PreparedStatement p = DatabaseConnection.getInstance().getConnection().prepareStatement("UPDATE loan SET loanStatus = ?, employeeID = ? WHERE loanID = ?");
                    p.setString(1, StatusType.APPROVED.toString());
                    p.setInt(2, main.employee.getEmployeeID());
                    p.setInt(3, loanID);
                    p.executeUpdate();
                    p = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT payRequire, customerID, loanAmount FROM loan WHERE loanID = ?");
                    p.setInt(1, loanID);
                    ResultSet r = p.executeQuery();
                    r.next();
                    int customerID = r.getInt("customerID");
                    double payRequire = r.getDouble("payRequire");
                    double amount = r.getDouble("loanAmount");
                    p = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT asset, debt FROM customer WHERE customerID = ?");
                    p.setInt(1, customerID);
                    r = p.executeQuery();
                    r.next();
                    double asset = amount + r.getDouble("asset");
                    double debt = payRequire + r.getDouble("debt");
                    p = DatabaseConnection.getInstance().getConnection().prepareStatement("UPDATE customer SET asset = ?, debt = ? WHERE customerID = ?");                    
                    p.setDouble(1, asset);
                    p.setDouble(2, debt);
                    p.setInt(3, customerID);
                    p.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                //| ClassNotFoundException e
            }

            @Override
            public void reject(int row) {
                if (table.isEditing()) {
                    table.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                int loanID = Integer.parseInt(model.getValueAt(row, 1).toString());
                model.removeRow(row);
                try {
                    PreparedStatement p = DatabaseConnection.getInstance().getConnection().prepareStatement("UPDATE loan SET loanStatus = ?, employeeID = ? WHERE loanID = ?");
                    p.setString(1, StatusType.REJECTED.toString());
                    p.setInt(2, main.employee.getEmployeeID());
                    p.setInt(3, loanID);
                    p.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        };
        table.getColumnModel().getColumn(7).setCellRenderer(new TableActionCellRender());
        table.getColumnModel().getColumn(7).setCellEditor(new TableActionCellEditor(event));
        setTableStyle();
        setTableData();
    }
    
    public void setTableStyle(){
        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1){
                TableHeader header = new TableHeader(o + "");
                header.setHorizontalAlignment(JLabel.CENTER);
                return header;
               
            }
        });
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(Object.class, centerRenderer);
        
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
    }
    public void setTableData(){
        removeAllRows();
        try {
        PreparedStatement p = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT loanID, loanType, loanAmount, loanTerm, loanDate, customerID FROM loan WHERE loanStatus='PENDING' ORDER BY loanID");
        ResultSet r = p.executeQuery();
        while(r.next()){
            PreparedStatement p1 = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT debt FROM customer WHERE customerID = ?");
            p1.setInt(1, r.getInt("customerID"));
            ResultSet r1 = p1.executeQuery();
            r1.next();
            addRow(new Object[]{r.getInt("customerID"),r.getInt("loanID"),r.getString("loanType"),r.getInt("loanAmount"),r.getInt("loanTerm"),r.getString("loanDate"),r1.getDouble("debt")});
        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addRow(Object[] row){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(row);
    }
    
    public void removeAllRows() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        panelBorderGradient1 = new swing.PanelBorderGradient();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 153, 255));
        setOpaque(false);

        spTable.setBackground(new java.awt.Color(51, 153, 255));
        spTable.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        table.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Loan ID", "Loan Type", "Amount", "Loan Term", "Date", "Customer Debt", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setGridColor(new java.awt.Color(255, 255, 255));
        table.setRowHeight(40);
        table.setSelectionBackground(new java.awt.Color(51, 153, 255));
        table.getTableHeader().setResizingAllowed(false);
        spTable.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(50);
            table.getColumnModel().getColumn(1).setPreferredWidth(30);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setPreferredWidth(50);
            table.getColumnModel().getColumn(4).setPreferredWidth(40);
            table.getColumnModel().getColumn(5).setPreferredWidth(70);
            table.getColumnModel().getColumn(7).setResizable(false);
            table.getColumnModel().getColumn(7).setPreferredWidth(50);
        }

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Loan Verification");

        javax.swing.GroupLayout panelBorderGradient1Layout = new javax.swing.GroupLayout(panelBorderGradient1);
        panelBorderGradient1.setLayout(panelBorderGradient1Layout);
        panelBorderGradient1Layout.setHorizontalGroup(
            panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorderGradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorderGradient1Layout.setVerticalGroup(
            panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBorderGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelBorderGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private swing.PanelBorderGradient panelBorderGradient1;
    private javax.swing.JScrollPane spTable;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
