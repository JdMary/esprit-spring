package com.example.springcrashcourses.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Entity
@Table(name = "Menu")
@Getter
@Setter
public class Menu implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @Id
    private Long idMenu;
    private String libelleMenu;
    private TypeMenu typeMenu;
    private Float prixTotal;
}
