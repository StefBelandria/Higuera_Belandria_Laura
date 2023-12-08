package com.codigo.Higuera_Belandria_Laura.service.Impl;

import com.codigo.Higuera_Belandria_Laura.dao.AutorDao;
import com.codigo.Higuera_Belandria_Laura.entity.AutorEntity;
import com.codigo.Higuera_Belandria_Laura.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


public class AutorServiceImpl implements AutorService {




    @Autowired
    private AutorDao autorDao;


    @Override
    public List<AutorEntity> obtenerTodos() {

        return autorDao.findAll();
    }

    @Override
    public AutorEntity obtenerAutorporId(Long id) throws Exception {
        Optional <AutorEntity> autor = autorDao.findById(id);
        if (autor.isPresent()){
            return autor.get();
        }else {
            throw new Exception("No existe el autor");
        }

    }

    @Override
    public AutorEntity crearAutor(AutorEntity autor) {
        return autorDao.save(autor);
    }

    @Override
    public AutorEntity actualizarAutor(Long id, AutorEntity autorActualizado) {
        return null;
    }


    @Override
    public boolean eliminarAutor(Long id) {
       return false;


    }
}
