package academy.learnprogramming.abstract_method.movie;

import academy.learnprogramming.abstract_method.movie.abstractMethod.AbstractMovieFactory;
import academy.learnprogramming.abstract_method.movie.bollywood.BollywoodMovie;
import academy.learnprogramming.abstract_method.movie.hollywood.HollywoodMovie;

public class MovieClient {
    public static void main(String[] args) {
        AbstractMovieFactory temp1 = MovieProducer.getMovie("hollywood");
        AbstractMovieFactory temp2 = MovieProducer.getMovie("bollywood");

        HollywoodMovie hollywoodMovie = temp1.getHollywoodMovie("action");
        hollywoodMovie.getMovieName();

        BollywoodMovie bollywoodMovie = temp2.getBollywoodMovie("action");
        bollywoodMovie.getMovieName();

        hollywoodMovie = temp1.getHollywoodMovie("comedy");
        hollywoodMovie.getMovieName();

        bollywoodMovie = temp2.getBollywoodMovie("comedy");
        bollywoodMovie.getMovieName();


    }
}
