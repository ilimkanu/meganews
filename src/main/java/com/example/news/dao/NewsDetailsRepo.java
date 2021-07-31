package com.example.news.dao;

import com.example.news.models.entity.NewsDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsDetailsRepo extends JpaRepository<NewsDetails, Long> {
}
