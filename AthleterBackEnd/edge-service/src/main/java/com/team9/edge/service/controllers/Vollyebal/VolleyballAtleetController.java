package com.team9.edge.service.controllers.Vollyebal;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team9.edge.service.models.GenericResponseWrapper;
import com.team9.edge.service.models.Volleybal.VolleyballAtleet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@RestController
@RequestMapping("/volleyballAtleets")
public class VolleyballAtleetController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/getVolleyballAtleets")
    public List<VolleyballAtleet> getVolleyballAtleets(){
        GenericResponseWrapper wrapper = restTemplate.getForObject("http://volleybal-service/volleyballAtleets/", GenericResponseWrapper.class);

        List<VolleyballAtleet> atleets  = objectMapper.convertValue(wrapper.get_embedded().get("volleyballAtleets"), new TypeReference<List<VolleyballAtleet>>() { });

        return atleets;
    }

    @PutMapping("/putvolleyballAtleet")
    public ResponseEntity<String> putVolleyballAtleet(@RequestBody VolleyballAtleet atleet){
        restTemplate.put("http://volleybal-service/volleyballAtleets/" + atleet.getVolleyballid(), atleet , String.class);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/postvolleyballAtleet")
    public ResponseEntity<String> postVolleyballAtleet(@RequestBody VolleyballAtleet atleet){

        VolleyballAtleet player = new VolleyballAtleet(atleet.getNaam(), atleet.getLengteInCm(), atleet.getSelecties(),atleet.getGeboortedatum(),atleet.getGeslacht(),atleet.getPositie(),atleet.getTeam());

        ResponseEntity<String> result = restTemplate.postForEntity(
                "http://volleybal-service/volleyballAtleets/", player, String.class
        );

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/deletevolleyballAtleet/{volleyballid}")
    public ResponseEntity deleteVolleyballAtleet(@PathVariable("volleyballid") String volleyballid){
        restTemplate.delete("http://volleybal-service/volleyballAtleets/" + volleyballid);
        return ResponseEntity.ok().build();
    }
}
