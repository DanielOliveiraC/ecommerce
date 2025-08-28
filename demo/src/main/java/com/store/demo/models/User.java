package com.store.demo.models;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @CPF
    private String cpf;

    private String name;
    private Address address;
    private String phone;
    private String email; 
    private String password;

    // Constructor
    public User() {}

    // Getters and Setters
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public Address getAddress() {return address;}
    public void setAddress(Address address) {this.address = address;}

    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone = phone;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
}
