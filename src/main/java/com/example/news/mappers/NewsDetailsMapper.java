package com.example.news.mappers;

import com.example.news.models.dto.NewsDetailsDto;
import com.example.news.models.entity.NewsDetails;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NewsDetailsMapper {
    NewsDetailsMapper INSTANCE = Mappers.getMapper(NewsDetailsMapper.class);

    NewsDetails toNewsDetails(NewsDetailsDto newsDetailsDto);

    NewsDetailsDto toNewsDetailsDto(NewsDetails newsDetails);
}
