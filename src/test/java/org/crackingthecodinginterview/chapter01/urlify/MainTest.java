package org.crackingthecodinginterview.chapter01.urlify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void urlifyShouldUrlifyFixedAssumedLengthString() {
        char[] str = "Mr John Smith    ".toCharArray();
        char[] strUrlified = Main.urlify(str);

        Assertions.assertEquals(new String(str), new String(strUrlified));
    }
}
