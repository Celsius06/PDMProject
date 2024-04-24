package swing;

import event.EventMenuSelected;
import model.Model_Menu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.*;


public class ListMenu<E extends Object> extends JList<E> {
    
    private final DefaultListModel model;
    private int selectedIndex = -1;
    private int overIndex = -1;
    private EventMenuSelected event;
    
    public void addEventMenuSelected(EventMenuSelected event){
        this.event = event;
    }
    
    public ListMenu(){
        model = new DefaultListModel();
        setModel(model);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if(SwingUtilities.isLeftMouseButton(me)) {
                    int index = locationToIndex(me.getPoint());
                    Object o = model.getElementAt(index);
                    if (o instanceof Model_Menu) {
                        Model_Menu menu=(Model_Menu)o;
                        if(menu.getType()==Model_Menu.MenuType.MENU){
                            selectedIndex=index;
                            if(event!=null){
                                event.selected(index);
                            }
                        }
                    } else {
                        selectedIndex = index;
                    }
                    repaint();
                } 
            }
            public void mouseExited(MouseEvent me) {
                overIndex=-1;
                repaint();
            }
            
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent me) {
                int index = locationToIndex(me.getPoint());
                if (index != overIndex) {
                    Object o = model.getElementAt(index);
                    if (o instanceof Model_Menu) {
                        Model_Menu menu = (Model_Menu) o;
                        if (menu.getType() == Model_Menu.MenuType.MENU) {
                            overIndex = index;
                        } else {
                            overIndex = -1;
                        }
                        repaint();
                    }
                }
            }
        });
    }
    
    
    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean forcus) {
                Model_Menu data;
                if (o instanceof Model_Menu) {
                    data = (Model_Menu) o;
                } else {
                    data = new Model_Menu("", o + "", Model_Menu.MenuType.EMPTY);
                }
                MenuItem item = new MenuItem(data);
                item.setSelected(selectedIndex == index);
                item.setOver(overIndex == index);
                return item;
            }

        };
    }

    public void addItem(Model_Menu data) {
        model.addElement(data);
    }
}
