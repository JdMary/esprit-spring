package com.example.springcrashcourses.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;
@Data
public class ChefCuisinier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idChefCuisinier;
    private String nom;
    private String prenom;
    private TypeChef typeChef;
}
