/*
Create a Class Course with below attributes:

CourseName - String
CourseNumber - int
Mode - String
Sharedata - boolean

Write getters, setters and parameterized constructor as required.

Create class Solution with main method.

Implement static method - findCourseStatus in Solution class.

This method will take a String parameter along with the other parameter as array of Course objects.
The method will return status where the String parameter appears in the side attribute (with case insensitive search).

If the number of the course greater than equal to 1000, print "High", if greater or equal to 500 but less than 1000 then print
"Medium" and if less than 500 then print "Low".

If the taken string not match with the Course name then print "No course found".


Consider below sample input and output:

Input 1:
------------
Java
1200
Online
False
Python
600
Offline
False
HTML
800
Offline
False
JavaScript
300
Online
True
Python

Output 1:
------------
Medium
=========================================
Input 2:
------------
Java
1200
Online
False
Python
600
Offline
False
HTML
800
Offline
False
JavaScript
300
Online
True
PHP

Output 2:
-------------
No course found
 */
package Java_IPA;

import java.util.Arrays;
import java.util.Scanner;

public class CourseStatusProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CourseStatus[] arr = new CourseStatus[4];
        for (int i = 0; i < arr.length; i++)
        {
            String a = sc.nextLine();
            int b = sc.nextInt();sc.nextLine();
            String c = sc.nextLine();
            boolean d = sc.nextBoolean();sc.nextLine();

            arr[i] = new CourseStatus(a,b,c,d);
        }
        String courseName = sc.nextLine();

//        CourseStatus[] ans = findCourseStatus(arr,courseName);
//        if (ans != null) {
//            for (int i=0;i<ans.length;i++) {
//                if (ans[i].getCourseNumber() >= 1000) {
//                    System.out.println("High");
//                }
//                else if (ans[i].getCourseNumber() >= 500 && ans[i].getCourseNumber() < 1000) {
//                    System.out.println("Medium");
//                }
//                else {
//                    System.out.println("Low");
//                }
//            }
//        }
//        else {
//            System.out.println("No course found.");
//        }

        String res = findCourseStatus(arr,courseName);
        if (res != null) {
            System.out.println(res);
        }
        else {
            System.out.println("No course found");
        }


    }
//    public static CourseStatus[] findCourseStatus(CourseStatus[] arr, String courseName) {
//        CourseStatus[] courses = new CourseStatus[0];
//        for (int i=0;i< arr.length;i++) {
//            if (arr[i].getCourseName().equalsIgnoreCase(courseName)) {
//                courses = Arrays.copyOf(courses,courses.length+1);
//                courses[courses.length-1] = arr[i];
//            }
//        }
//        if (courses.length > 0) {
//            return courses;
//        }
//        else {
//            return null;
//        }
//    }

    public static String findCourseStatus(CourseStatus[] c, String n)
    {
        for (int i = 0; i < c.length; i++) {
            if(c[i].getCourseName().equalsIgnoreCase(n))
            {
                if(c[i].getCourseNumber()>=1000)
                {
                    return "High";
                }
                else if(c[i].getCourseNumber()>=500 && c[i].getCourseNumber()<1000)
                {
                    return "Medium";
                }
                else
                {
                    return "Low";
                }
            }
        }
        return null;
    }
}
class CourseStatus {
    String CourseName;
    int CourseNumber;
    String Mode;
    boolean Sharedata;

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public int getCourseNumber() {
        return CourseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        CourseNumber = courseNumber;
    }

    public String getMode() {
        return Mode;
    }

    public void setMode(String mode) {
        Mode = mode;
    }

    public boolean isSharedata() {
        return Sharedata;
    }

    public void setSharedata(boolean sharedata) {
        Sharedata = sharedata;
    }

    public CourseStatus(String courseName, int courseNumber, String mode, boolean sharedata) {
        CourseName = courseName;
        CourseNumber = courseNumber;
        Mode = mode;
        Sharedata = sharedata;
    }
}
