/*
Create a class Student with the following attributes:

name - String
rollNo - String
age - int
gender - char ('M' for male and 'F' for female)
course - String
semester - int
GPA - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Solution with the main method.

Implement two static methods - calculateAverageGPA and getStudentsByCourse in Solution class.

calculateAverageGPA method:
This method will take an array of Student objects as input.
The method will return the average GPA of all the students in the array.
If the array is empty, the method should return 0.

getStudentsByCourse method:
This method will take two input parameters - array of Student objects and a course (string).
The method will return an array of Student objects that are enrolled in the specified course.
If no student with the given course is present in the array of Student objects, then the method should return an empty array.

These above mentioned static methods should be called from the main method.

For calculateAverageGPA method - The main method should print the average GPA returned by the method.
If the returned value is 0, then it should print "Sorry - No students are available".

For getStudentsByCourse method - The main method should print the name, roll number and GPA of the returned Student objects.
If the returned value is an empty array, then it should print "Sorry - No students are available for the given course".

Before calling these static methods in main, use Scanner object to read the values of four Student objects referring
attributes in the above mentioned attribute sequence. Next, read the value for a course.

Example Input:
------------------------
John
1234
20
M
CSE
2
3.5
Alice
5678
19
F
EEE
1
3.7
Bob
9101
21
M
CSE
4
3.9
Sarah
2345
20
F
ME
3
3.2
CSE

Example Output:
---------------------------
3.6
John
1234
3.5
Bob
9101
3.9
 */
package Java_IPA;

import java.util.Arrays;
import java.util.Scanner;

public class StudentCourse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudCourse[] arr = new StudCourse[4];


        for (int i = 0; i < arr.length; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();
            int g = sc.nextInt();sc.nextLine();
            double h = sc.nextDouble();sc.nextLine();

            arr[i] = new StudCourse(a,b,c,d,e,g,h);
        }
        String course = sc.nextLine();

        double ans1 = calculateAverageGPA(arr);
        if(ans1 != 0)
        {
            System.out.printf("%.1f",ans1);
            System.out.println();
        }
        else
        {
            System.out.println("Sorry - No students are available");
        }

        StudCourse[] res = getStudentsByCourse(arr,course);
        if (res!=null) {
            for (int i=0;i<res.length;i++) {
                System.out.println(res[i].getName());
                System.out.println(res[i].getRollNo());
                System.out.println(res[i].getGPA());
            }
        }
        else {
            System.out.println("Sorry - No students are available for the given course");
        }
    }


    public static double calculateAverageGPA(StudCourse[] arr) {
        double sum = 0;
        int count = 0;
        for (int i=0;i< arr.length;i++) {
            sum += arr[i].getGPA();
            count++;
        }
        return sum/count;
    }

    public static StudCourse[] getStudentsByCourse(StudCourse[] arr, String course) {
        StudCourse[] courses = new StudCourse[0];
        for (int i=0;i< arr.length;i++) {
            if (arr[i].getCourse().equalsIgnoreCase(course)) {
                courses = Arrays.copyOf(courses,courses.length+1);
                courses[courses.length-1] = arr[i];
            }
        }
        if (courses.length > 0) {
            return courses;
        }
        return null;
    }
}
class StudCourse {
    String name;
    String rollNo;
    int age;
    char gender;
    String course;
    int semester;
    double GPA;

    public StudCourse(String name, String rollNo, int age, char gender, String course, int semester, double GPA) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.gender = gender;
        this.course = course;
        this.semester = semester;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
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