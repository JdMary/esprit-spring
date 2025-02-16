package com.example.springcrashcourses.services;

import com.example.springcrashcourses.entities.ChefCuisinier;
import com.example.springcrashcourses.entities.Commande;
import com.example.springcrashcourses.repositories.CommandeRepository;

import java.util.List;

public class CommandeService implements ICommandeService{

    CommandeRepository commandeRepository;
    @Override
    public List<Commande> retrieveAllCommande() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande addCommande(Commande c) {
        return commandeRepository.save(c);
    }

    @Override
    public Commande updateCommande(Commande c) {

        return commandeRepository.save(c);
    }

    @Override
    public Commande retrieveCommande(Long idChaine) {

        return commandeRepository.findById(idChaine).get();
    }

    @Override
    public void removeCommande(Long idChaine) {
            commandeRepository.deleteById(idChaine);
    }

    @Override
    public List<Commande> addCommande(List<Commande> commandes) {
        return commandeRepository.saveAll(commandes);
    }
}
