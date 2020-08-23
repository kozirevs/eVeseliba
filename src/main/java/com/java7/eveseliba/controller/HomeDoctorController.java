package com.java7.eveseliba.controller;

import com.java7.eveseliba.dto.HomeDoctorDTO;
import com.java7.eveseliba.service.HomeDoctorService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/HomeDoctors/search")
    public List<HomeDoctorDTO> search(@RequestBody HomeDoctorDTO homeDoctorDTO) {
        return homeDoctorService.search(homeDoctorDTO);
    }

}
