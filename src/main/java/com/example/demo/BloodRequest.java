package com.example.demo;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "blood_requests")
public class BloodRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String patientName;
    private String bloodType;
    private String hospitalName;
    private String city;
    private LocalDateTime requestDate;

    // Constructors
    public BloodRequest() {}

    public BloodRequest(String patientName, String bloodType, String hospitalName, String city, LocalDateTime requestDate) {
        this.patientName = patientName;
        this.bloodType = bloodType;
        this.hospitalName = hospitalName;
        this.city = city;
        this.requestDate = requestDate;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) { this.patientName = patientName; }
    public String getBloodType() { return bloodType; }
    public void setBloodType(String bloodType) { this.bloodType = bloodType; }
    public String getHospitalName() { return hospitalName; }
    public void setHospitalName(String hospitalName) { this.hospitalName = hospitalName; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public LocalDateTime getRequestDate() { return requestDate; }
    public void setRequestDate(LocalDateTime requestDate) { this.requestDate = requestDate; }
}
