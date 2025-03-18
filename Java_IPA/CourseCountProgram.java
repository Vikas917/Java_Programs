/*
Create a Class Course with below attributes:

CourseId - Int
CourseName - String
CourseRating - double
Mode - String
HaveCertificate - boolean

Write getters, setters and parameterized constructor as required.

Create class Solution with main method.

Implement static method - CountCourse in Solution class.

This method will take a String parameter and a double parameter along with the other parameter as array of Course objects.
The method will return the total number of courses which have certificate facility and the rating of the course object is greater
than or equal to the given parameter with match the mode(with case insensitive search).

If no count is there then print "No course found".

Consider below sample input and output:

Input 1:
------------
1001
Java
5
Online
True
1002
Python
3
Offline
False
1003
HTML
4
Offline
True
1004
JavaScript
2
Online
False
3
Online


Output 1:
------------
1

=========================================

Input 2:
------------

1001
Java
5
Online
True
1002
Python
3
Offline
False
1003
HTML
4
Offline
True
1004
JavaScript
2
Online
False
5
Offline

Output 2:
-------------
No course found
 */
package Java_IPA;

import java.util.Scanner;

public class CourseCountProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CourseCount[] arr = new CourseCount[4];
        for (int i = 0; i < arr.length; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble();sc.nextLine();
            String d = sc.nextLine();
            boolean e = sc.nextBoolean();sc.nextLine();

            arr[i] = new CourseCount(a,b,c,d,e);
        }
        double rating = sc.nextDouble();sc.nextLine();
        String mode = sc.nextLine();

        int ans = CountCourse(arr,mode,rating);
        if (ans > 0) {
            System.out.println(ans);
        }
        else {
            System.out.println("No course found");
        }

    }
    public static int CountCourse(CourseCount[] arr,String mode, double rating) {
        int count = 0;
        for (int i=0;i< arr.length;i++) {
            if (arr[i].isHaveCertificate() && arr[i].getMode().equalsIgnoreCase(mode) && arr[i].getCourseRating() >= rating) {
                count++;
            }
        }
        return count;
    }
}
class CourseCount {
    int CourseId;
    String CourseName;
    double CourseRating;
    String Mode;
    boolean HaveCertificate;

    public int getCourseId() {
        return CourseId;
    }

    public void setCourseId(int courseId) {
        CourseId = courseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public double getCourseRating() {
        return CourseRating;
    }

    public void setCourseRating(double courseRating) {
        CourseRating = courseRating;
    }

    public String getMode() {
        return Mode;
    }

    public void setMode(String mode) {
        Mode = mode;
    }

    public boolean isHaveCertificate() {
        return HaveCertificate;
    }

    public void setHaveCertificate(boolean haveCertificate) {
        HaveCertificate = haveCertificate;
    }

    public CourseCount(int courseId, String courseName, double courseRating, String mode, boolean haveCertificate) {
        CourseId = courseId;
        CourseName = courseName;
        CourseRating = courseRating;
        Mode = mode;
        HaveCertificate = haveCertificate;
    }
}
