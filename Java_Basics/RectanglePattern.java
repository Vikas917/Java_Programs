package Java_Basics;

class RectanglePattern{
    public static void main(String[] args){
        
        // int m = 4; //Row
        // int n = 4; //Column

        // for (int i = 0; i < m; i++){
        //     for (int j = 0; j < n; j++){
        //         System.out.print("* "); //Solid Rectangle Program
        //     }
        //     System.out.println();
        // }

        int m = 4; //Row
        int n = 5; //Column

        for (int i = 1; i <= m; i++){
            for (int j = 1; j <= n; j++){
                if(i == 1 || j == 1 || i == m || j == n ){
                    System.out.print("*"); //Holid Rectangle Program
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        // int n = 6; // Change n as needed
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i == j || i + j == n + 1) { // X Star Pattern
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  "); // Two spaces for alignment
        //         }
        //     }
        //     System.out.println(); // Move to the next line after each row
        // }

        // int n = 6; // Change n as needed
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i == j || i + j == n + 1 || j == 1 || j == n) { // Hollow Butterfly Pattern
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  "); // Two spaces for alignment
        //         }
        //     }
        //     System.out.println(); // Move to the next line after each row
        // }
    }
}