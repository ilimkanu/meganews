package com.example.news.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "news_details")
public class NewsDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String header_title;

    private String text;

    @OneToMany
    private List<Filters> id_filters;

    private String add_date;

    private String edit_date;

    private String lang;
}
