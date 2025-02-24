package com.example.springcrashcourses.controllers;

import com.example.springcrashcourses.services.ClientService;
import com.example.springcrashcourses.services.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class ClientController {
    IClientService clientService;
}
