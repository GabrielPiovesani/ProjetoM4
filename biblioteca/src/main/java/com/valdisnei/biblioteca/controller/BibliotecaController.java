package com.valdisnei.biblioteca.controller;

import com.valdisnei.biblioteca.model.BibliotecaModel;
import com.valdisnei.biblioteca.model.PlaylistModel;
import com.valdisnei.biblioteca.repository.BibliotecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bibliotecas")
public class BibliotecaController {

    @Autowired
    private BibliotecaRepository bibliotecaRepository;

    @GetMapping
    public ResponseEntity<List<BibliotecaModel>> listarBibliotecas() {
        List<BibliotecaModel> bibliotecas = bibliotecaRepository.findAll();
        return ResponseEntity.ok(bibliotecas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BibliotecaModel> buscarBibliotecaPorId(@PathVariable Long id) {
        Optional<BibliotecaModel> existingBiblioteca = bibliotecaRepository.findById(id);

        if (existingBiblioteca.isPresent()) {
            return ResponseEntity.ok(existingBiblioteca.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<BibliotecaModel> criarBiblioteca(@RequestBody BibliotecaModel biblioteca) {
        BibliotecaModel novaBiblioteca = bibliotecaRepository.save(biblioteca);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaBiblioteca);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BibliotecaModel> atualizarBiblioteca(@PathVariable Long id, @RequestBody BibliotecaModel bibliotecaAtualizada) {
        Optional<BibliotecaModel> existingBiblioteca = bibliotecaRepository.findById(id);

        if (existingBiblioteca.isPresent()) {
            BibliotecaModel biblioteca = existingBiblioteca.get();
            biblioteca.setUsuario(bibliotecaAtualizada.getUsuario());
            biblioteca.setMusicas(bibliotecaAtualizada.getMusicas());
            biblioteca.setFilmes(bibliotecaAtualizada.getFilmes());
            biblioteca.setPlaylist(bibliotecaAtualizada.getPlaylist());
            BibliotecaModel bibliotecaAtualizadaNoBanco = bibliotecaRepository.save(biblioteca);
            return ResponseEntity.ok(bibliotecaAtualizadaNoBanco);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<BibliotecaModel> deletarBiblioteca(@PathVariable Long id) {
        Optional<BibliotecaModel> existingBiblioteca = bibliotecaRepository.findById(id);

        if (existingBiblioteca.isPresent()) {
            bibliotecaRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}/playlists/{playlistId}/tocar")
    public ResponseEntity<String> tocarPlaylist(@PathVariable Long id, @PathVariable Long playlistId) {
        Optional<BibliotecaModel> existingBiblioteca = bibliotecaRepository.findById(id);

        if (existingBiblioteca.isPresent()) {
            BibliotecaModel biblioteca = existingBiblioteca.get();
            Optional<PlaylistModel> playlist = biblioteca.getPlaylist().stream().filter(p -> p.getId().equals(playlistId)).findFirst();
            if (playlist.isPresent()) {
                String mensagem = "Tocando playlist " + playlist.get().getNome();
                return ResponseEntity.ok(mensagem);
            } else {
                return ResponseEntity.notFound().build();
            }
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
