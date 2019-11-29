package com.team9.hockey.repository;

import com.team9.hockey.entity.HockeyAtleet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HockeyAtleetRepository extends MongoRepository<HockeyAtleet, String> {
    List<HockeyAtleet> findHockeyAtleetByPloeg(@Param("ploeg") String ploeg);
    List<HockeyAtleet> findHockeyAtleetByPositie(@Param("positie") String positie);
    HockeyAtleet findHockeyAtleetByPloegAndPositie(@Param("ploeg") String ploeg,
                                                 @Param("positie") String positie);
}
