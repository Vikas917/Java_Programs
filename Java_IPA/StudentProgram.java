/*
Create a class Student with below attributes:

rollNo - int
name - String
subject - String
grade - char
date - String [DD/MM/YYYY]



The above attributes should be private.Write Getter and Setter and parametrized constructor as required.


Create class Solution with main method.
****************************************************************************
Implement one static method: findStudentByGradeAndMonth Solution Class.


findStudentByGradeAndMonth Method:

This method will take an array of Student objects, char value as grade and int value as month
for input parameters.The method will find out all Students from the given grade and month.
This method will return array of Student object ascending based on their rollNo if found.
If there is no Student that matches, then the method should return null.

for this method- main method should print Student name, subject and total student found [The
length of the list], if the returned value is not null. If the returned value is null then
main method should print "No student found".


NOTE:
	1. For Taking char as input use sc.nextLine().charAt(0)
	2. To match/check the month You havee to convert int month in the parameter to String.
	3. No need to count the Student array if return not null just print the array length.


****************************************************************************



Consider the below input and output:


input1:

111
Arijit
Math
B
22/09/2023
101
Priyanka
English
A
30/03/2022
107
Shreosi
History
C
13/05/2022
105
Tatan
Physics
A
27/03/2022
A
3


output1:

Priyanka
English
Tatan
Physics
2





input2:

111
Sohel
Math
B
22/09/2022
101
Priyanka
English
A
30/03/2022
107
Gopa
History
C
12/05/2022
105
Kamal
Physics
A
27/03/2022
A
7



output 2:

No student found

 */
package Java_IPA;

import java.util.Arrays;
import java.util.Scanner;

public class StudentProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[4];

        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();
            String t = "", m = "", y = "";
            for (int j = 0; j < e.length(); j++) {
                if (j < 2) {
                    t = t + e.charAt(j);
                } else if (j > 2 && j < 5) {
                    m = m + e.charAt(j);
                } else if (j > 5) {
                    y = y + e.charAt(j);
                }
            }
            arr[i] = new Student(a, b, c, d, t, m, y);
        }


        char grade = sc.nextLine().charAt(0);
        int month = sc.nextInt();sc.nextLine();

        Student[] res = findStudentByGradeAndMonth(arr, month, grade);
        if (res != null) {
            for (int i = 0; i < res.length; i++) {
                System.out.println(res[i].getName());
                System.out.println(res[i].getSubject());
            }
            System.out.println(res.length);
        } else {
            System.out.println("No student found.");
        }
    }

    // Method
    public static Student[] findStudentByGradeAndMonth(Student[] arr, int month, char grade) {
        Student[] arr2 = new Student[0];

        for (int i = 0; i < arr.length; i++) { //String[] month = s[i].getDate().split("/");  If we take whole month then we can split it
            int givenMonth = Integer.parseInt(arr[i].getMonth()); // Converting string to integer month
            if (arr[i].getGrade() == grade && givenMonth == month) {
                arr2 = Arrays.copyOf(arr2, arr2.length + 1);
                arr2[arr2.length - 1] = arr[i];
            }
        }

        // Sorting by rollNo
        for (int i = 0; i < arr2.length - 1; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i].getRollNo() > arr2[j].getRollNo()) {
                    Student temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        if (arr2.length > 0) {
            return arr2;
        } else {
            return null;
        }
    }
}

// Student Class
class Student {
    private int rollNo;
    private String name;
    private String subject;
    private char grade;
    private String day;
    private String month;
    private String year;

