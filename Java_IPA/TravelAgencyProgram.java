package Java_IPA;

import java.util.Objects;
import java.util.Scanner;

public class TravelAgencyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TravelAgencies[] arr = new TravelAgencies[4];
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            boolean e = sc.nextBoolean();

            arr[i] = new TravelAgencies(a,b,c,d,e);
        }
        int regNo = sc.nextInt();sc.nextLine();
        String packageType = sc.nextLine();


        int max = findAgencyWithHighestPackagePrice(arr);
        System.out.println(max);

        TravelAgencies result = agencyDetailsForGivenIdAndType(arr,regNo,packageType);
        assert result != null;
        System.out.println(result.getAgencyName() + ":" + result.getPrice());

    }
    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] arr) {
        int maxPackage = arr[0].getPrice();
        for (int i = 1; i < arr.length; i++) {
            if(maxPackage < arr[i].getPrice()) {
                maxPackage = arr[i].getPrice();
            }
        }
        if (maxPackage < 0){
            return 0;
        }
        else {
            return maxPackage;
        }
    }
    public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] arr,int regNo,String packageType) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].isFlightFacility()) {
                if (arr[i].getRegNo() == regNo && arr[i].getPackageName().equalsIgnoreCase(packageType)) {
                    return arr[i];
                }
            }
        }
        return null;
    }
}
class TravelAgencies {
    private int regNo;
    private String agencyName;
    private String packageName;
    private int price;
    private boolean flightFacility;

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }

    public void setFlightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }

    public TravelAgencies(int regNo, String agencyName, String packageName, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageName = packageName;
        this.price = price;
        this.flightFacility = flightFacility;
    }
}
/*
Create a class TravelAgencies with below attributes:

regNo – int
agencyName – String
pakageType – String
price – int
flightFacility – boolean

Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence.

Create class Solution with main method. Implement two static methods – findAgencyWithHighestPackagePrice and
agencyDetailsforGivenIdAndType in Solution class.

findAgencyWithHighestPackagePrice method:

This method will take array of TravelAgencies objects as an input parameter and return the highest package
price from the given array of objects.

agencyDetailsForGivenldAndType method:

This method will take three input parameters -array of TravelAgencies objects, int parameter regNo and String
parameter packageType. The method will return the TravelAgencies object based on below conditions.

FlightFacility should be available.
The input parameters(regNo and packageType) should matched with the regNo and packageType of TravelAgencies object.
If any of the above conditions are not met, then the method should return null. Note : Same Travel agency can
have more than one package type. Travel agency and package type combination is unique. All the searches should
be case insensitive.

The above mentioned static methods should be called from the main method.


For findAgencyWithHighestPackagePrice method – The main method should print the highestPackagePrice as it is.
For agencyDetailsForGivenldAndType method -The main method should print the AgencyName and price of the returned
object.The AgencyName and price should be concatinated with : while printing.
---------
Input
---------
123
A2Z Agency
Platinum
50000
true
345
SSS Agency
Gold
30000
false
987
Cox and Kings
Diamond
40000
true
888
Global Tours
Silver
20000
false
987
Diamond
-------------------------------
Output
-------------------------------
50000
Cox and Kings:40000
 */
