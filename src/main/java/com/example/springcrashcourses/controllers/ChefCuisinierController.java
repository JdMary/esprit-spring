package com.example.springcrashcourses.controllers;

import com.example.springcrashcourses.services.ChefCuisinierService;
import com.example.springcrashcourses.services.IChefCuisinier;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class ChefCuisinierController {
    IChefCuisinier chefCuisinierService;
}
