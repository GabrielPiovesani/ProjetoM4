package com.valdisnei.biblioteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BibliotecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner mappingDemo(ArtistaRepository artistas, MusicaRepository musicas) {
//		return args -> {
//			ArtistaModel[] artista = new ArtistaModel[3];
//			"Kawe","18/01/1998","MTV Miaw 2022","Masc"
//
//			artista[0] = new ArtistaModel("Kawe","18/01/1998","MTV Miaw 2022","Masc");
//			artista[1] = new ArtistaModel("L7NNON","30-03-1994","","Masc");
//			artista[2] = new ArtistaModel("Ananda","01/09/2003","Tiktok Wars","Fem");
//
//			artistas.saveAll(Arrays.asList(artista));
//
//			MusicaModel[] conjunto = new MusicaModel[5];
//
//			conjunto[0] = new MusicaModel("Rubi","rap",2021,2.37,artista[0]);
//			conjunto[1] = new MusicaModel("Barcelona","rap", 2018,3.43,artista[1]);
//			conjunto[2] = new MusicaModel("Kartie","Pop",2019,3.41,artista[2]);
//			conjunto[3] = new MusicaModel("Nada é pra sempre","Hip-hop",2020,3.49,artista[1]);
//			conjunto[4] = new MusicaModel("Colapso","Hip-hop",2021,2.41,artista[0]);
//
//			musicas.saveAll(Arrays.asList(conjunto));
//
//
//		};
//	}

//	{
//		"nome":"L7NNON",
//		"dataNascimento": "30/03/1994",
//		"premiacoes": "Melhor artista do ano",
//		"genero": "Masc"
//	}
//	{
//		"nome":"Ananda",
//		"dataNascimento": "30/03/1994",
//		"premiacoes": "Melhor artista do ano",
//		"genero": "Fem"
//	}
//
//	{
//		"titulo":"Rubi",
//		"ano": 2021,
//		"genero": "rap"
//		"duracao": 2.37,
//		"nota": "7",
//		"Artista": [{
//		"nome":"Ananda",
//		"dataNascimento": "30/03/1994",
//		"premiacoes": "Melhor artista do ano",
//		"genero": "Fem"
//		}]
//	}
}
