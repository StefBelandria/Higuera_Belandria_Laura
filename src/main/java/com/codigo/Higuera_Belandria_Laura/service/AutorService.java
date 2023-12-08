package com.codigo.Higuera_Belandria_Laura.service;


import com.codigo.Higuera_Belandria_Laura.entity.AutorEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AutorService {

    List<AutorEntity> obtenerTodos();
    AutorEntity obtenerAutorporId(Long id) throws Exception;
    AutorEntity crearAutor (AutorEntity  autor);
    AutorEntity actualizarAutor (Long id, AutorEntity autorActualizado);

    boolean eliminarAutor (Long id);
}
