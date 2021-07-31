package com.example.news.mappers;

import com.example.news.models.dto.FiltersDto;
import com.example.news.models.entity.Filters;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FiltersMapper {
    FiltersMapper INSTANCE = Mappers.getMapper(FiltersMapper.class);

    Filters toFilters(FiltersDto filtersDto);

    FiltersDto toFiltersDto(Filters filters);
}
