package com.java7.eveseliba.controller;

import com.java7.eveseliba.dto.UserDTO;
import com.java7.eveseliba.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/api/rest.User.svc")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }

    @GetMapping("/users")
    public List<UserDTO> getAllUsers() {
        return userService.getUsers();
    }

    @GetMapping("/user/({id})")
    public UserDTO getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }
}