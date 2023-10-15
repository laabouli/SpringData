package com.mdli.gestioncommercial2.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "commentaire")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commentaire_id;
    private String contenu;
}
