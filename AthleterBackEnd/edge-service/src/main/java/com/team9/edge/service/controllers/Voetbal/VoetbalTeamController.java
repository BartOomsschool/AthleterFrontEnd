package com.team9.edge.service.controllers.Voetbal;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team9.edge.service.models.GenericResponseWrapper;

import com.team9.edge.service.models.Voetbal.VoetbalTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@RestController
@RequestMapping("/voetbalTeams")
public class VoetbalTeamController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/getvoetbalteams")
    public List<VoetbalTeam> getVoetbalTeams(){

        GenericResponseWrapper wrapper = restTemplate.getForObject("http://voetbal-service/voetbalTeams/", GenericResponseWrapper.class);

        List<VoetbalTeam> voetbalTeams  = objectMapper.convertValue(wrapper.get_embedded().get("voetbalTeams"), new TypeReference<List<VoetbalTeam>>() { });

        return voetbalTeams;
    }
}