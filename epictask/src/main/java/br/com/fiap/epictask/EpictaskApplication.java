package br.com.fiap.epictask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Controller;


@SpringBootApplication
@EnableCaching
public class EpictaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(EpictaskApplication.class, args);
	}

}
