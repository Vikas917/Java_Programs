package Java_IPA;
/*
create the class Course with the below Attributes.

courseId- int
courseName- String
courseAdmin- String
quiz - int
handson -int

The above methods should be private ,write getter and setter and parametrized constructor as required.

create class courseProgram with main method.

Implement two static methods-
   findAvgOfQuizByAdmin method : this method will take array of Course objects and a String  value as input parameters.
This method will find out Average (as int) of Quiz questions for given Course Admin (String parameter passed)
This method will return Average if found. If there is no course that matches then the method should return 0.

sortCourseByHandsOn method:
This method will take an Array of Course Objects and int value as input parameters.
This methods should return an Array of Course objects in ascending order of their  handson which are less than the
given handson(int parameter passed) value. if there is no such course then the method should return null.

The above-mentioned static methods should be called from main methods.

for findAvgOfQuizByAdmin method : The main method should print the average if the returned value is not 0.
if the returned value is 0 then it should print "No Course found."


for sortCourseByHandsOn method:
                        the  main method should print the name of the Course from the returned Course object Array if the
returned value is not null.if the returned value is null then it should print "No Course found with mentioned attribute."

input1:
111
kubernetes
Nisha
40
10
321
cassandra
Roshini
30
15
457
Apache Spark
Nisha
30
12
987
site core
Tirth
50
20
Nisha
17

output1:
35
kubernetes
Apache Spark
cassandra

input2:
111
kubernetes
Nisha
40
10
321
cassandra
Roshini
30
15
457
Apache Spark
Nisha
30
12
987
site core
Tirth
50
20
Shubhamk
5

output 2:
No Course found
No Course found with mentioned attributes.
 */

import java.util.*;
public class CourseProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Course[] course = new Course[4];
        for(int i=0; i<4; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            int e = sc.nextInt();sc.nextLine();

            course[i] = new Course(a,b,c,d,e);
        }
        String admin = sc.nextLine();
        int hand = sc.nextInt();

        int ans1 = findAvgOfQuizByAdmin(course, admin);
        if(ans1!=0)
        {
            System.out.println(ans1);
        }
        else
        {
            System.out.println("No Course found");
        }

        Course[] ans2 = sortCourseByHandsOn(course, hand);
        if(ans2!=null)
        {
            for(int i=0; i<ans2.length; i++)
            {
                System.out.println(ans2[i].getCname());
            }
        }
        else
        {
            System.out.println("No Course found with mentioned attribute.");
        }
    }
    public static int findAvgOfQuizByAdmin(Course[]course, String admin)
    {
        int sum=0, count=0;
        for(int i=0; i<course.length; i++)
        {
            if(course[i].getCadmin().equalsIgnoreCase(admin))
            {
                sum = sum+course[i].getQuiz();
                count++;
            }
        }
        if(count>0)
        {
            int avg = sum/count;
            return avg;
        }
        else
        {
            return 0;
        }
    }

    public static Course[] sortCourseByHandsOn(Course[] course, int handsOn)
    {
        Course[] obj = new Course[0];
        for(int i=0; i<course.length; i++)
        {
            if(course[i].getHandson() < handsOn)
            {
                obj = Arrays.copyOf(obj, obj.length+1);
                obj[obj.length-1] = course[i];
            }
        }
        Course val;
        for(int i=0;i<obj.length;i++)
        {
            for(int j=i+1; j<obj.length; j++)
            {
                if(obj[i].getHandson()>obj[j].getHandson())
                {
                    val = obj[i];
                    obj[i] = obj[j];
                    obj[j] = val;
                }
            }
        }
        if(obj.length > 0)
        {
            return obj;
        }
        else
        {
            return null;
        }
    }
}
class Course
{
    private int cid, quiz, handson;
    private String cname, cadmin;

