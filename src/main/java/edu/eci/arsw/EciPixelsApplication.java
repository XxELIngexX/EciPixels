package edu.eci.arsw;

import edu.eci.arsw.model.Board;
import edu.eci.arsw.repository.PlayerRepository;
import edu.eci.arsw.service.BoardServices;
import edu.eci.arsw.service.PlayerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EciPixelsApplication {
	@Autowired
	PlayerRepository playerRepository;
	@Autowired(required = true)
	PlayerServices playerServices;
	@Autowired(required = true)
	BoardServices boardServices;


	public static void main(String[] args) {
		SpringApplication.run(EciPixelsApplication.class, args);
	}

	@Bean public CommandLineRunner run(){
		return (args)->{
			boardServices.addBoard(new Board(100,100));
		};

	}

}
