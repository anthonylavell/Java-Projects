package arraysandstrings.array.two_dimensional.client;

import arraysandstrings.array.two_dimensional.WordSearch;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WordSearchTest {
    char[][]  board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
     WordSearch wordSearch;
    String word;
    @BeforeEach
    public void setUp(){
        wordSearch = new WordSearch();

    }

    @Test
    void isExistTrue() {
        word = "SEE";
        boolean isTorF = wordSearch.exist(board,word);
        Assert.assertTrue(isTorF);

        word = "ABCCED";
        isTorF = wordSearch.exist(board,word);
        Assert.assertTrue(isTorF);
    }

    @Test
    void isExistFalse() {
        word = "ABCB";
        boolean isTorF = wordSearch.exist(board,word);
        Assert.assertFalse(isTorF);
    }
}