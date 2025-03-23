package ds.list.unique_list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class UniqueListTest {


    @Test
    public void day1() throws Exception {
       List<String> day1 = new ArrayList<>(Arrays.asList("14","15","16","20","22"));
        List<String> day2 = new ArrayList<>(Arrays.asList("14","21","22"));
        assertEquals(new ArrayList<>(Arrays.asList("14","22")), UniqueList.days(day1,day2).stream().sorted().collect(Collectors.toList()));
    }

    @Test
    public void modifyDay() throws Exception {
        List<String> day1 = new ArrayList<>(Arrays.asList("14","15","16","20","22"));
        List<String> day2 = new ArrayList<>(Arrays.asList("14","21","22"));
        assertEquals(new ArrayList<>(Arrays.asList("14","22")),UniqueList.modifyDay(day1,day2));
    }

    @org.junit.Test(expected = RuntimeException.class)
    public void notday1() throws Exception{
        List<String> day1 = null;
        List<String> day2 = new ArrayList<>(Arrays.asList("14","21","22"));
        UniqueList.days(day1,day2);
        fail("Should have thrown an RuntimeException");
    }

    @org.junit.Test(expected = RuntimeException.class)
    public void notmodifyDay() throws Exception{
        List<String> day1 = new ArrayList<>(Arrays.asList("14","15","16","20","22"));
        List<String> day2 = null;
        UniqueList.modifyDay(day1,day2);
        fail("Should have thrown an RuntimeException");
    }

}