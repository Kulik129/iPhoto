package com.example.iPhoto.controllers;

import com.example.iPhoto.models.Photos;
import com.example.iPhoto.servies.PhotoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class PhotoController {
    private final PhotoService photoService;
    
    @GetMapping("/")
    public String photos(@RequestParam(name = "title", required = false)String title, Model model){
        model.addAttribute("photos",photoService.photosList(title));
        return "photos";
    }

    @GetMapping("/photos/{id}")
    public String photoInfo(@PathVariable Long id, Model model){
        model.addAttribute("photos", photoService.getPhotoById(id));
        return "photo-info";
    }

    @PostMapping("/photos/create")
    public String createProduct(Photos photos){
        photoService.savePhoto(photos);
        return "redirect:/";
    }

    @PostMapping("/photos/delete/{id}")
    public String deletePhoto(@PathVariable Long id ){
        photoService.delete(id);
        return "redirect:/";
    }
}
