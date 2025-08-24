/*
Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

Implement the LRUCache class:

LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
int get(int key) Return the value of the key if the key exists, otherwise return -1.
void put(int key, int value) Update the value of the key if the key exists. Otherwise, add
the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
The functions get and put must each run in O(1) average time complexity.



Example 1:

Input
["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
Output
[null, null, null, 1, null, -1, null, -1, 3, 4]

Explanation
LRUCache lRUCache = new LRUCache(2);
lRUCache.put(1, 1); // cache is {1=1}
lRUCache.put(2, 2); // cache is {1=1, 2=2}
lRUCache.get(1);    // return 1
lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
lRUCache.get(2);    // returns -1 (not found)
lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
lRUCache.get(1);    // return -1 (not found)
lRUCache.get(3);    // return 3
lRUCache.get(4);    // return 4


Constraints:

1 <= capacity <= 3000
0 <= key <= 104
0 <= value <= 105
At most 2 * 105 calls will be made to get and put.
 */
package comp_p.capital_one.powerday;

import ds.node.doubly_linked.DoublyNodeLRU;

import java.util.HashMap;
import java.util.Map;

public class LRUCacheWithNode {
    private Map<Integer, DoublyNodeLRU>mapOfLRU;
    private int size;
    private DoublyNodeLRU head;
    private DoublyNodeLRU tail;
    public LRUCacheWithNode(int capacity) {
        this.size = capacity;
        mapOfLRU = new HashMap<>();
        head = null;
        tail = null;
    }

    public static void main(String[] args) {
        LRUCache lru = new LRUCache(2);
        lru.put(1,1);
        lru.put(1,2);
        lru.put(2,2);
        System.out.println(lru.get(1));
        lru.put(3,3);
        System.out.println(lru.get(2));
        lru.put(4,4);
        System.out.println(lru.get(1));
        System.out.println(lru.get(3));
        System.out.println(lru.get(4));
    }

    public int get(int key) {
       if (mapOfLRU.containsKey(key) && mapOfLRU.get(key).val != -1){
           moveToRear(key);
           return mapOfLRU.get(key).val;
       }
        return -1;
    }

    public void put(int key, int value) {
        if (mapOfLRU.containsKey(key)){
            mapOfLRU.get(key).val = value;
            moveToRear(key);
        }else {
            DoublyNodeLRU newNode = new DoublyNodeLRU(key, value);
            mapOfLRU.put(key,newNode);
            if (head == null) {
                head = newNode;
                tail = head;
            } else {
                newNode.prev = tail;
                tail.next = newNode;
                tail = tail.next;
            }
        }
        if (mapOfLRU.size() > size) {
            head.val = -1;
            removeElem();
        }
    }
    private void removeElem(){
        DoublyNodeLRU next =head.next;
        DoublyNodeLRU pre = head.prev;
    }
    private void moveToRear(int key){
        DoublyNodeLRU current = mapOfLRU.get(key);
        if (tail != current) {
            if (current.prev==null){
                if (head == current){
                removeElem();
                }
                current.next = null;
            }else {
                DoublyNodeLRU prev = current.prev;
                DoublyNodeLRU next = current.next;
                prev.next =next;
                next.prev = prev;
            }
            current.prev = tail;
            tail.next = current;
            tail = tail.next;
        }

    }
}
