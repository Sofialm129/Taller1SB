package com.example.taller1sb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Product {

    private Integer id;
    private String title;
    private float price;
    private String description;
    private String category;
    private String image;

}
