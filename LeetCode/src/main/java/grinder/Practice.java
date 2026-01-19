package grinder;

import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Practice {
    public List<String> getAllItems( Queue<String> warehouseQueue) {
        // TODO: Return all items in the queue as a list.

        return warehouseQueue.stream().toList();
    }
    public static void main(String[] args) {
        Practice trie = new Practice();
        Stack<int[]> historyStack = new Stack<>();
        historyStack.add(new int[] {0,0});
        historyStack.add(new int[] {1,0});
        historyStack.add(new int[] {1,1});
        List<int[]>path = historyStack.stream().toList();
        for (int[] position : path) {
            System.out.println(arrayToString(position));
        }
    }
    private static String arrayToString(int[] array) {
        return array[0] + ", " + array[1];
    }
}
