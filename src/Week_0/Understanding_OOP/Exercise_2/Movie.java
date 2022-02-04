package Week_0.Understanding_OOP.Exercise_2;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    public String title;
    public String studio;
    public String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static List<Movie> getPG(List<Movie> movies) {
        List<Movie> PGMovies = new ArrayList(List.of());

        for(int i = 0; i < movies.size(); ++i) {
            if (((Movie)movies.get(i)).rating == "PG") {
                PGMovies.add((Movie)movies.get(i));
            }
        }

        return PGMovies;
    }
}

