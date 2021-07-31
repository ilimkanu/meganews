package com.example.news.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="images")
public class Images {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String url;

    @ManyToOne
    @JoinColumn(name = "id_news_details")
    private NewsDetails id_news_details;

    private int order_num;

    private boolean active;
}
