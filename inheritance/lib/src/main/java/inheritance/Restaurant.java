package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant  {
    private String name;
    private double rate=0;
    private String  price_category;
    private List<Review> list_of_rates = new ArrayList<>();
    private double num_of_rating=0;

    public Restaurant() {
    }

    public Restaurant(String name, String price_category) {
        this.name = name;

        this.price_category = price_category;
    }

    public String addReview(Review review){
        if (review.num_stars>5){
            return("only review from 1 to 5");
        }
        else {
            list_of_rates.add(review);
            num_of_rating++;
            rate = (review.num_stars + rate) / num_of_rating;
            return "new rating have been added";
        }
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", price_category='" + price_category + '\'' +
                ", list_of_reviews=" + list_of_rates +
                '}';
    }
}
