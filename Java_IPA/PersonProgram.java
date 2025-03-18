/*
Create a class Person with the following attributes:

firstName - String
lastName - String
age - int
gender - char ('M' for male and 'F' for female)

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Student that extends the Person class and adds the following attributes:

rollNo - String
course - String
semester - int
GPA - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Faculty that extends the Person class and adds the following attributes:

employeeId - String
department - String
designation - String
salary - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Solution with the main method.

Implement two static methods - findHighestGPAStudent and findHighestPaidFaculty in Solution class.

findHighestGPAStudent method:
This method will take an array of Student objects as input.
The method will return the Student object with the highest GPA.
If the array is empty, the method should return null.

findHighestPaidFaculty method:
This method will take an array of Faculty objects as input.
The method will return the Faculty object with the highest salary.
If the array is empty, the method should return null.

These above mentioned static methods should be called from the main method.

For findHighestGPAStudent method - The main method should print the roll number, course and GPA of the returned Student object.
If the returned value is null then it should print "Sorry - No student is available".

For findHighestPaidFaculty method - The main method should print the employee ID, department and salary of the returned
Faculty object.
If the returned value is null then it should print "Sorry - No faculty is available".

Before calling these static methods in main, use Scanner object to read the values of two Student objects and two Faculty
objects referring attributes in the above mentioned attribute sequence.

Example Input:

First1
Last1
20
M
Roll1
Course1
2
3.8
First2
Last2
21
F
Roll2
Course2
3
3.9
Faculty1
Last3
35
M
ID1
Department1
Associate Professor
90000.0
Faculty2
Last4
40
F
ID2
Department2
Professor
100000.0

Output:

Roll2
Course2
3.9
ID2
Department2
100000.0
 */
package Java_IPA;

import java.util.Scanner;

public class PersonProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentsP[] st = new StudentsP[2];
        Faculty[] fa = new Faculty[2];

        for (int i = 0; i < st.length; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();
            String f = sc.nextLine();
            int g = sc.nextInt();sc.nextLine();
            double h = sc.nextDouble();sc.nextLine();

            st[i] = new StudentsP(a,b,c,d,e,f,g,h);
        }
        for (int j = 0; j < fa.length; j++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();
            String f = sc.nextLine();
            String g = sc.nextLine();
            double h = sc.nextDouble();
            sc.nextLine();

            fa[j] = new Faculty(a, b, c, d, e, f, g, h);
        }

        StudentsP ans = findHighestGPAStudent(st);
        if (ans!=null) {
            System.out.println(ans.getRollNo());
            System.out.println(ans.getCourse());
            System.out.println(ans.getGPA());
        }
        else {
            System.out.println("Sorry - No student is available");
        }

        Faculty res = findHighestPaidFaculty(fa);
        if (res!=null) {
            System.out.println(res.getEmployeeId());
            System.out.println(res.getDepartment());
            System.out.println(res.getSalary());
        }
        else {
            System.out.println("Sorry - No student is available");
        }

    }
    public static StudentsP findHighestGPAStudent(StudentsP[] st) {
        double maxGPA = 0;
        double maxGPAIndex = st[0].getGPA();

        if (st == null || st.length == 0) {
            return null;
        }

        for (int i = 1;i<st.length;i++) {
            if (st[i].getGPA() > maxGPA) {
                maxGPA = st[i].getGPA();
                maxGPAIndex = i;
            }
        }
        return st[(int) maxGPAIndex];
    }

    public static Faculty findHighestPaidFaculty(Faculty[] fa) {
        double maxSalary = 0;
        double maxSalIndex = fa[0].getSalary();

        if (fa == null || fa.length == 0) {
            return null;
        }
        for (int i=1;i< fa.length;i++) {
            if (fa[i].getSalary() > maxSalary) {
                maxSalary = fa[i].getSalary();
                maxSalIndex = i;
            }
        }
        return fa[(int) maxSalIndex];
    }
}
class Person {
    String firstName;
    String lastName;
    int age;
    char gender;

    public Person(String firstName, String lastName, int age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
class StudentsP extends Person {
    String rollNo;
    String course;
    int semester;
    double GPA;

    public StudentsP(String firstName, String lastName, int age, char gender, String rollNo, String course, int semester, double GPA) {
        super(firstName, lastName, age, gender);
        this.rollNo = rollNo;
        this.course = course;
        this.semester = semester;
        this.GPA = GPA;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}

class Faculty extends Person {
    String employeeId;
    String department;
    String designation;
    double salary;

    public Faculty(String firstName, String lastName, int age, char gender, String employeeId, String department, String designation, double salary) {
        super(firstName, lastName, age, gender);
        this.employeeId = employeeId;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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