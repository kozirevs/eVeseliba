package com.java7.eveseliba.mapper;

import com.java7.eveseliba.dto.UserDTO;
import com.java7.eveseliba.model.HomeDoctor;
import com.java7.eveseliba.model.User;
import com.java7.eveseliba.model.eenum.UserType;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User fromDTO(UserDTO userDTO) {
        User user = new User();
        HomeDoctor homeDoctor = new HomeDoctor();
        homeDoctor.setHomeDoctorPk(userDTO.getHomeDoctorPk());

        user.setName(userDTO.getName());
        user.setPhone(userDTO.getPhone());
        user.setAddress(userDTO.getAddress());
        user.setEmail(userDTO.getEmail());
        user.setHomeDoctor(homeDoctor);
        user.setPasswordHash(userDTO.getPasswordHash());

        if (userDTO.getType() == null) {
            user.setType(null);
        } else {
            user.setType(UserType.valueOf(userDTO.getType()));
        }
        user.setUserPk(userDTO.getUserPk());

        return user;
    }

    public UserDTO toDTO(User user) {
        UserDTO userDTO = new UserDTO();

        userDTO.setAddress(user.getAddress());
        userDTO.setEmail(user.getEmail());
        userDTO.setName(user.getName());
        userDTO.setPasswordHash(user.getPasswordHash());
        userDTO.setPhone(user.getPhone());
        userDTO.setType(user.getType().name());
        userDTO.setUserPk(user.getUserPk());
        userDTO.setHomeDoctorPk(user.getHomeDoctor().getHomeDoctorPk());

        return userDTO;
    }
}
