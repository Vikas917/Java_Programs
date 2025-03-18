/*
Create a class Player with below attributes:

playerId - int
skill - String
level - String
points - int

Write getters, setters and parameterized constructor in the above mentioned attribute
sequence as required.

Create class Solution with the main method.

Implement two static methods - findPointsForGivenSkill and getPlayerBasedOnLevel in Solution class.

findPointsForGivenSkill method:
------------------------------------
This method will take two input parameters - array of Player objects
and string parameter skill. The method will return the sum of the points attribute from player objects
for the skill passed as parameter. If no player with the given skill is present in the array of player
objects, then the method should return 0.

getPlayerBasedOnLevel method:
-------------------------------------
This method will take two String parameters level and skill, along with the array of Player objects.
The method will return the player object, if the input String parameters matches with the level and
skill attribute of the player object and its point attribute is greater than or equal to 20. If any
of the conditions are not met, then the method should return null.

Note : No two player object would have the same value for skill and level attribute. All player object
would have the points greater than 0. All the searches should be case insensitive.

These above mentioned static methods should be called from the main method.

For findPointsForGivenSkill method - The main method should print the points as it is if the returned
price is greater than 0, or it should print "The given Skill is not available".

For getPlayerBasedOnLevel method - The main method should print the playerId of the returned player object.
If the returned value is null then it should print "No player is available with specified level, skill
and eligibility points".

Before calling these static methods in main, use Scanner object to read the values of four Player objects
referring attributes in the above mentioned attribute sequence. Next, read the value for skill and level.
Please consider the skill value read above as skill parameter for both the static methods.

Input:
-----------
101
Cricket
Basic
20
102
Cricket
Intermediate
25
111
Football
Intermediate
50
113
BaseBall
Advanced
100
Cricket
Intermediate

Output:
--------------
45
102
 */
package Java_IPA;
import java.util.*;
public class PlayerProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] arr = new Player[4];
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();

            arr[i] = new Player(a,b,c,d);
        }
        String skill = sc.nextLine();
        String level = sc.nextLine();

        int sum = findPointsForGivenSkill(arr, skill);
        if (sum < 0) {
            System.out.println("The given Skill is not available");
        }
        else {
            System.out.println(sum);
        }
        Player result = getPlayerBasedOnLevel(arr, level, skill);
        if (result == null) {
            System.out.println("No player is available with specified level, skill and eligibility points");
        }
        else {
            System.out.println(result.getPlayerId());
        }

    }
    public static int findPointsForGivenSkill(Player[] arr, String skill) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSkill().equalsIgnoreCase(skill)) {
                sum += arr[i].getPoints();
            }
        }
        if (sum > 0){
            return sum;
        }
        else {
            return 0;
        }
    }
    public static Player getPlayerBasedOnLevel(Player[] arr, String level, String skill) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSkill().equalsIgnoreCase(skill) && arr[i].getLevel().equalsIgnoreCase(level) && arr[i].getPoints() >= 20) {
                return arr[i];
            }
        }
        return null;
    }
}
class Player {
    int playerId;
    String skill;
    String level;
    int points;

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Player(int playerId, String skill, String level, int points) {
        this.playerId = playerId;
        this.skill = skill;
        this.level = level;
        this.points = points;
    }
}