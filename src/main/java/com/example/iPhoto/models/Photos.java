package com.example.iPhoto.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Photos {
    private Long id;
    private String title;
    private String description;
    private int price;
    private String city;
    private String author;
}