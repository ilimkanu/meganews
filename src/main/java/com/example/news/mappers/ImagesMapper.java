package com.example.news.mappers;

import com.example.news.models.dto.ImagesDto;
import com.example.news.models.entity.Images;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ImagesMapper {
    ImagesMapper INSTANCE = Mappers.getMapper(ImagesMapper.class);

    Images toImages(ImagesDto imagesDto);

    ImagesDto toImagesDto(Images images);
}
