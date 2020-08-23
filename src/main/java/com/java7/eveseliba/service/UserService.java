package com.java7.eveseliba.service;

import com.java7.eveseliba.dto.UserDTO;
import com.java7.eveseliba.mapper.UserMapper;
import com.java7.eveseliba.model.User;
import com.java7.eveseliba.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Example;
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

    public void updateUser(UserDTO userDTO) {
        User userToUpdate = userMapper.fromDTO(userDTO);
        User userFromDB = userRepository.getOne(userToUpdate.getUserPk());
        BeanUtils.copyProperties(userToUpdate, userFromDB, "userPk");
        userRepository.save(userFromDB);
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

    public List<UserDTO> search(UserDTO userDTO) {
        User user = userMapper.fromDTO(userDTO);
        Example<User> userExample = Example.of(user);
        List<User> users = userRepository.findAll(userExample);
        return users.stream().map(userMapper::toDTO).collect(Collectors.toList());
    }
}
