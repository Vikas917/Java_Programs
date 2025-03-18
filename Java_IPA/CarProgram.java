/*
Create a class Car with the below attributes:

carId – int
carName – String
fuelType – String

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class RemoveCar with main method.

Implement two static methods – RemoveAndRearrange in RemoveCar class.

RemoveAndRearrange method:
This method will take int input parameter. The method will return the new array of Car object and remove that car whose
id is match with the input parameter. Remove the car details and return the array with continuous new ids.

If no car with the given id is present in the array of Car objects, then the method should return null.

Note: No two Car object would have the same engine id.

The above mentioned static methods should be called from the main method.

For RemoveAndRearrange method: The main method should print the id and car name as it is, if the returned
value is not null, or it should print “There are no car with given id”.

Before calling these static methods in main, use Scanner object to read the values of five objects referring attributes
in the above mentioned attribute sequence. next, read the value of int parameters for capturing car id.

Input :

1001
Maruti
Diesel
1002
Kia
Petrol
1003
Hyundai
Diesel
1004
Taxi
Petrol
1005
Truck
Diesel
1003

Output :

1001 : Maruti
1002 : Kia
1003 : Hyundai
1004 : Taxi
 */
package Java_IPA;

import java.util.Scanner;

public class CarProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cars[] arr = new Cars[5];

        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();

            arr[i] = new Cars(a,b,c);
        }
        int ids = sc.nextInt();sc.nextLine();

        Cars[] res = RemoveAndRearrange(arr,ids);
        if (res != null) {
            for (int i=0;i< res.length;i++) {
                System.out.println(res[i].getCarId() + ":" +res[i].getCarName());
            }
        }
        else {
            System.out.println("There are no car with given id");
        }

    }
    public static Cars[] RemoveAndRearrange(Cars[] arr, int id) {
        int n = arr.length;
        boolean found = false;
        Cars[] newCars = new Cars[n - 1];
        int newIndex = 0;

        // Find and remove the car with the given carId
        for (int i = 0; i < n; i++) {
            if (arr[i].getCarId() == id) {
                found = true;  // Car found and skipped
                continue;
            }
            if (newIndex < newCars.length) {
                newCars[newIndex] = arr[i];
                newCars[newIndex].setCarId(newIndex + 1001);  // Assign continuous new ids
                newIndex++;
            }
        }

        if (!found) {
            return null;  // If car with the given id not found
        }

        return newCars;  // Return the array with car removed and ids updated
    }
}
class Cars {
    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Cars(int carId, String carName, String fuelType) {
        this.carId = carId;
        this.carName = carName;
        this.fuelType = fuelType;
    }

    int carId;
    String carName;
    String fuelType;
}