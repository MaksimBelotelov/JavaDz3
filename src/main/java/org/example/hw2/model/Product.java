package org.example.hw2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String name;
    private String country;
    private double weight;
    private double price;
    private String grade;
}
