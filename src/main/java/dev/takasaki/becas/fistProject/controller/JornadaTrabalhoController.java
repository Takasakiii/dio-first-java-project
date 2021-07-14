package dev.takasaki.becas.fistProject.controller;

import dev.takasaki.becas.fistProject.model.JornadaTrabalho;
import dev.takasaki.becas.fistProject.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {
    private final JornadaTrabalhoService service;

    @Autowired
    public JornadaTrabalhoController(JornadaTrabalhoService service) {
        this.service = service;
    }

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return service.save(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ResponseEntity<JornadaTrabalho> get(@PathVariable("id") Long id)  {
        try {
            return ResponseEntity.ok(service.get(id));
        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping
    public JornadaTrabalho update(@RequestBody JornadaTrabalho jornada) {
        return service.update(jornada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        service.delete(id);
        return ResponseEntity.ok("Removido com sucesso");
    }
}
