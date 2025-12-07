package com.movieapi;

import static spark.Spark.*;
import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {

        port(4567);
        Gson gson = new Gson();
        MovieService service = new MovieService();

        post("/movies", (req, res) -> {
            Movie movie = gson.fromJson(req.body(), Movie.class);
            service.addMovie(movie);
            res.status(201);
            return "Movie added!";
        });

        post("/movies/:id/rate", (req, res) -> {
            int id = Integer.parseInt(req.params("id"));
            Movie movie = service.getMovie(id);

            if (movie == null) return "Movie not found";

            RatingRequest ratingReq = gson.fromJson(req.body(), RatingRequest.class);
            movie.addRating(ratingReq.rating);

            return "Rating added!";
        });

        get("/movies/:id/average", (req, res) -> {
            int id = Integer.parseInt(req.params("id"));
            Movie movie = service.getMovie(id);

            if (movie == null) return "Movie not found";

            return gson.toJson(new AverageResponse(movie.getId(), movie.getAverageRating()));
        });

        get("/movies/most-rated", (req, res) -> gson.toJson(service.getMostRated()));
    }

    static class RatingRequest { int rating; }
    static class AverageResponse {
        int movieId; double averageRating;
        AverageResponse(int id, double avg) { movieId = id; averageRating = avg; }
    }
}
