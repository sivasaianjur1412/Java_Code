package movie;

import java.util.Comparator;

public class MovieComparatorByRatingAndProfit implements Comparator<Movie> {

    @Override
    public int compare(Movie firstMovie, Movie secondMovie) {
        int flag = firstMovie.getRating() - secondMovie.getRating();
        if(flag == 0)
            flag = firstMovie.getProfit() - secondMovie.getProfit();
        return flag;
    }
}
