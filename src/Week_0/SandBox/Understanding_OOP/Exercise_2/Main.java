package Week_0.SandBox.Understanding_OOP.Exercise_2;

import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Movie casinoRoyale = new Movie("Casino Royale", "Eon Productions", "PG13");
        Movie sing2 = new Movie("Sing 2", "Netflix Original", "PG");
        Movie residentEvil = new Movie("Resident Evil", "Netflix Original", "PG16");
        List<Movie> movieLists = List.of(casinoRoyale, sing2, residentEvil);
        System.out.println(Movie.getPG(movieLists));
    }
}

