package com.store.demo.models;

import jakarta.persistence.Entity;

@Entity
public class Client extends User {

    private String role = "CLIENT"; 
    
    public Client() {
        super();
    }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}
