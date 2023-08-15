package Domain;

public class MovieReview {
    String movieName;
    double movieScore;
    String remark;

    public MovieReview(String movieName, double movieScore, String remark) {
        this.movieName = movieName;
        this.movieScore = movieScore;
        this.remark = remark;
    }

    @Override
    public String toString() {
        return " " + movieScore + " " + remark;
    }
}
