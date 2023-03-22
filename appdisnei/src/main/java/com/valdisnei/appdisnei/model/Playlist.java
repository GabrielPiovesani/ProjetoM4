package com.valdisnei.appdisnei.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;

@Entity
@Getter @Setter @Builder
@AllArgsConstructor @NoArgsConstructor
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


//    @OneToMany
//    @JoinTable(name = "playlist_midias",
//            joinColumns = @JoinColumn(name = "playlist_id"),
//            inverseJoinColumns = @JoinColumn(name = "midias_id"))
    private ArrayList<Midia> midias;
    private int ordem;


    private String midiaAtual;

}
