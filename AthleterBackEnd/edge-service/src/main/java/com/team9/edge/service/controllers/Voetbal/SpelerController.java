package com.team9.edge.service.controllers.Voetbal;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team9.edge.service.models.GenericResponseWrapper;
import com.team9.edge.service.models.Voetbal.Speler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.cbor.MappingJackson2CborHttpMessageConverter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/spelers")
public class SpelerController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("{teamID}")
    public List<Speler> getSpelersByTeamID(@PathVariable("teamID") String teamID){
        GenericResponseWrapper wrapper = restTemplate.getForObject("http://voetbal-service/spelers/search/findSpelerByTeamID?teamID=" + teamID, GenericResponseWrapper.class);

        List<Speler> spelers  = objectMapper.convertValue(wrapper.get_embedded().get("spelers"), new TypeReference<List<Speler>>() { });

/*
        List<Speler> returnList = new ArrayList<>();
        for (Speler speler: spelers){
            Speler test = restTemplate.getForObject("http://voetbal-service/spelers/" + speler.getId(), Speler.class);
            returnList.add(test);
        }
*/
        return spelers;
    }

    @GetMapping("/getspelers")
    public List<Speler> getSpelers(){
        GenericResponseWrapper wrapper = restTemplate.getForObject("http://voetbal-service/spelers/", GenericResponseWrapper.class);

        List<Speler> spelers  = objectMapper.convertValue(wrapper.get_embedded().get("spelers"), new TypeReference<List<Speler>>() { });

        return spelers;
    }

    @PostMapping("/postspeler")
    public ResponseEntity<String> postSpeler(@RequestBody Speler speler){

        Speler player = new Speler(speler.getNaam(),speler.getTeamID(),speler.getPositieID(),speler.getGeboorteDatum());

        ResponseEntity<String> result = restTemplate.postForEntity(
                "http://voetbal-service/spelers/", player, String.class
        );

        return ResponseEntity.ok().build();
    }

    @PutMapping("/putspeler")
    public ResponseEntity<String> putSpeler(@RequestBody Speler speler){
        List<HttpMessageConverter<?>> list = new ArrayList<>();
        list.add(new MappingJackson2CborHttpMessageConverter());
        restTemplate.setMessageConverters(list);

        restTemplate.put("http://voetbal-service/spelers/" + speler.getId(), speler , String.class);
        return ResponseEntity.ok().build();
    }
}
