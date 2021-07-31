package com.example.news.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="filters")
public class Filters {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String lang;

    private boolean active;
}
