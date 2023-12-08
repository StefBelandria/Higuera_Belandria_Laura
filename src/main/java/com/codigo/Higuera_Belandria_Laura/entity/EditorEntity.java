package com.codigo.Higuera_Belandria_Laura.entity;

import jakarta.persistence.*;

@Entity

@Table(name = "Editor")
public class EditorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombre;
    private Integer estado;
}
