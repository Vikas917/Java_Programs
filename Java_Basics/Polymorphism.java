package Java_Basics;

//Polymorphism  - poly means many & morphs means forms.
// Polymorphism in Java refers to the ability of an object to take on multiple forms.
// It allows one interface to be used for a general class of actions. There are two types:
//
// (1) Compile-time (or static) polymorphism: Achieved through method overloading.
// (2) Run-time (or dynamic) polymorphism: Achieved through method overriding.

//In Java, polymorphism is mainly used when a parent class reference is used to refer to a child class object.

interface Camera {
    void clickPicture();
}

interface GPS {
    void provideLocation();
}
class CellPhones {
    void mediaPlayer() {
        System.out.println("Play Video");
    }
}
class Smartphone1 extends CellPhones implements Camera,GPS {

    @Override
    public void clickPicture() {
        System.out.println("Take Picture");
    }

    @Override
    public void provideLocation() {
        System.out.println("Give me the location");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Camera cam = new Smartphone1();  // Can only implement camera methods not gps or other methods
        cam.clickPicture();

//        cam.mediaPlayer(); // Not possible because we are using reference of camera class
//        A phone can act as a camera but a camera cannot act as a phone
        GPS gps = new Smartphone1();   // Can only implement gps methods
        gps.provideLocation();
        Smartphone1 sp = new Smartphone1();  // Can  implement all smartphone methods
        sp.mediaPlayer();
    }
}
