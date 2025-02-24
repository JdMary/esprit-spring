package com.example.springcrashcourses.repositories;

import com.example.springcrashcourses.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface CommandeRepository extends JpaRepository<Commande,Long> {

    List<Commande> findByClientMappedIdClient(Long idclient);
    List<Commande> findByClientMappedIdClientAndDateCommandeBetween(Long idclient, LocalDate date1,LocalDate date2);

}
