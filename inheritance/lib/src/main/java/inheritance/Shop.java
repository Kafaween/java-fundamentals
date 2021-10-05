package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop implements reviewable{
    private String name;
    private String desc;
    private String num_dol;
    private List<Review> list_of_rates = new ArrayList<>();
    private double rate=0;
    private double num_of_rating=0;

    public Shop(String name, String desc, String num_dol) {
        this.name = name;
        this.desc = desc;
        this.num_dol = num_dol;
    }

    @Override
    public String addReview(Review review){
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
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", price_category='" + num_dol + '\'' +
                ", list_of_reviews=" + list_of_rates +
                '}';
    }
}
