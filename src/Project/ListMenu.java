package Project;

import java.awt.Component;
import javax.swing.*;


public class ListMenu<E extends Object> extends JList<E> {
    
    private final DefaultListModel model;
    
    public ListMenu(){
        model = new DefaultListModel();
        setModel(model);
    }
    
    
    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean bln, boolean bln1) {
                Model_Menu data;
                if (o instanceof Model_Menu) {
                    data = (Model_Menu) o;
                } else {
                    data = new Model_Menu("", o + "", Model_Menu.MenuType.EMPTY);
                }
                MenuItem item = new MenuItem(data);
                return item;
            }

        };
    }

    public void addItem(Model_Menu data) {
        model.addElement(data);
    }
}
