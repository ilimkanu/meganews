package com.example.news.models.dto;

import com.example.news.models.entity.Filters;
import lombok.Data;

import javax.persistence.OneToMany;
import java.util.List;

@Data
public class NewsDetailsDto {
    private Long id;

    private String title;

    private String header_title;

    private String text;

    private List<Filters> id_filters;

    private String add_date;

    private String edit_date;

    private String lang;
}
