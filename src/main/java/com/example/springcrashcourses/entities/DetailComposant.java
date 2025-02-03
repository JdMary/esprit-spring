package com.example.springcrashcourses.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Data
@Entity
@Table
public class DetailComposant implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailComposant;
    private Long imc;
    @Enumerated(EnumType.STRING)
    private TypeComposant typeComposant;

}
