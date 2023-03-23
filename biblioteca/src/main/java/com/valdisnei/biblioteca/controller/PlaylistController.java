package com.valdisnei.biblioteca.controller;

import com.valdisnei.biblioteca.model.Playlist;
import com.valdisnei.biblioteca.repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin
@RequestMapping("/playlists")
public class PlaylistController {

    @Autowired
    private PlaylistRepository playlistRepository;
    @CrossOrigin
    @GetMapping
    public ResponseEntity<List<Playlist>> listarPlaylists() {
        List<Playlist> playlists = playlistRepository.findAll();
        return ResponseEntity.ok(playlists);
    }
    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Playlist> buscarPlaylistPorId(@PathVariable Long id) {
        Optional<Playlist> existingPlaylist = playlistRepository.findById(id);

        if (existingPlaylist.isPresent()) {
            return ResponseEntity.ok(existingPlaylist.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Playlist> criarPlaylist(@RequestBody Playlist playlist) {
        Playlist novaPlaylist = playlistRepository.save(playlist);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaPlaylist);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Playlist> atualizarPlaylist(@PathVariable Long id, @RequestBody Playlist playlistAtualizada) {
        Optional<Playlist> existingPlaylist = playlistRepository.findById(id);

        if (existingPlaylist.isPresent()) {
            Playlist playlist = existingPlaylist.get();
            playlist.setMusicas(playlistAtualizada.getMusicas());
            playlist.setMusicas(playlistAtualizada.getMusicas());
            playlist.setOrdem(playlistAtualizada.getOrdem());
            playlist.setMidiaAtual(playlistAtualizada.getMidiaAtual());
            Playlist playlistAtualizadaNoBanco = playlistRepository.save(playlist);
            return ResponseEntity.ok(playlistAtualizadaNoBanco);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Playlist> deletarPlaylist(@PathVariable Long id) {
        Optional<Playlist> existingPlaylist = playlistRepository.findById(id);

        if (existingPlaylist.isPresent()) {
            playlistRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
