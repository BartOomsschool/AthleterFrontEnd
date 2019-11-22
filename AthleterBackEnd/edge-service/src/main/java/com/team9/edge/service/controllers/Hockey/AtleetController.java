package com.team9.edge.service.controllers.Hockey;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team9.edge.service.models.GenericResponseWrapper;
import com.team9.edge.service.models.Hockey.Atleet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
        GenericResponseWrapper wrapper = restTemplate.getForObject("http://hockey-service/atleets.search/findAtleetByPloegID?PloegID=" + ploegID, GenericResponseWrapper.class);

        List<Atleet> spelers  = objectMapper.convertValue(wrapper.get_embedded().get("atleets"), new TypeReference<List<Atleet>>() { });

        return spelers;
    }

    @GetMapping("/getAtleten")
    public List<Atleet> getAtleten(){
        GenericResponseWrapper wrapper = restTemplate.getForObject("http://hockey-service/atleets/", GenericResponseWrapper.class);

        List<Atleet> spelers  = objectMapper.convertValue(wrapper.get_embedded().get("atleets"), new TypeReference<List<Atleet>>() { });

        return spelers;
    }
}
