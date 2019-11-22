package com.team9.Volleyball.repository;

import com.team9.Volleyball.Entity.VolleyballSpeler;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

public interface VolleyballSpelerRepository extends MongoRepository<VolleyballSpeler, Integer> {
    VolleyballSpeler findVolleyballSpelerByNaam(@Param("naam")String naam);
}
