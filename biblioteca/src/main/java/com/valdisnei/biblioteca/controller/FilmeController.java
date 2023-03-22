package com.valdisnei.biblioteca.controller;

import com.valdisnei.biblioteca.model.Filme;
import com.valdisnei.biblioteca.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/filme")
public class FilmeController {

    @Autowired
    private FilmeRepository filmeRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Filme> getFilmeById(@PathVariable Long id) {
        Optional<Filme> filme = filmeRepository.findById(id);

        if (filme.isPresent()) {
            return ResponseEntity.ok(filme.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Filme> createFilme(@RequestBody Filme filme) {
        Filme newFilme = filmeRepository.save(filme);
        return ResponseEntity.status(HttpStatus.CREATED).body(newFilme);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Filme> updateFilme(@PathVariable Long id, @RequestBody Filme filme) {
        Optional<Filme> existingFilme = filmeRepository.findById(id);

        if (existingFilme.isPresent()) {
            Filme updatedFilme = existingFilme.get();
            updatedFilme.setDuracao(filme.getDuracao());
            updatedFilme.setTipo(filme.getTipo());
            updatedFilme.setElenco(filme.getElenco());
            updatedFilme.setDiretor(filme.getDiretor());
            updatedFilme.setProdutor(filme.getProdutor());
            filmeRepository.save(updatedFilme);
            return ResponseEntity.ok(updatedFilme);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFilme(@PathVariable Long id) {
        Optional<Filme> filme = filmeRepository.findById(id);

        if (filme.isPresent()) {
            filmeRepository.delete(filme.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}