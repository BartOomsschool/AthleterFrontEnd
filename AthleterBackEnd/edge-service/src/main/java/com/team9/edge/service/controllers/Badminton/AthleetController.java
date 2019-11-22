package com.team9.edge.service.controllers.Badminton;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team9.edge.service.models.Badminton.Athleet;
import com.team9.edge.service.models.GenericResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/badminton")
public class AthleetController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/getAthleten")
    public List<Athleet> getAthleten(){
        GenericResponseWrapper wrapper = restTemplate.getForObject("http://badminton-service/athleets/", GenericResponseWrapper.class);

        List<Athleet> athleten  = objectMapper.convertValue(wrapper.get_embedded().get("athleets"), new TypeReference<List<Athleet>>() { });

        return athleten;
    }
}
