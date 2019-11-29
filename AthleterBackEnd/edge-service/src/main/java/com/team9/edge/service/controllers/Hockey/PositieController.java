package com.team9.edge.service.controllers.Hockey;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team9.edge.service.models.GenericResponseWrapper;
import com.team9.edge.service.models.Hockey.Positie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.cbor.MappingJackson2CborHttpMessageConverter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class PositieController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/getPositieen")
    public List<Positie> getPositieen(){
        GenericResponseWrapper wrapper = restTemplate.getForObject("http://hockey-service/Posities/", GenericResponseWrapper.class);
        List<Positie> Positie = objectMapper.convertValue(wrapper.get_embedded().get("Posities"), new TypeReference<List<Positie>>() { });
        return Positie;
    }

    @PostMapping("/postPositie")
    public ResponseEntity<String> postPositie(@RequestBody Positie position){

        Positie positie = new Positie(position.getNaam());

        ResponseEntity<String> result = restTemplate.postForEntity(
                "http://hockey-service/Posities/", position, String.class
        );
        return ResponseEntity.ok().build();
    }

    @PutMapping("/putPositie")
    public ResponseEntity<String> putPositie(@RequestBody Positie position){
        List<HttpMessageConverter<?>> list = new ArrayList<>();
        list.add(new MappingJackson2CborHttpMessageConverter());
        restTemplate.setMessageConverters(list);

        restTemplate.put("http://hockey-service/Posities/" + position.getPositieID(), position , String.class);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("positie/{positieID}")
    public ResponseEntity deletePositie(@PathVariable("positieID") String positieID){

        restTemplate.delete("http://hockey-service/Posities/" + positieID);
        return ResponseEntity.ok().build();
    }

}
