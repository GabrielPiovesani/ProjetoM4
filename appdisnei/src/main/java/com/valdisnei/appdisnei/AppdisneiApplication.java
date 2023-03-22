package com.valdisnei.appdisnei;

import com.valdisnei.appdisnei.model.Artista;
import com.valdisnei.appdisnei.model.Musica;
import com.valdisnei.appdisnei.repositorio.ArtistaRepositorio;
import com.valdisnei.appdisnei.repositorio.MidiaRepositorio;
import com.valdisnei.appdisnei.repositorio.MusicaRepositorio;
import com.valdisnei.appdisnei.repositorio.PlaylistRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class AppdisneiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppdisneiApplication.class, args);
	}


//	@Bean
//	public CommandLineRunner mappingDemo(ArtistaRepositorio artistas, MusicaRepositorio musicas) {
//		return args -> {
//			Artista[] artista = new Artista[3];
//
//			artista[0] = new Artista("Kawe","18/01/1998","MTV Miaw 2022","Masc");
//			artista[1] = new Artista("L7NNON","30-03-1994","","Masc");
//			artista[2] = new Artista("Ananda","01/09/2003","Tiktok Wars","Fem");
//
//			artistas.saveAll(Arrays.asList(artista));
//
//			Musica[] conjunto = new Musica[5];
//
//			conjunto[0] = new Musica("Rubi","rap",2021,2.37,artista[0]);
//			conjunto[1] = new Musica("Barcelona","rap", 2018,3.43,artista[1]);
//			conjunto[2] = new Musica("Kartie","Pop",2019,3.41,artista[2]);
//			conjunto[3] = new Musica("Nada é pra sempre","Hip-hop",2020,3.49,artista[1]);
//			conjunto[4] = new Musica("Colapso","Hip-hop",2021,2.41,artista[0]);
//
//			musicas.saveAll(Arrays.asList(conjunto));
//
//
//		};
//	}


}
