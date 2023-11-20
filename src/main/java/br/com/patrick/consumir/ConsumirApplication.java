package br.com.patrick.consumir;

import br.com.patrick.consumir.model.DadosSerie;
import br.com.patrick.consumir.service.ConsumoAPI;
import br.com.patrick.consumir.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumirApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConsumirApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		ConsumoAPI consumoAPI = new ConsumoAPI();
		var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=prison+break&apikey=6585022c");
		System.out.println(json);
		ConverteDados converteDados = new ConverteDados();
		DadosSerie dados = converteDados.obterDados(json, DadosSerie.class);
		System.out.println(dados);


	}
}
