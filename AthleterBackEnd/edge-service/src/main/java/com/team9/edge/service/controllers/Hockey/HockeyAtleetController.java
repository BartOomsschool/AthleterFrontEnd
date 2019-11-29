package com.team9.edge.service.controllers.Hockey;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team9.edge.service.models.GenericResponseWrapper;
import com.team9.edge.service.models.Hockey.HockeyAtleet;
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
//    @GetMapping("{ploeg}")
//    public List<HockeyAtleet> getAtleetByPloegID(@PathVariable("ploeg")  String ploeg){
//        GenericResponseWrapper wrapper = restTemplate.getForObject("http://hockey-service/hockeyAtleets/search/findAtleetByPloegID?PloegID=" + ploeg, GenericResponseWrapper.class);
//        List<HockeyAtleet> spelers  = objectMapper.convertValue(wrapper.get_embedded().get("hockeyAtleets"), new TypeReference<List<HockeyAtleet>>() { });
//        return spelers;
//    }
    @GetMapping("getAtleten")
    public List<HockeyAtleet> getAtleten(){
        GenericResponseWrapper wrapper = restTemplate.getForObject("http://hockey-service/hockeyAtleets/", GenericResponseWrapper.class);
        List<HockeyAtleet> spelers  = objectMapper.convertValue(wrapper.get_embedded().get("hockeyAtleets"), new TypeReference<List<HockeyAtleet>>() { });
        return spelers;
    }
    @PostMapping("postAtleet")
    public ResponseEntity<String> postAtleet(@RequestBody HockeyAtleet speler){

        HockeyAtleet hockeyAtleet = new HockeyAtleet(speler.getNaam());
        ResponseEntity<String> result = restTemplate.postForEntity(
                "http://hockey-service/hockeyAtleets/", speler, String.class
        );
        return ResponseEntity.ok().build();
    }
    @PutMapping("putAtleet")
    public ResponseEntity<String> putAtleet(@RequestBody HockeyAtleet speler){

        restTemplate.put("http://hockey-service/hockeyAtleets/" + speler.getID(), speler , String.class);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("{ID}")
    public ResponseEntity deleteAtleet(@PathVariable("ID") String ID){
        restTemplate.delete("http://hockey-service/hockeyAtleets/" + ID);
        return ResponseEntity.ok().build();
    }
}