package algorithms;

import movie.Movie;
import movie.MovieComparatorByRatingAndProfit;
import movie.MovieComparatorByYearAndRating;

public class SortingMovie {

    /***
     * Used selection sort
     * @param movies
     * @return
     */

    public Movie[] sortMovieByRatingAndProfit(Movie[] movies) {
        MovieComparatorByRatingAndProfit movieComparatorByRatingAndProfit =
                new MovieComparatorByRatingAndProfit();
        for(int i = 0; i <= movies.length - 2; i++) {
            int minimumMovieIndex = i;
            for(int j = i; j <= movies.length - 1; j++) {
                if(movieComparatorByRatingAndProfit.compare(movies[j], movies[minimumMovieIndex]) < 0)
                    minimumMovieIndex = j;
            }

            Movie swappingProduct = movies[minimumMovieIndex];
            movies[minimumMovieIndex] = movies[i];
            movies[i] = swappingProduct;
        }
        return movies;
    }

    public Movie[] sortMovieByYearAndRating(Movie[] movies) {
        MovieComparatorByYearAndRating movieComparatorByYearAndRating =
                new MovieComparatorByYearAndRating();
        for(int i = 0; i <= movies.length - 2; i++) {
            int minimumMovieIndex = i;
            for(int j = i; j <= movies.length - 1; j++) {
                if(movieComparatorByYearAndRating.compare(movies[j], movies[minimumMovieIndex]) < 0)
                    minimumMovieIndex = j;
            }

            Movie swappingProduct = movies[minimumMovieIndex];
            movies[minimumMovieIndex] = movies[i];
            movies[i] = swappingProduct;
        }
        return movies;
    }
}
