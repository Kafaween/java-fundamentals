package inheritance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Restaurant  {
    private String name;
    private int rate=0;
    private String  price_category;
    private List<Review> list= new ArrayList<>();
    private int num_of_rating=0;

    public Restaurant() {
    }

    public Restaurant(String name, String price_category) {
        this.name = name;

        this.price_category = price_category;
    }

    public void addReview(Review review){
        list.add(review);
        num_of_rating++;
        rate=(review.num_stars+rate)/num_of_rating;

    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", price_category='" + price_category + '\'' +
                ", list=" + list +
                '}';
    }
}
