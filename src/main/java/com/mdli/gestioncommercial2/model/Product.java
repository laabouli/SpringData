package com.mdli.gestioncommercial2.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "produit")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int produit_id;
    private String nom;
    private String description;
    private int cout;
}
