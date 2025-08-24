package comp_p.capital_one.powerday;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUCacheTest {

    @Test
    void testLRUCache() {
        LRUCache lru = new LRUCache(2);
        lru.put(1,1);
        lru.put(1,2);
        lru.put(2,2);
        Assertions.assertEquals(2,lru.get(1));
        lru.put(3,3);
        Assertions.assertEquals(-1,lru.get(2));
        lru.put(4,4);
        Assertions.assertEquals(-1,lru.get(1));
        Assertions.assertEquals(3,lru.get(3));
        Assertions.assertEquals(-4,lru.get(4));
    }

    @Test
    void testLRUCache2() {
        LRUCache lru = new LRUCache(1);
        Assertions.assertEquals(-1,lru.get(6));
        Assertions.assertEquals(-1,lru.get(8));
        lru.put(12,1);
        Assertions.assertEquals(-1,lru.get(2));
        lru.put(15,11);
        lru.put(5,2);
        lru.put(1,15);
        lru.put(4,2);
        Assertions.assertEquals(2,lru.get(4));
        lru.put(15,15);
    }
}