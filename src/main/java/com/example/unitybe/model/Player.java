package com.example.unitybe.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Player {
    @Id
    private String id;
    @Indexed(unique = true)
    private String ign;
    private int experience;
    private String password;
    private Position position;
}
