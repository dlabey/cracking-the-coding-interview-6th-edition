package org.crackingthecodinginterview.chapter01.urlify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void urlifyFixedShouldUrlifyFixedAssumedLengthString() {
        char[] str = "Mr John Smith    ".toCharArray();
        char[] strUrlified = Main.urlifyFixed(str);

        Assertions.assertEquals("Mr%20John%20Smith", new String(strUrlified));
    }

    @Test
    void urlifyShouldUrlifyFixedAssumedLengthString() {
        char[] str = "Mr John Smith    ".toCharArray();
        char[] strUrlified = Main.urlify(str);

        Assertions.assertEquals("Mr%20John%20Smith%20%20%20%20", new String(strUrlified));
    }
}
