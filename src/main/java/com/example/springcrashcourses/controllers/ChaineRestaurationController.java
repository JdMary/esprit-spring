package com.example.springcrashcourses.controllers;

import com.example.springcrashcourses.services.ChaineRestaurationService;
import com.example.springcrashcourses.services.IChaineRestaurationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ChaineRestaurationController {
    IChaineRestaurationService chaineRestaurationService;
}
