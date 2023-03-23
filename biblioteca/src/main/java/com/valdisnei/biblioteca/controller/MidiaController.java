package com.valdisnei.biblioteca.controller;

import com.valdisnei.biblioteca.model.Midia;
import com.valdisnei.biblioteca.repository.MidiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/midia")
public class MidiaController {

    @Autowired
    private MidiaRepository midiaRepository;
    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Midia> getMidiaById(@PathVariable Long id) {
        Optional<Midia> midia = midiaRepository.findById(id);

        if (midia.isPresent()) {
            return ResponseEntity.ok(midia.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Midia> createMidia(@RequestBody Midia midia) {
        Midia newMidia = midiaRepository.save(midia);
        return ResponseEntity.status(HttpStatus.CREATED).body(newMidia);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Midia> updateMidia(@PathVariable Long id, @RequestBody Midia midia) {
        Optional<Midia> existingMidia = midiaRepository.findById(id);

        if (existingMidia.isPresent()) {
            Midia updatedMidia = existingMidia.get();
            updatedMidia.setTitulo(midia.getTitulo());
            updatedMidia.setAno(midia.getAno());
            updatedMidia.setGenero(midia.getGenero());
            midiaRepository.save(updatedMidia);
            return ResponseEntity.ok(updatedMidia);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMidia(@PathVariable Long id) {
        Optional<Midia> midia = midiaRepository.findById(id);

        if (midia.isPresent()) {
            midiaRepository.delete(midia.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}