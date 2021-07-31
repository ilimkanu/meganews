package com.example.news.dao;

import com.example.news.models.entity.Images;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagesRepo extends JpaRepository<Images, Long> {
}
