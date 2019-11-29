package com.team9.hockey.repository;

import com.team9.hockey.entity.Ploeg;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PloegRepository extends MongoRepository<Ploeg, String> {
    List<Ploeg> getPloegByNaam(@Param("naam") String naam );
}
