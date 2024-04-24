package model;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Model_Menu {

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }

    public Model_Menu(String icon, String name, MenuType type) {
        this.icon = icon;
        this.name = name;
        this.type = type;
    }

    public Model_Menu() {
    }

    private String icon;
    private String name;
    private MenuType type;
    
    public Icon toIcon() {
        if (icon != null && !icon.isEmpty()) {
            return new ImageIcon(getClass().getResource("/Graphics/"+ icon +".png"));
        } else {
        // Handle the case when icon is null or empty
        // For example, return a default icon or null
        return new ImageIcon(getClass().getResource("/Graphics/home.png"));
        }
    }

    public static enum MenuType {
        TITLE, MENU, EMPTY
    }
}
