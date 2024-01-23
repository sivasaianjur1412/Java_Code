package movie;

import java.util.Comparator;

public class MovieComparatorByYearAndRating implements Comparator<Movie> {

    @Override
    public int compare(Movie firstMovie, Movie secondMovie) {
        int flag = firstMovie.getYearReleased() - secondMovie.getYearReleased();
        if(flag == 0)
            flag = firstMovie.getRating() - secondMovie.getRating();
        return flag;
    }
}
