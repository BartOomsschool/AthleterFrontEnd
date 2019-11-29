package com.team9.hockey.repository;

import com.team9.hockey.entity.Positie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PositieRepository extends MongoRepository<Positie, String> {
    List<Positie> getPositieByNaam(@Param("naam") String naam );
}
