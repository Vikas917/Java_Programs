/*
You are tasked with designing the application for getting information for the Movies and actors working in the said movie.

Consider the following classes for the Movies.

movield int
movieName. String
movieRating: int
numberOfActor int
actors: List<String>


Make getter, setter and constructor for the Movie class.

There should be 2 non static method that needs to be created in the MovieService Class as mentioned below:

Task 1: Fetch List of Movies Based on the Actor:

Create a non static method which will find out the list of movies, in which specific actor has worked. This method will take
two input: List<Movie> movies and String actorName. In case there are no movies with aforementioned actorName print
"No Movies Found" in Movie Tester. This method will return the List of Movies with the mentioned actor Name.This list must be
printed in the main method. Please Investigate the Sample input and output for the better understanding of the program.

Task 2: Calculate Average Movie Rating based on the Actor:

Create a non static method which will assist in getting the average movie rating for the specific actor. This method will take
two inputs: List<Movie> movies and String actorName. In case there are no movies with aforementioned actor Name throw
NeActorFoundException with the message "No Actor Found" from the MovieService class. This method will return double
averageRating of movies with the mentioned actorName. This averageRating of movies must be printed in the main method.
Please investigate the Sample input and output for the better understanding of the program.

Note:

Write the code for accepting inputs, printing outputs and calling the non-static methods in the main method from the
MovieService class.You can refer to the sample input/output below to verify your solution.
Don't use any static test or formatting for printing the result, just invoke the methods and print the result.

• All comparisons should be case-insensitive.

Sample Input 1:

3
movie1
4
2
sahi
sid
2
movie2
3
1
sid
3
movie3
5
1
sahi
sid
sahi

Sample output 1:

1
movie1
4
2
movie 2
3
Average Rating for the actor is: 4.5


Sample Input 2:

3
1
movie1
4
2
sahi
sid
2
movie2
3
1
sid
3
movie3
5
sahi
Siddy
sahil

Sample output 2:

No Movies Found
No Actor Found

 */

package Java_PRA;

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