package com.team9.hockey.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Ploeg")
public class Ploeg {
    @Id
    private String teamID;
    private String naam;


}
