/*
Create a class called Employee with the below attributes:

employeeld - int
name - String
branch - String
rating - double
company Transport - boolean
The above attributes should be private. write getters, setters and parameterized constructor as required.

Create class MyClass with main method.
Implement two static methods findCountOfEmployeesUsingCompTransport and findEmployeeWithSecondHighestRating
in MyClass class.

findCountOfEmployeesUsingCompTransport method:
----------------------------------------------
This method will take an array of Employee object and a String parameter as input parameters.
This method will calculate and return the count of Employees who are all using company transport
in the given branch (String parameter passed).
If no Employee in the given branch using company transport in the array of Employee objects, then
the method should return 0.

findEmployeeWithSecondHighestRating method:
--------------------------------------------
This method will take an array of Employee objects as an input parameter. This method will return
the object of the second highest rating employee from the array of Employee objects who are not using
company transport.
If all Employees using company transport in the array of Employee objects, then the method should return null.

Note: All the searches should be case sensitive, companyTransport and rating combination of each Employee
is unique.

For findCountOfEmployeesUsingCompTransport method, The main method should print the returned count as it
is if the returned value is greater than 0, else it should print "No such Employees".

Ex: 2 , where 2 is the count
For findEmployeeWithSecondHighestRating method: The main method should print the employeeld and name from
the returned object if the returned value is not null. If the returned value is null, then it should
print "All Employees using company transport".

Ex: 1003
    Uma
where 1003 is the employeeld and Uma is the name.
Before calling these static methods in main, use Scanner object to read the values of four Employee
objects referring attributes in the above mentioned attributes sequence. Next, read the value of String
parameter for capturing branch.

Input :

1001
Ashwa
IT
5
true
1002
Preeti
IT
4
true
1003
Uma
Admin
3
false
1004
Akash
Hardware
4.5
false
IT



Output :

2
1003
Uma
 */
package Java_IPA;

//import java.util.Arrays;
//import java.util.Scanner;
//
//public class EmployeeProgram {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Employee[] arr = new Employee[4];
//        for (int i = 0; i < 4; i++) {
//            int a = sc.nextInt();sc.nextLine();
//            String b = sc.nextLine();
//            String c = sc.nextLine();
//            Double d = sc.nextDouble();sc.nextLine();
//            boolean e = sc.nextBoolean();
//
//            arr[i] = new Employee(a,b,c,d,e);
//        }
//        String branch = sc.nextLine();
//
//        int ans1 = findCountOfEmployeesUsingCompTransport(arr, branch);
//        if(ans1!=0)
//        {
//            System.out.println(ans1);
//        }
//        else{
//            System.out.println("No such Employees");
//        }
//
//        Employee[] ans2 = findEmployeeWithSecondHighestRating(arr);
//        if(ans2!=null) {
//            for (int i = 0; i < ans2.length; i++) {
//                if(ans2[i].getRating()>ans2[i+1].getRating())
//                {
//                    System.out.println(ans2[i+1].getEmployeeld());
//                    System.out.println(ans2[i+1].getName());
//                    break;
//                }
//            }
//        }
//        else {
//            System.out.println("All Employees using company transport");
//        }
//
//    }
//    public static int findCountOfEmployeesUsingCompTransport(Employee[] arr, String branch) {
//        int count = 0;
//        for (int i = 0;i < arr.length; i++) {
//            if(arr[i].getBranch().equalsIgnoreCase(branch) && arr[i].isCompany()) {
//                count++;
//            }
//        }
//        if(count>0) {
//            return count;
//        }
//        else {
//            return 0;
//        }
//    }
//    public static Employee[] findEmployeeWithSecondHighestRating(Employee[] arr) {
//        Employee[] sec = new Employee[0];
//        Employee del;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i].isCompany()==false)
//            {
//                sec = Arrays.copyOf(sec, sec.length+1);
//                sec[sec.length-1] = arr[i];
//            }
//        }
//        for (int i = 0; i < sec.length; i++) {
//            for (int j = i; j < sec.length; j++) {
//                if(sec[i].getRating() < sec[j].getRating())
//                {
//                    del = sec[i];
//                    sec[i]=sec[j];
//                    sec[j]=del;
//                }
//            }
//        }
//        if(sec.length>0)
//        {
//            return sec;
//        }
//        else
//        {
//            return null;
//        }
//    }
//
//}
//class Employee {
//    int employeeld;
//    String name;
//    String branch;
//    Double rating;
//    boolean company;
//
//    public int getEmployeeld() {
//        return employeeld;
//    }
//
//    public void setEmployeeld(int employeeld) {
//        this.employeeld = employeeld;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getBranch() {
//        return branch;
//    }
//
//    public void setBranch(String branch) {
//        this.branch = branch;
//    }
//
//    public Double getRating() {
//        return rating;
//    }
//
//    public void setRating(Double rating) {
//        this.rating = rating;
//    }
//
//    public boolean isCompany() {
//        return company;
//    }
//
//    public void setCompany(boolean company) {
//        this.company = company;
//    }
//
//    public Employee(int employeeld, String name, String branch, Double rating, boolean company) {
//        this.employeeld = employeeld;
//        this.name = name;
//        this.branch = branch;
//        this.rating = rating;
//        this.company = company;
//    }
//}

