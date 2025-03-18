/*
Linked List Data Structure:
                            Data structure which is a linear collection of data elements, called nodes, each pointing to the next node by means of a pointer

                              A Linked List is a linear data structure where elements (nodes) are stored in a sequence, but unlike arrays,
linked lists do not store elements in contiguous memory locations. Instead, each element points to the next element in the list, forming a chain-like structure.
 */

package Java_Basics;
public class LinkedList<I extends Number> {
    Node head;
    int size=0;

    LinkedList() {
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //Adding first in the list
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
    //Adding last in the list
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    //Printing the list
    public void printList() {
        if (head == null){
            System.out.println("List is empty");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    //Deleting the first node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;

    }
    //Deleting the last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        if (head.next == null) { //For a single node
            head = null;
            return;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }
    //Reversing the list
    public void reverseIteratively() {
        if (head == null || head.next ==null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    public Node reverseRecursively(Node head) {
        if (head == null || head.next ==null) {
            return head;
        }
        Node newHead = reverseRecursively(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    public Node removeNthNodeFromEnd(Node head,int n) {
        if (head == null || head.next == null) {
            return n == 1 ? null : head;
        }

        int size = 0;
        Node curr = head;
        // Calculate the size of the list
        while (curr != null) {
            curr = curr.next;
            size++;
        }

        // If the node to remove is the first node
        if (n == size) {
            return head.next;
        }

        int indexToSearch = size - n - 1;
        Node prev = head;
        int i = 0;
        // Traverse to the node just before the one to be removed
        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }

        // Remove the nth node from the end
        prev.next = prev.next.next;
        return head;
    }

    public Node reverseHalfList(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node findMiddle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean isPalindromeLinkedList(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node middle = findMiddle(head);
        Node secondHalfStart = reverseHalfList(middle.next);

        Node firstHalfStart = head;
        while (secondHalfStart != null) {
            if (firstHalfStart.data != secondHalfStart.data) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }

    public boolean hasCycleInLL(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node rabbit = head;
        Node turtle = head;

        while (rabbit.next != null && rabbit.next.next != null) {
            rabbit = rabbit.next.next;
            turtle = turtle.next;

            if (rabbit == turtle) {
                return true;
            }
        }
        return false;
    }

    public void removeCycle(Node head) {
        Node hare = head;
        Node tortoise = head;

        // Move hare and tortoise until they meet again (where the cycle starts)
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            tortoise = tortoise.next;

            // The point where both of them are at the same place (cycle starts)
            if (hare == tortoise) {
                // Move turtle to the head
                tortoise = head;

                // Move turtle and hare one step at a time until they meet again
                while (tortoise.next != hare.next) {
                    tortoise = tortoise.next;
                    hare = hare.next;
                }

                // Break the cycle by setting the next of the node where they meet to null
                hare.next = null;
                break;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Number> list = new LinkedList<Number>();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("list");
        list.addFirst("This");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
        list.addFirst("This");
        list.addLast("List");
        list.printList();
        list.reverseIteratively();
        list.printList();
        list.head = list.reverseRecursively(list.head);
        list.printList();
        list.head = list.removeNthNodeFromEnd(list.head, 2);
        list.printList();
        list.deleteLast();
        list.printList();
        list.addLast("This");
        list.printList();
        System.out.println(list.isPalindromeLinkedList(list.head));
    }
}

