//Abstraction- Class 12

abstract class car {
    int maxspeed = 20;

    abstract void accelerate();

    void show() {
        System.out.println("hello");
    }

    abstract void brake();

}

class bmw extends car {
    void accelerate() {
        System.out.println("BMW is accelerating");
    }

    void brake() {

    }
}

class bmw1 extends bmw {
    void brake() {
        System.out.println("BMW is braking");
    }

    void accelerate() {
        System.out.println("BMW is accelerating");
    }
}

abstract class A {
    int a = 10;

    void show1() {
        System.out.println(a + " " + "Hi i am a concrete method in abstract class");
    }
}

class B extends A {
    void show() {
        System.out.println(a);
    }
}

public class Lecture12 {
    public static void main(String[] args) {
        // car c=new car();//This is not possible..
        bmw b = new bmw();
        b.accelerate();
        bmw1 b1 = new bmw1();
        b1.accelerate();
        B n = new B();
        n.show();
        n.show1();
    }
}