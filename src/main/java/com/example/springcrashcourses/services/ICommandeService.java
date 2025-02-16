package com.example.springcrashcourses.services;

import com.example.springcrashcourses.entities.ChefCuisinier;
import com.example.springcrashcourses.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICommandeService{
    List<Commande> retrieveAllCommande();
    Commande addCommande(Commande c);
    Commande updateCommande(Commande c);
    Commande retrieveCommande(Long idChaine);
    void removeCommande(Long idChaine);
    List<Commande> addCommande(List<Commande> commandes);
}
