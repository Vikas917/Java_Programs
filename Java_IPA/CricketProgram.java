/*
Create class Player2 with below attributes:

id - int
name - String
iccRank - int
matchesPlayed - int
runsScored - int

Create class Solution and implement static method "findAverageOfRuns" in the Solution class.
This method will take array of Player objects and a target int as parameters.
And will return another double array where the target int is lesser than or equal to the original array of Player object's
matchesPlayed attribute and contains the average run scored by each player satisfying above condition.

Write necessary getters and setters.

Before calling "findAverageOfRuns" method in the main method, read values for four Player objects referring the attributes
in above sequence along with a int target.
Then call the "findAverageOfRuns" method and write logic in main method to print "Grade A",if the calculated averageRun
value is 80 to 100. Else if the averageRun value is between 50 and 79 then print "Grade B". Else print "Grade C".

Input
------------------
100
Sachin
5
150
13000
101
Sehwag
4
120
10000
103
Dhoni
7
110
7000
104
Kohli
15
57
4400
100

Output
--------------------
Grade A
Grade A
Grade B
 */
package Java_IPA;

import java.util.Arrays;
import java.util.Scanner;

public class CricketProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cricket[] arr = new Cricket[4];

        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            int e = sc.nextInt();sc.nextLine();

            arr[i] = new Cricket(a,b,c,d,e);
        }
        int target = sc.nextInt();sc.nextLine();
        double[] ans = findAverageOfRuns(arr, target);
        if (ans != null) {
            for (int i =0 ;i < ans.length;i++){
                if(ans[i]>=80 && ans[i]<=100)
                {
                    System.out.println("Grade A");
                }
                else if(ans[i]>=50 && ans[i]<=79)
                {
                    System.out.println("Grade B");
                }
                else
                {
                    System.out.println("Grade C");
                }
            }
        }

    }
    static double[] findAverageOfRuns(Cricket[] arr, int target) {
        double[] crickets = new double[0];
        for (int i=0; i <arr.length;i++) {
            if (target <= arr[i].getMatchesPlayed()) {
                crickets = Arrays.copyOf(crickets,crickets.length+1);
                crickets[crickets.length-1] = ((double) arr[i].getRunsScored() /arr[i].getMatchesPlayed());
            }
        }
        if (crickets.length > 0) {
            return crickets;
        }
        else {
            return null;
        }
    }
}
class Cricket {
    int id;
    String name;
    int iccRank;
    int matchesPlayed;
    int runsScored;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIccRank() {
        return iccRank;
    }

    public void setIccRank(int iccRank) {
        this.iccRank = iccRank;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    public Cricket(int id, String name, int iccRank, int matchesPlayed, int runsScored) {
        this.id = id;
        this.name = name;
        this.iccRank = iccRank;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
    }
}
