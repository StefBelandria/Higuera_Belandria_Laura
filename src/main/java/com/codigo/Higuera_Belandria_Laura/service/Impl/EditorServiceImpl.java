package com.codigo.Higuera_Belandria_Laura.service.Impl;

import com.codigo.Higuera_Belandria_Laura.dao.EditorDao;
import com.codigo.Higuera_Belandria_Laura.entity.EditorEntity;
import com.codigo.Higuera_Belandria_Laura.service.EditorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EditorServiceImpl implements EditorService {

    @Autowired
    private EditorDao editorDAO;


    @Override
    public List<EditorEntity> obtenerTodos() {
        return editorDAO.findAll();
    }

    @Override
    public EditorEntity obtenerEditorporId(Long id) throws Exception {
        Optional<EditorEntity> editor = editorDAO.findById(id);
        if (editor.isPresent()){
            return editor.get();
        }else {
            throw new Exception("Editor no existe");
        }

    }

    @Override
    public EditorEntity crearEditor(EditorEntity editor) {

        return editorDAO.save(editor);
    }

    @Override
    public EditorEntity actualizarEditor(Long id, EditorEntity editorEntity) {
        return null;
    }

    @Override
    public boolean eliminarEditor(Long id) {

        return false;
    }


}
