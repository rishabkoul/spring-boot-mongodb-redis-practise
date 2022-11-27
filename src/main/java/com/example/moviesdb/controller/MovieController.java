package com.example.moviesdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.moviesdb.model.Movie;
import com.example.moviesdb.service.MovieService;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return movieService.getMovies();
    }
}
