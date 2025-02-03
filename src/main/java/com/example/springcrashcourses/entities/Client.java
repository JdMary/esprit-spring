package com.example.springcrashcourses.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Date;
@Entity
@Table
@Getter
@Setter
public class Client implements Serializable {
    @Id
    //auto une table hibernate sequence se generre propreement
    //table créer une séquence differente
    //sequence :
    //identity : dire au sgbd dutiliser sa facon de id incrementation
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idClient")
    private Long idClient; // Clé primaire
    private String identifiant;
    @Temporal(TemporalType.DATE)
    private Date datePremiereVisite;
// Constructeur et accesseurs (getters) et mutateurs (setters)
    @Transient
    Integer difference;
    @OneToMany(mappedBy = "clientMapped")
    private List<Commande> listCommandes;
}