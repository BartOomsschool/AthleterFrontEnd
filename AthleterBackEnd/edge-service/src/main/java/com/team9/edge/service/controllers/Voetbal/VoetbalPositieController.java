package com.team9.edge.service.controllers.Voetbal;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team9.edge.service.models.GenericResponseWrapper;

import com.team9.edge.service.models.Voetbal.VoetbalPositie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


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
}
