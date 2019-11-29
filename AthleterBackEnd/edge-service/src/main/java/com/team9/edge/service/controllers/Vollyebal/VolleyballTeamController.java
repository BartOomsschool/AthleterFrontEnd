package com.team9.edge.service.controllers.Vollyebal;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team9.edge.service.models.GenericResponseWrapper;
import com.team9.edge.service.models.Volleybal.VolleyballTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.cbor.MappingJackson2CborHttpMessageConverter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/volleyballTeams")
public class VolleyballTeamController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/getVolleyballTeams")
    public List<VolleyballTeam> getVolleyballTeams(){
        GenericResponseWrapper wrapper = restTemplate.getForObject("http://volleybal-service/volleyballTeams/", GenericResponseWrapper.class);
        
        List<VolleyballTeam> teams  = objectMapper.convertValue(wrapper.get_embedded().get("volleyballTeams"), new TypeReference<List<VolleyballTeam>>() { });

        return teams;
    }

    @PostMapping("/postvolleyballTeam")
    public ResponseEntity<String> postVolleyballTeam(@RequestBody VolleyballTeam team0) {

        VolleyballTeam team = new VolleyballTeam(team0.getNaam());

        ResponseEntity<String> result = restTemplate.postForEntity(
                "http://volleybal-service/volleyballTeams/", team, String.class
        );
        return ResponseEntity.ok().build();
    }

    @PutMapping("/putvolleyballTeam")
    public ResponseEntity<String> putVolleyballTeam(@RequestBody VolleyballTeam team){
        List<HttpMessageConverter<?>> list = new ArrayList<>();
        list.add(new MappingJackson2CborHttpMessageConverter());
        restTemplate.setMessageConverters(list);

        restTemplate.put("http://volleybal-service/volleyballTeams/" + team.getId(), team , String.class);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("DeletevolleyballTeam/{id}")
    public ResponseEntity deleteVolleyballTeam(@PathVariable("id") String id){

        restTemplate.delete("http://volleybal-service/volleyballTeams/" + id);
        return ResponseEntity.ok().build();
    }
}
