/*
Create a class named "Employee" with the following attributes:

id (int)
name (String)
designation (String)
salary (double)

The above attributes should be private, and the class should have a parameterized constructor to initialize them.

Implement the following methods in the Employee class:

getSalary(): This method should return the salary of the employee.
getDesignation(): This method should return the designation of the employee.

Create a class named "Company" with the following attributes:

companyName (String)
employees (Employee array)
numEmployees (int)

The above attributes should be private, and the class should have a parameterized constructor to initialize them.

Implement the following methods in the Company class:

getAverageSalary(): This method should return the average salary of all the employees in the company.
getMaxSalary(): This method should return the highest salary of all the employees in the company.
getEmployeesByDesignation(String designation): This method should return an array of all employees with the given designation.

In the main method, use a Scanner object to read the values of the company name, number of employees, and the employee details
        (id, name, designation, and salary) in a loop. Once all employee details have been read, create a Company object and pass the
appropriate parameters. Finally, call the three methods mentioned above and print the output.

Note:

All searches should be case-insensitive.
You may assume that the input is valid and in the correct format.

Sample input:
        ---------------------
Enter company name: ABC Company
Enter number of employees: 3
Enter employee details:
Employee 1:
Enter id: 101
Enter name: John Smith
Enter designation: Manager
Enter salary: 5000
Employee 2:
Enter id: 102
Enter name: Jane Doe
Enter designation: Engineer
Enter salary: 4000
Employee 3:
Enter id: 103
Enter name: Bob Johnson
Enter designation: Engineer
Enter salary: 4500

Sample Output:
        --------------------
Average salary: 4500.0
Max salary: 5000.0
Employees with designation: Engineer
ID: 102, Name: Jane Doe, Designation: Engineer, Salary: 4000.0
ID: 103, Name: Bob Johnson, Designation: Engineer, Salary: 4500.0
*/

/*package Java_IPA;

import java.util.Arrays;
import java.util.Scanner;

public class CompanyEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter company name: ");
        String cn = sc.nextLine();
        System.out.println("Enter number of employees: ");
        int ne = sc.nextInt();sc.nextLine();
        System.out.println("Enter Employee Details");
        Employees[] emp = new Employees[ne];
        for (int i = 0;i < emp.length; i++) {
            System.out.println("Employee " + (i+1) +":");
            System.out.println("Enter id: ");
            int a = sc.nextInt();sc.nextLine();

            System.out.print("Enter name: ");
            String b = sc.nextLine();

            System.out.print("Enter designation: ");
            String c = sc.nextLine();

            System.out.print("Enter salary: ");
            double d = sc.nextDouble();sc.nextLine();

            emp[i] = new Employees(a,b,c,d);
        }
        Company com = new Company(cn, emp, ne);

        System.out.println("Average Salary : "+com.getAverageSalary(emp));
        System.out.println("Max Salary : "+com.getMaxSalary(emp));

        System.out.print("Employee with Designation: ");
        String designation = sc.nextLine();

        Employees[] ans = com.getEmployeesByDesignation(emp,designation);
        if(ans!=null)
        {
            for (int i = 0; i < ans.length; i++) {
                System.out.println("ID: "+ans[i].getId()+", Name: "+ans[i].getName()+", Designation: "+ans[i].getDesignation()+", Salary: "+ans[i].getSalary());
            }
        }
    }
}
class Employees {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employees(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class Company {
    private String companyName;
    private Employees[] emp;
    private int numEmployees;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employees[] getEmp() {
        return emp;
    }

    public void setEmp(Employees[] emp) {
        this.emp = emp;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }

    public Company(String companyName, Employees[] emp, int numEmployees) {
        this.companyName = companyName;
        this.emp = emp;
        this.numEmployees = numEmployees;
    }
    public double getAverageSalary(Employees[] emp){
        double sum = 0;
        for (int i = 0;i < emp.length;i++) {
            sum += emp[i].getSalary();
        }
        return sum / emp.length;
    }
    public double getMaxSalary(Employees[] emp) {
        double max = emp[0].getSalary();
        for (int i = 0;i < emp.length;i++) {
            if(emp[i].getSalary() > max) {
                max = emp[i].getSalary();
            }
        }
        return max;
    }
    public Employees[] getEmployeesByDesignation(Employees[] emp,String designation) {
        Employees[] emp2 = new Employees[0];
        for (int i = 0;i < emp.length;i++) {
            if (emp[i].getDesignation().equalsIgnoreCase(designation)) {
                emp2 = Arrays.copyOf(emp2,emp2.length+1);
                emp2[emp2.length-1] = emp[i];
            }
        }
        if(emp2.length>0)
        {
            return emp2;
        }
        return null;
    }
}
 */

