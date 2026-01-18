package grinder;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;

public class Practice {
    public List<String> getAllItems( Queue<String> warehouseQueue) {
        // TODO: Return all items in the queue as a list.

        return warehouseQueue.stream().toList();
    }
    public static void main(String[] args) {
        Practice trie = new Practice();
        Queue<String> warehouseQueue = new ArrayDeque<>();
        warehouseQueue.offer("lavell");
        warehouseQueue.offer("anthony");
        warehouseQueue.offer("ward");
        List<String> temp = trie.getAllItems(warehouseQueue);
        System.out.println(temp);
       temp.sort(Comparator.naturalOrder());
        System.out.println(temp);
    }
}
