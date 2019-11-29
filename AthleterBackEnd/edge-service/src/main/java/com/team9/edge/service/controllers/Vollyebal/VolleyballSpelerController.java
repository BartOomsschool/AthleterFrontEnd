package com.team9.edge.service.controllers.Vollyebal;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team9.edge.service.models.GenericResponseWrapper;
import com.team9.edge.service.models.Volleybal.VolleyballSpeler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.cbor.MappingJackson2CborHttpMessageConverter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/volleyballSpelers")
public class VolleyballSpelerController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/getVolleyballSpelers")
    public List<VolleyballSpeler> getVolleyballSpelers(){
        GenericResponseWrapper wrapper = restTemplate.getForObject("http://volleybal-service/volleyballSpelers/", GenericResponseWrapper.class);

        List<VolleyballSpeler> spelers  = objectMapper.convertValue(wrapper.get_embedded().get("volleyballSpelers"), new TypeReference<List<VolleyballSpeler>>() { });

        return spelers;
    }

    @PutMapping("/putvolleyballSpeler")
    public ResponseEntity<String> putVolleyballSpeler(@RequestBody VolleyballSpeler speler){
        List<HttpMessageConverter<?>> list = new ArrayList<>();
        list.add(new MappingJackson2CborHttpMessageConverter());
        restTemplate.setMessageConverters(list);

        restTemplate.put("http://volleybal-service/volleyballSpelers/" + speler.getId(), speler , String.class);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/postvolleyballSpeler")
    public ResponseEntity<String> postVolleyballSpeler(@RequestBody VolleyballSpeler speler){

        VolleyballSpeler player = new VolleyballSpeler(speler.getNaam(), speler.getLengteInCm(), speler.getSelecties(),speler.getGeboortedatum(),speler.getGeslacht(),speler.getPositieId(),speler.getTeamId());

        ResponseEntity<String> result = restTemplate.postForEntity(
                "http://volleybal-service/volleyballSpelers/", player, String.class
        );

        return ResponseEntity.ok().build();
    }

    @GetMapping("volleyballSpelers/{teamId}")
    public List<VolleyballSpeler> getVolleyballSpelerByteamId(@PathVariable("teamId")  String teamId){
        GenericResponseWrapper wrapper = restTemplate.getForObject("http://volleybal-service/volleyballSpelers/findVolleyballSpelersByTeamId?teamId=" + teamId, GenericResponseWrapper.class);

        List<VolleyballSpeler> spelers  = objectMapper.convertValue(wrapper.get_embedded().get("atleets"), new TypeReference<List<VolleyballSpeler>>() { });

        return spelers;
    }

    @DeleteMapping("DeletevolleyballSpeler/{id}")
    public ResponseEntity deleteVolleyballSpeler(@PathVariable("id") String id){

        restTemplate.delete("http://volleybal-service/volleyballSpelers/" + id);
        return ResponseEntity.ok().build();
    }
}