package Java_IPA;
import java.util.*;
public class CompanyEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter company name: ");
        String cn = sc.nextLine();
        System.out.print("Enter number of employees: ");
        int num = sc.nextInt();sc.nextLine();
        Employee[] emp = new Employee[num];
        System.out.println("Enter employee details: ");
        for (int i = 0; i < emp.length; i++) {
            System.out.println("Employee "+(i+1)+":");

            System.out.print("Enter id: ");
            int a = sc.nextInt();sc.nextLine();

            System.out.print("Enter name: ");
            String b = sc.nextLine();

            System.out.print("Enter designation: ");
            String c = sc.nextLine();

            System.out.print("Enter salary: ");
            double d = sc.nextDouble();sc.nextLine();

            emp[i] = new Employee(a,b,c,d);
        }
        Company com = new Company(cn,emp,num);

        System.out.println("Average Salary : "+com.getAverageSalary(emp));
        System.out.println("Max Salary : "+com.getMaxSalary(emp));

        System.out.print("Enployee with Designation: ");
        String desi = sc.nextLine();
        Employee[] ans = com.getEmployeesByDesignation(emp,desi);
        if(ans!=null)
        {
            for (int i = 0; i < ans.length; i++) {
                System.out.println("ID: "+ans[i].getId()+", Name: "+ans[i].getName()+", Designation: "+ans[i].getDes()+", Salary: "+ans[i].getSalary());
            }
        }
    }
}

class Employee
{
    private int id;
    private String name;
    private String des;
    private double salary;
    public Employee(int id, String name, String des, double salary) {
        this.id = id;
        this.name = name;
        this.des = des;
        this.salary = salary;
    }

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

    public String getDes() {
        return des;
    }
    public void setDes(String des) {
        this.des = des;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Company
{
    private String comName;
    private Employee[] emp;
    private int numEmp;
    public Company(String comName, Employee[] emp, int numEmp) {
        this.comName = comName;
        this.emp = emp;
        this.numEmp = numEmp;
    }
    public double getAverageSalary(Employee[] e)
    {
        double sum = 0;
        for(int i=0; i<e.length; i++)
        {
            sum+=e[i].getSalary();
        }
        if(sum>0)
        {
            double avg = sum/e.length;
            return avg;
        }
        return 0;
    }

    public double getMaxSalary(Employee[] e)
    {
        double maxSal=e[0].getSalary();
        for(int i=0; i<e.length; i++)
        {
            if(maxSal<e[i].getSalary())
            {
                maxSal = e[i].getSalary();
            }
        }
        return maxSal;
    }

    public Employee[] getEmployeesByDesignation(Employee[]e,String d)
    {
        Employee[] emp = new Employee[0];
        for (int i = 0; i < e.length; i++) {
            if(e[i].getDes().equalsIgnoreCase(d))
            {
                emp = Arrays.copyOf(emp,emp.length+1);
                emp[emp.length-1] = e[i];
            }
        }
        if(emp.length>0)
        {
            return emp;
        }
        return null;
    }
}