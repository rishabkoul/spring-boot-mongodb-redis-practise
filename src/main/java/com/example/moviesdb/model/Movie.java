package com.example.moviesdb.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Movie")
public class Movie {
    @Id
    private String id;
    private String name;
    private String description;
    private String director;
    private String language;
    private List<String> actors;

    public Movie(String id, String name, String description, String director, String language, List<String> actors) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.director = director;
        this.language = language;
        this.actors = actors;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }
}
