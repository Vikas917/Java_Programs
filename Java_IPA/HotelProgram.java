/*
Create a class Hotel with the below attributes:

hotelId - int
hotelName - String
dateOfBooking – String (in the format dd-mon-yyyy)
noOfRoomsBooked – int
wifiFacility – String
totalBill- double



The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.

Implement two static methods – noOfRoomsBookedInGivenMonth and searchHotelByWifiOption in Solution class.

noOfRoomsBookedInGivenMonth method:
This method will take two input parameter - array of Hotel objects and a String parameter.
The method will return the total numbers of rooms booked from array of Hotel objects for the given month(String parameter passed).
If no rooms are booked for the given month in the array of Hotel objects, then the method should return 0.



searchHotelByWifiOption method:
This method will take two input parameter - array of Hotel objects and a String parameter
The method will return Hotel object with second highest totalbill, from the array of Hotel objects where wifiFacility attribute
matches with the given wifi facility(String parameter passed).
If no Hotel with the given wifi option is present in the array of Hotel objects, then the method should return null.

Note :
No two Hotel object would have the same hotelId.
No two Hotel object would have the same totalbill.
The Array either has at least two objects with specified wifi option OR  no object with specified wifi option.
All the searches should be case insensitive.
dateOfBooking is stored in the format dd-mon-yyyy(eg. 01-Jan-2022)

The above mentioned static methods should be called from the main method.

For noOfRoomsBookedInGivenMonth method - The main method should print the total number of booked rooms as it is,
if the returned value is greater than 0, else it should print "No rooms booked in the given month"

For searchHotelByWifiOption method - The main method should print the hotelId from the returned Hotel object if the returned value is not null.
If the returned value is null then it should print "No such option available".

Before calling these static methods in main, use Scanner object to read the values of four Hotel objects referring attributes in the above mentioned attribute sequence.
Next, read the value of two String parameters for capturing the month and wifi option .



Consider below sample input and output:


Input1:
101
Best Stay
01-jan-2022
10
Yes
20000
102
Apple Stay
12-Feb-2022
3
Yes
4000
103
Accord
11-May-2022
5
Yes
15000
104
Royal Park
22-Dec-2021
7
Yes
12000
May
Yes

Output1:
5
103



Input2:
101
Best Stay
01-jan-2022
10
Yes
20000
102
Apple Stay
12-Feb-2022
3
Yes
4000
103
Accord
11-May-2022
5
Yes
15000
104
Royal Park
22-Dec-2021
7
Yes
12000
May1
Yes1



Output2:
No rooms booked in the given month
No such option available

 */
package Java_IPA;

import java.util.Arrays;
import java.util.Scanner;

public class HotelProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel[] arr = new Hotel[4];
        for (int i = 0; i < arr.length; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            String e = sc.nextLine();
            double f = sc.nextDouble();sc.nextLine();

            arr[i] = new Hotel(a,b,c,d,e,f);
        }
        String month = sc.nextLine();
        String wifi = sc.nextLine();

        int ans = noOfRoomsBookedInGivenMonth(arr,month);
        if (ans > 0) {
            System.out.println(ans);
        }
        else {
            System.out.println("No rooms booked in the given month");
        }
        int res = searchHotelByWifiOption(arr, wifi);
        if (res > 0) {
            System.out.println(res);
        }
        else {
            System.out.println("No such option available");
        }


    }
    public static int noOfRoomsBookedInGivenMonth(Hotel[] arr,String month) {
        int total = 0;
        for (int i=0;i< arr.length;i++) {
//            String[] months = arr[i].getDateOfBooking().split("-");
//            if (months[1].equalsIgnoreCase(month)) {
            if (arr[i].getDateOfBooking().contains(month)) {
                total += arr[i].getNoOfRoomsBooked();
            }
        }
        return total;
    }

    public static int searchHotelByWifiOption(Hotel[] arr, String wifi) {
        Hotel[] hotels = new Hotel[0];
        for (int i=0;i< arr.length;i++) {
            if (arr[i].getWifiFacility().equalsIgnoreCase(wifi)) {
                hotels = Arrays.copyOf(hotels,hotels.length+1);
                hotels[hotels.length-1]  = arr[i];

            }
        }
        for (int i=0;i< hotels.length-1;i++) {
            for (int j=i+1;j<hotels.length;j++) {
                if (hotels[i].getTotalBill() < hotels[j].getTotalBill()) {
                    Hotel h = hotels[i];
                    hotels[i] = hotels[j];
                    hotels[j] = h;
                }
            }
        }
        if (hotels.length > 0) {
            return hotels[1].getHotelId();
        }
        return 0;
    }
}
class Hotel {
    int hotelId;
    String hotelName;
    String dateOfBooking;
    int noOfRoomsBooked;
    String wifiFacility;
    double totalBill;

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(String dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }

    public void setNoOfRoomsBooked(int noOfRoomsBooked) {
        this.noOfRoomsBooked = noOfRoomsBooked;
    }

    public String getWifiFacility() {
        return wifiFacility;
    }

    public void setWifiFacility(String wifiFacility) {
        this.wifiFacility = wifiFacility;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    public Hotel(int hotelId, String hotelName, String dateOfBooking, int noOfRoomsBooked, String wifiFacility, double totalBill) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.wifiFacility = wifiFacility;
        this.totalBill = totalBill;
    }
}
