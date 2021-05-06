package org.crackingthecodinginterview.chapter02.returnKthToLast;

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

    static LinkedListNode returnKthToLast(LinkedListNode linkedList, int kth) {
        int length = 0;

        ArrayList<LinkedListNode> pointers = new ArrayList<>();

        while (linkedList != null) {
            pointers.add(linkedList);
            length++;
            linkedList = linkedList.next;
        }

        if (kth > length) {
            throw new IllegalArgumentException("Kth is larger than the amount of nodes in the linked list.");
        }

        int node = length - kth;

        return pointers.get(node);
    }

    public static void main(String[] args) {
        LinkedListNode linkedList = new LinkedListNode(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);

        LinkedListNode kth = returnKthToLast(linkedList, 4);

        System.out.println(kth.data);
    }
}
