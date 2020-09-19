package com.java7.eveseliba.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CountryDTO {

    private String name;

    @JsonProperty("callingCodes")
    private String countryCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
