package academy.learnprogramming.abstract_method.movie.bollywood;

import academy.learnprogramming.abstract_method.movie.abstractMethod.AbstractMovieFactory;
import academy.learnprogramming.abstract_method.movie.hollywood.HollywoodMovie;


public class BollywoodFactory extends AbstractMovieFactory {
    @Override
    public BollywoodMovie getBollywoodMovie(String genre) {
        switch (genre.toUpperCase()){
            case "ACTION":
                return new BollywoodActionMovie();
            case "COMEDY":
                return new BollywoodComedyMovie();
            default:
                return null;
        }
    }

    @Override
    public HollywoodMovie getHollywoodMovie(String genre) {
        return null;
    }
}
