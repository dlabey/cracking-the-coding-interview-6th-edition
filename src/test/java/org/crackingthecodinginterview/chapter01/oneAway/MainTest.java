package org.crackingthecodinginterview.chapter01.oneAway;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void isOneAwayShouldReturnTrue() {
        boolean isOneAway = Main.isOneAway("pale", "ple");

        Assertions.assertTrue(isOneAway);
    }

    @Test
    void isOneAwayShouldReturnFalse() {
        boolean isOneAway = Main.isOneAway("pale", "bake");

        Assertions.assertFalse(isOneAway);
    }
}
