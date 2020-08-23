package com.java7.eveseliba.service;

import com.java7.eveseliba.dto.HomeDoctorDTO;
import com.java7.eveseliba.mapper.HomeDoctorMapper;
import com.java7.eveseliba.model.HomeDoctor;
import com.java7.eveseliba.repository.HomeDoctorRepository;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HomeDoctorService {

    private final HomeDoctorRepository homeDoctorRepository;
    private final HomeDoctorMapper homeDoctorMapper;

    public HomeDoctorService(HomeDoctorRepository homeDoctorRepository, HomeDoctorMapper homeDoctorMapper) {
        this.homeDoctorRepository = homeDoctorRepository;
        this.homeDoctorMapper = homeDoctorMapper;
    }

    public List<HomeDoctorDTO> getHomeDoctors() {
        List<HomeDoctor> homeDoctors = homeDoctorRepository.findAll();
        return homeDoctors.stream().map(homeDoctorMapper::toDTO).collect(Collectors.toList());
    }

    public HomeDoctorDTO getHomeDoctorByUserId(Long id) {
        HomeDoctor homeDoctor = homeDoctorRepository.getHomeDoctorByUserId(id);
        return homeDoctorMapper.toDTO(homeDoctor);
    }

    public List<HomeDoctorDTO> search(HomeDoctorDTO homeDoctorDTO) {
        HomeDoctor homeDoctor = homeDoctorMapper.fromDTO(homeDoctorDTO);
        Example<HomeDoctor> homeDoctorExample = Example.of(homeDoctor);
        List<HomeDoctor> homeDoctors = homeDoctorRepository.findAll(homeDoctorExample);
        return homeDoctors.stream().map(homeDoctorMapper::toDTO).collect(Collectors.toList());
    }

}
