/*
Create a class EmployeeClass with below attributes:

employeeId - int
employeeName - String
age - int
gender - char
salary - double

where employeeId is the unique identifier of the employee, employeeName is the name of the employee, age is the age of
the employee, gender is the gender of the employee and salary is the salary of the employee.

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.
Implement two static methods - getEmployeeWithSecondLowestSalary and countEmployeesBasedOnAge in Solution class.

getEmployeeWithSecondLowestSalary method:
This method will take an array of EmployeeClass objects as a parameter.
The method will return the EmployeeClass object with the second-lowest salary in the array of EmployeeClass objects.
If there are less than two employees in the array, then the method should return null.

countEmployeesBasedOnAge method:
This method will take two input parameters - array of EmployeeClass objects and an integer parameter (for age).
The method will return the count of employees from the array of EmployeeClass objects whose age matches with the input
parameter.
If no employee with the given age is present in the array of EmployeeClass objects, then the method should return 0.

Note :

Two employee objects can have the same salary.
All the searches should be case-insensitive.

The above-mentioned static methods should be called from the main method.

For getEmployeeWithSecondLowestSalary method - The main method should print the employeeId followed by # and employeeName
from the returned EmployeeClass object, if the returned value is not null.

If the returned value is null then it should print "Null".

For countEmployeesBasedOnAge method - The main method should print the count of employees as it is, if the returned value
is greater than 0, otherwise it should print "No employee found for the given age".

Before calling these static methods in main, use Scanner to read the number of objects and objects to read the values of
EmployeeClass objects referring attributes in the above mentioned attribute sequence.

Consider below sample input and output:

Input:
-------------
4
101
John
30
M
10000.00
102
Samantha
25
F
15000.00
103
Alex
28
M
12000.00
104
Lisa
30
F
15000.00
30

Output:
----------------
103#Alex
2
 */
package Java_IPA;

import java.util.*;
public class Count_Salary
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        EmployeeClass[] emp = new EmployeeClass[n];
        for(int i=0; i<n; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            char d = sc.next().charAt(0);sc.nextLine();
            double e = sc.nextDouble();sc.nextLine();

            emp[i] = new EmployeeClass(a,b,c,d,e);
        }
        int age = sc.nextInt();
        //Method 1
        EmployeeClass[] ans1 = getEmployeeWithSecondLowestSalary(emp);
        if(ans1!=null)
        {
            for(int i=0; i<ans1.length; i++)
            {
                System.out.println(ans1[i].getId()+"#"+ans1[i].getName());
            }
        }
        else
        {
            System.out.println("Null");
        }
        //Method 2
        int ans2 = countEmployeesBasedOnAge(emp,age);
        if(ans2!=0)
        {
            System.out.println(ans2);
        }
        else
        {
            System.out.println("No employee found for the given age");
        }
    }
    public static EmployeeClass[] getEmployeeWithSecondLowestSalary(EmployeeClass[] e)
    {
        EmployeeClass[] det = new EmployeeClass[0];
        if(e.length>1)
        {    //Sorting the array e based on salary
            for(int i=0; i<e.length; i++)
            {
                for(int j=i+1; j<e.length; j++)
                {
                    if(e[i].getSalary() > e[j].getSalary())
                    {
                        EmployeeClass temp = e[i];
                        e[i] = e[j];
                        e[j] = temp;
                    }
                }
            }
            //EmployeeClass min = e[0];
            //Making the copy of the array det based on salary if second element is higher than first as the array is sorted.
            for(int i=0; i<e.length; i++)
            {
                if(e[i].getSalary() > e[0].getSalary())
                {//It will store the array elements with second highest salary
                    det = Arrays.copyOf(det, det.length+1);
                    det[det.length-1] = e[i];
                    break;
                }
            }
            for(int i=0; i<e.length; i++)
            {//checking the array det salary same as of array e and both array should not have same id
                if(det[0].getSalary() == e[i].getSalary() && e[i].getId() != det[0].getId())
                {
                    det = Arrays.copyOf(det, det.length+1);
                    det[det.length-1] = e[i];
                }
            }
            return det;
        }
        return null;
    }
    /*
    Breakdown of Input of getEmployeeWithSecondLowestSalary method
Number of Employees: 4
Employee Details:
Employee 1: ID = 101, Name = John, Age = 30, Gender = M, Salary = 10000.00
Employee 2: ID = 102, Name = Samantha, Age = 25, Gender = F, Salary = 15000.00
Employee 3: ID = 103, Name = Alex, Age = 30, Gender = M, Salary = 10000.00
Employee 4: ID = 104, Name = Lisa, Age = 30, Gender = F, Salary = 15000.00

Step-by-Step Execution of getEmployeeWithSecondLowestSalary

Check the Number of Employees:

The method checks if the length of the array e is greater than 1.
We have 4 employees, so we proceed.

Sorting Employees by Salary:

The nested loop sorts the employees based on their salary.

After sorting, the employees will be in the following order:
John: 10000.00 (index 0)
Alex: 10000.00 (index 1)
Samantha: 15000.00 (index 2)
Lisa: 15000.00 (index 3)

Sorted Employee Array:
{
    EmployeeClass{id=101, name=John, salary=10000.00},
    EmployeeClass{id=103, name=Alex, salary=10000.00},
    EmployeeClass{id=102, name=Samantha, salary=15000.00},
    EmployeeClass{id=104, name=Lisa, salary=15000.00}
}

Finding the Second Lowest Salary:

The method looks for the first employee whose salary is greater than 10000.00.
The loop starts checking from the second employee (Alex):
Since Alex also has a salary of 10000.00, the method continues to the next employee.
The third employee, Samantha, has a salary of 15000.00, which is greater than 10000.00.
Thus, the second lowest salary is 15000.00.

Finding the Employee(s) with the Second Lowest Salary:

The method initializes the det array to store employees with the second lowest salary.
It now looks for employees with a salary of 15000.00:
Lisa (ID: 104) has a salary of 15000.00.
Samantha (ID: 102) also has a salary of 15000.00.
Both Samantha and Lisa are added to the det array.
After this step:

det will contain:
{
    EmployeeClass{id=102, name=Samantha, salary=15000.00},
    EmployeeClass{id=104, name=Lisa, salary=15000.00}
}

Return Value:

The method returns the det array, which contains both Samantha and Lisa as the employees with the second lowest salary.

Final Output
The output for this modified input would be:

Output :-
102#Samantha
104#Lisa
     */
    public static int countEmployeesBasedOnAge(EmployeeClass[] e, int a)
    {
        int count = 0;
        for(int i=0; i<e.length; i++)
        {
            if(e[i].getAge()==a)
            {
                count++;
            }
        }
        return count;
    }
}
class EmployeeClass
{
    private int id;
    private String name;
    private int age;
    private char gender;
    private double salary;

