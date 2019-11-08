package com.team9.Badminton.repository;

import com.team9.Badminton.entity.Athleet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface AthleetRepository extends JpaRepository<Athleet, Integer> {
    Athleet findAthleetByAthleetID(@Param("athleetID") int athleetID);
}

