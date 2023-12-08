package com.codigo.Higuera_Belandria_Laura.service.Impl;


import com.codigo.Higuera_Belandria_Laura.dao.CategoriaDao;
import com.codigo.Higuera_Belandria_Laura.entity.CategoriaEntity;
import com.codigo.Higuera_Belandria_Laura.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {


    @Autowired
    private CategoriaDao categoriaDao;


    @Override
    public List<CategoriaEntity> obtenerTodos() {
        return categoriaDao.findAll();
    }

    @Override
    public CategoriaEntity obtenerCategoriaPorId(Long id) throws Exception {
        Optional<CategoriaEntity> categoria = categoriaDao.findById(id);
        if (categoria.isPresent()) {
            return categoria.get();
        }else{
            throw new Exception("No existe la categoria ");

        }

    }

    @Override
    public CategoriaEntity crearCategoria(CategoriaEntity categoria) {
        return categoriaDao.save(categoria);
    }

    @Override
    public CategoriaEntity actualizarCategoria(Long id, CategoriaEntity categoriaEntity) {
        return null;
    }

    @Override
    public boolean eliminarCategoria(Long id) {
        return false;
    }


}
