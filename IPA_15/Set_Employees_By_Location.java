package IPA_15;

/* Group the employees by city

 * Input:
 * ----------------
 * Employee |      City
 * ---------------------
 * Arijit       Kolkata
 * Minaz        Mumbai
 * Rahul        Chennai
 * Rajesh       Kolkata
 * Sekhar       Chennai
 * Kasim        Chennai

 * Output:
 * ----------------
 * Kolkata: Arijit,Rajesh
 * Mumbai: Minaz
 * Chennai: Rahul,Sekhar,Kasim
 */
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Set_Employees_By_Location {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String,String> emp = new LinkedHashMap<>();
        System.out.println("Number of Employees are: ");
        int num = sc.nextInt();sc.nextLine();

        for (int i=0;i<num;i++) {
            System.out.println((i+1) + ") Enter Name: ");
            String name = sc.nextLine();
            System.out.println("Enter City: ");
            String city = sc.nextLine();

            emp.put(name,city);
        }
        System.out.println(); //One line space

        // Show my data set
        for (Map.Entry<String ,String> data : emp.entrySet()) {
            System.out.println(data.getKey() + " : " + data.getValue());
        }
        System.out.println();

        LinkedHashMap<String,String> empLocUpdate = new LinkedHashMap<>();

        for (Map.Entry<String ,String> data : emp.entrySet()) {
            if (!empLocUpdate.containsKey(data.getValue())) {
                empLocUpdate.put(data.getValue(), data.getKey());
            }
            else {
                empLocUpdate.put(data.getValue(), empLocUpdate.get(data.getValue()) + "," + data.getKey());
            }
        }

        // List data
        for(HashMap.Entry<String,String> ans : empLocUpdate.entrySet())
        {
            System.out.println(ans.getKey()+" : "+ans.getValue());
        }
    }
}
