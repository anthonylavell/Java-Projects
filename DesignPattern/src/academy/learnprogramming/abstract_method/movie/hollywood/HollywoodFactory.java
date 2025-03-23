package academy.learnprogramming.abstract_method.movie.hollywood;

import academy.learnprogramming.abstract_method.movie.abstractMethod.AbstractMovieFactory;
import academy.learnprogramming.abstract_method.movie.bollywood.BollywoodMovie;

public class HollywoodFactory extends AbstractMovieFactory {
    @Override
    public BollywoodMovie getBollywoodMovie(String genre) {
        return null;
    }

    @Override
    public HollywoodMovie getHollywoodMovie(String genre) {
        switch (genre.toUpperCase()){
            case "ACTION":
                return new HollywoodActionMovie();
            case "COMEDY":
                return new HollywoodComedyMovie();
                default:
                    return null;
        }

    }
}
