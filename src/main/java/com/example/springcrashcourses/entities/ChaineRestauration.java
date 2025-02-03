package com.example.springcrashcourses.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table
@Setter
@Getter
public class ChaineRestauration implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChaineRestauration;
    private String libelle;
    @Temporal(TemporalType.DATE)
    private LocalDate dateCreation;
    @OneToMany(mappedBy = "chaineRestaurationsMapped")
    private List<Restaurant> restaurantList;

}
