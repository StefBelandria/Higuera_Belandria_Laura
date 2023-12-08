package com.codigo.Higuera_Belandria_Laura.service;

import com.codigo.Higuera_Belandria_Laura.entity.AutorEntity;
import com.codigo.Higuera_Belandria_Laura.entity.LibroEntity;

import java.util.List;

public interface LibroService {

    List<LibroEntity> ObtenerTodos();
    AutorEntity obtenerLibroByid (Long id) throws Exception;
    LibroEntity crearLibro (LibroEntity libro);
    LibroEntity actualizarLibro (Long id, LibroEntity libroEntity);

}
