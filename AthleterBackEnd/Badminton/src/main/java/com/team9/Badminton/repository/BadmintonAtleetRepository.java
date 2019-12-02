package com.team9.Badminton.repository;

import com.team9.Badminton.entity.Badmintonatleet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface BadmintonAtleetRepository extends JpaRepository<Badmintonatleet, Integer> {
    Badmintonatleet findBadmintonAtleetByAtleetID(@Param("atleetID") int atleetID);
}

