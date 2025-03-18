package Java_Basics;

import java.util.Scanner;

public class array { //1D Array

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // // Step 1: Declare and initialize the array
    // System.out.print("Enter the size of the array: ");
    // int size = scanner.nextInt(); // Read the size of the array

    // //type[] arrayName = new type[size]          //new is a keyword in java to create and initialize objects, arrays, and collections.
    // int[] array = new int[size]; //1D Array

    // // Step 2: Read array elements
    // System.out.println("Enter " + size + " integers:");
    // for (int i = 0; i < size; i++) {
    //   array[i] = scanner.nextInt(); // Read each integer and store it in the array
    // }

    // // Print the array to verify input
    // System.out.println("Array elements:");
    // for (int i = 0; i < array.length; i++) {
    //   System.out.print(array[i] + " ");
    // }

    // for(int i : array){
    //     System.out.println(i);
    // }


    //2D Array
    // Declaring and initializing a 2D array
    //   int[][][] arr = {
    //     {
    //         {1, 2, 3}, 
    //         {4, 5, 6},
    //         {7, 8, 9}, 
    //     }
    // };
    // System.out.println("Enter rows & columns: ");
    // int rows = scanner.nextInt();
    // int cols = scanner.nextInt();

    // //Intialized the 2D matrix
    // int [][] matrix2D = new int[rows][cols];

    // System.out.println("Enter 2D Matrix Elements: ");

    // //Input Matrix
    // for (int i = 0; i < rows; i++) {
    //   for (int j = 0; j < cols; j++) {
    //     matrix2D[i][j] = scanner.nextInt();
    //   }
    // }
    // System.out.println("2D Matrix Elements are: ");
    // //Output Matrix
    // for (int i = 0; i < rows; i++) {
    //   for (int j = 0; j < cols; j++) {
    //     System.out.print(matrix2D[i][j] + " ");
    //   }
    //   System.out.println();
    // }


    //3D Array
    // Declaring and initializing a 3D array
    //   int[][][] arr = {
    //     {
    //         {1, 2, 3}, 
    //         {4, 5, 6}
    //     }, 
    //     {
    //         {7, 8, 9}, 
    //         {10, 11, 12}
    //     }, 
    //     {
    //         {13, 14, 15}, 
    //         {16, 17, 18}
    //     }
    // };
    System.out.println("Enter rows & columns: ");
    int rows = scanner.nextInt();
    int cols = scanner.nextInt();
    int slices = scanner.nextInt();

    //Intialized the 3D matrix
    int [][][] matrix3D = new int[rows][cols][slices];

    System.out.println("Enter 3D Matrix Elements: ");

    //Input Matrix
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        for (int k = 0; k < slices; k++) {
        matrix3D[i][j][k] = scanner.nextInt();
        }
      }
    }
    System.out.println("3D Matrix Elements are: ");
    //Output Matrix
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        for (int k = 0; k < slices; k++) {
          System.out.print(matrix3D[i][j][k] + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
    // Close the scanner
    scanner.close();
  }
}
