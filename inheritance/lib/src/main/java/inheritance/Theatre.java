package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theatre implements reviewable,reviewmovie {
    private String name;
    private List<String> movies = new ArrayList<>();
    private double rate = 0;
    private List<Review> list_of_rates = new ArrayList<>();
    private double num_of_rating = 0;

    public Theatre(String name) {
        this.name = name;
    }

    public String addMovies(String movie) {


        if (movies.contains(movie)) {
            return ("Movie already in the list");
        }
        else {
            movies.add(movie);
            return movie + " have been added";
        }
    }

    public String removeMovies(String movie) {
        movies.remove(movie);
        return movie + " have been removed";
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                ", rate=" + rate +
                ", list_of_rates=" + list_of_rates +
                '}';
    }

    @Override
    public String addReview(Review review) {
        if (review.num_stars>5){
            return("only review from 1 to 5");
        }
        else {
            list_of_rates.add(review);
            num_of_rating++;
            rate = (review.num_stars + rate) / num_of_rating;
            return "new rating have been added for"+name;
        }
    }

    @Override
    public String addReviewmovie(Review review, String watchedmovie) {
        if (review.num_stars>5){
            return("only review from 1 to 5");
        }
        else {
            list_of_rates.add(review);
            num_of_rating++;
            rate = (review.num_stars + rate) / num_of_rating;
            return "new rating have been added for"+name+"based on watching"+watchedmovie ;
        }
    }
}

