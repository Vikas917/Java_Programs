package Java_Basics;

class Employee {
    // Attributes
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        //this keyword in Java to refer current object, invoke methods, constructors, and return values
        // Using 'this' to refer to instance variables
        this.id = id;    // 'this.id' refers to the instance variable, 'id' refers to the parameter
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to increase salary
    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * (percentage / 100);
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee(101, "John Doe", 50000);

        // Displaying employee details
        emp.displayEmployeeDetails();

        // Increasing salary
        emp.increaseSalary(10); // 10% increase

        // Displaying updated employee details
        System.out.println("After salary increase:");
        emp.displayEmployeeDetails();

        /*

          (1) Attributes: id, name, and salary.
          (2) Constructor: Initializes the employee details.
          (3) Getters/Setters: Access and modify employee information.
          (4) Increase Salary: Method to increase the salary by a percentage.
          (5) Display Method: Prints employee details.

         */
    }
}
