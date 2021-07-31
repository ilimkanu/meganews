package com.example.news.models.dto;

import lombok.Data;

@Data
public class FiltersDto {
    private Long id;

    private String name;

    private String lang;

    private boolean active;
}
