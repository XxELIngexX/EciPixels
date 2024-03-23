package edu.eci.arsw;

import edu.eci.arsw.model.Board;
import edu.eci.arsw.service.BoardServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
//@EnableJpaRepositories("edu.eci.arsw.repository")
@EnableRedisRepositories

public class EciPixelsApplication {

	@Autowired
	private BoardServices boardServices;

	public static void main(String[] args) {
		SpringApplication.run(EciPixelsApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() {
		return (args) -> {
			boardServices.addBoard(new Board(100, 100));
		};
	}
}
