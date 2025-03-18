package Java_Basics;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // 1. Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 2. put() - Inserts key-value pairs into the map
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        map.put(4, "Grapes");
        System.out.println("HashMap after put(): " + map);

        // 3. get() - Retrieve value for a given key
        String fruit = map.get(2);
        System.out.println("Value for key 2 (get()): " + fruit);

        // 4. containsKey() - Check if a key exists in the map
        boolean hasKey = map.containsKey(3);
        System.out.println("Contains key 3 (containsKey()): " + hasKey);

        // 5. containsValue() - Check if a value exists in the map
        boolean hasValue = map.containsValue("Apple");
        System.out.println("Contains value 'Apple' (containsValue()): " + hasValue);

        // 6. remove() - Remove a key-value pair by key
        map.remove(4);
        System.out.println("HashMap after remove(4): " + map);

        // 7. size() - Get the number of key-value pairs
        int size = map.size();
        System.out.println("Size of HashMap (size()): " + size);

        // 8. isEmpty() - Check if the map is empty
        boolean isEmpty = map.isEmpty();
        System.out.println("Is HashMap empty? (isEmpty()): " + isEmpty);

        // 9. keySet() - Get a set of all keys
        System.out.println("Keys in HashMap (keySet()): " + map.keySet());

        // 10. values() - Get a collection of all values
        System.out.println("Values in HashMap (values()): " + map.values());

        // 11. entrySet() - Get a set of all key-value pairs
        System.out.println("Key-Value pairs in HashMap (entrySet()): " + map.entrySet());

        // 12. replace() - Replace the value for a specific key
        map.replace(2, "Mango");
        System.out.println("HashMap after replace(2, 'Mango'): " + map);

        // 13. putIfAbsent() - Insert a key-value pair if the key is absent
        map.putIfAbsent(4, "Pineapple");
        System.out.println("HashMap after putIfAbsent(4, 'Pineapple'): " + map);

        // 14. clear() - Remove all key-value pairs from the map
        map.clear();
        System.out.println("HashMap after clear(): " + map);
    }
}
