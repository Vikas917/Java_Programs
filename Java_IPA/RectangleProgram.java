/*
Create a class Rectangle with the following attributes:

length - double
breadth - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Solution with the main method.

Implement two static methods - calculateArea and calculatePerimeter in Solution class.

calculateArea method:
This method will take a Rectangle object as input.
The method will calculate the area of the rectangle and return it as a double.

calculatePerimeter method:
This method will take a Rectangle object as input.
The method will calculate the perimeter of the rectangle and return it as a double.

These above mentioned static methods should be called from the main method.

For calculateArea method - The main method should print the area returned by the method.

For calculatePerimeter method - The main method should print the perimeter returned by the method.

Before calling these static methods in main, use Scanner object to read the values of two Rectangle objects referring
attributes in the above mentioned attribute sequence.

Example Input:
5.5
3.2
7.0
4.5

Example Output:
17.6
17.4
31.5
23.0
 */
package Java_IPA;

import java.util.Arrays;
import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle[] arr = new Rectangle[2];

        for (int i=0;i< arr.length;i++) {
            double a = sc.nextDouble();sc.nextLine();
            double b = sc.nextDouble();sc.nextLine();

            arr[i]  = new Rectangle(a,b);
        }

        double[] ans = calculateArea(arr);
        for (int i =0;i<ans.length;i++) {
            System.out.println(ans[i]);
        }
        double[] res = calculatePerimeter(arr);
        for (int i =0;i<res.length;i++) {
            System.out.println(res[i]);
        }
    }
    public static double[] calculateArea(Rectangle[] arr) {
        double[] rectangles = new double[0];
        double area;
        for (int i=0;i<arr.length;i++) {
            area =  arr[i].getLength() * arr[i].getBreadth();
            rectangles = Arrays.copyOf(rectangles,rectangles.length+1);
            rectangles[rectangles.length-1] = area;
        }
        if (rectangles.length > 0) {
            return rectangles;
        }
        return null;
    }
    public static double[] calculatePerimeter(Rectangle[] arr) {
        double[] rectangles = new double[0];
        double perimeter;
        for (int i=0;i<arr.length;i++) {
            perimeter =  2 * (arr[i].getLength() * arr[i].getBreadth());
            rectangles = Arrays.copyOf(rectangles,rectangles.length+1);
            rectangles[rectangles.length-1] = perimeter;
        }
        if (rectangles.length > 0) {
            return rectangles;
        }
        return null;
    }
}
class Rectangle {
    double length,breadth;

    public Rectangle(double length,double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getBreadth() {
        return breadth;
    }
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
}
