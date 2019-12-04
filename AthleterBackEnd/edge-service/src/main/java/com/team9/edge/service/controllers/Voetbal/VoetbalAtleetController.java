package com.team9.edge.service.controllers.Voetbal;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team9.edge.service.models.GenericResponseWrapper;
import com.team9.edge.service.models.Voetbal.VoetbalAtleet;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("voetbalAtleets")
@Api(value="VoetbalAtleet controller", description="Actions that involve the VoetbalAtleet entity")
public class VoetbalAtleetController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    @ApiOperation(value = "Geeft een atleet terug met de opgegeven Id", response = List.class)
    @GetMapping("getatleet/{voetbalAtleetID}")
    public VoetbalAtleet getVoetbalAtleetByVoetbalAtleetID(@PathVariable("voetbalAtleetID") String voetbalAtleetID){
        VoetbalAtleet voetbalAtleet = restTemplate.getForObject("http://voetbal-service/voetbalAtleets/search/findVoetbalAtleetByVoetbalAtleetID?voetbalAtleetID=" + voetbalAtleetID, VoetbalAtleet.class);
        return voetbalAtleet;
    }


    @ApiOperation(value = "Geeft een lijst terug van alle atleten", response = List.class)
    @GetMapping("getatleten")
    public List<VoetbalAtleet> getAtleten(){
        GenericResponseWrapper wrapper = restTemplate.getForObject("http://voetbal-service/voetbalAtleets/", GenericResponseWrapper.class);
        List<VoetbalAtleet> voetbalAtleets = objectMapper.convertValue(wrapper.get_embedded().get("voetbalAtleets"), new TypeReference<List<VoetbalAtleet>>() { });
        return voetbalAtleets;
    }


    @ApiOperation(value = "Voegt een atleet toe", response = List.class)
    @PostMapping("postatleet")
    public ResponseEntity<String> postSpeler(@RequestBody VoetbalAtleet voetbalAtleet){
        VoetbalAtleet player = new VoetbalAtleet(voetbalAtleet.getNaam(), voetbalAtleet.getTeam(), voetbalAtleet.getPositie());
        ResponseEntity<String> result = restTemplate.postForEntity("http://voetbal-service/voetbalAtleets/", player, String.class);
        return ResponseEntity.ok().build();
    }

    @ApiOperation(value = "Update de opgegeven atleet", response = List.class)
    @PutMapping("putatleet")
    public ResponseEntity<String> putSpeler(@RequestBody VoetbalAtleet voetbalAtleet){
        restTemplate.put("http://voetbal-service/voetbalAtleets/" + voetbalAtleet.getVoetbalAtleetID(), voetbalAtleet, String.class);
        return ResponseEntity.ok().build();
    }


    @ApiOperation(value = "Verwijdert de atleet met opgegeven Id", response = List.class)
    @DeleteMapping("deleteatleet/{voetbalAtleetID}")
    public ResponseEntity deleteTeam(@PathVariable("voetbalAtleetID") String voetbalAtleetID) {
        restTemplate.delete("http://voetbal-service/voetbalAtleets/" + voetbalAtleetID);
        return ResponseEntity.ok().build();
    }
}
