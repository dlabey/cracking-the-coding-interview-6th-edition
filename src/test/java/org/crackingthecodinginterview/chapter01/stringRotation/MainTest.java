package org.crackingthecodinginterview.chapter01.stringRotation;

import org.junit.jupiter.api.Test;

import static org.crackingthecodinginterview.chapter01.stringRotation.Main.isSubstring;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    void shouldBeASubstring() {
        assertTrue(isSubstring("waterbottle", "erbottlewat"));
    }

    @Test
    void shouldNotBeASubstring() {
        assertFalse(isSubstring("waterbottle", "bottlerwat"));
    }
}