    public Course(int cid, String cname, String cadmin, int quiz, int handson)
    {
        this.cid = cid;
        this.cname = cname;
        this.cadmin = cadmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    public int getCid()
    {
        return cid;
    }
    public void setCid(int cid)
    {
        this.cid = cid;
    }
    public String getCname()
    {
        return cname;
    }
    public void setCname(String cname)
    {
        this.cname = cname;
    }
    public String getCadmin()
    {
        return cadmin;
    }
    public void setCadmin(String cadmin)
    {
        this.cadmin = cadmin;
    }
    public int getQuiz()
    {
        return quiz;
    }
    public void setQuiz(int quiz)
    {
        this.quiz = quiz;
    }
    public int getHandson()
    {
        return handson;
    }
    public void setHandson(int handson)
    {
        this.handson = handson;
    }
}

//class Course {
//    // Private attributes
//    private int courseId;
//    private String courseName;
//    private String courseAdmin;
//    private int quiz;
//    private int handson;
//
//    // Parametrized constructor
//    public Course(int courseId, String courseName, String courseAdmin, int quiz, int handson) {
//        this.courseId = courseId;
//        this.courseName = courseName;
//        this.courseAdmin = courseAdmin;
//        this.quiz = quiz;
//        this.handson = handson;
//    }
//
//    // Getters and setters
//    public int getCourseId() {
//        return courseId;
//    }
//
//    public void setCourseId(int courseId) {
//        this.courseId = courseId;
//    }
//
//    public String getCourseName() {
//        return courseName;
//    }
//
//    public void setCourseName(String courseName) {
//        this.courseName = courseName;
//    }
//
//    public String getCourseAdmin() {
//        return courseAdmin;
//    }
//
//    public void setCourseAdmin(String courseAdmin) {
//        this.courseAdmin = courseAdmin;
//    }
//
//    public int getQuiz() {
//        return quiz;
//    }
//
//    public void setQuiz(int quiz) {
//        this.quiz = quiz;
//    }
//
//    public int getHandson() {
//        return handson;
//    }
//
//    public void setHandson(int handson) {
//        this.handson = handson;
//    }
//}
//
//class CourseProgram {
//    public static void main(String[] args) {
//        // Input courses
//        Course[] courses = new Course[]{
//                new Course(111, "kubernetes", "Nisha", 40, 10),
//                new Course(321, "cassandra", "Roshini", 30, 15),
//                new Course(457, "Apache Spark", "Nisha", 30, 12),
//                new Course(987, "site core", "Tirth", 50, 20)
//        };
//
//        // Call findAvgOfQuizByAdmin method
//        int avgQuiz = findAvgOfQuizByAdmin(courses, "Nisha");
//        if (avgQuiz != 0) {
//            System.out.println(avgQuiz);
//        } else {
//            System.out.println("No Course found.");
//        }
//
//        // Call sortCourseByHandsOn method
//        Course[] sortedCourses = sortCourseByHandsOn(courses, 17);
//        if (sortedCourses != null) {
//            for (Course course : sortedCourses) {
//                System.out.println(course.getCourseName());
//            }
//        } else {
//            System.out.println("No Course found with mentioned attributes.");
//        }
//    }
//
//    // Method to find average of quiz by course admin
//    public static int findAvgOfQuizByAdmin(Course[] courses, String admin) {
//        int totalQuiz = 0;
//        int count = 0;
//        for (Course course : courses) {
//            if (course.getCourseAdmin().equals(admin)) {
//                totalQuiz += course.getQuiz();
//                count++;
//            }
//        }
//        return count > 0 ? totalQuiz / count : 0;
//    }
//
//    // Method to sort courses by hands-on
//    public static Course[] sortCourseByHandsOn(Course[] courses, int handsonLimit) {
//        // Count courses that meet the condition
//        int count = 0;
//        for (Course course : courses) {
//            if (course.getHandson() < handsonLimit) {
//                count++;
//            }
//        }
//
//        // Return null if no courses meet the condition
//        if (count == 0) {
//            return null;
//        }
//
//        // Create a new array for courses with handson < handsonLimit
//        Course[] filteredCourses = new Course[count];
//        int index = 0;
//        for (Course course : courses) {
//            if (course.getHandson() < handsonLimit) {
//                filteredCourses[index++] = course;
//            }
//        }
//
//        // Sort the filtered courses by handson in ascending order
//        java.util.Arrays.sort(filteredCourses, (c1, c2) -> Integer.compare(c1.getHandson(), c2.getHandson()));
//
//        return filteredCourses;
//    }
//}
//

//import java.util.Arrays;
//import java.util.Scanner;
//
//class Course {
//    private int courseId;
//    private String courseName;
//    private String courseAdmin;
//    private int quiz;
//    private int handson;
//
//    Course(int courseId,String courseName,String courseAdmin,int quiz,int handson){
//        this.courseAdmin = courseAdmin;
//        this.courseId = courseId;
//        this.handson = handson;
//        this.quiz = quiz;
//        this.courseName = courseName;
//    }
//
//
//    public String getCourseName() {
//        return courseName;
//    }
//
//    public void setCourseName(String courseName) {
//        this.courseName = courseName;
//    }
//
//    public String getCourseAdmin() {
//        return courseAdmin;
//    }
//
//    public void setCourseAdmin(String courseAdmin) {
//        this.courseAdmin = courseAdmin;
//    }
//
//    public int getQuiz() {
//        return quiz;
//    }
//
//    public void setQuiz(int quiz) {
//        this.quiz = quiz;
//    }
//
//    public int getHandson() {
//        return handson;
//    }
//
//    public void setHandson(int handson) {
//        this.handson = handson;
//    }
//
//    public int getCourseId() {
//        return courseId;
//    }
//
//    public void setCourseId(int courseId) {
//        this.courseId = courseId;
//    }
//}
//
//public class CourseProgram {
//    public static Course[] main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Course[] courses = new Course[4];
//
//        for(int i = 0; i < 4; i++) {
//            int a = sc.nextInt();sc.nextLine();
//            String b = sc.nextLine();
//            String c = sc.nextLine();
//            int d = sc.nextInt();sc.nextLine();
//            int e = sc.nextInt();sc.nextLine();
//
//            courses[i] = new Course(a,b,c,d,e);
//        }
//
//        String admin = sc.nextLine();
//        int hand = sc.nextInt();
//
//
//        public static int findAvgOfQuizByAdmin(Course[] courses, String admin) {
//            int sum = 0, count = 0;
//            for(int i = 0;i < courses.length;i++) {
//                if(courses[i].getCourseAdmin().equalsIgnoreCase(admin)) {
//                    sum += courses[i].getQuiz();
//                    count++;
//                }
//            }
//            if (count > 0) {
//                int avg = sum / count;
//                return avg;
//            }
//            else return 0;
//        }
//
//        public static Course[] sortCourseByHandsOn(Course[] courses, int h) {
//            Course[] obj = new Course[0];
//            for(int i = 0;i < courses.length;i++) {
//                if (courses[i].getHandson() < h) {
//                    obj = Arrays.copyOf(obj, obj.length+1);
//                    obj[obj.length - 1] = courses[i];
//                }
//            }
//            Course val;
//            for(int i = 0;i < obj.length;i++) {
//                for(int j = i+1;j < obj.length;j++) {
//                    if (obj[i].getHandson() > obj[j].getHandson()) {
//                        val = obj[i];
//                        obj[i] = obj[j];
//                        obj[j] = val;
//                    }
//                }
//            }
//            if (obj.length > 0) {
//                return obj;
//            }
//            else return null;
//        }
//    }
//}
