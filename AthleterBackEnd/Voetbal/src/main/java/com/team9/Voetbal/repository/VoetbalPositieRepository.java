package com.team9.Voetbal.repository;

import com.team9.Voetbal.entity.VoetbalPositie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VoetbalPositieRepository extends MongoRepository<VoetbalPositie, String> {
    List<VoetbalPositie> getVoetbalPositieByNumber(@Param("number") String number);
}
