package com.team9.edge.service.controllers.Voetbal;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team9.edge.service.models.GenericResponseWrapper;
import com.team9.edge.service.models.Voetbal.VoetbalAtleet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.cbor.MappingJackson2CborHttpMessageConverter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("voetbalAtleets")
public class VoetbalAtleetController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("getatleet/{voetbalAtleetID}")
    public VoetbalAtleet getVoetbalAtleetByVoetbalAtleetID(@PathVariable("voetbalAtleetID") String voetbalAtleetID){
        VoetbalAtleet voetbalAtleet = restTemplate.getForObject("http://voetbal-service/voetbalAtleets/search/findVoetbalAtleetByVoetbalAtleetID?voetbalAtleetID=" + voetbalAtleetID, VoetbalAtleet.class);
        return voetbalAtleet;
    }

    @GetMapping("getatleten")
    public List<VoetbalAtleet> getAtleten(){
        GenericResponseWrapper wrapper = restTemplate.getForObject("http://voetbal-service/voetbalAtleets/", GenericResponseWrapper.class);
        List<VoetbalAtleet> voetbalAtleets = objectMapper.convertValue(wrapper.get_embedded().get("voetbalAtleets"), new TypeReference<List<VoetbalAtleet>>() { });
        return voetbalAtleets;
    }

    @PostMapping("postatleet")
    public ResponseEntity<String> postSpeler(@RequestBody VoetbalAtleet voetbalAtleet){
        VoetbalAtleet player = new VoetbalAtleet(voetbalAtleet.getNaam(), voetbalAtleet.getTeam(), voetbalAtleet.getPositie());
        ResponseEntity<String> result = restTemplate.postForEntity("http://voetbal-service/voetbalAtleets/", player, String.class);
        return ResponseEntity.ok().build();
    }

    @PutMapping("putatleet")
    public ResponseEntity<String> putSpeler(@RequestBody VoetbalAtleet voetbalAtleet){
        restTemplate.put("http://voetbal-service/voetbalAtleets/" + voetbalAtleet.getVoetbalAtleetID(), voetbalAtleet, String.class);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("deleteatleet/{voetbalAtleetID}")
    public ResponseEntity deleteTeam(@PathVariable("voetbalAtleetID") String voetbalAtleetID) {
        restTemplate.delete("http://voetbal-service/voetbalAtleets/" + voetbalAtleetID);
        return ResponseEntity.ok().build();
    }
}
