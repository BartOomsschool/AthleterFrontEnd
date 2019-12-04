package com.team9.edge.service.controllers.Badminton;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team9.edge.service.models.Badminton.Badmintonatleet;
import com.team9.edge.service.models.GenericResponseWrapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/badminton")
public class BadmintonatleetController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    @ApiOperation(value = "Geeft een lijst terug van alle atleten", response = List.class)
    @GetMapping("/getBadmintonatleten")
    public List<Badmintonatleet> getBadmintonatleten(){
        GenericResponseWrapper wrapper = restTemplate.getForObject("http://badminton-service/badmintonatleets?page=0&size=5000", GenericResponseWrapper.class);

        List<Badmintonatleet> atleten  = objectMapper.convertValue(wrapper.get_embedded().get("badmintonatleets"), new TypeReference<List<Badmintonatleet>>() { });

        return atleten;
    }

    @ApiOperation(value = "Geeft een atleet terug met de opgegeven Id", response = List.class)
    @GetMapping("getBadmintonatleet/{badmintonatleetID}")
    public Badmintonatleet getVoetbalAtleetByVoetbalAtleetID(@PathVariable("badmintonatleetID") String atleetID){
        Badmintonatleet voetbalAtleet = restTemplate.getForObject("http://badminton-service/badmintonatleets/" + atleetID, Badmintonatleet.class);
        return voetbalAtleet;
    }

    @ApiOperation(value = "Voegt een atleet toe", response = List.class)
    @PostMapping("/postBadmintonatleet")
    public ResponseEntity<String> postBadmintonatleet(@RequestBody Badmintonatleet atleetPost){

        Badmintonatleet atleet = new Badmintonatleet(atleetPost.getAtleetID(), atleetPost.getCategorie(),
                atleetPost.getRank(), atleetPost.getLand(), atleetPost.getNaam(), atleetPost.getPunten(),
                atleetPost.getToernooien(), atleetPost.getAfbeelding(), atleetPost.getPartnerID() );

        ResponseEntity<String> result = restTemplate.postForEntity(
                "http://badminton-service/badmintonatleets/", atleet, String.class
        );

        return ResponseEntity.ok().build();
    }


    @ApiOperation(value = "Update de opgegeven atleet", response = List.class)
    @PutMapping("/putBadmintonatleet")
    public ResponseEntity<String> putBadmintonatleet(@RequestBody Badmintonatleet atleet){
        restTemplate.put("http://badminton-service/badmintonatleets/" + atleet.getAtleetID(), atleet, String.class);
        return ResponseEntity.ok().build();
    }

    @ApiOperation(value = "Verwijdert de atleet met opgegeven Id", response = List.class)
    @DeleteMapping("/deleteBadmintonatleet/{badmintonatleetID}")
    public ResponseEntity deleteBadmintonatleet(@PathVariable("badmintonatleetID") String badmintonatleetID) {
        restTemplate.delete("http://badminton-service/badmintonatleets/" + badmintonatleetID);
        return ResponseEntity.ok().build();
    }
}
