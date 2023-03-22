package com.valdisnei.biblioteca.controller;

import com.valdisnei.biblioteca.model.MidiaModel;
import com.valdisnei.biblioteca.repository.MidiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/midia")
public class MidiaController {

    @Autowired
    private MidiaRepository midiaRepository;

    @GetMapping("/{id}")
    public ResponseEntity<MidiaModel> getMidiaById(@PathVariable Long id) {
        Optional<MidiaModel> midia = midiaRepository.findById(id);

        if (midia.isPresent()) {
            return ResponseEntity.ok(midia.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<MidiaModel> createMidia(@RequestBody MidiaModel midia) {
        MidiaModel newMidia = midiaRepository.save(midia);
        return ResponseEntity.status(HttpStatus.CREATED).body(newMidia);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MidiaModel> updateMidia(@PathVariable Long id, @RequestBody MidiaModel midia) {
        Optional<MidiaModel> existingMidia = midiaRepository.findById(id);

        if (existingMidia.isPresent()) {
            MidiaModel updatedMidia = existingMidia.get();
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
        Optional<MidiaModel> midia = midiaRepository.findById(id);

        if (midia.isPresent()) {
            midiaRepository.delete(midia.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}