    public Student(int rollNo, String name, String subject, char grade, String day, String month, String year) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
        this.grade = grade;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getters and Setters
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
//Another Better Solution
/*
package IPA17;
import java.util.*;
public class IPA17_AnotherSolution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Stud[] s = new Stud[4];
        for (int i = 0; i < s.length; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();

            s[i] = new Stud(a,b,c,d,e);
        }
        char g = sc.nextLine().charAt(0);
        int m = sc.nextInt();sc.nextLine();
        Stud[] ans1 = findStudent(s,g,m);
        if(ans1!=null)
        {
            for (int i = 0; i < ans1.length; i++)
            {
                System.out.println(ans1[i].getName());
                System.out.println(ans1[i].getSub());
            }
            System.out.println(ans1.length);
        }
        else
        {
            System.out.println("No student found");
        }
    }
    public static Stud[] findStudent(Stud[]s, char g, int m)
    {
        Stud[] arr = new Stud[0];
        for (int i = 0; i < s.length; i++)
        {
            String[] month = s[i].getDate().split("/");
            if(s[i].getGrade()==g && Integer.parseInt(month[1])==m)
            {
                arr = Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1] = s[i];
            }
        }
        Stud data;
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[i].getRoll()>arr[j].getRoll())
                {
                    data = arr[i];
                    arr[i]=arr[j];
                    arr[j]=data;
                }
            }
        }
        if(arr.length>0)
        {
            return arr;
        }
        else
        {
            return null;
        }
    }
}


class Stud
{
    private int roll;
    private String name;
    private String sub;
    private char grade;
    private String date;

    public Stud(int roll, String name, String sub, char grade, String date)
    {
        this.roll = roll;
        this.name = name;
        this.sub = sub;
        this.grade = grade;
        this.date = date;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}
 */

//import java.util.*;
//public class StudentProgram
//{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Student[] s = new Student[4];
//        for (int i = 0; i < s.length; i++)
//        {
//            int a = sc.nextInt();sc.nextLine();
//            String b = sc.nextLine();
//            String c = sc.nextLine();
//            char d = sc.nextLine().charAt(0);
//            String e = sc.nextLine();
//            String t="",m="",y="";
//            for(int j=0; j<e.length(); j++)
//            {
//                if(j<2)
//                {
//                    t = t+e.charAt(j);
//                }
//                else if(j>2 && j<5)
//                {
//                    m = m+e.charAt(j);
//                }
//                else if(j>5)
//                {
//                    y = y+e.charAt(j);
//                }
//            }
//
//            s[i] = new Student(a,b,c,d,t,m,y);
//        }
//        char g = sc.nextLine().charAt(0);
//        int m = sc.nextInt();sc.nextLine();
//        Student[] ans1 = findStudentByGradeAndMonth(s,g,m);
//        if(ans1!=null)
//        {
//            for (int i = 0; i < ans1.length; i++)
//            {
//                System.out.println(ans1[i].getName());
//                System.out.println(ans1[i].getSub());
//            }
//            System.out.println(ans1.length);
//        }
//        else
//        {
//            System.out.println("No student found");
//        }
//    }
//    public static Student[] findStudentByGradeAndMonth(Student[]s, char g, int m)
//    {
//        Student[] arr = new Student[0];
//        for (int i = 0; i < s.length; i++) {
//            int mon = Integer.parseInt(s[i].getMonth());
//            if(s[i].getGrade()==g && mon == m)
//            {
//                arr = Arrays.copyOf(arr,arr.length+1);
//                arr[arr.length-1] = s[i];
//            }
//        }
//        Student data;
//        for (int i = 0; i < arr.length-1; i++)
//        {
//            for (int j = i+1; j < arr.length; j++)
//            {
//                if(arr[i].getRoll()>arr[j].getRoll())
//                {
//                    data = arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=data;
//                }
//            }
//        }
//        if(arr.length>0)
//        {
//            return arr;
//        }
//        else
//        {
//            return null;
//        }
//    }
//}
//class Student
//{
//    private int roll;
//    private String name;
//    private String sub;
//    private String day;
//    private String month;
//    private String year;
//    private char grade;
//
//    public Student(int roll, String name, String sub, char grade, String day, String month, String year)
//    {
//        this.roll = roll;
//        this.name = name;
//        this.sub = sub;
//        this.grade = grade;
//        this.day = day;
//        this.month = month;
//        this.year =year;
//    }
//
//    public int getRoll() {
//        return roll;
//    }
//
//    public void setRoll(int roll) {
//        this.roll = roll;
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
//    public String getSub() {
//        return sub;
//    }
//
//    public void setSub(String sub) {
//        this.sub = sub;
//    }
//
//    public String getDay() {
//        return day;
//    }
//
//    public void setDay(String day) {
//        this.day = day;
//    }
//
//    public String getMonth()
//    {
//        return month;
//    }
//    public void setMonth(String month)
//    {
//        this.month = month;
//    }
//    public String getYear() {
//        return year;
//    }
//
//    public void setYear(String year) {
//        this.year = year;
//    }
//
//    public char getGrade() {
//        return grade;
//    }
//
//    public void setGrade(char grade) {
//        this.grade = grade;
//    }
//}