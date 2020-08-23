package com.java7.eveseliba.mapper;

import com.java7.eveseliba.dto.HomeDoctorDTO;
import com.java7.eveseliba.model.HomeDoctor;
import org.springframework.stereotype.Component;

@Component
public class HomeDoctorMapper {

    public HomeDoctor fromDTO(HomeDoctorDTO homeDoctorDTO) {
        HomeDoctor homeDoctor = new HomeDoctor();
        homeDoctor.setExternalRef(homeDoctorDTO.getExternalRef());
        homeDoctor.setHomeDoctorPk(homeDoctorDTO.getHomeDoctorPk());
        homeDoctor.setName(homeDoctorDTO.getName());
        homeDoctor.setPhone(homeDoctorDTO.getPhone());
        return homeDoctor;
    }

    public HomeDoctorDTO toDTO(HomeDoctor homeDoctor) {
        HomeDoctorDTO homeDoctorDTO = new HomeDoctorDTO();
        homeDoctorDTO.setExternalRef(homeDoctor.getExternalRef());
        homeDoctorDTO.setHomeDoctorPk(homeDoctor.getHomeDoctorPk());
        homeDoctorDTO.setName(homeDoctor.getName());
        homeDoctorDTO.setPhone(homeDoctor.getPhone());
        return homeDoctorDTO;
    }
}
