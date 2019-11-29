package com.team9.edge.service.controllers.Hockey;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team9.edge.service.models.GenericResponseWrapper;
import com.team9.edge.service.models.Hockey.Ploeg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.cbor.MappingJackson2CborHttpMessageConverter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hockeyPloegen")
public class PloegController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/getPloegen")
    public List<Ploeg> getPloegen(){
        GenericResponseWrapper wrapper = restTemplate.getForObject("http://hockey-service/Ploegs/", GenericResponseWrapper.class);
        List<Ploeg> ploegen = objectMapper.convertValue(wrapper.get_embedded().get("ploegs"), new TypeReference<List<Ploeg>>() { });
        return ploegen;
    }

    @PostMapping("/postPloeg")
    public ResponseEntity<String> postPloeg(@RequestBody Ploeg team){

        Ploeg ploeg = new Ploeg(team.getNaam());

        ResponseEntity<String> result = restTemplate.postForEntity(
                "http://hockey-service/Ploegs/", ploeg, String.class
        );

        return ResponseEntity.ok().build();
    }

    @PutMapping("/putPloeg")
    public ResponseEntity<String> putPloeg(@RequestBody Ploeg team){
        List<HttpMessageConverter<?>> list = new ArrayList<>();
        list.add(new MappingJackson2CborHttpMessageConverter());
        restTemplate.setMessageConverters(list);

        restTemplate.put("http://hockey-service/Ploegs/" + team.getPloegID(), team , String.class);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("ploeg/{ploegID}")
    public ResponseEntity deletePloeg(@PathVariable("ploegID") String ploegID){

        restTemplate.delete("http://hockey-service/Ploegs/" + ploegID);
        return ResponseEntity.ok().build();
    }

}