import java.util.*;

public class EmployeeProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeP[] emp = new EmployeeP[4];
        for (int i = 0; i < emp.length; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            boolean e = sc.nextBoolean();sc.nextLine();

            emp[i] = new EmployeeP(a,b,c,d,e);
        }
        String br = sc.nextLine();
        //Method 1
        int ans1 = CountOfEmployee(emp,br);
        if(ans1!=0)
        {
            System.out.println(ans1);
        }
        else{
            System.out.println("No such Employees");
        }
        //Method 2
        EmployeeP[] ans2 = EmployeeWithSecondHighestRating(emp);
        if(ans2!=null)
        {
            for (int i = 0; i < ans2.length; i++) {
                if(ans2[i].getRating() > ans2[i+1].getRating())
                {
                    System.out.println(ans2[i+1].getId());
                    System.out.println(ans2[i+1].getName());
                    break;
                }
            }
        }
        else
        {
            System.out.println("All Employees using company transport");
        }
    }
    //Method 1
    public static int CountOfEmployee(EmployeeP[]e, String b)
    {
        int count = 0;
        for (int i = 0; i < e.length; i++) {
            if(e[i].getBranch().equalsIgnoreCase(b) && e[i].getTransport())
            {
                count++;
            }
        }
        if(count>0)
        {
            return count;
        }
        else{
            return 0;
        }
    }
    //Method 2
    public static EmployeeP[] EmployeeWithSecondHighestRating(EmployeeP[] e)
    {
        EmployeeP[] sec = new EmployeeP[0];
        //EmployeeP del;
        //Making the copy of tha array sec who are not using company transport
        for (int i = 0; i < e.length; i++) {
            if(!e[i].getTransport()) //or if(e[i].getTransport() == false)
            {
                sec = Arrays.copyOf(sec, sec.length+1);
                sec[sec.length-1] = e[i];
            }
        }
        //Sorting the array sec based on rating
        for (int i = 0; i < sec.length; i++) {
            for (int j = i; j < sec.length; j++) {
                if(sec[i].getRating() < sec[j].getRating())
                {
                    EmployeeP temp = sec[i];
                    sec[i] = sec[j];
                    sec[j] = temp;
                }
            }
        }
        if(sec.length>0)
        {
            return sec;
        }
        else
        {
            return null;
        }
    }
    /*
    Suppose we have the following employees:

Employee 1: employeeId=1001, name=Ashwa, branch=IT, rating=5.0, companyTransport=true
Employee 2: employeeId=1002, name=Preeti, branch=IT, rating=4.0, companyTransport=true
Employee 3: employeeId=1003, name=Uma, branch=Admin, rating=3.0, companyTransport=false
Employee 4: employeeId=1004, name=Akash, branch=Hardware, rating=4.5, companyTransport=false

Step-by-Step Execution
Input Data:

An array of Employee objects is passed to the method.

Collect Non-Transport Employees:

An empty array nonTransportEmployees is initialized.

The method iterates over each employee in the input array:
For Ashwa: companyTransport=true (skipped)
For Preeti: companyTransport=true (skipped)
For Uma: companyTransport=false → Added to nonTransportEmployees
For Akash: companyTransport=false → Added to nonTransportEmployees

After this step, nonTransportEmployees will contain:
Uma (3.0, false)
Akash (4.5, false)

Check for Non-Transport Employees:

If no employees were collected, it would return null. Here, there are two employees.

Sort Non-Transport Employees by Rating:

The method sorts the nonTransportEmployees array in descending order of their ratings:

Initial array: Uma (3.0), Akash (4.5)
After sorting:
Compare Akash (4.5) with Uma (3.0):
4.5 > 3.0 → Swap
Sorted array: Akash (4.5), Uma (3.0)

Identify the Highest Rating:

highestRating is set to 4.5 (rating of Akash).
Initialize secondHighest as null.

Find the Second Highest Rating:

Iterate through nonTransportEmployees to find an employee with a rating less than highestRating:
For Akash (4.5): rating equals highestRating, continue.
For Uma (3.0): rating is less than highestRating → Set secondHighest to Uma.
The loop breaks after finding the second highest.

Return the Result:

The method returns secondHighest, which is the Employee object representing Uma.
Final Output
The output from the method call will be the employee with the second highest rating, which in this case is:

Employee 3:
ID: 1003
Name: Uma
Rating: 3.0
     */
}
class EmployeeP
{
    private int Id;
    private String name;
    private String branch;
    private double rating;
    private boolean transport;

    public EmployeeP(int Id, String name, String branch, double rating, boolean transport)
    {
        this.Id = Id;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.transport = transport;
    }

    public int getId()
    {
        return Id;
    }
    public void setId(int Id)
    {
        this.Id = Id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getBranch()
    {
        return branch;
    }
    public void setBranch(String branch)
    {
        this.branch = branch;
    }
    public double getRating()
    {
        return rating;
    }
    public void setRating(double rating)
    {
        this.rating = rating;
    }
    public boolean getTransport()
    {
        return transport;
    }
    public void setTransport(boolean transport)
    {
        this.transport= transport;
    }
}