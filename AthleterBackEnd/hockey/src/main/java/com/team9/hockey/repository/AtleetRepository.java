package com.team9.hockey.repository;

import com.team9.hockey.entity.Atleet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AtleetRepository extends MongoRepository<Atleet, String> {
    List<Atleet> findAtleetByPloegID(@Param("teamID") String teamID);
    List<Atleet> findAtleetByPositieID(@Param("positieID") String positieID);
    Atleet findAtleetByPloegIDAndPositieID(@Param("teamID") String teamID,
                                          @Param("positieID") String positieID);
}
