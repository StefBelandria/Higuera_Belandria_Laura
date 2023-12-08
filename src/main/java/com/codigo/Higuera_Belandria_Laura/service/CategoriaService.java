package com.codigo.Higuera_Belandria_Laura.service;

import com.codigo.Higuera_Belandria_Laura.entity.CategoriaEntity;

import java.util.List;

public interface CategoriaService {
    List<CategoriaEntity> obtenerTodos();
    CategoriaEntity obtenerCategoriaPorId(Long id) throws Exception;
    CategoriaEntity crearCategoria(CategoriaEntity  categoria);

    CategoriaEntity actualizarCategoria (Long id, CategoriaEntity categoriaEntity) ;

    boolean eliminarCategoria (Long id);
}
