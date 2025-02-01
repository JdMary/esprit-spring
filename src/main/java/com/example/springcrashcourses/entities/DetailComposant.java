package com.example.springcrashcourses.entities;

import lombok.Data;

import java.io.Serializable;
@Data
public class DetailComposant extends Composant implements Serializable  {
    private Long imc;
    private TypeComposant typeComposant;

}
