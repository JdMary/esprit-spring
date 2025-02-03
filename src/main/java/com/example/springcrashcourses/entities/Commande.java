package com.example.springcrashcourses.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table
@Getter
@Setter

public class Commande implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idCommande;
    @Temporal(TemporalType.DATE)
    private LocalDate dateCommande;
    private Integer porcentageRemise;
    private Float totalRemise;
    private Float totalCommnde;
    private Long note;
    @ManyToOne()
    private Client clientMapped;
    @ManyToOne()
    private Menu menuMapped;

}
