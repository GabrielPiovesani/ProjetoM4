package com.valdisnei.biblioteca.controller;

import com.valdisnei.biblioteca.model.MusicoModel;
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
    public ResponseEntity<List<MusicoModel>> listarMusicos() {
        List<MusicoModel> musicos = musicoRepository.findAll();
        return ResponseEntity.ok(musicos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MusicoModel> buscarMusicoPorId(@PathVariable Long id) {
        Optional<MusicoModel> existingMusico = musicoRepository.findById(id);

        if (existingMusico.isPresent()) {
            return ResponseEntity.ok(existingMusico.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<MusicoModel> criarMusico(@RequestBody MusicoModel musico) {
        MusicoModel novoMusico = musicoRepository.save(musico);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoMusico);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MusicoModel> atualizarMusico(@PathVariable Long id, @RequestBody MusicoModel musicoAtualizado) {
        Optional<MusicoModel> existingMusico = musicoRepository.findById(id);

        if (existingMusico.isPresent()) {
            MusicoModel musico = existingMusico.get();
            musico.setNome(musicoAtualizado.getNome());
            musico.setDataNascimento(musicoAtualizado.getDataNascimento());
            musico.setPremiacoes(musicoAtualizado.getPremiacoes());
            musico.setGenero(musicoAtualizado.getGenero());
            musico.setAtuacao(musicoAtualizado.getAtuacao());
            MusicoModel musicoAtualizadoNoBanco = musicoRepository.save(musico);
            return ResponseEntity.ok(musicoAtualizadoNoBanco);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MusicoModel> deletarMusico(@PathVariable Long id) {
        Optional<MusicoModel> existingMusico = musicoRepository.findById(id);

        if (existingMusico.isPresent()) {
            musicoRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}