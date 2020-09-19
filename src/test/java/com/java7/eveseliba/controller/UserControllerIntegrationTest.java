package com.java7.eveseliba.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java7.eveseliba.dto.UserDTO;
import com.java7.eveseliba.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class UserControllerIntegrationTest {

    @Autowired
    private UserService userService;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void deleteUser() throws InterruptedException {
        restTemplate.delete("http://localhost:" + port + "/api/rest/User.svc/user/(3)");
        sleep(1500);

        UserDTO userDTO = userService.getUserById(3L);

        List<UserDTO> userDTOS = userService.getUsers();

        assertFalse(userDTOS.contains(userDTO));
    }

    @Test
    void createUser() throws JsonProcessingException {
        UserDTO userDTO = new UserDTO();

        userDTO.setAddress("America");
        userDTO.setEmail("email@email.com");
        userDTO.setName("Jack");
        userDTO.setPasswordHash("1111");
        userDTO.setPhone("+371 11111111");
        userDTO.setType("PATIENT");
        userDTO.setHomeDoctorPk(5L);

        String result = restTemplate.postForObject("http://localhost:" + port + "/api/rest/User.svc/user",
                userDTO, String.class);

        JsonNode jsonNode = objectMapper.readTree(result);
        List<UserDTO> userDTOS = objectMapper.convertValue(jsonNode.get("holderList"),
                new TypeReference<List<UserDTO>>() {});

        assertNotNull(userDTOS.get(0).getUserPk());
    }
}
