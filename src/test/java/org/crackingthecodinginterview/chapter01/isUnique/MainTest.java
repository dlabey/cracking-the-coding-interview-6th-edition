package org.crackingthecodinginterview.chapter01.isUnique;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void isUniqueListDataStructureShouldReturnFalse() {
        boolean isUniqueListDataStructure = Main.isUniqueListDataStructure("teeth");

        Assertions.assertFalse(isUniqueListDataStructure);
    }

    @Test
    void isUniqueListDataStructureShouldReturnTrue() {
        boolean isUniqueListDataStructure = Main.isUniqueListDataStructure("coding");

        Assertions.assertTrue(isUniqueListDataStructure);
    }
}
