package Domain;

public class MovieSearchRequest {
    String request;

    public MovieSearchRequest(String request) {
        this.request = request;
    }

    public String getMovieName() {
        return request;
    }
}
