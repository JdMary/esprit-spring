package com.example.springcrashcourses.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Table
@Getter
@Setter
//serializable :dans le cas dentreprise les lobejets les objets vont tre stockes dns un seveur donc passer par réseau donc besoin
//alors il stocke les objs en des BYtes
//2.6 spring est integre

//but dune association one to one pour optimiser les requetes lorsquon a des attributs moins imporant que dautres
public class Menu implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @Id
    private Long idMenu;
    private String libelleMenu;
    //ordinal= dejeuner dans bd on la trouve l'index du champs dans lenum afin de protéger les champs
    //par defaut ordinal il faut chnager
    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;
    private Float prixTotal;
    //esm el champs declare fel parent
    @OneToMany(mappedBy = "menuMapped")
    private List<Commande> commandeList;
    @ManyToMany
    private List<ChefCuisinier> chefMapped;
    @OneToMany(mappedBy = "menuMapped")
    private List<Composant> composantList;
}
