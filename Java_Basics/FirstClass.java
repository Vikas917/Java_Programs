package Java_Basics;



//Declaring the class Employee
class NewEmployee {
    //Initializing the attributes
    int id;
    String name;
    double salary;

//    public void printDetails() {
//        System.out.println("The Employee details are: ");
//        System.out.println("The Employee id is: " + id);
//        System.out.println("The Employee name is: " + name);
//        System.out.println("The Employee salary is: " + salary);
//    }

//    public double salaryIncrement() {
//        return salary*5;
//    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}

class Phone {
    public void ringing() {
        System.out.println("The phone is ringing...");
    }
    public void calling() {
        System.out.println("The phone is calling...");
    }
}
class Square {
    public int area(int n) {
        return n*n;
    }
    public int perimeter(int n) {
        return 4*n;
    }
}
class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference(int radius) {
        return 2 * Math.PI * radius;
    }
}

public class FirstClass {
    public static void main(String[] args) {
        //Initializing the object harry using new keyword
        NewEmployee harry = new NewEmployee();
//        harry.id = 1; // Setting the attributes
//        harry.name = "Harry";
//        harry.salary = 50000.00;

        //Initializing the object john using new keyword
        NewEmployee john = new NewEmployee();
        john.id = 2;
        john.name = "John";
        john.salary = 40000.00;

//        harry.printDetails();
//        System.out.println("The Employee salary after increment is: " + harry.salaryIncrement());
//        john.printDetails();

        System.out.println(harry.getId());
        System.out.println(harry.getName());
        harry.setName("Alice");
        System.out.println(harry.getName());

        Phone samsung = new Phone();
        samsung.calling();
        samsung.ringing();

        Square s1 = new Square();
        System.out.println("Area of square is: " + s1.area(4));
        System.out.println("Perimeter of square is: " + s1.perimeter(5));

        Circle c1 = new Circle(3);
        System.out.println("Radius of circle is: " + c1.getRadius());
        c1.setRadius(4);
        System.out.println("Radius of circle is: " + c1.getRadius());
        System.out.println("Area of circle is: " + c1.area());
        System.out.println("Circumference of circle is: " + c1.circumference(6));
    }
}
