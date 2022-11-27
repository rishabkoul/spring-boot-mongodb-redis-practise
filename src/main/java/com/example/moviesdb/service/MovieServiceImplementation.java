package com.example.moviesdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.moviesdb.model.Movie;
import com.example.moviesdb.repository.MovieRepository;

@Service
public class MovieServiceImplementation implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

    @Override
    public List<Movie> findMovies(String searchString) {
        return null;
    }

}
