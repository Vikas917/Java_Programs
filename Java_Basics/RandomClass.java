package Java_Basics;

import java.util.*;

//static void RockPaperScissors(int n) {
//        if ()
//
//}
public class RandomClass {
    public static void main(String[] args) {
        /*
        // Create an instance of Random
        Random random = new Random();

        // Generate a random integer
        int randomInt = random.nextInt();
        System.out.println("Random Integer: " + randomInt);

        // Generate a random integer between 0 (inclusive) and a given bound (exclusive)
        int boundInt = random.nextInt(100);  // Range: 0 to 99
        System.out.println("Random Integer (0-99): " + boundInt);

        // Generate a random long
        long randomLong = random.nextLong();
        System.out.println("Random Long: " + randomLong);

        // Generate a random float between 0.0 and 1.0
        float randomFloat = random.nextFloat();
        System.out.println("Random Float: " + randomFloat);

        // Generate a random double between 0.0 and 1.0
        double randomDouble = random.nextDouble();
        System.out.println("Random Double: " + randomDouble);

        // Generate a random boolean
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random Boolean: " + randomBoolean);

        // Generate a random Gaussian (normally distributed) double with mean 0 and stddev 1
        double randomGaussian = random.nextGaussian();
        System.out.println("Random Gaussian: " + randomGaussian);

        // Generate a stream of random integers (Java 8+)
        System.out.println("Random Integer Stream:");
        random.ints(5, 0, 100).forEach(System.out::println);  // 5 random integers between 0 and 99
        */



        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r for Rock, p for Paper & s for Scissors: ");
        String userInput = sc.nextLine().toLowerCase();  // Convert input to lowercase to make it case-insensitive
        int computerInput = random.nextInt(3);

// Check the user's input based on the first letter
        if (userInput.charAt(0) == 'r') {
            if (computerInput == 2) {
                System.out.println("You Won because computer input was Scissors");
            } else if (computerInput == 0) {
                System.out.println("It's a Draw because computer input was Rock");
            } else {
                System.out.println("Computer Won because computer input was Paper");
            }
        } else if (userInput.charAt(0) == 'p') {
            if (computerInput == 0) {
                System.out.println("You Won because computer input was Rock");
            } else if (computerInput == 1) {
                System.out.println("It's a Draw because computer input was Paper");
            } else {
                System.out.println("Computer Won because computer input was Scissors");
            }
        } else if (userInput.charAt(0) == 's') {
            if (computerInput == 1) {
                System.out.println("You Won because computer input was Paper");
            } else if (computerInput == 2) {
                System.out.println("It's a Draw because computer input was Scissors");
            } else {
                System.out.println("Computer Won because computer input was Rock");
            }
        } else {
            System.out.println("Invalid input! Please enter 'r', 'p', or 's'.");
        }

// Print the computer's choice
        if (computerInput == 0) System.out.println("Computer chose Rock");
        if (computerInput == 1) System.out.println("Computer chose Paper");
        if (computerInput == 2) System.out.println("Computer chose Scissors");


    }
}
