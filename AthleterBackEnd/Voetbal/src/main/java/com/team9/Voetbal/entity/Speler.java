package com.team9.Voetbal.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

import java.util.Date;
@Data
@Document(collection = "Speler")
public class Speler {
    @Id
    private String spelerID;
    private String teamID;
    private String positieID;
    private String Naam;
    private Date GeboorteDatum;
}
