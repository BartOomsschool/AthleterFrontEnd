package com.team9.hockey.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "Atleet")
public class Atleet {
    @Id
    private String ID;
    private String Naam;
    private Date Geboortedatum;
    private Integer PloegID;
    private Integer PositieID;
}
