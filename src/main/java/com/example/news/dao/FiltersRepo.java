package com.example.news.dao;

import com.example.news.models.entity.Filters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiltersRepo extends JpaRepository<Filters, Long> {
}
