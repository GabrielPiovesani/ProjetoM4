package com.valdisnei.biblioteca.controller;

import com.valdisnei.biblioteca.model.MusicaModel;
import com.valdisnei.biblioteca.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/musica")
public class MusicaController {

    @Autowired
    private MusicaRepository musicaRepository;



    @GetMapping("/{id}")
    public ResponseEntity<MusicaModel> getMusicaById(@PathVariable Long id) {
        Optional<MusicaModel> musica = musicaRepository.findById(id);

        if (musica.isPresent()) {
            return ResponseEntity.ok(musica.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping("/musica/add")
    public ResponseEntity<MusicaModel> createMusica(@RequestBody MusicaModel musica) {
        MusicaModel newMusica = musicaRepository.save(musica);
        return ResponseEntity.status(HttpStatus.CREATED).body(newMusica);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MusicaModel> updateMusica(@PathVariable Long id, @RequestBody MusicaModel musica) {
        Optional<MusicaModel> existingMusica = musicaRepository.findById(id);

        if (existingMusica.isPresent()) {
            MusicaModel updatedMusica = existingMusica.get();
            updatedMusica.setDuracao(musica.getDuracao());
            updatedMusica.setArtista(musica.getArtista());
            updatedMusica.setNota(musica.getNota());
            musicaRepository.save(updatedMusica);
            return ResponseEntity.ok(updatedMusica);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMusica(@PathVariable Long id) {
        Optional<MusicaModel> musica = musicaRepository.findById(id);

        if (musica.isPresent()) {
            musicaRepository.delete(musica.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
