package inheritance;

public class Review  {
    private String body;
    private String author;
    protected double num_stars;

    public Review(String body, String author, int num_stars) {
        this.body = body;
        this.author = author;
        this.num_stars = num_stars;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", num_stars=" + num_stars +
                '}';
    }
}
