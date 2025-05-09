package br.com.fiap.controller;

import br.com.fiap.entity.Brinquedo;
import br.com.fiap.repository.BrinquedoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoRepository repository;

    @PostMapping
    public Brinquedo adicionarBrinquedo(@RequestBody Brinquedo brinquedo) {
        return repository.save(brinquedo);
    }

    @GetMapping
    public List<Brinquedo> listarBrinquedos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Brinquedo buscarPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }
}
