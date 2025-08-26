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

import java.util.*;

public class LRUCache {
    private Map<Integer,Integer>mapOfLRU;
    private int size;
    public LRUCache(int capacity) {
        this.size = capacity;
        mapOfLRU = new LinkedHashMap<>();
    }

    public static void main(String[] args) {
        LRUCache lru = new LRUCache(2);
        lru.put(1,1);
        lru.put(2,2);
        lru.put(1,2);
        //System.out.println(lru.get(1));
        lru.put(3,3);
        System.out.println(lru.get(2));
        System.out.println(lru.get(1));
        lru.put(4,4);
        System.out.println(lru.get(1));
        System.out.println(lru.get(3));
        System.out.println(lru.get(4));
    }

    public int get(int key) {
        if (mapOfLRU.containsKey(key)){
                int [] nums = {key,mapOfLRU.get(key)};
                mapOfLRU.remove(nums[0]);
                mapOfLRU.put(nums[0],nums[1]);
                return nums[1];
        }
        return -1;
    }

    public void put(int key, int value) {
        if (size == mapOfLRU.size() && !mapOfLRU.containsKey(key)){
            for (Map.Entry<Integer,Integer> map : mapOfLRU.entrySet()){
                mapOfLRU.remove(map.getKey());
                break;
            }
        }
        mapOfLRU.remove(key);
        mapOfLRU.put(key,value);
    }
}
