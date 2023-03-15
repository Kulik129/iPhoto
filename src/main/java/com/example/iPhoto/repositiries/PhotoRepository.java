package com.example.iPhoto.repositiries;

import com.example.iPhoto.models.Photos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhotoRepository extends JpaRepository<Photos, Long> {
    List<Photos> findByTitle(String title);
}
