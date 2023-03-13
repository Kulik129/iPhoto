package com.example.iPhoto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PhotoController {
    @GetMapping("/")
    public String photos(){
        return "photos";
    }
}
