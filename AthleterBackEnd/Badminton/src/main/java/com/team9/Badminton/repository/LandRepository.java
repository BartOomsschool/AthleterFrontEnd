package com.team9.Badminton.repository;

import com.team9.Badminton.entity.Land;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface LandRepository extends JpaRepository<Land, Integer> {
    Land findLandByLandID(@Param("landID") int landID);
}

