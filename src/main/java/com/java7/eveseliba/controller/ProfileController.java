package com.java7.eveseliba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Misc.svc")
public class ProfileController {

    @Value("${my.profile}")
    private String myProfile;

    @GetMapping("/profileInfo")
    public String getMyProfile() {
        return myProfile;
    }
}
