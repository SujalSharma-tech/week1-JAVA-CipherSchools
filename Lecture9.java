// multiple inheritence
//classes and properties
class A {
    int a, b;

    public void show() {
        System.out.println("Hello!");
    }
}

class B extends A {
    int c, d;

    public void write() {
        System.out.println("Writing!!");
    }
}

class C extends B {
    int e, f;

    public void speak() {
        System.out.println("Speaking");
    }
}

class D extends C {
    int g, h;

    public void eat() {
        System.out.println("eating");
    }
}

class E extends C {
    int i, j;

    public void cry() {
        System.out.println("Crying");
    }
}

interface A1 {
    public void doing();
}

interface B1 {
    public void done();
}

class C1 implements A1, B1 {
    public void done() {

    }

    public void doing() {

    }
}

class C2 extends A implements A1 {
    public void doing() {

    }
}

public class Lecture9 {
    public static void main(String[] args) {

        B b = new B();
        b.show();
        D d = new D();
        d.show();
        E e = new E();
        e.speak();
    }
}
