package com.example.springcrashcourses.services;

import com.example.springcrashcourses.entities.Commande;
import com.example.springcrashcourses.entities.Composant;

import java.util.List;

public interface IComposantService {
    List<Composant> retrieveAllComposant();
    Composant addComposant(Composant c);
    Composant updateComposant(Composant c);
    Composant retrieveComposant(Long idChaine);
    void removeComposant(Long idChaine);
    List<Composant> addComposant(List<Composant> composants);
}
