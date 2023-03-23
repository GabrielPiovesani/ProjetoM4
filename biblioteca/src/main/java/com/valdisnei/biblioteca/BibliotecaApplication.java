package com.valdisnei.biblioteca;

import com.valdisnei.biblioteca.model.*;
import com.valdisnei.biblioteca.repository.*;
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
	public CommandLineRunner mappingDemo(AtorRepository elenco, FilmeRepository filme, ArtistaRepository artistas,
										 MusicaRepository musicas, PlaylistRepository playlists) {
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
			PlaylistBuild[0] = new Playlist(List.of(conjunto[0],conjunto[2],conjunto[4]),"As melhores");


			playlists.saveAll(Arrays.asList(PlaylistBuild));

			Ator[] ator = new Ator[6];

			ator[0] = new Ator("Fulano de Tal", "01/01/1990", "Oscar de Melhor Ator", "Masculino", "Graduação em Artes Cênicas");
			ator[1] = new Ator("Beltrano da Silva", "02/02/1985", "Indicação ao Globo de Ouro", "Masculino", "Mestrado em Teatro");
			ator[2] = new Ator("Ciclana Oliveira", "03/03/1995", "Prêmio Shell de Teatro", "Feminino", "Graduação em Cinema");
			ator[3] = new Ator("João Souza", "04/04/1980", "Indicação ao Emmy", "Masculino", "Doutorado em Artes Cênicas");
			ator[4] = new Ator("Maria da Silva", "05/05/1992", "Indicação ao Troféu Imprensa", "Feminino", "Graduação em Teatro");
			ator[5] = new Ator("José Santos", "06/06/1988", "Prêmio APCA de Melhor Ator", "Masculino", "Mestrado em Artes Cênicas");
			elenco.saveAll(Arrays.asList(ator));

			Filme[] filmes = new Filme[6];

			filmes[0] = new Filme("A Herança",1996,"Drama",130.00,"longa", List.of(ator[0]),"Pedro Almodóvar","Miramax Films");
			filmes[1] = new Filme("O Legado",2002,"Ação",105.00,"longa",List.of(ator[1]),"Michael Bay","DreamWorks Pictures");
			filmes[2] = new Filme("O Enigma do Abismo",2005,"Suspense",122.00,"longa",List.of(ator[4]),"Christopher Nolan","Warner Bros");
			filmes[3] = new Filme("O Império da Noite",2008,"Drama",137.00,"longa",List.of(ator[2]),"David Fincher","Columbia Pictures");
			filmes[4] = new Filme("O Ladrão de Sonhos",2013,"Fantasia",99.00,"longa",List.of(ator[3]),"Tim Burton","Disney");
			filmes[5] = new Filme("O Despertar da Consciência",2018,"Drama",115.00,"longa",List.of(ator[5]),"Barry Jenkins","Annapurna Pictures");

			filme.saveAll(Arrays.asList(filmes));

		};
	}


}
