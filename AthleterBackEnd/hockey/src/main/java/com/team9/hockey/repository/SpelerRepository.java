package com.team9.hockey.repository;

import com.team9.hockey.entity.Speler;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SpelerRepository extends MongoRepository<Speler, String> {
    List<Speler> findSpelersByTeamID(@Param("teamID") Integer teamID);
    List<Speler> findSpelersByPositieID(@Param("positieID") Integer positieID);
    Speler findSpelerByTeamIDAndPositieID(@Param("teamID") Integer teamID,
                                          @Param("positieID") Integer positieID);
}
