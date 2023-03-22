package com.valdisnei.biblioteca.controller;

import com.valdisnei.biblioteca.model.AtorModel;
import com.valdisnei.biblioteca.repository.AtorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/ator")
public class AtorController {

    @Autowired
    private AtorRepository atorRepository;

    @GetMapping("/{id}")
    public ResponseEntity<AtorModel> getAtorById(@PathVariable Long id) {
        Optional<AtorModel> ator = atorRepository.findById(id);

        if (ator.isPresent()) {
            return ResponseEntity.ok(ator.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<AtorModel> createAtor(@RequestBody AtorModel ator) {
        AtorModel newAtor = atorRepository.save(ator);
        return ResponseEntity.status(HttpStatus.CREATED).body(newAtor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AtorModel> updateAtor(@PathVariable Long id, @RequestBody AtorModel ator) {
        Optional<AtorModel> existingAtor = atorRepository.findById(id);

        if (existingAtor.isPresent()) {
            AtorModel updatedAtor = existingAtor.get();
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
        Optional<AtorModel> ator = atorRepository.findById(id);

        if (ator.isPresent()) {
            atorRepository.delete(ator.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}