package Java_Basics;

import java.util.LinkedList;
public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("This");
        list.add("is");
        list.add("a");
        list.addLast("list");
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.remove();
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        System.out.println(list.size());
    }
}
