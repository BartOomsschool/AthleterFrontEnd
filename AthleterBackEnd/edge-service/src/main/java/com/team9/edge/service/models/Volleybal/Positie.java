package com.team9.edge.service.models.Volleybal;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Positie {
    private String id;
    private String naam;
}
