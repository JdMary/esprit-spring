package com.example.springcrashcourses.repositories;

import com.example.springcrashcourses.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
}
