package com.movieapi;

import java.util.*;

public class MovieService {

    private Map<Integer, Movie> movies = new HashMap<>();

    public void addMovie(Movie movie) {
        movies.put(movie.getId(), movie);
    }

    public Movie getMovie(int id) {
        return movies.get(id);
    }

    public List<Movie> getMostRated() {
        List<Movie> list = new ArrayList<>(movies.values());
        list.sort((a, b) -> b.getRatings().size() - a.getRatings().size());
        return list;
    }
}
