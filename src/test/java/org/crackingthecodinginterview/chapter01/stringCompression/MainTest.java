package org.crackingthecodinginterview.chapter01.stringCompression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.crackingthecodinginterview.chapter01.stringCompression.Main.compressString;

class MainTest {

    @Test
    void compressStringShouldReturnCompressedString() {
        String str = "aabcccccaaa";
        String strCompressed = compressString(str);

        Assertions.assertEquals("a2b1c5a3", strCompressed);
    }

    @Test
    void compressStringShouldReturnOriginalString() {
        String str = "abbc";
        String strCompressed = compressString(str);

        Assertions.assertEquals(str, strCompressed);
    }
}
