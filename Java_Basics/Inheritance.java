package Java_Basics;

//Inheritance in java - It is used borrow properties & methods from an existing class
class BaseClass {//Super Class or Base Class
    public int x;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base class now & setting class");
        this.x = x;
    }

    public boolean baseClassDetails() {
        System.out.println("I am in base class");
        return false;
    }
}
class DerivedClass extends BaseClass { //SubClass or Derived Class
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Base1 {
    Base1(){
        System.out.println("I m in base1 class constructor");
    }
    Base1(int x){
        System.out.println("I m an overloaded base1 class constructor with x: " + x);
    }
}
class Derived1 extends Base1 {
    Derived1() {
//        super();
        System.out.println("I m in derived1 class constructor");
    }
    Derived1(int x, int y) {
        super(x);
        System.out.println("I m an overloaded derived1 class constructor with y: " + y);
    }
}
class ChildDerived extends Derived1 {
    ChildDerived() {
        //super(1,2);
        System.out.println("I m child derived class constructor");
    }
    ChildDerived(int x, int y, int z) {
        super(x,y);
        System.out.println("I m an overloaded derived1 class constructor with z: " + z);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        /*
        BaseClass base = new BaseClass();
        base.setX(4);
        //base.setY(4); We cannot set subclass property in superclass
        System.out.println(base.getX());
        System.out.println(base.baseClassDetails());

        DerivedClass derived = new DerivedClass();
        derived.setX(5); //But We can set superclass property in subclass
        System.out.println(derived.getX());
        */

        //Base1 b1 = new Base1();
        //Derived1 d1 = new Derived1(6,7);
        ChildDerived cd =  new ChildDerived(1,2,3);
    }
}
