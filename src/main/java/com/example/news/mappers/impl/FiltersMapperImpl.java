package com.example.news.mappers.impl;

import com.example.news.mappers.FiltersMapper;
import com.example.news.models.dto.FiltersDto;
import com.example.news.models.entity.Filters;

public class FiltersMapperImpl implements FiltersMapper {
    @Override
    public Filters toFilters(FiltersDto filtersDto) {
        Filters filters = new Filters();
        filters.setName(filtersDto.getName());
        filters.setId(filtersDto.getId());
        filters.setLang(filtersDto.getLang());
        filters.setActive(filtersDto.isActive());
        return filters;
    }

    @Override
    public FiltersDto toFiltersDto(Filters filters) {
        return null;
    }
}
