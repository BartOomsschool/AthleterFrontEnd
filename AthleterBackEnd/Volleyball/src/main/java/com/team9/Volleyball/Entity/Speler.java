package com.team9.Volleyball.Entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection ="Speler")
public class Speler {
    @Id
    private int id;
    private String naam;
    private int lengteInCm;
    private int selecties;
    private Date geboortedatum;
    private String geslacht;
    private int positieId;
    private int TeamId;
}
