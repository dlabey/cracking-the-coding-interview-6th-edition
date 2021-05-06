package org.crackingthecodinginterview.chapter02.removeDups;

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

    static void removeDups(LinkedListNode linkedList) {
        ArrayList<Integer> uniqueData = new ArrayList<>();
        LinkedListNode previousNode = null;

        while (linkedList != null) {
            if (uniqueData.contains(linkedList.data)) {
                previousNode.next = linkedList.next;
                linkedList = previousNode;
            } else {
                uniqueData.add(linkedList.data);
                previousNode = linkedList;
            }

            linkedList = linkedList.next;
        }
    }

    public static void main(String[] args) {
        LinkedListNode linkedList = new LinkedListNode(1);
        linkedList.append(2);
        linkedList.append(2);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        removeDups(linkedList);
        while (linkedList != null) {
            System.out.println(linkedList.data);

            linkedList = linkedList.next;
        }
    }
}
