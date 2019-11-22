package com.team9.Voetbal.repository;


import com.team9.Voetbal.entity.VoetbalTeam;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VoetbalTeamRepository extends MongoRepository<VoetbalTeam, String> {
    List<VoetbalTeam> getVoetbalTeams();
}
