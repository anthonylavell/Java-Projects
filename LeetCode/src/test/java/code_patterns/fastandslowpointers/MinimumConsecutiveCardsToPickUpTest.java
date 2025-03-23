package code_patterns.fastandslowpointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumConsecutiveCardsToPickUpTest {

    @Test
    void testMinimumCardPickup() {
        int[] cards = {3,4,2,3,4,7};
        int result = 4;
        Assertions.assertEquals(result,MinimumConsecutiveCardsToPickUp.minimumCardPickup(cards));
        int[] cards2 = {3,4,5,3,5,4,7};
        int result2 = 3;
        Assertions.assertEquals(result2,MinimumConsecutiveCardsToPickUp.minimumCardPickup(cards2));
    }
}