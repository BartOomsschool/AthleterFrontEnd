package com.team9.edge.service.controllers.Voetbal;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team9.edge.service.models.GenericResponseWrapper;

import com.team9.edge.service.models.Voetbal.VoetbalPositie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.cbor.MappingJackson2CborHttpMessageConverter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/voetbalPosities")
public class VoetbalPositieController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/getvoetbalposities")
    public List<VoetbalPositie> getVoetbalPosities(){

        GenericResponseWrapper wrapper = restTemplate.getForObject("http://voetbal-service/voetbalPosities/", GenericResponseWrapper.class);

        List<VoetbalPositie> voetbalPosities  = objectMapper.convertValue(wrapper.get_embedded().get("voetbalPosities"), new TypeReference<List<VoetbalPositie>>() { });

        return voetbalPosities;
    }

    @PostMapping("/postvoetbalpositie")
    public ResponseEntity<String> postVoetbalPositie(@RequestBody VoetbalPositie positie){

        VoetbalPositie position = new VoetbalPositie(positie.getNumber());

        ResponseEntity<String> result = restTemplate.postForEntity(
                "http://voetbal-service/voetbalPosities/", position, String.class
        );

        return ResponseEntity.ok().build();
    }

    @PutMapping("/putvoetbalpositie")
    public ResponseEntity<String> putSpeler(@RequestBody VoetbalPositie positie){
        List<HttpMessageConverter<?>> list = new ArrayList<>();
        list.add(new MappingJackson2CborHttpMessageConverter());
        restTemplate.setMessageConverters(list);

        restTemplate.put("http://voetbal-service/voetbalPosities/" + positie.getPositieID(), positie , String.class);
        return ResponseEntity.ok().build();
    }
}
