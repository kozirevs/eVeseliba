package com.java7.eveseliba.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java7.eveseliba.dto.CountryDTO;
import com.java7.eveseliba.dto.CountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

@Component
public class CountryService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    private Map<String, String> countryCallingCode = new TreeMap<>();

    public String getCountryCallingCode(String name) {
        return countryCallingCode.get(name);
    }

    @PostConstruct
    public void init() throws JsonProcessingException {
        List<Map> result = restTemplate.getForObject("http://restcountries.eu/rest/v2/all", List.class);

        result.forEach(t -> {
            countryCallingCode.put(t.get("name").toString(), t.get("callingCodes").toString());
        });

        countryCallingCode.forEach((t, k) -> System.out.println(t + " " + k));
    }
}
