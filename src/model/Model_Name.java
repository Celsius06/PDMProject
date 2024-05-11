package model;

import javax.swing.Icon;

public class Model_Name {

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

    public Icon getProfile() {
        return profile;
    }

    public void setProfile(Icon profile) {
        this.profile = profile;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Model_Name(String firstName, String lastName, Icon profile, String path) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.profile = profile;
        this.path = path;
    }

    public Model_Name() {
    }

    private String firstName;
    private String lastName;
    private Icon profile;
    private String path;

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
