/*
Create class Associate with below attributes: id - int name - String technology - String experienceInYears - int

Create class Solution and implement static method "associatesForGivenTechnology" in the Solution class. This method will take array
of Associate objects and a searchTechnology String as parameters. And will return another array of Associate objects where the
searchTechnology String matches with the original array of Associate object's technology attribute (case insensitive search) and
experienceInYears attribute should be multiples of 5.

Write necessary getters and setters.

Before calling "associatesForGivenTechnology" method in the main method, read values for five associate objects referring
the attributes in above sequence along with a String searchTechnology. Then call the "associatesForGivenTechnology" method and
write the logic to print the id's in the main method.

Input :

101
Alex
Java
15
102
Albert
Unix
20
103
Alferd
Testing
13
104
Alfa
Java
15
105
Almas
Java
29
Java

Output :

101
104
 */

package Java_IPA;

import java.util.Arrays;
import java.util.Scanner;

public class AssociateProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Associate[] arr = new Associate[5];
        for (int i=0;i<5;i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();

            arr[i] = new Associate(a,b,c,d);
        }
        String tech = sc.nextLine();

        int[] ans = associatesForGivenTechnology(arr,tech);
        if (ans != null) {
            for (int i : ans) {
                System.out.println(i);
            }
        }
        else {
            System.out.println("No associate found for given technology");
        }
    }
    public static int[] associatesForGivenTechnology(Associate[] arr,String tech) {
        int[] associates = new int[0];
        for (int i=0;i < arr.length;i++) {
            if (arr[i].getTechnology().equalsIgnoreCase(tech)) {
                if (arr[i].getExperienceInYears() % 5 == 0) {
                    associates = Arrays.copyOf(associates,associates.length+1);
                    associates[associates.length-1] = arr[i].getId();
                }
            }
        }
        return associates.length > 0 ? associates : null;
    }
}
class Associate {
    int id, experienceInYears;
    String name, technology;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public Associate(int id, String name, String technology,int experienceInYears) {
        this.id = id;
        this.experienceInYears = experienceInYears;
        this.name = name;
        this.technology = technology;
    }
}