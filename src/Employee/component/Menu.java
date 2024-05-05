package Employee.component;

import Employee.event.MenuEvent;
import Employee.swing.MenuButton;
import Employee.swing.Split;
import Employee.swing.scroll.ScrollBarCustom;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class Menu extends javax.swing.JPanel {

    private MenuButton selectedMenu;
    private MenuButton unSelectedMenu;
    private Animator animator;
    private MenuEvent event;

    public Menu() {
        initComponents();
        setOpaque(false);
        scroll.setViewportBorder(null);
        scroll.setBorder(null);
        scroll.getViewport().setOpaque(false);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        panelMenu.setLayout(new MigLayout("wrap, fillx, inset 0", "[fill]"));
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                selectedMenu.setAnimate(fraction);
                if (unSelectedMenu != null) {
                    unSelectedMenu.setAnimate(1f - fraction);
                }
            }
        };
        animator = new Animator(300, target);
        animator.setAcceleration(.5f);
        animator.setDeceleration(.5f);
        animator.setResolution(0);
    }

    public void initMenu(MenuEvent event) {
        this.event = event;
        addMenu("1", "Dashboard", 0);
        addMenu("2", "Staff", 1);
        addMenu("3", "Product", 2);
        split("Report");
        addMenu("4", "Report Income", 3);
        addMenu("5", "Report Expense", 4);
        addMenu("6", "Report Staff", 5);
        addMenu("7", "Accounting", 6);

        // For testing the scroll bar
        addMenu("5", "Report Expense", 4);
        addMenu("6", "Report Staff", 5);
        addMenu("7", "Accounting", 6);

        space(60);      // Creates a space of height 20 pixels
        addMenu("key", "Logout", 7);
    }

    private void addMenu(String icon, String text, int index) {
        MenuButton menu = new MenuButton(index);
        setFont(menu.getFont().deriveFont(Font.PLAIN, 14));
        menu.setIcon(new ImageIcon(getClass().getResource("/Employee/icon/menubutton/" + icon + ".png")));
        menu.setText("  " + text);
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!animator.isRunning()) {
                    if (menu != selectedMenu) {
                        unSelectedMenu = selectedMenu;
                        selectedMenu = menu;
                        animator.start();
                        event.menuSelected(index);
                    }
                }
            }
        });
        panelMenu.add(menu);
    }

    private void split(String name) {
        panelMenu.add(new Split(name), "h 20");
    }

    private void space(int height) {
        JLabel spaceLabel = new JLabel();
        spaceLabel.setPreferredSize(new Dimension(10, height)); // Adjust the width and height as needed
        panelMenu.add(spaceLabel, "wrap"); // Add a line break after adding the space
    }

    public void setSelected(int index) {
        for (Component com : panelMenu.getComponents()) {
            MenuButton menu = (MenuButton) com;
            if (menu.getIndex() == index) {
                if (menu != selectedMenu) {
                    unSelectedMenu = selectedMenu;
                    selectedMenu = menu;
                    animator.start();
                    event.menuSelected(index);
                }
                break;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        image = new Employee.swing.ImageAvatar();
        scroll = new javax.swing.JScrollPane();
        panelMenu = new javax.swing.JPanel();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employee/graphics/employee.png"))); // NOI18N
        jLabel1.setText("Employee Dashboard");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));

        image.setBorderSize(3);
        image.setBorderSpace(2);
        image.setGradientColor1(new java.awt.Color(51, 102, 255));
        image.setGradientColor2(new java.awt.Color(0, 51, 204));
        image.setImage(new javax.swing.ImageIcon(getClass().getResource("/Employee/icon/profile.jpg"))); // NOI18N

        panelMenu.setOpaque(false);

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        scroll.setViewportView(panelMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scroll)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(scroll))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Employee.swing.ImageAvatar image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
