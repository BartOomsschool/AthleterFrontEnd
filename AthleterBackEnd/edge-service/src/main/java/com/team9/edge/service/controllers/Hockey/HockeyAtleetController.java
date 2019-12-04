package com.team9.edge.service.controllers.Hockey;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team9.edge.service.models.GenericResponseWrapper;
import com.team9.edge.service.models.Hockey.HockeyAtleet;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("hockeyAtleets")
public class HockeyAtleetController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    @ApiOperation(value = "Geeft een atleet terug met de opgegeven Id", response = List.class)
    @GetMapping("getAtleet/{ID}")
    public HockeyAtleet getAtleet(@PathVariable("ID") String ID){
        HockeyAtleet speler = restTemplate.getForObject("http://hockey-service/hockeyAtleets/search/findAtleetByID?ID=" + ID, HockeyAtleet.class);
        return speler;
    }

    @ApiOperation(value = "Geeft een lijst terug van alle atleten", response = List.class)
    @GetMapping("getAtleten")
    public List<HockeyAtleet> getAtleten(){
        GenericResponseWrapper wrapper = restTemplate.getForObject("http://hockey-service/hockeyAtleets/", GenericResponseWrapper.class);
        List<HockeyAtleet> spelers  = objectMapper.convertValue(wrapper.get_embedded().get("hockeyAtleets"), new TypeReference<List<HockeyAtleet>>() { });
        return spelers;
    }

    @ApiOperation(value = "Voegt een atleet toe", response = List.class)
    @PostMapping("postAtleet")
    public ResponseEntity<String> postAtleet(@RequestBody HockeyAtleet speler){

        HockeyAtleet hockeyAtleet = new HockeyAtleet(speler.getNaam());
        ResponseEntity<String> result = restTemplate.postForEntity(
                "http://hockey-service/hockeyAtleets/", speler, String.class
        );
        return ResponseEntity.ok().build();
    }


    @ApiOperation(value = "Update de opgegeven atleet", response = List.class)
    @PutMapping("putAtleet")
    public ResponseEntity<String> putAtleet(@RequestBody HockeyAtleet speler){

        restTemplate.put("http://hockey-service/hockeyAtleets/" + speler.getID(), speler , String.class);
        return ResponseEntity.ok().build();
    }

    @ApiOperation(value = "Verwijdert de atleet met opgegeven Id", response = List.class)
    @DeleteMapping("{ID}")
    public ResponseEntity deleteAtleet(@PathVariable("ID") String ID){
        restTemplate.delete("http://hockey-service/hockeyAtleets/" + ID);
        return ResponseEntity.ok().build();
    }
}