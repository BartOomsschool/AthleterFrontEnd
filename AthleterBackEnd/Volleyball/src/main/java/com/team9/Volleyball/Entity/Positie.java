package com.team9.Volleyball.Entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection ="positie")
public class Positie {
    @Id
    private int id;
    private String naam;
}
