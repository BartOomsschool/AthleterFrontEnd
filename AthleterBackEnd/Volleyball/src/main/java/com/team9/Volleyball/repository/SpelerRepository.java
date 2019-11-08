package com.team9.Volleyball.repository;

import com.team9.Volleyball.Entity.Speler;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

public interface SpelerRepository extends MongoRepository<Speler, Integer> {
    Speler findSpelerByNaam(@Param("naam")String naam);
}
