package com.team9.edge.service.controllers.Vollyebal;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team9.edge.service.models.GenericResponseWrapper;
import com.team9.edge.service.models.Volleybal.VolleyballSpeler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.List;
@RestController
@RequestMapping("/volleyballSpelers")
public class VolleyballSpelerController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/getVolleyballSpelers")
    public List<VolleyballSpeler> getVolleyballSpelers(){
        GenericResponseWrapper wrapper = restTemplate.getForObject("http://volleybal-service/volleyballSpelers/", GenericResponseWrapper.class);

        List<VolleyballSpeler> spelers  = objectMapper.convertValue(wrapper.get_embedded().get("volleyballSpelers"), new TypeReference<List<VolleyballSpeler>>() { });

        return spelers;
    }
}
