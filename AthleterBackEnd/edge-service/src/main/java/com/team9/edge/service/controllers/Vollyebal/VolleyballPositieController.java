package com.team9.edge.service.controllers.Vollyebal;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team9.edge.service.models.GenericResponseWrapper;
import com.team9.edge.service.models.Volleybal.VolleyballPositie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.cbor.MappingJackson2CborHttpMessageConverter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/volleyballPosities")
public class VolleyballPositieController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/getVolleyballPosities")
    public List<VolleyballPositie> getVolleyballPosities() {
        GenericResponseWrapper wrapper = restTemplate.getForObject("http://volleybal-service/volleyballPosities/", GenericResponseWrapper.class);

        List<VolleyballPositie> posities = objectMapper.convertValue(wrapper.get_embedded().get("volleyballPosities"), new TypeReference<List<VolleyballPositie>>() {
        });

        return posities;
    }

    @PostMapping("/postvolleyballPositie")
    public ResponseEntity<String> postVolleyballPositie(@RequestBody VolleyballPositie positie) {

        VolleyballPositie position = new VolleyballPositie(positie.getNaam());

        ResponseEntity<String> result = restTemplate.postForEntity(
                "http://volleybal-service/volleyballPosities/", position, String.class
        );
        return ResponseEntity.ok().build();
    }

    @PutMapping("/putvolleyballpositie")
    public ResponseEntity<String> putVolleyballPositie(@RequestBody VolleyballPositie positie){
        List<HttpMessageConverter<?>> list = new ArrayList<>();
        list.add(new MappingJackson2CborHttpMessageConverter());
        restTemplate.setMessageConverters(list);

        restTemplate.put("http://volleybal-service/volleyballPosities/" + positie.getId(), positie , String.class);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("DeletevolleyballPositie/{id}")
    public ResponseEntity deleteVolleyballPositie(@PathVariable("id") String id){

        restTemplate.delete("http://volleybal-service/volleyballPosities/" + id);
        return ResponseEntity.ok().build();
    }
}
