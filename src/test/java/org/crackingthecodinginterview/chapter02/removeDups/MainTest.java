package org.crackingthecodinginterview.chapter02.removeDups;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.crackingthecodinginterview.chapter02.removeDups.Main.LinkedListNode;
import org.junit.jupiter.api.Test;

public class MainTest {
    
    @Test
    void shouldRemoveDups() {
        LinkedListNode linkedList = new LinkedListNode(1);
        linkedList.append(1);
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(3);

        Main.removeDups(linkedList);
        int i = 1;
        while (linkedList != null) {
            assertEquals(i, linkedList.data);
            i++;

            linkedList = linkedList.next;
        }
    }
}
