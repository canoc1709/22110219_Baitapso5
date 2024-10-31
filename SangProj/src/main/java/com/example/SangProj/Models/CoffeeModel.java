package com.example.SangProj.Models;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoffeeModel {
    private int CoffeeId;
    private boolean active;
    private String description;
    private String poster;
    private String title;
    private int views;
    private MultipartFile imageFile;
    private int categoryId;
    private Boolean isEdit = false;
}