package inheritance;

public class Restaurant  {
    private String name;
    private int rate;
    private String  price_category;

    public Restaurant() {
    }

    public Restaurant(String name, int rate, String price_category) {
        this.name = name;
        this.rate = rate;
        this.price_category = price_category;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", price_category='" + price_category + '\'' +
                '}';
    }

}
