package com.java7.eveseliba.controller;

import com.java7.eveseliba.dto.HomeDoctorDTO;
import com.java7.eveseliba.service.HomeDoctorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rest/HomeDoctor.svc")
public class HomeDoctorController {

    private final HomeDoctorService homeDoctorService;

    public HomeDoctorController(HomeDoctorService homeDoctorService) {
        this.homeDoctorService = homeDoctorService;
    }

    @GetMapping("/HomeDoctors")
    public List<HomeDoctorDTO> getAllDoctors() {
        return homeDoctorService.getHomeDoctors();
    }

    @GetMapping("/HomeDoctor/user/({id})")
    public HomeDoctorDTO getHomeDoctorByUserId(@PathVariable("id") Long id) {
        return homeDoctorService.getHomeDoctorByUserId(id);
    }
}
