package Employee.swing;

import com.raven.table.TableCustom;     // This import comes from the table-custom.jar library
import java.awt.Color;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.TableCellRenderer;

public class Table extends TableCustom {

    public Table() {
    }

    public void addTableStyle(JScrollPane scroll) {
        scroll.getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        setBorder(null);
        scroll.setBorder(null);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBar(new swing.ScrollBar());
        JPanel panel = new JPanel();
        panel.setBackground(new Color(60, 60, 60));
        setForeground(new Color(214, 214, 214));
        setSelectionForeground(new Color(214, 214, 214));
        setSelectionBackground(new Color(50, 50, 50));
        getTableHeader().setDefaultRenderer(new TableHeaderCustom());
        setRowHeight(47);
        setShowHorizontalLines(true);
        setGridColor(new Color(50, 50, 50));
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, panel);
    }

    @Override
    public Component prepareRenderer(TableCellRenderer tcr, int i, int i1) {
        Component com = super.prepareRenderer(tcr, i, i1);
        if (!isCellSelected(i, i1)) {
            com.setBackground(new Color(60, 60, 60));
        }
        return com;
    }
}
