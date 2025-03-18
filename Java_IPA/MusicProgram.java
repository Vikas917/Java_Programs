/*
Create a class Music with below attributes:

playListNo - int
type -String
count - int
duration(minutes) -double.



The above attributes should be private.Write Getter and Setter and parametrized constructor as required.

Create class Solution with main method.

****************************************************************************

Implement two static methods: findAvgOfCount and sortTypeByDuration in Solution Class.



findAvgOfCount Method:
----------------------------------------
This method will take an array of Music objects and an int value as input parameters.The method will find out Average
(as int) of count for those objects whose count is more than the given Count(int parameter passed).This method will return
average if found.If there is no Type that matches then the method should return 0.

for this method- main method should print average ,if the returned value is not 0.If the returned value is 0 then main method
should print "No playlist found".

sortTypeByDuration method:
-----------------------------------------
This method will take an array of Music objects and an int value as input parameters.This method should return an array of
Music objects in an ascending order of their duration which are more than the given duration (int parameter passed) value.
If there are no such objects ,then the method should return null.

for this method-The main method should print the type from the returned Music object array if the returned value is not null.
If the returned value is null then the main method should print "No playlist found with mentioned attribute".

****************************************************************************

Consider the below input and output:

input1:
------------
111
WorkOut
10
15.2
321
Dance Party
20
55.500
721
Childhood Jams
6
50.60
521
Chill
30
78.89
15
20


output1:
--------------------
25
Childhood Jams
Dance Party
Chill



input2:
-----------------------
111
Oldies but Goodies
17
55
321
Guilty Pleasures
27
27
721
night drive
21
345
521
Rainy day
34
21
50
5000


output 2:
-----------------------
No playlist found.
No playlist found with mentioned attribute.

 */
package Java_IPA;

import java.util.Arrays;
import java.util.Scanner;

public class MusicProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Music[] arr = new Music[4];

        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();
            double d = sc.nextDouble();
            sc.nextLine();

            arr[i] = new Music(a,b,c,d);
        }
        int cnt = sc.nextInt();sc.nextLine();
        int dur = sc.nextInt();sc.nextLine();

        int ans = findAvgOfCount(arr,cnt);
        if (ans > 0) {
            System.out.println(ans);
        }
        else {
            System.out.println("No playlist found");
        }

        String[] res = sortTypeByDuration(arr,dur);
        if (res != null) {
            for (int i=0;i< res.length;i++) {
                System.out.println(res[i]);
            }
        }
        else {
            System.out.println("No playlist found with mentioned attribute");
        }
    }
    public static int findAvgOfCount(Music[] arr, int cnt) {
        int c = 0, sum = 0 ;
        for (int i=0;i<arr.length;i++) {
            if (arr[i].getCount()  > cnt) {
                sum += arr[i].getCount();
                c++;
            }
        }
        if (c > 0) {
            return sum / c;
        }
        else {
            return 0;
        }
    }


    public static String[] sortTypeByDuration(Music[] arr,int dur) {
        String[] t = new String[0];
        double[] du = new double[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i].getDuration() > dur)
            {
                du = Arrays.copyOf(du, du.length+1);
                du[du.length-1] = arr[i].getDuration();
                Arrays.sort(du);
            }
        }
        for(int i=0; i<du.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                if(arr[j].getDuration()==du[i])
                {
                    t = Arrays.copyOf(t, t.length+1);
                    t[t.length-1]=arr[j].getType();
                }
            }
        }
        if(t.length>0)
        {
            return t;
        }
        else
        {
            return null;
        }
    }
    
}
class Music {
    int playListNo;
    String type;
    int count;
    double duration;

    public int getPlayListNo() {
        return playListNo;
    }

    public void setPlayListNo(int playListNo) {
        this.playListNo = playListNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Music(int playListNo, String type, int count, double duration) {
        this.playListNo = playListNo;
        this.type = type;
        this.count = count;
        this.duration = duration;
    }
}
