package com.java7.eveseliba.mapper;

import com.java7.eveseliba.dto.UserDTO;
import com.java7.eveseliba.model.HomeDoctor;
import com.java7.eveseliba.model.User;
import com.java7.eveseliba.model.eenum.UserType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserMapperTest {

    private final UserMapper userMapper = new UserMapper();

    @Test
    void fromDTO() {

        UserDTO userDTO = new UserDTO();

        userDTO.setAddress("Jurmala");
        userDTO.setEmail("kozirevs@inbox.lv");
        userDTO.setName("A. Kozirevs");
        userDTO.setPasswordHash("0000");
        userDTO.setPhone("+371 27022531");
        userDTO.setType("PATIENT");
        userDTO.setUserPk(11L);
        userDTO.setHomeDoctorPk(5L);

        User user = userMapper.fromDTO(userDTO);

        assertEquals("Jurmala", user.getAddress());
        assertEquals("kozirevs@inbox.lv", user.getEmail());
        assertEquals("A. Kozirevs", user.getName());
        assertEquals("0000", user.getPasswordHash());
        assertEquals("+371 27022531", user.getPhone());
        assertEquals(UserType.valueOf("PATIENT"), user.getType());
        assertEquals(11L, user.getUserPk());
        assertEquals(5L, user.getHomeDoctor().getHomeDoctorPk());
    }

    @Test
    void toDTO() {
        User user = new User();
        HomeDoctor homeDoctor = new HomeDoctor();
        homeDoctor.setHomeDoctorPk(3L);

        user.setName("Alex");
        user.setPhone("+371 27022530");
        user.setAddress("Jurmala");
        user.setEmail("kozirevs@inbox.lv");
        user.setHomeDoctor(homeDoctor);
        user.setPasswordHash("0000");
        user.setType(UserType.valueOf("PATIENT"));
        user.setUserPk(1L);

        UserDTO userDTO = userMapper.toDTO(user);

        assertEquals("Alex", userDTO.getName());
        assertEquals("+371 27022530", userDTO.getPhone());
        assertEquals("Jurmala", userDTO.getAddress());
        assertEquals("kozirevs@inbox.lv", userDTO.getEmail());
        assertEquals("Alex", userDTO.getName());
        assertEquals(3L, userDTO.getHomeDoctorPk());
        assertEquals("PATIENT", userDTO.getType());
        assertEquals(1L, userDTO.getUserPk());
    }
}