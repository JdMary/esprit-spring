package com.example.springcrashcourses.services;

import com.example.springcrashcourses.entities.ChaineRestauration;
import com.example.springcrashcourses.entities.ChefCuisinier;

import java.util.List;

public interface IChefCuisinier {
    List<ChefCuisinier> retrieveAllChefCuisinier();
    ChefCuisinier addChefCuisinier(ChefCuisinier c);
    ChefCuisinier updateChefCuisinier(ChefCuisinier c);
    ChefCuisinier retrieveChefCuisinier(Long idChaine);
    void removeChefCuisinier(Long idChaine);
    List<ChefCuisinier> addChefCuisinier(List<ChefCuisinier> chefCuisiniers);
}
