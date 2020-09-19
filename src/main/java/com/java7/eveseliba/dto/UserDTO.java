package com.java7.eveseliba.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UserDTO extends DtoHolder {

    @JsonProperty("user_pk")
    private Long userPk;

    @JsonProperty("name")
    @NotBlank(message = "please provide name")
    private String name;

    @JsonProperty("address")
    private String address;

    @Email(message = "Email not valid")
    @JsonProperty("email")
    private String email;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("password_hash")
    private String passwordHash;

    @JsonProperty("user_type")
    private String type;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserDTO userDTO = (UserDTO) o;

        if (userPk != null ? !userPk.equals(userDTO.userPk) : userDTO.userPk != null) return false;
        if (name != null ? !name.equals(userDTO.name) : userDTO.name != null) return false;
        if (address != null ? !address.equals(userDTO.address) : userDTO.address != null) return false;
        if (email != null ? !email.equals(userDTO.email) : userDTO.email != null) return false;
        if (phone != null ? !phone.equals(userDTO.phone) : userDTO.phone != null) return false;
        if (passwordHash != null ? !passwordHash.equals(userDTO.passwordHash) : userDTO.passwordHash != null)
            return false;
        if (type != null ? !type.equals(userDTO.type) : userDTO.type != null) return false;
        return homeDoctorPk != null ? homeDoctorPk.equals(userDTO.homeDoctorPk) : userDTO.homeDoctorPk == null;
    }

    @Override
    public int hashCode() {
        int result = userPk != null ? userPk.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (passwordHash != null ? passwordHash.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (homeDoctorPk != null ? homeDoctorPk.hashCode() : 0);
        return result;
    }
}
