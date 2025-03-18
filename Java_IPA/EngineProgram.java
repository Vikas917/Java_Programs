/*
Create a class Engine with the below attributes:

engineld – int
engineName – String
engine Type – String
enginePrice – double

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class MyClass with main method.

Implement two static methods – findAvgEnginePriceByType and searchEngineByName in MyClass class.

findAvgEnginePriceByType method: This method will take two input parameters Engine objects and String parameter.
The method will return the average price of Engines from array of Engine objects for the given engine type
(String parameter passed). If no Engine with the given type is present in the array of Engine objects, then the method
should return 0.


searchEngineByName method: This method will take a String parameter and an array of Engine objects as the other parameter.
The method will return Engine object array in an ascending order of their engine ids, from the array of Engine objects whose
name attribute matches with the given engine name (String parameter passed). If no Engine with the given name is present in
the array of Engine objects, then the method should return null.

Note: No two Engine object would have the same engine id.

All searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For findAvgEnginePriceByType method: The main method should print the average enginePrice of Engines as it is, if the returned
value is greater than 0, or it should print “There are no engine with given type”.

For searchEngineByName method: The main method should print the engineld from the returned Engine object array if the returned
value is not null. If the returned value is null, then it should print “There are no engine with the given name”.

Before calling these static methods in main, use Scanner object to read the values of four Engine objects referring attributes
in the above mentioned attribute sequence. next, read the value of two String parameters for capturing engine type and engine
name respectively.

Input :

1001
Maruti
Diesel
20000
1002
Kia
Pertro
17000
1003
Hyundai
Diesel
24000
1000
Maruti
Petrol
27500
Petrol
Maruti

Output :

27500
1000
1001
 */
package Java_IPA;

import java.util.Arrays;
import java.util.Scanner;

public class EngineProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Engine[] arr = new Engine[4];

        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();

            arr[i] = new Engine(a,b,c,d);
        }
        String type = sc.nextLine();
        String name = sc.nextLine();

        int res = findAvgEnginePriceByType(arr,type);
        if (res > 0) {
            System.out.println(res);
        }
        else {
            System.out.println("There are no engine with given type");
        }

        Engine[] ans = searchEngineByName(arr, name);
        if (ans != null) {
            for (int i=0;i<ans.length;i++) {
                System.out.println(ans[i].getEngineId());
            }
        }
        else {
            System.out.println("There are no engine with given name");
        }
    }

    public static int findAvgEnginePriceByType(Engine[] arr, String type) {
        int sum = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getEngineType().equalsIgnoreCase(type)) {
                sum += arr[i].getEnginePrice();
                count++;
            }
        }
        if (sum > 0) {
            return sum / count;
        }
        else {
            return 0;
        }
    }

    public static Engine[] searchEngineByName(Engine[] arr, String name) {
        Engine[] engines = new Engine[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getEngineName().equalsIgnoreCase(name)) {
                engines = Arrays.copyOf(engines,engines.length+1);
                engines[engines.length-1] = arr[i];
            }
        }
        for (int i = 0; i < engines.length-1; i++) {
            for (int j = 1; j < engines.length; j++) {
                if (engines[i].getEngineId()  > engines[j].getEngineId()) {
                    Engine e = engines[i];
                    engines[i] = engines[j];
                    engines[j] = e;
                }
            }
        }
        if (engines.length > 0) {
            return engines;
        }
        else {
            return null;
        }
    }
}
class Engine {
    int engineId;
    String engineName;
    String engineType;
    double enginePrice;

    public int getEngineId() {
        return engineId;
    }

    public void setEngineId(int engineId) {
        this.engineId = engineId;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getEnginePrice() {
        return enginePrice;
    }

    public void setEnginePrice(double enginePrice) {
        this.enginePrice = enginePrice;
    }

    public Engine(int engineld, String engineName, String engineType, double enginePrice) {
        this.engineId = engineld;
        this.engineName = engineName;
        this.engineType = engineType;
        this.enginePrice = enginePrice;
    }
}
