package com.codigo.Higuera_Belandria_Laura.entity;

import java.io.Serializable;

public class LibroCatEntityId  implements Serializable {
    private Long libro;
    private Long categoria;


    public Long getLibro() {
        return libro;
    }

    public void setLibro(Long libro) {
        this.libro = libro;
    }

    public Long getCategoria() {
        return categoria;
    }

    public void setCategoria(Long categoria) {
        this.categoria = categoria;
    }
}
