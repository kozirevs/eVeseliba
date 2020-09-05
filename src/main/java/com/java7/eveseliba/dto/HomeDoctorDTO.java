package com.java7.eveseliba.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HomeDoctorDTO extends DtoHolder {

    @JsonProperty("id")
    private Long homeDoctorPk;

    @JsonProperty("name")
    private String name;

    @JsonProperty("external_ref")
    private String externalRef;

    @JsonProperty("phone")
    private String phone;

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

    @Override
    public String toString() {
        return "HomeDoctorDTO{" +
                "homeDoctorPk=" + homeDoctorPk +
                ", name='" + name + '\'' +
                ", externalRef='" + externalRef + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
