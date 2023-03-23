package com.valdisnei.biblioteca.controller;

import com.valdisnei.biblioteca.model.Musica;
import com.valdisnei.biblioteca.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/musica")
public class MusicaController {

    @Autowired
    private MusicaRepository musicaRepository;



    @GetMapping("/{id}")
    public ResponseEntity<Musica> getMusicaById(@PathVariable Long id) {
        Optional<Musica> musica = musicaRepository.findById(id);

        if (musica.isPresent()) {
            return ResponseEntity.ok(musica.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping("/musica/add")
    public ResponseEntity<Musica> createMusica(@RequestBody Musica musica) {
        Musica newMusica = musicaRepository.save(musica);
        return ResponseEntity.status(HttpStatus.CREATED).body(newMusica);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Musica> updateMusica(@PathVariable Long id, @RequestBody Musica musica) {
        Optional<Musica> existingMusica = musicaRepository.findById(id);

        if (existingMusica.isPresent()) {
            Musica updatedMusica = existingMusica.get();
            updatedMusica.setDuracao(musica.getDuracao());
            updatedMusica.setMusico(musica.getMusico());
            updatedMusica.setNota(musica.getNota());
            musicaRepository.save(updatedMusica);
            return ResponseEntity.ok(updatedMusica);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/{id}/title")
    public String getMovieTitle(@PathVariable Long id) {
        Optional<Musica> movieOptional = musicaRepository.findById(id);
        if (movieOptional.isPresent()) {
            Musica movie = movieOptional.get();
            return movie.getTitulo();
        } else {
            throw new RuntimeException("Movie not found with id " + id);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMusica(@PathVariable Long id) {
        Optional<Musica> musica = musicaRepository.findById(id);

        if (musica.isPresent()) {
            musicaRepository.delete(musica.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
