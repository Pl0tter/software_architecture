package Adapters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import Ports.IFetchMovieReviews;
import Domain.MovieReview;
import Domain.MovieSearchRequest;

public class MovieReviewsRepo implements IFetchMovieReviews {
    private Map<String, List<MovieReview>> movieReviewMap;

    public MovieReviewsRepo() {
        initialize();
    }

    private void initialize() {
        this.movieReviewMap = new HashMap<>();
        movieReviewMap.put("StarWars", Collections.singletonList(new MovieReview("1", 7.5, "Good")));
        movieReviewMap.put("StarTrack",
                Arrays.asList(new MovieReview("1", 9.5, "Excellent"), new MovieReview("1", 8.5, "Good")));
    }

    @Override
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest) {
        return Optional.ofNullable(movieReviewMap.get(movieSearchRequest.getMovieName())).orElse(new ArrayList<>());
    }

}
