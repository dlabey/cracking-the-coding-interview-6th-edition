package org.crackingthecodinginterview.chapter02.returnKthToLast;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class MainTest {
    
    @Test
    void shouldReturnKthToLast() {
        Main.LinkedListNode linkedList = new Main.LinkedListNode(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);

        Main.LinkedListNode kth = Main.returnKthToLast(linkedList, 2);

        assertEquals(5, kth.data);
    }

    @Test
    void shouldReturnExceptionOnOutOfBoundsKth() {
        Main.LinkedListNode linkedList = new Main.LinkedListNode(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);

        assertThrows(IllegalArgumentException.class, () ->  Main.returnKthToLast(linkedList, 7));
    }
}
