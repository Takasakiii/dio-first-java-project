package dev.takasaki.becas.fistProject.controller;

import dev.takasaki.becas.fistProject.model.JornadaTrabalho;
import dev.takasaki.becas.fistProject.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
