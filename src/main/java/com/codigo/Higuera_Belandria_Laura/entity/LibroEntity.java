package com.codigo.Higuera_Belandria_Laura.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "libro")

public class LibroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombre;
    private Integer estado;


    @OneToOne
    @JoinColumn(name = "editor_id")
    private EditorEntity editor;
    @ManyToOne
    @JoinColumn(name = "autor_id")
    private AutorEntity autor;

    @ManyToMany
    @JoinTable(
            name = "libro_categoria",
            joinColumns = @JoinColumn(name = "libro_id"),
            inverseJoinColumns = @JoinColumn (name = "categoria_id")
    )
    private Set<CategoriaEntity> categorias = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "libro_autor",
            joinColumns = @JoinColumn(name = "autor_id"),
            inverseJoinColumns = @JoinColumn (name = "libro_id")
    )
    private Set<CategoriaEntity> categoria = new HashSet<>();

}
