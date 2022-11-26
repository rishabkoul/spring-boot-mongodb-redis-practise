package com.example.moviesdb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.moviesdb.model.Movie;

public interface MovieRepository extends MongoRepository<Movie, String> {

}
