package org.crackingthecodinginterview.chapter02.partition;

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

    static void partition(LinkedListNode linkedListNode, int partition) {
        LinkedListNode beforeStart = null;
        LinkedListNode beforeEnd = null;
        LinkedListNode afterStart = null;
        LinkedListNode afterEnd = null;

        while (linkedListNode != null) {
            LinkedListNode next = linkedListNode.next;
            linkedListNode.next = null;
            if (linkedListNode.data < partition) {
                if (beforeStart == null) {
                    beforeStart = linkedListNode;
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.next = linkedListNode;
                    beforeEnd = linkedListNode;
                }
            } else {
                if (afterStart == null) {
                    afterStart = linkedListNode;
                    afterEnd = afterStart;
                } else {
                    afterEnd.next = linkedListNode;
                    afterEnd = linkedListNode;
                }
            }
            linkedListNode = next;
        }

        if (beforeStart == null) {
            linkedListNode = afterStart;
        } else {
            beforeEnd.next = afterStart;
            linkedListNode = beforeStart;
        }
    }

    public static void main(String[] args) {
        LinkedListNode linkedList = new LinkedListNode(3);
        linkedList.append(5);
        linkedList.append(8);
        linkedList.append(5);
        linkedList.append(10);
        linkedList.append(2);
        linkedList.append(1);

        partition(linkedList, 5);
        while (linkedList != null) {
            System.out.println(linkedList.data);

            linkedList = linkedList.next;
        }
    }
}
