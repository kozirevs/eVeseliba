package com.java7.eveseliba.controller;

import com.java7.eveseliba.dto.Response;
import com.java7.eveseliba.dto.UserDTO;
import com.java7.eveseliba.mapper.ResponseMapper;
import com.java7.eveseliba.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/rest/User.svc")
@CrossOrigin
public class UserController {

    private final UserService userService;
    private final ResponseMapper responseMapper;

    public UserController(UserService userService, ResponseMapper responseMapper) {
        this.userService = userService;
        this.responseMapper = responseMapper;
    }

    @PostMapping("/user")
    public Response createUser(@Valid @RequestBody UserDTO userDTO) {
        if(userService.isEmailExists(userDTO.getEmail())) {
            return responseMapper.mapFail("Email: " + userDTO.getEmail() + " already Exists!", "WARNING");
        }
        return responseMapper.mapSuccess(userService.createUser(userDTO));
    }

    @PutMapping("/user")
    public void saveUser(@RequestBody UserDTO userDTO) {
        userService.updateUser(userDTO);
    }

    @GetMapping("/users")
    public Response getAllUsers() {
        return responseMapper.mapSuccess(userService.getUsers());
    }

    @GetMapping("/user/({id})")
    public Response getUserById(@PathVariable("id") Long id) {
        return responseMapper.mapSuccess(userService.getUserById(id));
    }

    @PostMapping("/users/search")
    public Response search(@RequestBody UserDTO userDTO) {
        return responseMapper.mapSuccess(userService.search(userDTO));
    }

    @DeleteMapping("/user/({id})")
    public Response deleteUser(@PathVariable("id") Long id) {
        return responseMapper.mapSuccess(userService.deleteUser(id));
    }
}
