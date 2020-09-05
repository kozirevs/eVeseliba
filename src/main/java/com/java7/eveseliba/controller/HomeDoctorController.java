package com.java7.eveseliba.controller;

import com.java7.eveseliba.dto.HomeDoctorDTO;
import com.java7.eveseliba.dto.Response;
import com.java7.eveseliba.mapper.ResponseMapper;
import com.java7.eveseliba.service.HomeDoctorService;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/api/rest/HomeDoctor.svc")
public class HomeDoctorController {

    private final HomeDoctorService homeDoctorService;
    private final ResponseMapper responseMapper;

    public HomeDoctorController(HomeDoctorService homeDoctorService, ResponseMapper responseMapper) {
        this.homeDoctorService = homeDoctorService;
        this.responseMapper = responseMapper;
    }

    @GetMapping("/HomeDoctors")
    public Response getAllDoctors() {
        return responseMapper.mapSuccess(homeDoctorService.getHomeDoctors());
    }

    @GetMapping("/HomeDoctor/user/({id})")
    public Response getHomeDoctorByUserId(@PathVariable("id") Long id) {
        return responseMapper.mapSuccess(homeDoctorService.getHomeDoctorByUserId(id));
    }

    @PostMapping("/HomeDoctors/search")
    public Response search(@RequestBody HomeDoctorDTO homeDoctorDTO) {
        return responseMapper.mapSuccess(homeDoctorService.search(homeDoctorDTO));
    }

}
