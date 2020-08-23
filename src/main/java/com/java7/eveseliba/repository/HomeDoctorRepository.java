package com.java7.eveseliba.repository;

import com.java7.eveseliba.model.HomeDoctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeDoctorRepository extends JpaRepository<HomeDoctor, Long> {

    @Query(value = "FROM HomeDoctor h JOIN h.users u WHERE u.userPk =:id")
    HomeDoctor getHomeDoctorByUserId(@Param("id") Long Id);
}
