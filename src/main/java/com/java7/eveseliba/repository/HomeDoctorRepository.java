package com.java7.eveseliba.repository;

import com.java7.eveseliba.model.HomeDoctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeDoctorRepository extends JpaRepository<HomeDoctor, Long> {

//    @Query(value = "SELECT h FROM HomeDoctor h WHERE h.user_pk =:id")
//    HomeDoctor getHomeDoctorByUserId(@Param("id") Long Id);
}
