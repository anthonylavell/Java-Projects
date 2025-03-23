package code.pattern.backtracking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsOfAPhoneNumberTest {
    private List<String> listOfResultOfStr23;
    private List<String>listOfResultOfEmptyStr;
    private List<String>listOfResultOfStr2;
    private List<String>listOfResultOfStr234;
    @BeforeEach
    public void setUpResults(){
        listOfResultOfStr23 = new ArrayList<>(Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf"));
        listOfResultOfEmptyStr = new ArrayList<>();
        listOfResultOfStr2 = new ArrayList<>(Arrays.asList("a","b","c"));
        listOfResultOfStr234 = new ArrayList<>(Arrays.asList("adg","adh","adi","aeg","aeh","aei","afg","afh","afi","bdg","bdh","bdi","beg","beh","bei","bfg","bfh","bfi","cdg","cdh","cdi","ceg","ceh","cei","cfg","cfh","cfi"));
    }

    @Test
    void testLetterCombinations() {
        String str = "23";
        List<String> listOfStr = LetterCombinationsOfAPhoneNumber.letterCombinationsOfPhoneNumber(str);
        getTestResult(listOfStr,listOfResultOfStr23);

        String str2 = "";
        List<String> listOfStr2 = LetterCombinationsOfAPhoneNumber.letterCombinationsOfPhoneNumber(str2);
        getTestResult(listOfStr2,listOfResultOfEmptyStr);

        String str3 = "2";
        List<String> listOfStr3 = LetterCombinationsOfAPhoneNumber.letterCombinationsOfPhoneNumber(str3);
        getTestResult(listOfStr3,listOfResultOfStr2);

        String str4 = "234";
        List<String> listOfStr4 = LetterCombinationsOfAPhoneNumber.letterCombinationsOfPhoneNumber(str4);
        getTestResult(listOfStr4,listOfResultOfStr234);
    }
    private void getTestResult(List<String> listOfStr, List<String> result) {
        assertTrue(listOfStr.size() == result.size());
        for (int index = 0; index < listOfStr.size(); index++) {
            assertEquals(result.get(index), listOfStr.get(index));
        }
    }
}