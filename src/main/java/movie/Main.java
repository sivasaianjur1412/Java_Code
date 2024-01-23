package movie;

import algorithms.SortingMovie;

public class Main {
    public static void main(String[] args) {
        Movie[] movies = {
                new Movie(2003, 9, 10000, 15000),
                new Movie(2015, 8, 20000, 25000),
                new Movie(2020, 10, 15000, 10000)
        };
        SortingMovie sortingMovie = new SortingMovie();
        movies = sortingMovie.sortMovieByRatingAndProfit(movies);

        System.out.println("Movies based on ratings and profits");
        System.out.println("Year, Budget, Rating, Collection, Profit");
        for(Movie movie : movies){
            System.out.println(movie.getYearReleased() + ", "
                    + movie.getBudget() + ", " + movie.getRating() +
                    ", " + movie.getCollectionAmount() + ", " + movie.getProfit()
                    );

        }

        movies = sortingMovie.sortMovieByYearAndRating(movies);

        System.out.println("Movies based on year and rating");
        System.out.println("Year, Budget, Rating, Collection, Profit");
        for(Movie movie : movies){
            System.out.println(movie.getYearReleased() + ", "
                    + movie.getBudget() + ", " + movie.getRating() +
                    ", " + movie.getCollectionAmount() + ", " + movie.getProfit()
            );

        }
    }
}
