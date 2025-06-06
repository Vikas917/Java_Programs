/*
Create a class Car with the following attributes:

make - String
model - String
year - int
price - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Solution with the main method.

Implement two static methods - findMostExpensiveCar and getCarByMakeAndModel in Solution class.

findMostExpensiveCar method:
This method will take an array of Car objects as input.
The method will return the Car object with the highest price.
If the array is empty, the method should return null.

getCarByMakeAndModel method:
This method will take three input parameters - array of Car objects, make and model (both strings).
The method will return the Car object that matches the make and model attributes passed as parameters.
If no car with the given make and model is present in the array of car objects, then the method should return null.

Note: The search should be case insensitive.

These above mentioned static methods should be called from the main method.

For findMostExpensiveCar method - The main method should print the make, model, year and price of the returned Car object.
If the returned value is null then it should print "Sorry - No car is available".

For getCarByMakeAndModel method - The main method should print the year and price of the returned Car object. If the returned
value is null then it should print "Sorry - No car is available".

Before calling these static methods in main, use Scanner object to read the values of four Car objects referring attributes in
the above mentioned attribute sequence. Next, read the values for make and model.

Input:
-----------------
Mercedes
S-Class
2020
1250000
BMW
5-Series
2019
900000
Audi
A4
2022
800000
Jaguar
F-PACE
2021
1100000
Audi
A4

Output:
---------------------
Mercedes
S-Class
1250000.0
2020
2022
800000.0
 */
package Java_IPA;

import java.util.Scanner;

public class VehicleProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarV[] arr = new CarV[4];

        for (int i = 0; i < arr.length; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();
            double d = sc.nextDouble();
            sc.nextLine();

            arr[i] = new CarV(a,b,c,d);
        }
        String make = sc.nextLine();
        String model = sc.nextLine();

        CarV ans = findMostExpensiveCar(arr);
        if (ans!=null) {
            System.out.println(ans.getMake());
            System.out.println(ans.getModel());
            System.out.println(ans.getYear());
            System.out.println(ans.getPrice());
        }
        else {
            System.out.println("Sorry - No Car Availiable");
        }


        CarV res = getCarByMakeAndModel(arr,make,model);
        if (res!=null) {
            System.out.println(res.getYear());
            System.out.println(res.getPrice());
        }
        else {
            System.out.println("Sorry - No Car Availiable");
        }

    }
    public static CarV findMostExpensiveCar(CarV[] arr) {
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getPrice() > max) {
                max = arr[i].getPrice();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getPrice() == max) {
                return arr[i];
            }
        }
        return null;
    }
//        We can execute the same in one or loop also

//    public static CarV findMostExpensiveCar(CarV[] arr) {
//        if (arr == null || arr.length == 0) {
//            return null;
//        }
//
//        int maxIndex = 0; // To store the index of the most expensive car
//        double maxPrice = arr[0].getPrice(); // Assume the first car has the highest price initially
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i].getPrice() > maxPrice) {
//                maxPrice = arr[i].getPrice();
//                maxIndex = i; // Update the index of the most expensive car
//            }
//        }
//
//        return arr[maxIndex]; // Return the car with the highest price
//    }





    public static CarV getCarByMakeAndModel(CarV[] arr,String make, String model) {
        for (int i=0;i< arr.length;i++) {
            if (arr[i].getMake().equalsIgnoreCase(make) && arr[i].getModel().equalsIgnoreCase(model)) {
                return arr[i];
            }
        }
        return null;
    }
}
class CarV {
    String make;
    String model;
    int year;
    double price;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CarV(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
}