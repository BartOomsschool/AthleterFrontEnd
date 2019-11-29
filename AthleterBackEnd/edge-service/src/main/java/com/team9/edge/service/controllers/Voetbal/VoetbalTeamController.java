package com.team9.edge.service.controllers.Voetbal;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team9.edge.service.models.GenericResponseWrapper;

import com.team9.edge.service.models.Voetbal.VoetbalTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.cbor.MappingJackson2CborHttpMessageConverter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;
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

    @PostMapping("/postvoetbalteam")
    public ResponseEntity<String> postVoetbalTeam(@RequestBody VoetbalTeam team){

        VoetbalTeam team1 = new VoetbalTeam(team.getTeamNaam());

        ResponseEntity<String> result = restTemplate.postForEntity(
                "http://voetbal-service/voetbalTeams/", team1, String.class
        );
        return ResponseEntity.ok().build();
    }

    @PutMapping("/putvoetbalteam")
    public ResponseEntity<String> putVoetbalTeam(@RequestBody VoetbalTeam team){
        List<HttpMessageConverter<?>> list = new ArrayList<>();
        list.add(new MappingJackson2CborHttpMessageConverter());
        restTemplate.setMessageConverters(list);

        restTemplate.put("http://voetbal-service/voetbalTeams/" + team.getTeamId(), team , String.class);
        return ResponseEntity.ok().build();
    }
}