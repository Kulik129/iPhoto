package com.example.iPhoto.servies;

import com.example.iPhoto.models.Photos;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhotoService {
    private List<Photos> photosList = new ArrayList<>();
    private long ID =0;
    {
        photosList.add(new Photos(++ID,"Girls","Very",2,"MSK","Author"));
        photosList.add(new Photos(++ID,"Ledy","Very Good",22,"SPB","Author"));
    }

    public List<Photos> photosList() {
        return photosList;
    }

    public void savePhoto(Photos photos) {
        photos.setId(++ID);
        photosList.add(photos);
    }

    public void delete(Long id){
        photosList.removeIf(photos -> photos.getId().equals(id));
    }

    public Photos getPhotoById(Long id) {
        for (Photos photos: photosList) {
            if (photos.getId().equals(id)) return photos;
        }
        return null;
    }
}
