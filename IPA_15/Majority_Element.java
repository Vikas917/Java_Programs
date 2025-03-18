package IPA_15;

import java.util.ArrayList;
import java.util.HashMap;

public class Majority_Element {
    // Method to find the majority element (appearing more than n/2 times)
    public static int majorityElem(int[] a) {
        int count = 0;
        int elem = 0;

        // Boyer-Moore Voting Algorithm
        for (int i = 0; i < a.length; i++) {
            if (count == 0) {
                elem = a[i];
                count = 1;
            } else if (a[i] == elem) {
                count++;
            } else {
                count--;
            }
        }

        // Verify if the element is indeed the majority
        int cnt1 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == elem) {
                cnt1++;
            }
        }

        if (cnt1 > (a.length / 2)) {
            return elem;
        }
        return -1; // No majority element
    }

    // Method to find elements appearing more than n/3 times
    public static ArrayList<Integer> majorityElement3(int[] v) {
        ArrayList<Integer> ls = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int nl = v.length;
        int mini = nl / 3 + 1;

        // Fill the map with element counts
        for (int i = 0; i < nl; i++) {
            map.put(v[i], map.getOrDefault(v[i], 0) + 1);
            if (map.get(v[i]) == mini && !ls.contains(v[i])) {
                ls.add(v[i]);
            }
            if (ls.size() == 2) break; // We are only interested in at most 2 elements
        }

        return ls; // Return the list of elements
    }

    public static void main(String[] args) {
        // Test case for majority element (> n/2 times)
        int[] a = {1, 2, 3, 2, 3, 3, 2, 3, 3};
        System.out.println("Majority Element (> n/2): " + majorityElem(a));

        // Test case for elements appearing more than n/3 times
        int[] v = {1, 2, 3, 2, 3, 3, 2, 3, 3, 2, 2};
        System.out.println("Majority Elements (> n/3): " + majorityElement3(v));
    }
}
