package com.valdisnei.appdisnei.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter @Setter @Builder
@AllArgsConstructor @NoArgsConstructor
public class BibliotecaM {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//    @OneToMany
    private List<Midia> midia;

    @OneToOne
    private Usuario usuario;

    @OneToMany
    @JoinTable(name = "biblioteca_playlist",
            joinColumns = @JoinColumn(name = "biblioteca_id"),
            inverseJoinColumns = @JoinColumn(name = "playlist_id"))
    private List<Playlist> playlist;

}
