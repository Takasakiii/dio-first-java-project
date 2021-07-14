package dev.takasaki.becas.fistProject.service;

import dev.takasaki.becas.fistProject.model.JornadaTrabalho;
import dev.takasaki.becas.fistProject.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class JornadaTrabalhoService {
    private final JornadaTrabalhoRepository jornadaTrabalhoRepository;

    @Autowired
    public JornadaTrabalhoService(JornadaTrabalhoRepository jornadaTrabalhoRepository) {
        this.jornadaTrabalhoRepository = jornadaTrabalhoRepository;
    }

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> list() {
        return jornadaTrabalhoRepository.findAll();
    }

    public JornadaTrabalho get(Long id) throws NoSuchElementException {
        return jornadaTrabalhoRepository
                .findById(id)
                .orElseThrow(() -> new NoSuchElementException("Jornada não encontrada"));
    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public void delete(Long id) {
        jornadaTrabalhoRepository.deleteById(id);
    }
}
