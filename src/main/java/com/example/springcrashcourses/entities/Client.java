package com.example.springcrashcourses.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.List;
import java.util.Date;
@Entity
@Table
@Getter
@Setter
//contructor for the fields that are annotated with @notnull
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode

@Slf4j
public class Client implements Serializable {
    //auto une table hibernate sequence se generre propreement
    //table créer une séquence differente
    //sequence :
    //identity : dire au sgbd dutiliser sa facon de id incrementation
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idClient")
    @NonNull
    Long idClient; // Clé primaire

    String identifiant;

    @Temporal(TemporalType.DATE)
     Date datePremiereVisite;

    //not added in DB
    @Transient
    Integer difference;

    @OneToMany(mappedBy = "clientMapped")
    List<Commande> listCommandes;


}