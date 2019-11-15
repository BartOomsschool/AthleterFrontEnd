package com.team9.edge.service.controllers.Voetbal;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team9.edge.service.models.GenericResponseWrapper;
import com.team9.edge.service.models.Voetbal.Speler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@RestController
@RequestMapping("/spelers")
public class SpelerController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("{teamID}")
    public List<Speler> getSpelersByTeamID(@PathVariable("teamID") Integer teamID){
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
}
