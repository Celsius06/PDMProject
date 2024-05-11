package swing;

import model.Model_Staff;
import com.raven.table.TableCustom;     // This import comes from the table-custom.jar library
import component.Record;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import model.ModelCustomer;
import model.Model_ApprovedCustomer;

public class TableVerify extends TableCustom {

    public TableVerify() {
    }

    public void addTableStyle(JScrollPane scroll) {
        scroll.getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        setBorder(null);
        scroll.setBorder(null);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBar(new Employee.swing.scroll.ScrollBarCustom());
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        setForeground(new Color(0, 0, 0));
        setSelectionForeground(new Color(0, 0, 0));
        setSelectionBackground(new Color(240, 240, 240));
        getTableHeader().setDefaultRenderer(new Employee.swing.TableHeaderCustom());
        setRowHeight(47);
        setShowHorizontalLines(true);
        setGridColor(new Color(240, 240, 240));
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, panel);
    }

    @Override
    public Component prepareRenderer(TableCellRenderer tcr, int i, int i1) {
        Component com = super.prepareRenderer(tcr, i, i1);
        if (!isCellSelected(i, i1)) {
            com.setBackground(new Color(240, 240, 240));
        }
        return com;
    }

    public void addRow(Model_ApprovedCustomer approve) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        Object[] rowData = new Object[]{
            approve.getName(),
            approve.getLoanID(),
            approve.getAmount(),
            approve.getMonths(),
            approve.getLoanType()
        };
        model.addRow(rowData);
    }

    public void addRowTable1(Model_Staff modelStaff, boolean b) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        Object[] rowData = new Object[]{
            modelStaff.getName().getFirstName() + " " + modelStaff.getName().getLastName(),
            modelStaff.getLoanID(),
            modelStaff.getAmount(),
            modelStaff.getMonths(),
            modelStaff.getTypeOfLoan(),
            "", // Placeholder for Action column
            b // Approval column
        };
        model.addRow(rowData);
    }

}
