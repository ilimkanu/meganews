package com.example.news.mappers.impl;

import com.example.news.mappers.NewsDetailsMapper;
import com.example.news.models.dto.NewsDetailsDto;
import com.example.news.models.entity.NewsDetails;

public class NewsDetailsMapperImpl implements NewsDetailsMapper {
    @Override
    public NewsDetails toNewsDetails(NewsDetailsDto newsDetailsDto) {
        NewsDetails newsDetails = new NewsDetails();
        newsDetails.setId(newsDetailsDto.getId());
        newsDetails.setTitle(newsDetailsDto.getTitle());
        newsDetails.setHeader_title(newsDetailsDto.getHeader_title());
        newsDetails.setText(newsDetailsDto.getText());
        newsDetails.setId_filters(newsDetailsDto.getId_filters());
        newsDetails.setAdd_date(newsDetailsDto.getAdd_date());
        newsDetails.setEdit_date(newsDetailsDto.getEdit_date());
        newsDetails.setLang(newsDetailsDto.getLang());
        return newsDetails;
    }

    @Override
    public NewsDetailsDto toNewsDetailsDto(NewsDetails newsDetails) {
        return null;
    }
}
