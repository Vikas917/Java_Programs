/*
Create class Team with below attributes:

tId - int
tName - String
tCountry - String
tRun - int

The above attributes should be private.Write Getter and Setter and parametrized constructor as required.

Create class Solution with main method.

Implement One static method-

● findPlayer

findPlayer in the solution class.
This method will take array of Team objects, int paramater run and String country and returns the Team object where taken
country is matched with the country of team object and team run is greater than the taken run.

Write code to perform following tasks:

1. In main mehod, take 1st input as integer parameter which shows the number of team object.
2. Take necessary input variable and call findPlayer.
3. All searches should be case insensitive.

For this method- The main method should print the team object. As if the returned value is not null,
or it should print "No team is found from the given country and run".

Input
------------------
3
1
Arijit
India
43
2
Doremon
China
40
3
Donal
England
32
35
China



Output
--------------
2
Doremon
China
40
 */
package Java_IPA;

import java.util.Scanner;

public class TeamProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        Team[] arr = new Team[n];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();

            arr[i] = new Team(a,b,c,d);
        }
        int r = sc.nextInt();sc.nextLine();
        String con = sc.nextLine();
        Team ans = findPlayer(arr,r,con);
        if(ans!=null)
        {
            System.out.println(ans.getTakenId());
            System.out.println(ans.getTakenName());
            System.out.println(ans.getTakenCountry());
            System.out.println(ans.getTakenRun());
        }
        else
        {
            System.out.println("No team is found from the given country and run");
        }
    }
    public static Team findPlayer(Team[] arr, int r, String c)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getTakenCountry().equalsIgnoreCase(c) && arr[i].getTakenRun()>r)
            {
                return arr[i];
            }
        }
        return null;
    }
}
class Team {
    int takenId;
    String takenName;
    String takenCountry;
    int takenRun;

    public int getTakenId() {
        return takenId;
    }

    public void setTakenId(int takenId) {
        this.takenId = takenId;
    }

    public String getTakenName() {
        return takenName;
    }

    public void setTakenName(String takenName) {
        this.takenName = takenName;
    }

    public String getTakenCountry() {
        return takenCountry;
    }

    public void setTakenCountry(String takenCountry) {
        this.takenCountry = takenCountry;
    }

    public int getTakenRun() {
        return takenRun;
    }

    public void setTakenRun(int takenRun) {
        this.takenRun = takenRun;
    }

    public Team(int takenId, String takenName, String takenCountry, int takenRun) {
        this.takenId = takenId;
        this.takenName = takenName;
        this.takenCountry = takenCountry;
        this.takenRun = takenRun;
    }
}
