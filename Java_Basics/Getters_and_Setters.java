package Java_Basics;


class Person {
    // Private fields
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) { // Adding a simple validation
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }
}

public class Getters_and_Setters {
    // Main method to test the Person class
    public static void main(String[] args) {
        Person person = new Person("John", 25);

        // Using getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Using setters
        person.setName("Alice");
        person.setAge(30);

        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
    }
}
