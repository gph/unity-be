package com.example.unitybe.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Position {
    private int x;
    private int y;
    private int z;
}
