package com.example.iPhoto.servies;

import com.example.iPhoto.models.Photos;
import com.example.iPhoto.repositiries.PhotoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PhotoService {

    private final PhotoRepository photoRepository;
    public List<Photos> photosList(String title) {
        if(title != null) return photoRepository.findByTitle(title);
        return photoRepository.findAll();
    }

    public void savePhoto(Photos photos) {
        log.info("Save new {}", photos);
        photoRepository.save(photos);
    }

    public void delete(Long id){
        photoRepository.deleteById(id);
    }

    public Photos getPhotoById(Long id) {
        return photoRepository.findById(id).orElse(null);
    }
}
