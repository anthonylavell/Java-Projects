package grinder.backtracking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePartitioning2Test {
    private String str;
    private String str2;
    private String str3;

    private List<List<String>> ans = new ArrayList<>();
    private List<List<String>> ans2 = new ArrayList<>();
    private List<List<String>> ans3= new ArrayList<>();


    @BeforeEach
    void setUpStr() {
        str = "aab";
        str2 = "a";
        str3 = "abab";
    }

    @BeforeEach
    void setUpListList() {
        ans.add(new ArrayList<>(Arrays.asList("a","a","b")));
        ans.add(new ArrayList<>(Arrays.asList("aa","b")));

        ans2.add(new ArrayList<>(List.of("a")));

        ans3.add(new ArrayList<>(Arrays.asList("a","b","a","b")));
        ans3.add(new ArrayList<>(Arrays.asList("a","bab")));
        ans3.add(new ArrayList<>(Arrays.asList("aba","b")));
    }

    @Test
    void testPartition() {
        List<List<String>> result = PalindromePartitioning2.partition(str);
        isPartition(ans,result);

        List<List<String>> result2 = PalindromePartitioning2.partition(str2);
        isPartition(ans2,result2);

        List<List<String>> result3 = PalindromePartitioning2.partition(str3);
        isPartition(ans3,result3);
    }

    private void isPartition(List<List<String>> results,List<List<String>> results2){
        for (int row = 0; row < results.size(); row++){
            for (int col = 0; col < results.get(row).size(); col++ ){
                    assertEquals(results.get(row).get(col), results2.get(row).get(col));
            }
        }
    }
}