package Movie;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie = new Movie("Inverter", "Joshua Juntilla");

        movie.addActor("Lebron James");
        movie.addActor("Kim Arniego");

        movie.addReview("Mind-blowing visuals!");
        movie.addReview("A masterpiece of sci-fi storytelling.");

        movie.displayMovieInfo();
    }
}
