/*
Create a class NavalVessel with the below attributes:

vesselld – int
vesselName – String
noOfVoyagesPlanned – int
noOfVoyagesCompleted – int
purpose – String


Write getters, setters for the above attributes. Create constructor which takes parameter in the above
sequence except classification.

Create class Solution with main method. Implement two static methods – findAvgVoyagesByPct and findVesselByGrade
in Solution class.

findAvgVoyagesByPct method:

This method will take two input parameters -array of NavalVessel objects and int parameter percentage. The method will
return the average of the noOfVoyagesCompleted attribute from NavalVessel objects which meets the percentage requirement
as mentioned below.The percentage for each navalVessel is calculated as
percentage = (noOfVoyagesCompleted * 100)/noOfVoyagesPlanned. If the above calculated percentage is greater than or equal
to the percentage passed as the parameter, then those objects should participate in the average calculation. If there are
no objects with the mentioned criteria, then the method should return 0.

findVesselByGrade method:

This method will take a String parameter purpose, along with the array of NavalVessel objects. The method will return the
NavalVessel object, if the input String parameter matches with the purpose attribute of the NavalVessel object. Before
returning the object, the classification should be derived as mentioned below. This classification value should be assigned
to the object before returning. If any of the above conditions are not met, then the method should return null. The
classification attribute should be calculated based on the percentage calculation mentioned above.

If the percentage = 100 then classification should be ‘Star’, if percentage is between 99 and 80 then classification should
be ‘Leader, if percentage is between 79 and 55 then classification should be ‘Inspirer' otherwise the classification should
be ‘Striver’ If the returned value is null then it should print “No Naval Vessel is available with the specified purpose”.

Before calling these static methods in main, use Scanner object to read the values of four NavalVessel objects referring
attributes in the above mentioned attribute sequence (except the classification attribute). Next, read the value for
percentage and purpose.

Input
-------------------
111
Rojer
100
100
Passenger
222
Kalam
200
100
Goods
333
Yashwin
400
300
Army
444
Thanishwini
500
500
Welfare
75
Army

Output
------------------
300
Yashwin%Inspirer
 */
package Java_IPA;

import java.util.Arrays;
import java.util.Scanner;

public class NavelVessel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vessel[] arr = new Vessel[4];
        for (int i = 0;i < arr.length;i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new Vessel(a,b,c,d,e);
        }
        int percentage = sc.nextInt();sc.nextLine();
        String purpose = sc.nextLine();

        //Calling the methods
        int res = findAvgVoyagesByPct(arr, percentage);
        if (res > 0) {
            System.out.println(res);
        }
        else {
            System.out.println(0);
        }

        Vessel[] res2 = findVesselByGrade(arr, purpose);
        if (res2 != null) {
            for (int i = 0; i < res2.length;i++) {
                percentage = res2[i].getNoOfVoyagesCompleted() * 100 / res2[i].getNoOfVoyagesPlanned();
                if (percentage == 100) {
                    System.out.println(res2[i].getVesselName() + "%Star");
                } else if (percentage >= 99 && percentage <= 80) {
                    System.out.println(res2[i].getVesselName() +"%leader");
                } else if (percentage >= 79 && percentage <= 55) {
                    System.out.println(res2[i].getVesselName() +"%Inspirer");
                }
                else {
                    System.out.println(res2[i].getVesselName() +"%striver");
                }
            }
        }
        else {
            System.out.println("No Naval Vessel is available with the specified purpose");
        }
    }
    //Method - 1
    public static int findAvgVoyagesByPct(Vessel[] arr, int percentage) {
        int sum = 0, count = 0;
        for (int i = 0;i < arr.length;i++) {
            if ( (arr[i].getNoOfVoyagesCompleted() * 100 / arr[i].getNoOfVoyagesPlanned()) >= percentage) {
                sum += arr[i].noOfVoyagesCompleted;
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
    //Method - 2
    public static Vessel[] findVesselByGrade(Vessel[] arr, String purpose) {
        Vessel[] arr2 = new Vessel[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getPurpose().equalsIgnoreCase(purpose)) {
                arr2 = Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1] = arr[i];
            }
        }
        if (arr2.length > 0) {
            return arr2;
        }
        else {
            return null;
        }
    }
}
class Vessel {
    int vesselId;
    String vesselName;
    int noOfVoyagesPlanned;
    int noOfVoyagesCompleted;
    String purpose;

    public Vessel(int vesselId, String vesselName, int noOfVoyagesPlanned, int noOfVoyagesCompleted, String purpose) {
        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
        this.purpose = purpose;
    }

    public int getVesselId() {
        return vesselId;
    }

    public void setVesselId(int vesselId) {
        this.vesselId = vesselId;
    }

    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public int getNoOfVoyagesPlanned() {
        return noOfVoyagesPlanned;
    }

    public void setNoOfVoyagesPlanned(int noOfVoyagesPlanned) {
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
    }

    public int getNoOfVoyagesCompleted() {
        return noOfVoyagesCompleted;
    }

    public void setNoOfVoyagesCompleted(int noOfVoyagesCompleted) {
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}