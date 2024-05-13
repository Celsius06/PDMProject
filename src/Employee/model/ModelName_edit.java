package Employee.model;

import javax.swing.Icon;

public class ModelName_edit {

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ModelName_edit(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public ModelName_edit() {
    }

    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
