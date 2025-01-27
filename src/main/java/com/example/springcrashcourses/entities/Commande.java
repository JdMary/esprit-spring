package com.example.springcrashcourses.entities;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table( name="commande")
public class Commande implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    Long idCommande;
}
