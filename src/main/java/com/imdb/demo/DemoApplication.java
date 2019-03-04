package com.imdb.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.imdb.demo.repositories.FilmRepository;

@SpringBootApplication
public class DemoApplication {


	@Autowired
	FilmRepository filmRepository;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
