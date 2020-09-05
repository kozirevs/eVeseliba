package com.java7.eveseliba.model;

import com.java7.eveseliba.model.eenum.UserType;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_pk")
    private Long userPk;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "password_hash")
    private String passwordHash;

    @Column(name = "user_status")
    private String userStatus;

    @Column(name = "user_type")
    @Enumerated(EnumType.STRING)
    private UserType type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "home_doctor_pk")
    private HomeDoctor homeDoctor;

    @OneToMany(mappedBy = "patientUser")
    private Set<Receipt> patientReceipts = new HashSet<>();

    @OneToMany(mappedBy = "doctorUser")
    private Set<Receipt> doctorReceipts = new HashSet<>();

    public Long getUserPk() {
        return userPk;
    }

    public void setUserPk(Long userPk) {
        this.userPk = userPk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public HomeDoctor getHomeDoctor() {
        return homeDoctor;
    }

    public void setHomeDoctor(HomeDoctor homeDoctor) {
        this.homeDoctor = homeDoctor;
    }

    public Set<Receipt> getPatientReceipts() {
        return patientReceipts;
    }

    public void setPatientReceipts(Set<Receipt> patientReceipts) {
        this.patientReceipts = patientReceipts;
    }

    public Set<Receipt> getDoctorReceipts() {
        return doctorReceipts;
    }

    public void setDoctorReceipts(Set<Receipt> doctorReceipts) {
        this.doctorReceipts = doctorReceipts;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
}
