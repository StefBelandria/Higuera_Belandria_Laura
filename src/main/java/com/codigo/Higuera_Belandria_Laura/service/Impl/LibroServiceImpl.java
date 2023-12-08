package com.codigo.Higuera_Belandria_Laura.service.Impl;

import com.codigo.Higuera_Belandria_Laura.dao.LibroDao;
import com.codigo.Higuera_Belandria_Laura.entity.LibroEntity;
import com.codigo.Higuera_Belandria_Laura.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroServiceImpl  implements LibroService {
    @Autowired
    private LibroDao libroDao;


    @Override
    public List<LibroEntity> obtenerTodos() {

        return libroDao.findAll();
    }

    @Override
    public LibroEntity obtenerLibroByid(Long id) throws Exception {
        Optional<LibroEntity> libro = libroDao.findById(id);
        if(libro.isPresent()){
            return libro.get();
        }else{
            throw new Exception("No existe el Libro");
        }
    }



    @Override
    public LibroEntity crearLibro(LibroEntity libro) {
        return null;
    }

    @Override
    public LibroEntity actualizarLibro(Long id, LibroEntity libroEntity) {
        return null;
    }
}
