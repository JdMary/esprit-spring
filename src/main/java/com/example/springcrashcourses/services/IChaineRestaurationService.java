package com.example.springcrashcourses.services;

import com.example.springcrashcourses.entities.ChaineRestauration;
import com.example.springcrashcourses.entities.Client;

import java.util.List;

public interface IChaineRestaurationService {

    List<ChaineRestauration> retrieveAllChaineResataution();
    ChaineRestauration addChaineResataution(ChaineRestauration c);
    ChaineRestauration updateChaineResataution(ChaineRestauration c);
    ChaineRestauration retrieveChaineResataution(Long idChaine);
    void removeChaineResataution(Long idChaine);
    List<ChaineRestauration> addChaineResataution (List<ChaineRestauration> chaineRestaurations);
}
