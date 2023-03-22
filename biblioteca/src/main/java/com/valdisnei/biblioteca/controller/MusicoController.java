package com.valdisnei.biblioteca.controller;

import com.valdisnei.biblioteca.model.Musico;
import com.valdisnei.biblioteca.repository.MusicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/musicos")
public class MusicoController {

    @Autowired
    private MusicoRepository musicoRepository;

    @GetMapping
    public ResponseEntity<List<Musico>> listarMusicos() {
        List<Musico> musicos = musicoRepository.findAll();
        return ResponseEntity.ok(musicos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Musico> buscarMusicoPorId(@PathVariable Long id) {
        Optional<Musico> existingMusico = musicoRepository.findById(id);

        if (existingMusico.isPresent()) {
            return ResponseEntity.ok(existingMusico.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Musico> criarMusico(@RequestBody Musico musico) {
        Musico novoMusico = musicoRepository.save(musico);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoMusico);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Musico> atualizarMusico(@PathVariable Long id, @RequestBody Musico musicoAtualizado) {
        Optional<Musico> existingMusico = musicoRepository.findById(id);

        if (existingMusico.isPresent()) {
            Musico musico = existingMusico.get();
            musico.setNome(musicoAtualizado.getNome());
            musico.setDataNascimento(musicoAtualizado.getDataNascimento());
            musico.setPremiacoes(musicoAtualizado.getPremiacoes());
            musico.setGenero(musicoAtualizado.getGenero());
            musico.setAtuacao(musicoAtualizado.getAtuacao());
            Musico musicoAtualizadoNoBanco = musicoRepository.save(musico);
            return ResponseEntity.ok(musicoAtualizadoNoBanco);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Musico> deletarMusico(@PathVariable Long id) {
        Optional<Musico> existingMusico = musicoRepository.findById(id);

        if (existingMusico.isPresent()) {
            musicoRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}