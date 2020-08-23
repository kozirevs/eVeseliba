package com.java7.eveseliba.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDTO {

    @JsonProperty("user_pk")
    private Long userPk;

    @JsonProperty("name")
    private String name;

    @JsonProperty("address")
    private String address;

    @JsonProperty("email")
    private String email;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("password_hash")
    private String passwordHash;

    @JsonProperty("user_type")
    private String  type;

    @JsonProperty("home_doctor_id")
    private Long homeDoctorPk;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getHomeDoctorPk() {
        return homeDoctorPk;
    }

    public void setHomeDoctorPk(Long homeDoctorPk) {
        this.homeDoctorPk = homeDoctorPk;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userPk=" + userPk +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", type='" + type + '\'' +
                ", homeDoctorPk=" + homeDoctorPk +
                '}';
    }
}
