/*
Create a class Employee with the following attributes:

name (string)
age (int)
salary (double)
Write getters, setters, and a parameterized constructor in the above-mentioned attribute sequence as required.

Create a class Solution with the main method.

Implement two static methods - calculateYearlySalary and calculateTax in the Solution class.

calculateYearlySalary method:
-----------------------------------------
This method will take an Employee object as input.
The method will calculate the yearly salary of the employee (assuming that the employee works for 12 months in a year) and
return it as a double.

calculateTax method:
-----------------------------------------
This method will take an Employee object as input.
The method will calculate the tax to be paid by the employee based on the following rules:

If the yearly salary is less than or equal to 50000, the tax is 10% of the yearly salary.
If the yearly salary is greater than 50000 but less than or equal to 100000, the tax is 20% of the amount over 50000 plus 10%
of the first 50000.
If the yearly salary is greater than 100000, the tax is 30% of the amount over 100000 plus 20% of the amount between 50000 and
100000 plus 10% of the first 50000.
The method will return the tax amount as a double.
These above-mentioned static methods should be called from the main method.

For calculateYearlySalary method - The main method should print the yearly salary returned by the method.

For calculateTax method - The main method should print the tax amount returned by the method.

Before calling these static methods in main, use a Scanner object to read the values of an Employee object's attributes.

Example Input:
----------------
John
30
55000.0

Example Output:
----------------
Yearly salary of John: 660000.0
Tax to be paid by John: 183000.0
 */
package Java_IPA;

import java.util.Scanner;

public class SalaryProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeSalary[] arr = new EmployeeSalary[1];

        for (int i = 0; i < arr.length; i++) {
            String a = sc.nextLine();
            int b = sc.nextInt();
            sc.nextLine();
            double c = sc.nextDouble();sc.nextLine();

            arr[i] = new EmployeeSalary(a,b,c);
        }

        double ans =  calculateYearlySalary(arr);
        System.out.println("Yearly salary of John : " + ans);

        double res = calculateTax(arr);
        System.out.println("Tax to be paid by John : " + res);

    }

    public static double calculateYearlySalary(EmployeeSalary[] arr) {
        double salary = 0;
        for (int i=0;i<arr.length;i++) {
            salary += arr[i].getSalary();
        }
        return salary*12;
    }

    public static double calculateTax(EmployeeSalary[] arr) {
        double tax = 0;
        double yearlySalary = calculateYearlySalary(arr);
        for (int i=0;i<arr.length;i++) {
            if (yearlySalary*12 <= 50000) {
                tax =  yearlySalary*0.1;
            }
            else if (yearlySalary <= 100000 && yearlySalary>50000)
            {
                tax = (50000 * 0.10) + ((yearlySalary - 50000) * 0.20);
            }
            else
            {
                tax = (50000 * 0.10) + (50000 * 0.20) + ((yearlySalary - 100000) * 0.30);
            }
        }
        return tax;
    }
}
class EmployeeSalary {
    String name;
    int age;
    double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public EmployeeSalary(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}