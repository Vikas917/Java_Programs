package Java_Basics;

public class StringFunctions {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // 1. length()
        int length = str.length();
        System.out.println("Length of the string: " + length); // Output: Length of the string: 13
        
        
        // 2. charAt(int index)
        char ch = str.charAt(7);
        System.out.println("Character at index 7: " + ch); // Output: Character at index 7: W
        
        
        // 3. substring(int beginIndex)
        String substr1 = str.substring(7);
        System.out.println("Substring starting from index 7: " + substr1); // Output: Substring starting from index 7: World!
        
        
        // 4. substring(int beginIndex, int endIndex)
        String substr2 = str.substring(7, 12);
        System.out.println("Substring from index 7 to 11: " + substr2); // Output: Substring from index 7 to 11: World
        
        
        // 5. contains(CharSequence s)
        boolean contains = str.contains("World");
        System.out.println("Contains 'World': " + contains); // Output: Contains 'World': true
        
        
        // 6. equals(Object another)
        String str1 = "Hello";
        String str2 = "Hello";
        boolean isEqual = str1.equals(str2);
        System.out.println("Strings are equal: " + isEqual); // Output: Strings are equal: true
        
        
        // 7. equalsIgnoreCase(String another)
        String str3 = "hello";
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str3);
        System.out.println("Strings are equal ignoring case: " + isEqualIgnoreCase); // Output: Strings are equal ignoring case: true
        
        
        // 8. compareTo(String another)
        String str4 = "apple";
        String str5 = "banana";
        int comparison = str4.compareTo(str5);
        System.out.println("Comparison result: " + comparison); // Output: Comparison result: -1
        
        
        // 9. toLowerCase()
        String lower = str.toLowerCase();
        System.out.println("Lowercase string: " + lower); // Output: Lowercase string: hello, world!
        
        
        // 10. toUpperCase()
        String upper = str.toUpperCase();
        System.out.println("Uppercase string: " + upper); // Output: Uppercase string: HELLO, WORLD!
        
        
        // 11. trim()
        String str6 = "   Hello, World!   ";
        String trimmed = str6.trim();
        System.out.println("Trimmed string: '" + trimmed + "'"); // Output: Trimmed string: 'Hello, World!'
        
        
        // 12. replace(char oldChar, char newChar)
        String replaced = str.replace('o', '0');
        System.out.println("Replaced string: " + replaced);      // Output: Replaced string: Hell0, W0rld!
        
        
        // 13. replaceAll(String regex, String replacement)
        String replacedAll = str.replaceAll("World", "Java");
        System.out.println("Replaced string: " + replacedAll);                 // Output: Replaced string: Hello, Java!
        
        
        // 14. split(String regex)
        String str7 = "apple,banana,cherry";
        String[] fruits = str7.split(",");
        System.out.println("Split string:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        // Output:
        // Split string:
        // apple
        // banana
        // cherry
        
        // 15. indexOf(String str)
        int index = str.indexOf("World");
        System.out.println("Index of 'World': " + index); // Output: Index of 'World': 7
        
        
        // 16. lastIndexOf(String str)
        String str8 = "Hello, World! World!";
        int lastIndex = str8.lastIndexOf("World");
        System.out.println("Last index of 'World': " + lastIndex); // Output: Last index of 'World': 14
        
        
        // 17. startsWith(String prefix)
        boolean starts = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + starts); // Output: Starts with 'Hello': true
        
        
        // 18. endsWith(String suffix)
        boolean ends = str.endsWith("World!");
        System.out.println("Ends with 'World!': " + ends); // Output: Ends with 'World!': true
        
        
        // 19. isEmpty()
        String str9 = "";
        boolean isEmpty = str9.isEmpty();
        System.out.println("Is string empty: " + isEmpty); // Output: Is string empty: true
        
        
        // 20. join(CharSequence delimiter, CharSequence... elements)
        String joined = String.join("-", "2024", "08", "29","11:30");
        System.out.println("Joined string: " + joined);            // Output: Joined string: 2024-08-29
        
    }
}
