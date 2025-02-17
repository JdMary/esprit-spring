package com.example.springcrashcourses.repositories;

import com.example.springcrashcourses.entities.Menu;
import com.example.springcrashcourses.entities.TypeMenu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu,Long> {
    List<Menu> findAllByTypeMenuAndPrixTotalGreaterThan(TypeMenu typeMenu ,Float montant);
}
