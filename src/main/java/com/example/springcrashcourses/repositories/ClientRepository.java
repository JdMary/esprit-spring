package com.example.springcrashcourses.repositories;

import com.example.springcrashcourses.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends JpaRepository <Client,Long> {

}
