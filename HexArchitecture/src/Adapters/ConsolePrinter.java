package Adapters;

import java.util.List;

import Ports.IPrintMovieReviews;
import Domain.MovieReview;

public class ConsolePrinter implements IPrintMovieReviews {

    @Override
    public void writeMovieReviews(List<MovieReview> movieReviewList) {
        movieReviewList.forEach(movieReview -> {
            System.out.println(movieReview.toString());
        });

    }

}
