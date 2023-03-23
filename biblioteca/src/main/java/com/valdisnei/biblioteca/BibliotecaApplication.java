package com.valdisnei.biblioteca;

import com.valdisnei.biblioteca.model.Artista;
import com.valdisnei.biblioteca.model.Musica;
import com.valdisnei.biblioteca.model.Musico;
import com.valdisnei.biblioteca.model.Playlist;
import com.valdisnei.biblioteca.repository.ArtistaRepository;
import com.valdisnei.biblioteca.repository.MusicaRepository;
import com.valdisnei.biblioteca.repository.PlaylistRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class BibliotecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
	}

	@Bean
	public CommandLineRunner mappingDemo(ArtistaRepository artistas, MusicaRepository musicas, PlaylistRepository playlists) {
		return args -> {
			Musico[] artista = new Musico[3];

			//(String nome, String dataNascimento, String premiacoes, String genero, Long id1, String atuacao)
			artista[0] = new Musico("Kawe","18/01/1998","MTV Miaw 2022","Masc", "Test");
			artista[1] = new Musico("L7NNON","30-03-1994","","Masc", "Test");
			artista[2] = new Musico("Ananda","01/09/2003","Tiktok Wars","Fem", "Test");

			artistas.saveAll(Arrays.asList(artista));

			Musica[] conjunto = new Musica[5];

			conjunto[0] = new Musica("Rubi",2021,"rap",2.37, 10, artista[0]);
			conjunto[1] = new Musica("Barcelona",2018,"rap",3.43, 8, artista[1]);
			conjunto[2] = new Musica("Kartie",2019,"Pop",3.41, 7,artista[2]);
			conjunto[3] = new Musica("Nada é pra sempre",2020,"Hip-hop",3.49, 8,artista[1]);
			conjunto[4] = new Musica("Colapso",2021, "Hip-hop",2.41,6, artista[0]);

			musicas.saveAll(Arrays.asList(conjunto));

			Playlist[] PlaylistBuild= new Playlist[1];
			PlaylistBuild[0] = new Playlist(List.of(conjunto),"rock");

			playlists.saveAll(Arrays.asList(PlaylistBuild));
		};
	}


}
