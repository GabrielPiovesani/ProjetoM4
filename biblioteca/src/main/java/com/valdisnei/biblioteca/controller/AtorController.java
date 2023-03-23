package com.valdisnei.biblioteca.controller;

import com.valdisnei.biblioteca.model.Ator;
import com.valdisnei.biblioteca.repository.AtorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/ator")
public class AtorController {

    @Autowired
    private AtorRepository atorRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Ator> getAtorById(@PathVariable Long id) {
        Optional<Ator> ator = atorRepository.findById(id);

        if (ator.isPresent()) {
            return ResponseEntity.ok(ator.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Ator> createAtor(@RequestBody Ator ator) {
        Ator newAtor = atorRepository.save(ator);
        return ResponseEntity.status(HttpStatus.CREATED).body(newAtor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ator> updateAtor(@PathVariable Long id, @RequestBody Ator ator) {
        Optional<Ator> existingAtor = atorRepository.findById(id);

        if (existingAtor.isPresent()) {
            Ator updatedAtor = existingAtor.get();
            updatedAtor.setNome(ator.getNome());
            updatedAtor.setDataNascimento(ator.getDataNascimento());
            updatedAtor.setPremiacoes(ator.getPremiacoes());
            updatedAtor.setGenero(ator.getGenero());
            updatedAtor.setFormacao(ator.getFormacao());
            atorRepository.save(updatedAtor);
            return ResponseEntity.ok(updatedAtor);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAtor(@PathVariable Long id) {
        Optional<Ator> ator = atorRepository.findById(id);

        if (ator.isPresent()) {
            atorRepository.delete(ator.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}