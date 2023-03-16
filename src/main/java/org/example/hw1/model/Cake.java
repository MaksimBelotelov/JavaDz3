package org.example.hw1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cake {
    private String name;
    private Double price;
    private String grade;
}
