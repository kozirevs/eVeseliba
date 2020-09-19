package com.java7.eveseliba.dto;

import java.util.List;

public class CountryResponse {
    private List<CountryDTO> countries;

    public CountryResponse() {
    }

    public List<CountryDTO> getCountries() {
        return countries;
    }

    public void setCountries(List<CountryDTO> countries) {
        this.countries = countries;
    }
}
