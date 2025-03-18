/*
Create a class Employee with the below attributes:

EmpId - int
EmpName - String
Dept - String
Rating - int
Salary - int

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create class Solution with the main method.

Implement two static methods - findDept and findSecondHighestSalary in Solution class.

findDept method:
-----------------------------------
This method will take two input parameters - array of Employee objects and int parameter. The method
will return the dept array attribute from employee objects whose salary is matched with int parameter and rating greater than
equal to 3. If no data found of beach objects, then the method should return null.

findSecondHighestSalary method:
-----------------------------------
This method will take two input parameters - array of Employee objects and string parameter. The method
will return the second highest salary from employee objects whose dept is matched with string parameter.
If no data found of beach objects, then the method should return 0.

Note: No two employees have same rating. All the searches should be case insensitive.

These above mentioned static methods should be called from the main method.
For findDept method - The main method should print the dept from the Employee array. If return null, then you should print
"No Department found".
For findSecondHighestSalary method - The main method should print the 2nd highest salary from the Employee array with
the following condition. If return 0, then you should print "No data found".


Input ->

101
Arijit
Computer
4
35000
102
Rakesh
Electronics
2
18000
103
Mahima
Mechanical
3
35000
104
Saniya
Mechanical
5
68000
105
Rajesh
Computer
1
30000
35000
Mechanical

Output ->
Computer, Mechanical
35000
 */
package Java_IPA;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeDeptProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDept[] arr = new EmployeeDept[5];

        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            int e = sc.nextInt();
            sc.nextLine();

            arr[i] = new EmployeeDept(a,b,c,d,e);
        }
        int sal = sc.nextInt();sc.nextLine();
        String dept = sc.nextLine();

        String[] ans = findDept(arr,sal);
        if (ans != null) {
            String depts = Arrays.toString(ans);
            String dep = depts.substring(1,depts.length()-1);
            System.out.println(dep);
        }
        else {
            System.out.println("No Department found");
        }

        int res = findSecondHighestSalary(arr,dept);
        if (res > 0) {
            System.out.println(res);
        }
        else {
            System.out.println("No Data found");
        }

    }
    public static String[] findDept(EmployeeDept[] arr,int salary) {
        String[] depts = new String[0];
        for (int i=0;i<arr.length;i++) {
            if (arr[i].getSalary() == salary && arr[i].getRating() >= 3) {
                depts = Arrays.copyOf(depts, depts.length + 1);
                depts[depts.length - 1] = arr[i].getDept();
            }
        }
        if (depts.length > 0) {
            return depts;
        }
        return null;
    }
    public static int findSecondHighestSalary(EmployeeDept[] arr,String dept) {
        int[] salaries = new int[0];
        for (int i=0;i<arr.length;i++) {
            if (arr[i].getDept().equalsIgnoreCase(dept)) {
                salaries = Arrays.copyOf(salaries,salaries.length+1);
                salaries[salaries.length-1] = arr[i].getSalary();
                Arrays.sort(salaries);
            }
        }
        if (salaries.length > 0) {
            return salaries[salaries.length-2];
        }
        return 0;
    }

}
class EmployeeDept {
    int EmpId;
    String EmpName;
    String Dept;
    int Rating;
    int Salary;

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int rating) {
        Rating = rating;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public EmployeeDept(int empId, String empName, String dept, int rating, int salary) {
        EmpId = empId;
        EmpName = empName;
        Dept = dept;
        Rating = rating;
        Salary = salary;
    }
}
