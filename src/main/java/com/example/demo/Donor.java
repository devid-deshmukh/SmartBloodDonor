package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "donors")
public class Donor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String bloodType;
    private String contactNumber;
    private String city;

    // Constructors
    public Donor() {}

    public Donor(String name, String email, String bloodType, String contactNumber, String city) {
        this.name = name;
        this.email = email;
        this.bloodType = bloodType;
        this.contactNumber = contactNumber;
        this.city = city;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getBloodType() { return bloodType; }
    public void setBloodType(String bloodType) { this.bloodType = bloodType; }
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
}
