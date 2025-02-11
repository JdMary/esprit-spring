package com.example.springcrashcourses.repositories;

import com.example.springcrashcourses.entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu,Long> {
}
