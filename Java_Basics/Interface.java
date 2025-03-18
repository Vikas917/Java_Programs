//Interface in java is a package of similar or related methods.
// In Java, an interface is a blueprint of a class that can contain abstract methods (methods without a body) and constants.
// It is used to specify a set of behaviors (methods) that a class must implement.
// Unlike an abstract class, an interface cannot have any concrete methods before Java 8.
// However, since Java 8, interfaces can also contain default methods and static methods.

package Java_Basics;
interface CellPhone {
    int num = 45;
    void switchOn();
    void switchOff();
}
interface TouchPhone {
    void playMusic();
    private void takeSnap() {
        System.out.println("Taking Snap");
    }
    default void playVideo() {
        takeSnap(); //Default method is used to call private method not static
        System.out.println("Play Video");
    }
    static void playGame(String game) {
        //takeSnap();
        System.out.println("Playing " + game);
    }

}
//We can implement more than 1 interface
class Nokia implements CellPhone, TouchPhone {

    @Override
    public void switchOn() {
        System.out.println("Switch on the phone");
    }

    @Override
    public void switchOff() {
        System.out.println("Switch off the phone");
    }

    void Flash(){
        System.out.println("Turn on the Flash Light");
    }

    @Override
    public void playMusic() {
        System.out.println("Play Music");
    }

//    @Override
//    public void playVideo() {
//        System.out.println("Playing video in Nokia");
//    }
}

interface methods {
    void meth1();
    void meth2();
}
// We can extend an interface by another interface
interface methods2 extends methods {
    void meth3();
    void meth4();
}
//But we cannot extend interface by class
//class SampleClass extends methods
class InheritanceInInterface implements methods2{

    @Override
    public void meth3() {
        System.out.println("Method1");
    }

    @Override
    public void meth4() {
        System.out.println("Method1");
    }

    @Override
    public void meth1() {
        System.out.println("Method1");
    }

    @Override
    public void meth2() {
        System.out.println("Method1");
    }
}
public class Interface {
    public static void main(String[] args) {
       // CellPhone c = new CellPhone();
        Nokia n = new Nokia();
//        n.switchOff();
//        n.switchOn();
//        n.Flash();
//        n.playMusic();
//        n.playVideo();
//        System.out.println(n.num);
//        n.num = 56; Not possible as num is final
//        n.playVideo();
//
////        n.playGame("BS"); We cannot call this method like this
//        TouchPhone.playGame("Brawl Stars"); // We have to call static method by its Interface

        InheritanceInInterface inInterface = new InheritanceInInterface();
        inInterface.meth1();
    }
}
