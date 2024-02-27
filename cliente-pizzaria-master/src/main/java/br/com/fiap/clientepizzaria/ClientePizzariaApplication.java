package br.com.fiap.clientepizzaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@SpringBootApplication
public class ClientePizzariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientePizzariaApplication.class, args);
	}


	@GetMapping(value = "/")
	public String index(){
	return "Bom dia 2TDSPG";

	}


}
