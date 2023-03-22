package com.valdisnei.biblioteca.controller;

import com.valdisnei.biblioteca.model.ArtistaModel;
import com.valdisnei.biblioteca.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/artista")
public class ArtistaController {

    @Autowired
    private ArtistaRepository artistaRepository;

    @GetMapping("/{id}")
    public ResponseEntity<ArtistaModel> getArtistaById(@PathVariable Long id) {
        Optional<ArtistaModel> artista = artistaRepository.findById(id);

        if (artista.isPresent()) {
            return ResponseEntity.ok(artista.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<ArtistaModel> createArtista(@RequestBody ArtistaModel artista) {
        ArtistaModel newArtista = artistaRepository.save(artista);
        return ResponseEntity.status(HttpStatus.CREATED).body(newArtista);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ArtistaModel> updateArtista(@PathVariable Long id, @RequestBody ArtistaModel artista) {
        Optional<ArtistaModel> existingArtista = artistaRepository.findById(id);

        if (existingArtista.isPresent()) {
            ArtistaModel updatedArtista = existingArtista.get();
            updatedArtista.setNome(artista.getNome());
            updatedArtista.setDataNascimento(artista.getDataNascimento());
            updatedArtista.setPremiacoes(artista.getPremiacoes());
            updatedArtista.setGenero(artista.getGenero());
            artistaRepository.save(updatedArtista);
            return ResponseEntity.ok(updatedArtista);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArtista(@PathVariable Long id) {
        Optional<ArtistaModel> artista = artistaRepository.findById(id);

        if (artista.isPresent()) {
            artistaRepository.delete(artista.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }}}
