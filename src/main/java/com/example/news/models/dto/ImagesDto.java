package com.example.news.models.dto;

import com.example.news.models.entity.NewsDetails;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class ImagesDto {
    private Long id;

    private String url;

    private NewsDetails id_news_details;

    private int order_num;

    private boolean active;
}
