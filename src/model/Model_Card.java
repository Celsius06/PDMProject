
package model;

import javax.swing.Icon;

public class Model_Card {

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValues() {
        return values;
    }

    public void setValue(String value) {
        this.values = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Model_Card(Icon icon, String title, String value, String description) {
        this.icon = icon;
        this.title = title;
        this.values = value;
        this.description = description;
    }   
    
    public Model_Card() {
    }
    
    private Icon icon;
    private String title;
    private String values;
    private String description;
    
}
