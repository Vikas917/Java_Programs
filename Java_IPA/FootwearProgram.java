/*
create a class Footwear which consists of the below attributes.
  footwearId=int
  footwearName=String
  footwearType=String
  price =int

the above attributes should be private.
write getter and setter and parametrised constructor as required.

create the class footwearProgrammm with the main method.
implement the 2 static methods.getCountByType and
getSecondHighestPriceByBrand in the Solution class.


getCountByType method:
            this method will take two input parameters - array of the Footwear objects and string parameter footwear type.
this method will return the count of the footwears from array of the footwear objects for the given type of footwear.
if no footwear with the given footwear type is found in the array of footwear abjects,then the method should return 0.



getSecondHighestPriceByBrand method:
  this method will take 2 input parameters-array of footwear objects and string parameter inputFootwearName.the method
will return the second highest footwear objects based on the price from the array of the Footwear objects
whose brand name matches with the input string parameter.

if no footwear with the given brand is present in the array of the footwear objects, the method should return null.

NOTE: no two footwear objects would have the same footwearId. All the searches should be case insensitive.
the above mentioned static methods should be called from the main method.

for getCountByType method - the main method should print the count of the footwears ,if the returned value
is greater than zero. or it should print "Footwear not available";

for getSecondHighestPriceByBrand method-The main method should print price from the returned footwear objects
if the returned footwear object is not null.else it should print "Brand not available".

for example.
112
ABC
25555
  where 112 is the footwear id,ABC is brand name, 25,555 is price.

consider the sample input and output.
100
Sketchers
sneekers
12345
103
reebok
running shoes
10099
102
reebok
Running shoes
5666
101
Reebok
running shoes
5666
99
reebok
floaters
5666
Running shoes
reebok

Sample output:
3
99
reebok
5666

Sample input2:

100
Puma
sneekers
12345
101
Puma
sneekers
10099
102
Puma
sneekers
5000
102
Reebok
sneekers
8000
104
Puma
floaters
2000
running shoes
bata

Sample output:
Footwear not available
Brand not available
 */
package Java_IPA;

import java.util.Arrays;
import java.util.Scanner;

public class FootwearProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Footwear[] arr = new Footwear[5];

        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();

            arr[i] = new Footwear(a,b,c,d);
        }
        String ftype = sc.nextLine();
        String fname = sc.nextLine();

        int ans = getCountByType(arr,ftype);
        if (ans  > 0) {
            System.out.println(ans);
        }
        else {
            System.out.println("Footwear not available");
        }

        Footwear[] obj = getSecondHighestPriceByBrand(arr,fname);
        if (obj != null) {
            for (int i=0;i < obj.length;i++) {
                System.out.println(obj[i].getFootwearId());
                System.out.println(obj[i].getFootwearName());
                System.out.println(obj[i].getPrice());
            }
        }
        else {
            System.out.println("Brand not available");
        }


    }
    public static int getCountByType(Footwear[] arr, String ftype) {
        int count = 0;
        for (int i=0;i< arr.length;i++) {
            if (arr[i].getFootwearType().equalsIgnoreCase(ftype)) {
                count ++;
            }
        }
        if (count > 0) {
            return count;
        }
        else  {
            return 0;
        }
    }

    public static Footwear[] getSecondHighestPriceByBrand(Footwear[] arr, String fname) {
        // Step 1: Filter footwears matching the specified brand name (case insensitive)
        Footwear[] foot = new Footwear[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getFootwearName().equalsIgnoreCase(fname)) {
                foot = Arrays.copyOf(foot, foot.length + 1);
                foot[foot.length - 1] = arr[i];
            }
        }

        // Step 2: Find the highest and second-highest prices
        int highestPrice = Integer.MIN_VALUE;
        int secondHighestPrice = Integer.MIN_VALUE;

        for (Footwear f : foot) {
            if (f.getPrice() > highestPrice) {
                secondHighestPrice = highestPrice;
                highestPrice = f.getPrice();
            } else if (f.getPrice() > secondHighestPrice && f.getPrice() < highestPrice) {
                secondHighestPrice = f.getPrice();
            }
        }

        // Step 3: Collect all footwears with the second highest price
        Footwear[] footwears = new Footwear[0];

        for (Footwear f : foot) {
            if (f.getPrice() == secondHighestPrice) {
                footwears = Arrays.copyOf(footwears, footwears.length + 1);
                footwears[footwears.length - 1] = f;
            }
        }

        // Return the footwears with the second highest price or null if none found
        if (footwears.length > 0) {
            return footwears;
        } else {
            return null;
        }
    }


}
class Footwear {
    int footwearId;
    String footwearName;
    String footwearType;
    int price;

    public int getFootwearId() {
        return footwearId;
    }

    public void setFootwearId(int footwearId) {
        this.footwearId = footwearId;
    }

    public String getFootwearName() {
        return footwearName;
    }

    public void setFootwearName(String footwearName) {
        this.footwearName = footwearName;
    }

    public String getFootwearType() {
        return footwearType;
    }

    public void setFootwearType(String footwearType) {
        this.footwearType = footwearType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Footwear(int footwearId, String footwearName, String footwearType, int price) {
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;
    }
}
