package com.example.moviesdb.service;

import java.util.List;

import com.example.moviesdb.model.Movie;

public interface MovieService {

    public List<Movie> getMovies();

    public List<Movie> findMovies(String searchString);
}
