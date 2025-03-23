package binarysearch.test;

import binarysearch.BadVersion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BadVersionTest {
    @Test
    public void findBadVersion(){
        String [] trueOrFalse = {"F","F","F","F","T","T","T"};
        Assertions.assertEquals(4, BadVersion.firstBadVersion(trueOrFalse));
        String [] trueOrFalse2 = {"F","F","T","T","F","F","F"};
        Assertions.assertEquals(2, BadVersion.firstBadVersion(trueOrFalse2));
        String [] trueOrFalse3 = {"T","T","T","T","F","F","F"};
        Assertions.assertEquals(0, BadVersion.firstBadVersion(trueOrFalse3));
        String [] trueOrFalse4 = {"F","F","F","T","T","T","T"};
        Assertions.assertEquals(3, BadVersion.firstBadVersion(trueOrFalse4));
    }

}