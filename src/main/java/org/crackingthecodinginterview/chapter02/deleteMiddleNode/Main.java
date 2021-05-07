package org.crackingthecodinginterview.chapter02.deleteMiddleNode;

import java.util.ArrayList;

public class Main {
    static class LinkedListNode {
        LinkedListNode next = null;
        int data;

        public LinkedListNode(int data) {
            this.data = data;
        }

        public void append(int data) {
            LinkedListNode end  = new LinkedListNode(data);
            LinkedListNode current = this;

            while(current.next != null) {
                current = current.next;
            }

            current.next = end;
        }
    }

    static void deleteMiddleNode(LinkedListNode linkedList) {
        int length = 0;

        ArrayList<LinkedListNode> pointers = new ArrayList<>();

        while (linkedList != null) {
            pointers.add(linkedList);
            length++;
            linkedList = linkedList.next;
        }

        if (length < 3) {
            throw new IllegalArgumentException("There is no middle node.");
        }

        int middle = length / 2;

        pointers.get(middle - 1).next = pointers.get(middle + 1);

        linkedList = pointers.get(0);
    }

    public static void main(String[] args) {
        LinkedListNode linkedList = new LinkedListNode(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);
        linkedList.append(7);

        deleteMiddleNode(linkedList);

        while (linkedList != null) {
            System.out.println(linkedList.data);

            linkedList = linkedList.next;
        }
    }
}
