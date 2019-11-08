package com.team9.Voetbal.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

import java.util.Date;

@Data
@Document(collection = "speler")
public class Speler {
    @Id
    private String id;
    private Integer teamID;
    private Integer positieID;
    private String naam;
    private Date geboorteDatum;


}
