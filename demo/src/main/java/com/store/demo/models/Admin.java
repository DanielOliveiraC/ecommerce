package com.store.demo.models;

import jakarta.persistence.Entity;

@Entity
public class Admin extends User {

    private String role = "ADMIN";

    public Admin() {
        super();
    }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}