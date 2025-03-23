package academy.learnprogramming.abstract_method.movie;

import academy.learnprogramming.abstract_method.movie.abstractMethod.AbstractMovieFactory;
import academy.learnprogramming.abstract_method.movie.bollywood.BollywoodFactory;
import academy.learnprogramming.abstract_method.movie.hollywood.HollywoodFactory;

public class MovieProducer  {
    public static AbstractMovieFactory getMovie(String company){
        switch (company.toUpperCase()){
            case "HOLLYWOOD":
                return new HollywoodFactory();
            case "BOLLYWOOD":
                return new BollywoodFactory();
                default:
                    return null;
        }
    }
}
