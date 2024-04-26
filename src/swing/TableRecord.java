package swing;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import component.Record;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

public class TableRecord extends JTable {
    
    public TableRecord() {
        
        setShowHorizontalLines(true);
        setRowHeight(200);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1){
                TableHeader header = new TableHeader(o + "");
                if(i1==4){
                    header.setHorizontalAlignment(JLabel.CENTER);
                }    
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int i, int i1) {
                return (Component) o; // Return the component directly        
            }
        });
        
        // Initialize the table model
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        setModel(model);
        
        for (int i = 0; i < getColumnCount(); i++) {
            TableColumn column = getColumnModel().getColumn(i);
            column.setWidth(0);
            column.setMinWidth(0);
            column.setMaxWidth(0);
        }
    }
     
    public void addRow(Record record){
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(new Object[]{record});
    }
    
}
