package com.java7.eveseliba.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "home_doctor")
public class HomeDoctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "home_doctor_pk")
    private Long homeDoctorPk;

    @Column(name = "name")
    private String name;

    @Column(name = "external_reference")
    private String externalRef;

    @Column(name = "phone")
    private String phone;

    @OneToMany(mappedBy = "homeDoctor")
    private Set<User> users = new HashSet<>();

    public Long getHomeDoctorPk() {
        return homeDoctorPk;
    }

    public void setHomeDoctorPk(Long homeDoctorPk) {
        this.homeDoctorPk = homeDoctorPk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExternalRef() {
        return externalRef;
    }

    public void setExternalRef(String externalRef) {
        this.externalRef = externalRef;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
