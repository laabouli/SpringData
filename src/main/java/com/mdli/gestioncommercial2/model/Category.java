package com.mdli.gestioncommercial2.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "categorie")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categorie_id")
    private int category_id;
    private String nom;
}
