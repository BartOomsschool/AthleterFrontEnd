package com.team9.Volleyball.Entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection ="VolleyballSpeler")
public class VolleyballSpeler {
    @Id
    private String id;
    private String naam;
    private String lengteInCm;
    private String selecties;
    private String geboortedatum;
    private String geslacht;
    private String positieId;
    private String teamId;
}
