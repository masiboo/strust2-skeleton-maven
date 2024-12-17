package org.test.actions;

import org.apache.struts2.ActionSupport;

public class RegistrationAction extends ActionSupport   {
    private String name;

    private String email;

    private String password;

    // Getters and setters for form fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute() {
        // Here you can process the data (e.g., save to database, validate, etc.)
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);

        // Return SUCCESS if processing is successful
        return SUCCESS;
    }
}