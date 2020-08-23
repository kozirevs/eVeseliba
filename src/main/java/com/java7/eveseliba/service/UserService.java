package com.java7.eveseliba.service;

import com.java7.eveseliba.dto.HomeDoctorDTO;
import com.java7.eveseliba.dto.UserDTO;
import com.java7.eveseliba.mapper.HomeDoctorMapper;
import com.java7.eveseliba.mapper.UserMapper;
import com.java7.eveseliba.model.HomeDoctor;
import com.java7.eveseliba.model.User;
import com.java7.eveseliba.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public UserDTO createUser(UserDTO userDTO) {
        User user = userMapper.fromDTO(userDTO);
        User createdUser = userRepository.save(user);
        return userMapper.toDTO(createdUser);
    }

    public List<UserDTO> getUsers() {
        List<User> users = userRepository.findAll();
        return users.stream().map(userMapper::toDTO).collect(Collectors.toList());
    }

    public UserDTO getUserById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        User user = optionalUser.orElseGet(User::new);
        return userMapper.toDTO(user);
    }
}
