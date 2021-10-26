package com.nttdata.hibernate1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.hibernate1.persistence.client;
import com.nttdata.hibernate1.services.clientManagementServices;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner{
	@Autowired
	private clientManagementServices clientService;
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception{
		client client1 = new client();
		client1.setDocumentoDeINDENTIDAD("12345645p");
		client1.setFirstName("Piero");
		client1.setFirstName("Velasco");
		client1.setSecondName("Ruiz");
	}

}
