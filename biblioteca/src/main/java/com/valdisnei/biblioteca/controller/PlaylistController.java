package com.valdisnei.biblioteca.controller;

import com.valdisnei.biblioteca.model.PlaylistModel;
import com.valdisnei.biblioteca.repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {

    @Autowired
    private PlaylistRepository playlistRepository;

    @GetMapping
    public ResponseEntity<List<PlaylistModel>> listarPlaylists() {
        List<PlaylistModel> playlists = playlistRepository.findAll();
        return ResponseEntity.ok(playlists);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlaylistModel> buscarPlaylistPorId(@PathVariable Long id) {
        Optional<PlaylistModel> existingPlaylist = playlistRepository.findById(id);

        if (existingPlaylist.isPresent()) {
            return ResponseEntity.ok(existingPlaylist.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<PlaylistModel> criarPlaylist(@RequestBody PlaylistModel playlist) {
        PlaylistModel novaPlaylist = playlistRepository.save(playlist);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaPlaylist);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PlaylistModel> atualizarPlaylist(@PathVariable Long id, @RequestBody PlaylistModel playlistAtualizada) {
        Optional<PlaylistModel> existingPlaylist = playlistRepository.findById(id);

        if (existingPlaylist.isPresent()) {
            PlaylistModel playlist = existingPlaylist.get();
            playlist.setMusicas(playlistAtualizada.getMusicas());
            playlist.setMusicas(playlistAtualizada.getMusicas());
            playlist.setOrdem(playlistAtualizada.getOrdem());
            playlist.setMidiaAtual(playlistAtualizada.getMidiaAtual());
            PlaylistModel playlistAtualizadaNoBanco = playlistRepository.save(playlist);
            return ResponseEntity.ok(playlistAtualizadaNoBanco);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<PlaylistModel> deletarPlaylist(@PathVariable Long id) {
        Optional<PlaylistModel> existingPlaylist = playlistRepository.findById(id);

        if (existingPlaylist.isPresent()) {
            playlistRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
