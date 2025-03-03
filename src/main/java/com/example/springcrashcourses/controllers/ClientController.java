package com.example.springcrashcourses.controllers;

import com.example.springcrashcourses.entities.Client;
import com.example.springcrashcourses.services.ClientService;
import com.example.springcrashcourses.services.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientController {
    IClientService clientService;
    @GetMapping("/retrieve-all-clients")
    public List<Client> getClients() {
        return clientService.retrieveAllClients();

    }
    @PostMapping("/add-client")
    public void addClient(Client c){
        clientService.addClient(c);
    }


}
