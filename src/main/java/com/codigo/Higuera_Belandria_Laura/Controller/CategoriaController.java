package com.codigo.Higuera_Belandria_Laura.Controller;

import com.codigo.Higuera_Belandria_Laura.entity.AutorEntity;
import com.codigo.Higuera_Belandria_Laura.entity.CategoriaEntity;
import com.codigo.Higuera_Belandria_Laura.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping ("api/v1/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<CategoriaEntity> listarCategorias() {
        List<CategoriaEntity> categorias = categoriaService.obtenerTodos();
        return categorias;
    }

    @GetMapping("/api/v1/categoria/obtenerCategoria/{id}")
    public ResponseEntity<CategoriaEntity> obtenerCategoriaPorId(@PathVariable Long id) throws Exception {
        CategoriaEntity categoria = categoriaService.obtenerCategoriaPorId(id);
        return ResponseEntity.ok(categoria);
    }

    @PostMapping
    public ResponseEntity<CategoriaEntity> crearCategoria(@RequestBody CategoriaEntity categoria) {
        CategoriaEntity nuevaCategoria = categoriaService.crearCategoria(categoria);
        return new ResponseEntity<>(nuevaCategoria, HttpStatus.BAD_REQUEST);
    }


}

