package com.store.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String street;
    private String number;
    private String district;
    private String city;
    private String state;
    private String cep;

    // Constructor 
    public Address() {}

    // Getters and Setters
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getStreet() {return street;}
    public void setStreet(String street) {this.street = street;}

    public String getNumber() {return number;}
    public void setNumber(String number) {this.number = number;}

    public String getDistrict() {return district;}
    public void setDistrict(String district) {this.district = district;}

    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}

    public String getState() {return state;}
    public void setState(String state) {this.state = state;}

    public String getCep() {return cep;}
    public void setCep(String cep) {this.cep = cep;}
}
