package Java_IPA;

import java.util.*;

// Tester class
public class MovieTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Movie> movies = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            int movieId = Integer.parseInt(sc.nextLine());
            String movieName = sc.nextLine();
            int movieRating = Integer.parseInt(sc.nextLine());
            int noOfActor = Integer.parseInt(sc.nextLine());
            List<String> actors = new ArrayList<>();
            for (int j = 0; j < noOfActor; j++) {
                actors.add(sc.nextLine());
            }
            movies.add(new Movie(movieId, movieName, movieRating, noOfActor, actors));
        }

        String actorForSearch = sc.nextLine(); // For getMoviesByActors
        String actorForAvg = sc.nextLine();    // For getAvgRating

        MovieService service = new MovieService();

        List<Movie> foundMovies = service.getMoviesByActors(movies, actorForSearch);

        if (foundMovies.isEmpty()) {
            System.out.println("No Movies Found");
        } else {
            for (Movie m : foundMovies) {
                System.out.println(m.getMovieId());
                System.out.println(m.getMovieName());
                System.out.println(m.getMovieRating());
            }
        }

        try {
            double avgRating = service.getAvgRating(movies, actorForAvg);
            System.out.println("Average Rating for the actor is: " + avgRating);
        } catch (NoActorFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Movie class
class Movie {
    private int movieId, movieRating, noOfActor;
    private String movieName;
    private List<String> actors;

    public Movie(int movieId, String movieName, int movieRating, int noOfActor, List<String> actors) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieRating = movieRating;
        this.noOfActor = noOfActor;
        this.actors = actors;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public int getNoOfActor() {
        return noOfActor;
    }

    public List<String> getActors() {
        return actors;
    }
}

// MovieService class
class MovieService {
    public List<Movie> getMoviesByActors(List<Movie> movies, String actorName) {
        List<Movie> result = new ArrayList<>();
        for (Movie m : movies) {
            for (String actor : m.getActors()) {
                if (actor.equalsIgnoreCase(actorName)) {
                    result.add(m);
                    break;
                }
            }
        }
        return result;
    }

    public double getAvgRating(List<Movie> movies, String actorName) throws NoActorFoundException {
        int total = 0, count = 0;
        for (Movie m : movies) {
            for (String actor : m.getActors()) {
                if (actor.equalsIgnoreCase(actorName)) {
                    total += m.getMovieRating();
                    count++;
                    break;
                }
            }
        }
        if (count == 0) {
            throw new NoActorFoundException("No Actor Found");
        }
        return total / (double) count;
    }
}

// Custom Exception
class NoActorFoundException extends Exception {
    public NoActorFoundException(String message) {
        super(message);
    }
}