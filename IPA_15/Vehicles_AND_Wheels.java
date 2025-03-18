package IPA_15;

import java.util.Scanner;

public class Vehicles_AND_Wheels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Value of Vehicles: ");
        int vehicles = sc.nextInt();
        System.out.println("Value of Wheels: ");
        int wheels = sc.nextInt();

        if (wheels >= 2 && wheels % 2 == 0 && vehicles < wheels) {
            int FourWheelers = ((wheels - 2 * vehicles) / 2);
            int TwoWheelers = vehicles - FourWheelers;

            System.out.println("TwoWheelers: " + TwoWheelers);
            System.out.println("FourWheelers: " + FourWheelers);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
