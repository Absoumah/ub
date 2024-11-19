package com.ubforge.ubforge.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String role;

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getId() {
        return id;
    }

    public String getRole() {
        return role;
    }
    
}
