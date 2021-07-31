package com.example.news.mappers.impl;

import com.example.news.mappers.ImagesMapper;
import com.example.news.models.dto.ImagesDto;
import com.example.news.models.entity.Images;

public class ImagesMapperImpl implements ImagesMapper {
    @Override
    public Images toImages(ImagesDto imagesDto) {
        Images images = new Images();
        images.setId(imagesDto.getId());
        images.setUrl(imagesDto.getUrl());
        images.setId_news_details(imagesDto.getId_news_details());
        images.setOrder_num(imagesDto.getOrder_num());
        images.setActive(imagesDto.isActive());
        return images;
    }

    @Override
    public ImagesDto toImagesDto(Images images) {
        return null;
    }
}
