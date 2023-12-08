package com.codigo.Higuera_Belandria_Laura.Controller;


import com.codigo.Higuera_Belandria_Laura.entity.AutorEntity;
import com.codigo.Higuera_Belandria_Laura.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("api/v1/autor")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping
    public List<AutorEntity> listarAutores() {
        List<AutorEntity> autores = autorService.obtenerTodos();
        return autores;
    }

    @GetMapping("api/v1/autor/{id}")
    public ResponseEntity<AutorEntity> obternerAutorPorId(@PathVariable Long id) throws Exception {
        AutorEntity autor = autorService.obtenerAutorporId(id);
        return ResponseEntity.ok(autor);

    }

    @PostMapping ("api/v1/Autor/crearAutor")
    public ResponseEntity<AutorEntity> crearAutor(@RequestBody AutorEntity autor) {
        AutorEntity nuevoAutor = autorService.crearAutor(autor);
        return new ResponseEntity<>(nuevoAutor, HttpStatus.CREATED);


    }
    @DeleteMapping ("api/v1/Autor/{id}")
    public ResponseEntity <AutorEntity> eliminarAutor(@PathVariable Long id) throws  Exception{
        boolean autor = autorService.eliminarAutor(id);
        return null;

    }


}
