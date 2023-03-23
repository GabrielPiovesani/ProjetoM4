package com.valdisnei.biblioteca.controller;

import com.valdisnei.biblioteca.model.Artista;
import com.valdisnei.biblioteca.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/artista")
public class ArtistaController {

    @Autowired
    private ArtistaRepository artistaRepository;

    @GetMapping
    public ResponseEntity<List<Artista>> getAll(){
        var responponse =  artistaRepository.findAll();
        if(responponse.isEmpty())
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .build();

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(responponse);

    }
    @GetMapping("/{id}")
    public ResponseEntity<Artista> getArtistaById(@PathVariable Long id) {
        Optional<Artista> artista = artistaRepository.findById(id);

        if (artista.isPresent()) {
            return ResponseEntity.ok(artista.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Artista> createArtista(@RequestBody Artista artista) {
        Artista newArtista = artistaRepository.save(artista);
        return ResponseEntity.status(HttpStatus.CREATED).body(newArtista);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Artista> updateArtista(@PathVariable Long id, @RequestBody Artista artista) {
        Optional<Artista> existingArtista = artistaRepository.findById(id);

        if (existingArtista.isPresent()) {
            Artista updatedArtista = existingArtista.get();
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
        Optional<Artista> artista = artistaRepository.findById(id);

        if (artista.isPresent()) {
            artistaRepository.delete(artista.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }}}
