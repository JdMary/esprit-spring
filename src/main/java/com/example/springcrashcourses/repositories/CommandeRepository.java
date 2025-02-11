package com.example.springcrashcourses.repositories;

import com.example.springcrashcourses.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande,Long> {
}
