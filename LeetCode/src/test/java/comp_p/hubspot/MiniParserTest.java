package comp_p.hubspot;

import comp_p.hubspot.main.NestedInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MiniParserTest {

    @Test
    void testDeserializeSingleInter() {
        String s = "324";
        NestedInteger nesting = MiniParser.deserialize(s);
        Assertions.assertTrue(nesting.isInteger());
    }

    @Test
    void testDeserializeNestingInter() {
        String str2 = "[123,[456,[789]]],[123,[456,[789]]]";
        NestedInteger nesting = MiniParser.deserialize(str2);
        Assertions.assertFalse(nesting.getList().isEmpty());

    }
}