//Abstract Method
package academy.learnprogramming.abstract_method.movie.abstractMethod;

import academy.learnprogramming.abstract_method.movie.bollywood.BollywoodMovie;
import academy.learnprogramming.abstract_method.movie.hollywood.HollywoodMovie;

public abstract class AbstractMovieFactory {
    public abstract BollywoodMovie getBollywoodMovie(String genre);
    public abstract HollywoodMovie getHollywoodMovie(String genre);
}
