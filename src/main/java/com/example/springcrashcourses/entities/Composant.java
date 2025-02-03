package com.example.springcrashcourses.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Data
@Entity
@Table
public class Composant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idComposant;
    private String nomComposant;
    private Float prix;
    @ManyToOne()
    private Menu menuMapped;
    @OneToOne()
    private DetailComposant detailComposant;
}
