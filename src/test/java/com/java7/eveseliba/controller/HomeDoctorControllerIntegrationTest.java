package com.java7.eveseliba.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java7.eveseliba.dto.HomeDoctorDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class HomeDoctorControllerIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void getAllDoctors() throws JsonProcessingException {
        String result = restTemplate.getForObject("http://localhost:" + port
                + "/api/rest/HomeDoctor.svc/HomeDoctors", String.class);

        JsonNode jsonNode = objectMapper.readTree(result);

        List<HomeDoctorDTO> homeDoctorDTOS = objectMapper.convertValue(jsonNode.get("holderList"),
                new TypeReference<List<HomeDoctorDTO>>() {});

        assertEquals(5, homeDoctorDTOS.size());

        HomeDoctorDTO homeDoctorDTO1 = homeDoctorDTOS.stream()
                .filter(t -> t.getHomeDoctorPk() == 1)
                .findAny()
                .get();

        assertEquals("Irina R.", homeDoctorDTO1.getName());
        assertEquals("RF246434543", homeDoctorDTO1.getExternalRef());
        assertEquals("+371 23456789", homeDoctorDTO1.getPhone());

    }

    @Test
    void getHomeDoctorByUserId() {
    }

    @Test
    void search() {
    }
}