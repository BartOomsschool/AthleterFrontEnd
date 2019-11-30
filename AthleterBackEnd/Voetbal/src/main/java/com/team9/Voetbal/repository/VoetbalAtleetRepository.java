package com.team9.Voetbal.repository;

import com.team9.Voetbal.entity.VoetbalAtleet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VoetbalAtleetRepository extends MongoRepository<VoetbalAtleet, String>{
    List<VoetbalAtleet> getVoetbalAtleetByPositie(@Param("positie") String positie);
    VoetbalAtleet findVoetbalAtleetByVoetbalAtleetID(@Param("voetbalAtleetID") String voetbalAtleetID);
}
