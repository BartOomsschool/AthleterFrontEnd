package com.team9.Volleyball.repository;

import com.team9.Volleyball.Entity.VolleyballPositie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

public interface VolleyballPositieRepository extends MongoRepository<VolleyballPositie, Integer> {
    VolleyballPositie findVolleyballPositieByNaam(@Param("naam")String naam);
}
