package org.crackingthecodinginterview.chapter02.deleteMiddleNode;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class MainTest {
    
    @Test
    void shouldDeleteMiddleNode() {
        Main.LinkedListNode linkedList = new Main.LinkedListNode(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);
        linkedList.append(7);

        Main.deleteMiddleNode(linkedList);

        while (linkedList != null) {
            assertNotEquals(4, linkedList.data);

            linkedList = linkedList.next;
        }
    }

    @Test
    void shouldThrowExceptionWithNoMiddle() {
        Main.LinkedListNode linkedList = new Main.LinkedListNode(1);
        linkedList.append(2);

        assertThrows(IllegalArgumentException.class, () -> Main.deleteMiddleNode(linkedList));
    }
}
