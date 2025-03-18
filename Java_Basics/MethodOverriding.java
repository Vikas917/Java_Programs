//Method Overriding - It is the same method as that of super class in the subclass.
// We can make some changes in it, so that's called Method Overriding.

package Java_Basics;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks...");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows...");
    }
}

class Phones {
    public void greeting() {
        System.out.println("Hello User!");
    }
    public void calling() {
        System.out.println("Someone is calling...");
    }
}
class SmartPhone extends Phones {
    @Override
    public void greeting() {
        System.out.println("Namaste User!");
    }
    public void music() {
        System.out.println("Playing Music..");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
//       Phones ph = new Phones();
//       ph.greeting();
//       SmartPhone sp = new SmartPhone();
//       sp.greeting();

//       Dynamic Method Dispatch --

//       Super phs = new SubClass();          //  Allowed
//        SubClass sps = new Super();       //  Not Allowed


        Phones phs = new SmartPhone();          //  Allowed
//        SmartPhone sps = new Phones();       //  Not Allowed

//        phs.greeting();    // Overridden method is called
//        phs.calling();

//         phs.music();      //We cannot use subclass methods

//        Cat c = new Cat();
//        c.makeSound();

        Animal myAnimal;

        myAnimal = new Dog();
        myAnimal.makeSound(); // Outputs: Dog barks

        myAnimal = new Cat();
        myAnimal.makeSound(); // Outputs: Cat meows
    }
}
