package com.example.springcrashcourses.repositories;

import com.example.springcrashcourses.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
   List<Restaurant> findAllByChaineRestaurationsMappedAndChaineRestaurationsMapped_Libelle(String libelle);
    List<Restaurant> findAllByNbPlacesMaxGreaterThanAAndChaineRestaurationsMapped_DateCreationBefore(Long capacity, LocalDate date);

}
