package com.imdb.demo.components;

import com.imdb.demo.models.Movie;
import com.imdb.demo.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    FilmRepository filmRepository;

    public void run(ApplicationArguments args) {

        Movie movie1 = new Movie("Spider-Man: Into the Spider-Verse", "https://www.imdb.com/title/tt4633694/?ref_=rlm");
        filmRepository.save(movie1);

        Movie movie2 = new Movie("Life Itself", "https://www.imdb.com/title/tt5989218/?ref_=rlm");
        filmRepository.save(movie2);


        Movie movie3 = new Movie("Mary Queen of Scots", "https://www.imdb.com/title/tt2328900/?ref_=rlm");
        filmRepository.save(movie3);

        Movie movie4 = new Movie("The Lego Movie 2: The Second Part", "https://www.imdb.com/title/tt3513498/?ref_=rlm");
        filmRepository.save(movie4);

        Movie movie5 = new Movie("Captain Marvel", "https://www.imdb.com/title/tt4154664/?ref_=rlm");
        filmRepository.save(movie5);
    }
}
