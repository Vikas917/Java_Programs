package Java_Basics;

public class DoublyCircularLinkedList {
    public static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void displayList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void displayListFromTail(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("NULL");
    }
    public static void displayListFromRandom(Node random) {
        Node temp = random;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static Node insertionAtHead(Node head,int index) {
        Node t = new Node(30);
        t.next = head;
        head.prev = t;
        head = t;

        return head;
    }
    public static Node insertionAtTail(Node head,int x) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        Node t = new Node(x);

        temp.next = t;
        t.prev = temp;

        return head;
    }
    public static boolean isPalindrome(Node head) {
        // Edge case: empty or single element list is a palindrome
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Traverse to the end of the list to get the tail
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        // Step 2: Compare elements from the start (head) and end (tail)
        while (head != tail && head.prev != tail) {
            if (head.data != tail.data) {
                return false;
            }
            head = head.next;
            tail = tail.prev;
        }

        // If all checks passed, the list is a palindrome
        return true;
    }
    public static Node insertAtGivenIndex(Node head,int index,int x) {
        Node s = head;
        for (int i=1;i<=index-1;i++) {
            s = s.next;
        }
        //  s is now at index-1 position
        Node r = s.next;
        Node t = new Node(x);
        s.next = t;
        s.prev = s;
        t.next = r;
        r.prev = t;

        return head;
    }
    //Deletion
    public static Node deleteAtHead(Node head) {
        // If the list is empty, return null
        if (head == null) {
            return null;
        }

        // Move the head pointer to the next node
        head = head.next;

        // If the new head is not null, update its prev pointer
        if (head != null) {
            head.prev = null;
        }

        return head;
    }
    public static Node deleteAtTail(Node head) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp = temp.prev;
        temp.next = null;

        return head;
    }

    public static void main(String[] args) {
        //  1  <-> 2 <-> 3 <-> 4 <-> 5
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(4);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

//        displayList(a);
//        deleteAtTail(a);
//        displayList(a);
//        displayList(a);
//        displayListFromTail(e);
//        displayListFromRandom(c);
//        Node newNode = insertionAtHead(a,40);
//        displayList(newNode);
//        Node tail = insertionAtTail(a,60);
//        displayList(tail);
//        Node ind = insertAtGivenIndex(a,3,40);
//        displayList(a);
        displayList(a);
        System.out.println(isPalindrome(a));
    }
}
