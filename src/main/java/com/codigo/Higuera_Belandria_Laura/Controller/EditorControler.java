package com.codigo.Higuera_Belandria_Laura.Controller;

import com.codigo.Higuera_Belandria_Laura.entity.AutorEntity;
import com.codigo.Higuera_Belandria_Laura.entity.EditorEntity;
import com.codigo.Higuera_Belandria_Laura.service.EditorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/editor")

public class EditorControler {

    private EditorService editorService;

    public void EditorControlle(EditorService editorService) {
        this.editorService = editorService;
    }

    @GetMapping
    public List<EditorEntity> listarEditores() {
        List<EditorEntity> editores = editorService.obtenerTodos();
        return editores;
    }

    @GetMapping("/api/v1/editor/{id}")
    public ResponseEntity<EditorEntity> obtenerEditorPorId(@PathVariable Long id) throws Exception {
        EditorEntity editor = editorService.obtenerEditorporId(id);
        return ResponseEntity.ok(editor);
    }

    @PostMapping
    public ResponseEntity<EditorEntity> crearEditor(@RequestBody EditorEntity editor) {
        EditorEntity nuevoEditor = editorService.crearEditor(editor);
        return new ResponseEntity<>(nuevoEditor, HttpStatus.CREATED);
    }

    @DeleteMapping ("api/v1/editor/{id}")
    public ResponseEntity <AutorEntity> eliminarEditor(@PathVariable Long id) throws  Exception{
        boolean autor = editorService.eliminarEditor(id);
        return null;

    }


}
