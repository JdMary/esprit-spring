package com.example.springcrashcourses.controllers;

import com.example.springcrashcourses.services.CommandeService;
import com.example.springcrashcourses.services.ICommandeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class CommandeController {
    ICommandeService commandeService;

}
