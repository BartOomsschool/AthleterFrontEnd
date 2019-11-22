package com.team9.Volleyball.repository;

import com.team9.Volleyball.Entity.VolleyballTeam;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

public interface VolleyballTeamRepository extends MongoRepository<VolleyballTeam, Integer> {
    VolleyballTeam findVolleyballTeamByNaam(@Param("naam")String naam);
}
