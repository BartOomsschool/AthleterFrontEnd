package com.team9.edge.service.controllers.Hockey;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team9.edge.service.models.GenericResponseWrapper;
import com.team9.edge.service.models.Hockey.Atleet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.cbor.MappingJackson2CborHttpMessageConverter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/atleet")
public class AtleetController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;
    @GetMapping("atleet/{ploegID}")
    public List<Atleet> getAtleetByPloegID(@PathVariable("ploegID")  String ploegID){
        GenericResponseWrapper wrapper = restTemplate.getForObject("http://hockey-service/atleets/search/findAtleetByPloegID?PloegID=" + ploegID, GenericResponseWrapper.class);

        List<Atleet> spelers  = objectMapper.convertValue(wrapper.get_embedded().get("atleets"), new TypeReference<List<Atleet>>() { });

        return spelers;
    }

    @GetMapping("/getAtleten")
    public List<Atleet> getAtleten(){
        GenericResponseWrapper wrapper = restTemplate.getForObject("http://hockey-service/atleets/", GenericResponseWrapper.class);

        List<Atleet> spelers  = objectMapper.convertValue(wrapper.get_embedded().get("atleets"), new TypeReference<List<Atleet>>() { });

        return spelers;
    }

    @PostMapping("/postAtleet")
    public ResponseEntity<String> postAtleet(@RequestBody Atleet speler){

        Atleet atleet = new Atleet(speler.getNaam());

        ResponseEntity<String> result = restTemplate.postForEntity(
                "http://hockey-service/Atleets/", speler, String.class
        );

        return ResponseEntity.ok().build();
    }

    @PutMapping("/putAtleet")
    public ResponseEntity<String> putPloeg(@RequestBody Atleet speler){
        List<HttpMessageConverter<?>> list = new ArrayList<>();
        list.add(new MappingJackson2CborHttpMessageConverter());
        restTemplate.setMessageConverters(list);

        restTemplate.put("http://hockey-service/Atleets/" + speler.getID(), speler , String.class);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("atleets/{ID}")
    public ResponseEntity deleteAtleet(@PathVariable("ID") String ID){

        restTemplate.delete("http://hockey-service/Atleets/" + ID);
        return ResponseEntity.ok().build();
    }
}
