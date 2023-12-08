package com.codigo.Higuera_Belandria_Laura.service;

import com.codigo.Higuera_Belandria_Laura.entity.EditorEntity;

import java.util.List;

public interface EditorService {

    List<EditorEntity> obtenerTodos();
    EditorEntity obtenerEditorporId(Long id) throws Exception;
    EditorEntity crearEditor (EditorEntity  editor);
    EditorEntity actualizarEditor (Long id, EditorEntity editorEntity);
    boolean eliminarEditor (Long id);
}
