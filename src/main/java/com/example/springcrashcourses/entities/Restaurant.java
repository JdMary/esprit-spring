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
public class Restaurant implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestauant;
    private String nom;
    private Long nbPlacesMax;
    @OneToMany
    private List<Menu> menus;
    @ManyToOne
    private ChaineRestauration chaineRestaurationsMapped;
}
