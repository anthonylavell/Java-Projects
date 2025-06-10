package grinder.strings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindCommonCharactersTest {

    @Test
    void testCommonChars() {
        String [] words = {"bella","label","roller"};
        List<String> result = sort(Arrays.asList("e","l","l"));
        assertEquals(result,sort(FindCommonCharacters.commonChars(words)));

        String [] words2 = {"cool","lock","cook"};
        List<String> result2 = sort(Arrays.asList("c","o"));
        assertEquals(result2,sort(FindCommonCharacters.commonChars(words2)));

        String [] words3 = {"bcaddcdd","cbcdccdd","ddccbdda","dacbbdad","dababdcb",
                "bccbdaad","dbccbabd","accdddda"};
        List<String> result3 = sort(Arrays.asList("c","d","d"));
        assertEquals(result3,sort(FindCommonCharacters.commonChars(words3)));

        String [] words4 = {"cool"};
        List<String> result4 = sort(Arrays.asList("c","o","o","l"));
        assertEquals(result4,sort(FindCommonCharacters.commonChars(words4)));
    }

    private List<String> sort(List<String>str){
        Collections.sort(str);
        return str;
    }
}