package Java_Basics;

public class Pattern {
    public static void main(String[] args) {
        // int n = 4;   
        // //Butterfly Pattern Program
        // //Upper Half
        // for (int i = 1; i <= n; i++){
        //     for (int j = 1; j <= i; j++){ //Triangle
        //         System.out.print("*"); 
        //     }
        //     int spaces = 2*(n-i);
        //     for (int j = 1; j <= spaces; j++){ //Spaces
        //         System.out.print(" "); 
        //     }
        //     for (int j = 1; j <= i; j++){//Inverted Triangle
        //         System.out.print("*"); 
        //     }
        //     System.out.println();
        // }
        // //Lower Half of Butterfly
        // for (int i = n; i >= 1; i--){
        //     for (int j = 1; j <= i; j++){ //Triangle
        //         System.out.print("*"); 
        //     }
        //     int spaces = 2*(n-i);
        //     for (int j = 1; j <= spaces; j++){ //Spaces
        //         System.out.print(" "); 
        //     }
        //     for (int j = 1; j <= i; j++){//Inverted Triangle
        //         System.out.print("*"); 
        //     }
        //     System.out.println();
        // }
        
        // int n = 5;
        // for (int i = 1; i <= n; i++){
        //     for (int j = 1; j <= n - i; j++){ //Solid Rhombus
        //         System.out.print(" "); 
        //     }
            
        //     for (int j = 1; j <= n; j++){ 
        //         System.out.print("*"); 
        //     }
        //     System.out.println();
        //}

        // int n = 5;
        // for (int i = 1; i <= n; i++){
        //     for (int j = 1; j <= n - i; j++){ //Number Pyramid
        //         System.out.print(" "); 
        //     }
            
        //     for (int j = 1; j <= i; j++){ 
        //         System.out.print(i + " "); 
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for (int i = 1; i <= n; i++){
        //     for (int j = 1; j <= n - i; j++){ //Palindrome Pyramid
        //         System.out.print(" "); 
        //     }
            
        //     for (int j = i; j >= 1; j--){ 
        //         System.out.print(j); 
        //     }
        //     for (int j = 2; j <= i; j++){ 
        //         System.out.print(j); 
        //     }
        //     System.out.println();
        // }

        // int n = 4;
        // for (int i = 1; i <= n; i++){
        //     //Spaces
        //     for (int j = 1; j <= n-i; j++){ //Diamond Pattern
        //         System.out.print(" "); 
        //     }
        //     //Stars
        //     for (int j = 1; j <= 2*i-1; j++){ //Upper Half
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for (int i = n; i >= 1; i--){
        //     //Spaces
        //     for (int j = 1; j <= n-i; j++){ //Lower Half
        //         System.out.print(" "); 
        //     }
        //     //Stars
        //     for (int j = 1; j <= 2*i-1; j++){ 
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        int n = 4;

        // Upper Half
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Stars and spaces for hollow pattern
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower Half
        for (int i = n - 1; i >= 1; i--) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Stars and spaces for hollow pattern
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
