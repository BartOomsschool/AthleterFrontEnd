package com.team9.Voetbal.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

import java.util.Date;

@Data
@Document(collection = "Speler")
public class Speler {
    @Id
    private String SpelerID;
    private Integer TeamID;
    private Integer PositieID;
    private String Naam;
    private Date GorteDatum;


}
