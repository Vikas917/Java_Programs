package Java_Basics;

//Abstract Class - Abstract in english language means existing in idea or thoughts only & has no physical existence.
// In Java, an abstract class is a class that cannot be instantiated directly.
// It is used to define a template for other classes, allowing you to declare methods that must be implemented by any subclass.
// Abstract classes are typically used when you want to share common code among several related classes
// while still requiring specific behavior to be defined in each subclass.

// Abstract class
abstract class Animals {
    public String name;
    // Abstract method (does not have a body)
    public abstract void sound();

    Animals() {
        System.out.println("Abstract class constructor is called.");
    }
    public Animals(String name) {
        this.name = name;
    }

    // Concrete method (has a body)
    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

// Subclass (inherited from Animal)
class Dogs extends Animals {
    // Providing implementation of the abstract method

    Dogs() {
        System.out.println("Sub class constructor is called");
    }
    Dogs(String name) {
        System.out.println("This Animal sound is " + name);
    }
    public void sound() {
        System.out.println("The dog barks." + name);
    }
}
class Cats extends Animals {

    @Override
    public void sound() {
        System.out.println("The Cat meows.");
    }
}
/*
abstract class Parent {
    void hello(){
        System.out.println("Hello!");
    }
    abstract void greet(); //Abstract method has no body & has  no implementations.
}
class Child extends Parent { //Concrete Class
    @Override
    void greet() {
        System.out.println("Namaste");
    }
}

 */
public class AbstractClass {
    public static void main(String[] args) {
//        Parent p = new Parent(); //Abstract class cannot be instantiated directly.
//        Parent p = new Child(); //It can be called indirectly using dynamic method dispatch.
//        p.greet();
//        p.hello();
//        Child c = new Child();
//        c.greet();
//        c.hello();
        Animals dog = new Dogs();  // Polymorphism
//        dog.sound();             // Calls the implemented method in Dog class
//        dog.sleep();             // Calls the inherited method from Animal class
        Animals cat = new Cats();
//        cat.sound();
        Dogs d = new Dogs("Sher");
        d.sound();
    }
}
