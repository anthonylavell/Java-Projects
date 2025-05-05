package code.pattern.graph.kahn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskScheduleTest {

    @Test
    void testTaskScheduling() {
        List<String> tasks = Arrays.asList("a", "b", "c", "d");
        List<List<String>> requirements = Arrays.asList(
                new ArrayList<>(Arrays.asList("a", "b")),
                new ArrayList<>(Arrays.asList("c", "b")),
                new ArrayList<>(Arrays.asList("b", "d"))
        );
        List<String> result = Arrays.asList("a", "c", "b", "d");

        Assertions.assertEquals(result,TaskSchedule.taskScheduling(tasks,requirements));
        List<String> tasks2 = Arrays.asList("abbreviate","bricks","cardinals","dextrous","fibre","green","height");
        List<List<String>> requirements2 = Arrays.asList(
                new ArrayList<>(Arrays.asList("abbreviate","bricks")),
                new ArrayList<>(Arrays.asList("cardinals", "bricks")),
                new ArrayList<>(Arrays.asList("dextrous", "bricks")),
                new ArrayList<>(Arrays.asList("bricks","fibre")),
                new ArrayList<>(Arrays.asList("green","fibre"))
        );
        List<String> result2 = Arrays.asList("dextrous","abbreviate","green","cardinals","height","bricks","fibre");
        Assertions.assertEquals(result2,TaskSchedule.taskScheduling(tasks2,requirements2));
    }
}