package com.team9.Voetbal.repository;

import com.team9.Voetbal.entity.Speler;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SpelerRepository extends MongoRepository<Speler, String>{
    List<Speler> findSpelerByTeamID(@Param("teamID") Integer teamID);
    List<Speler> findSpelerByPositieID(@Param("PositieID") Integer PositieID);
    Speler findSpelerByTeamIDAndPositieID(@Param("TeamID") Integer TeamID, @Param("PositieID") Integer PositieID);
}
