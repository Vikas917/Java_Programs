/*
1. Java-Car Management

You need to develop a Car management system using Java. The system should manage a collection of Manufacturers and cars,
where each manufacturer produces multiple cars.

Write a program that performs the following tasks.

Create a class Car with following attributes and methods.

class Car

Attributes:

cardId Integer - Unique identifier for the car

name: String - name of a car

mileage:Double - mileage of a car (in kms)

price:Double - price of a car

Methods:

1. getter and Setters
2. Parameterized Constructor

Create a class Manufacturer with following attributes and methods.

class Manufacturer

Attributes:

manufacturerId Integer - Unique identifier for the manufacturer
manufacturerName String - Name of the manufacturer
numberOfCarsProduced Integer - Number of cars produced by manufacturer
cars ArrayList - list of the cars objects

Methods:

1. getter and Setters
2. Parameterized Constructor

Relationships:

Each Manufacturer produces multiple cars
Functional Requirements

Create a class Service with below methods

Method 1:

calculateAverage Price By Manufacturer Name:

Input: A list of Manufacturer and a manufacturerName.

Output: Prints the average price of cars produced by the given manufacturer (manufacturerName).

Formula: average price= sum of price of all cars/no of cars

Format for printing the average is-"Average price of cars produced by " + manufacturer Name + " is:" average price

Exception: Throw a custom exception PriceCannot BeNegativeException if car price is negative

Exception Message "Invalid Price: car price cannot be negative."

Special Case: If no cars is produced by given manufacturer print: "No cars produced by the given manufacturer

2.Method 2:

findCarWithMaximum Mileage
https://www.hackerrank.com/test/5ts586pleio/questions/6knorfeqrk

1

Input: A List of Manufacturer

Output: Prints the name and mileage a car with maximum mileage.

Output Format: Name - Name of the car, Mileage - Mileage of the car

Note:

1. All string comparison are case sensitive.
2. Refer sample input and output

Create a public class Solution for below functionalities

1. read the inputs.

2. create a instance of service class and call the methods.

Sample input:

2

101

Tata

3 -Number of cars manufactured

1001

-No of Manufacturers

-id of manufacturer 1

-Name of manufacturer 1

-id of car 1 manufacturer 1

-name of car 1 Manufacturer 1

-mileage of car 1 manufacurer 1

Nexon

17.8

1002

1300000 price of car 1 Manufacturer 1

-id of car 2 manufacturer 1

Punch

-name of car 2 Manufacturer 1

18

mileage of car 2 manufacurer 1

800000

1003

-price of car 2 Manufacturer 1

-id of car 2 manufacturer 1

Curv

-name of car 2 Manufacturer

20

mileage of car 2 manufacurer 1

1500000

price of car 2 Manufacturer 1

102

-id of manufacturer 2

Mahindra

-Name of manufacturer 2

2

-Number of cars manufactured
201

XUV700

-name of car 1 Manufacturer 2

14

-Number of cars manufactured

-id of car 1 manufacturer 2

-mileage of car 1 manufacurer 2

1400000

-price of car 1 Manufacturer 2

202

-id of car 2 manufacturer 2

Scorpio

-name of car 2 Manufacturer 2

15 -mileage of car 2 manufacurer 2

1350000

-price of car 2 Manufacturer 2

Tata

- Manufacturer name for which average price needs to be calculated,

Sample Output:

Average price of cars produced by Tata is: 1200000.0

Name - Curv

Mileage-20.0
 */


package Java_PRA;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CarManagement {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Manufacturer> manufacturers = new ArrayList<>();
        int n = sc.nextInt();

        for(int i=0;i<n;i++) {
            int manuId = sc.nextInt();
            sc.nextLine();
            String manuName = sc.nextLine();
            int noOfCars = sc.nextInt();

            List<Car> cars = new ArrayList<>();
            for(int j=0;j<noOfCars;j++) {
                int carId = sc.nextInt();
                sc.nextLine();
                String name = sc.nextLine();
                double mileage = sc.nextDouble();
                double price = sc.nextDouble();

                cars.add(new Car(carId, name, mileage, price));
            }
            manufacturers.add(new Manufacturer(manuId, manuName, noOfCars, cars));
        }
        sc.nextLine();
        String manufName = sc.nextLine();

        ServicesList service = new ServicesList();

        try {
            service.calculateAvgPriceByManuName(manufacturers, manufName);
        }
        catch(PriceCannotBeNegativeException e) {
            System.out.println(e.getMessage());
        }
        service.findCarWithMaxMileage(manufacturers);
    }
}

class ServicesList {
    public void calculateAvgPriceByManuName(List<Manufacturer> manufacturers, String manufName) throws PriceCannotBeNegativeException {
        int total = 0, count = 0;
        String carName = "";
        for(Manufacturer m : manufacturers) {
            for(Car c : m.getCars()) {
                if (m.getManuName().equals(manufName)) {
                    if (c.getPrice() < 0) {
                        throw new PriceCannotBeNegativeException("Invalid Price: car price cannot be negative.");
                    }
                    else {
                        total += c.getPrice();
                        count++;
                        carName = m.getManuName();
                    }
                }
            }
        }
        if (count > 0) {
            System.out.println("Average price of cars produced by " + carName + " is: " + (double)total/count);
        }
        else {
            System.out.println("No cars produced by the given manufacturer.");
        }

    }

    public void findCarWithMaxMileage(List<Manufacturer> manufacturers) {
        double maxMileage = Integer.MIN_VALUE;
        String car = "";

        for(Manufacturer m : manufacturers) {
            for(Car c : m.getCars()) {
                if (maxMileage < c.getMileage()) {
                    maxMileage = c.getMileage();
                    car = c.getName();
                }
            }
        }
        System.out.println("Name - " + car);
        System.out.println("Mileage - " + maxMileage);
    }
}

class Car {
    int carId;
    String name;
    double mileage, price;

    public Car(int carId, String name, double mileage, double price) {
        this.carId = carId;
        this.name = name;
        this.mileage = mileage;
        this.price = price;
    }

    public int getCarId() {
        return carId;
    }
    public String getName() {
        return name;
    }
    public double getMileage() {
        return mileage;
    }
    public double getPrice() {
        return price;
    }
}

class Manufacturer {
    int manuId, noOfCars;
    String manuName;
    List<Car> cars;

    public Manufacturer(int manuId, String manuName, int noOfCars, List<Car> cars) {
        this.manuId = manuId;
        this.manuName = manuName;
        this.noOfCars = noOfCars;
        this.cars = cars;
    }

    public int getManuId() {
        return manuId;
    }
    public String getManuName() {
        return manuName;
    }
    public int getNoOfCars() {
        return noOfCars;
    }
    public List<Car> getCars() {
        return cars;
    }
}

class PriceCannotBeNegativeException extends Exception {
    public PriceCannotBeNegativeException(String message) {
        super(message);
    }
}