    public EmployeeClass(int id, String name, int age, char gender, double salary)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public int getId()
    {
        return this.id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return this.age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public char getGender()
    {
        return this.gender;
    }
    public void setGender(char gender)
    {
        this.gender = gender;
    }
    public double getSalary()
    {
        return this.salary;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
}
//import java.util.*;
//
//public class Count_Salary {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        EmployeeClass[] arr = new EmployeeClass[4];
//        for (int i = 0;i < arr.length; i++) {
//            int a = sc.nextInt();sc.nextLine();
//            String b = sc.nextLine();
//            int c = sc.nextInt();sc.nextLine();
//            char d = sc.next().charAt(0);sc.nextLine();
//            double e = sc.nextDouble();sc.nextLine();
//
//            arr[i] = new EmployeeClass(a,b,c,d,e);
//        }
//        int age = sc.nextInt();sc.nextLine();
//
//        EmployeeClass[] res = getEmployeeWithSecondLowestSalary(arr);
//        if (res!=null) {
//            for (int i = 0; i < res.length; i++) {
//                System.out.println(res[i].getEmployeeId() + "#" + res[i].getEmployeeName());
//            }
//        }
//        else {
//            System.out.println("Null");
//        }
//        int ans2 = countEmployeesBasedOnAge(arr,age);
//        if(ans2!=0)
//        {
//            System.out.println(ans2);
//        }
//        else
//        {
//            System.out.println("No employee found for the given age");
//        }
//    }
//    //Methods
//    public static EmployeeClass[] getEmployeeWithSecondLowestSalary(EmployeeClass[] e)
//    {
//        EmployeeClass[] det = new EmployeeClass[0];
//        if(e.length>1)
//        {
//            for(int i=0; i<e.length; i++)
//            {
//                for(int j=i; j<e.length; j++)
//                {
//                    if(e[i].getSalary()>e[j].getSalary())
//                    {
//                        EmployeeClass k = e[i];
//                        e[i] = e[j];
//                        e[j] = k;
//                    }
//                }
//            }
//            EmployeeClass min = e[0];
//            for(int i=0; i<e.length; i++)
//            {
//                if(e[i].getSalary()>e[0].getSalary())
//                {
//                    det = Arrays.copyOf(det, det.length+1);
//                    det[det.length-1] = e[i];
//                    break;
//                }
//            }
//            for(int i=0; i<e.length; i++)
//            {
//                if(det[0].getSalary() == e[i].getSalary() && e[i].getEmployeeId()!=det[0].getEmployeeId())
//                {
//                    det = Arrays.copyOf(det, det.length+1);
//                    det[det.length-1] = e[i];
//                }
//            }
//            return det;
//        }
//        return null;
//    }
////    public static int countEmployeesBasedOnAge(EmployeeClass[] e, int a)
////    {
////        int count = 0;
////        for(int i=0; i<e.length; i++)
////        {
////            if(e[i].getAge()==a)
////            {
////                count++;
////            }
////        }
////        return count;
////    }
//}
//
//    public static int countEmployeesBasedOnAge(EmployeeClass[] arr, int age) {
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].getAge() == age) {
//                count++;
//            }
//        }
//        if (count > 0) return count;
//        else return 0;
//    }
//}
//class EmployeeClass {
//    private int employeeId;
//    private String employeeName;
//    private int age;
//    private char gender;
//    private double salary;
//
//    public int getEmployeeId() {
//        return employeeId;
//    }
//
//    public void setEmployeeId(int employeeId) {
//        this.employeeId = employeeId;
//    }
//
//    public String getEmployeeName() {
//        return employeeName;
//    }
//
//    public void setEmployeeName(String employeeName) {
//        this.employeeName = employeeName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public char getGender() {
//        return gender;
//    }
//
//    public void setGender(char gender) {
//        this.gender = gender;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public EmployeeClass(int employeeId, String employeeName, int age, char gender, double salary) {
//        this.employeeId = employeeId;
//        this.employeeName = employeeName;
//        this.age = age;
//        this.gender = gender;
//        this.salary = salary;
//    }
//}
