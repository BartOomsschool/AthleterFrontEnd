package com.team9.Volleyball.repository;

import com.team9.Volleyball.Entity.VolleyballAtleet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

public interface VolleyballAtleetRepository extends MongoRepository<VolleyballAtleet, Integer> {
    VolleyballAtleet findVolleyballAtleetByNaam(@Param("naam")String naam);
}
