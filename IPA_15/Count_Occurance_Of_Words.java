package IPA_15;

import java.util.*;

public class Count_Occurance_Of_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().replace(" ","");
//        String str = "Hello World";
//        str.replace(" ","");
        LinkedHashMap<Character,Integer> count = new LinkedHashMap<>();

        for (int i=0;i<str.length();i++) {
            if (!count.containsKey(str.charAt(i))) {
                count.put(str.charAt(i),1);
            }
            else {
                count.put(str.charAt(i),count.get(str.charAt(i))+1);
            }
        }

// To modify your code to use a HashMap instead of a LinkedHashMap, you can replace the LinkedHashMap with a HashMap.
// The difference is that HashMap does not maintain insertion order, while LinkedHashMap does.

//        HashMap<Character, Integer> count = new HashMap<>();  // Using HashMap
//
//        // Iterating through the string to count occurrences
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            count.put(ch, count.getOrDefault(ch, 0) + 1);
//        }

        for (HashMap.Entry<Character,Integer> data : count.entrySet()) {
            System.out.println(data.getKey() + " : " + data.getValue());
        }
    }
}
/* Using LinkedHashMap -

hello world
h : 1
e : 1
l : 3
o : 2
w : 1
r : 1
d : 1


Using HashMap -

hello world
r : 1
d : 1
e : 1
w : 1
h : 1
l : 3
o : 2
 */
