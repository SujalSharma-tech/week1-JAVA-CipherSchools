import java.util.Scanner;

//Control Flow- Class 8
class car {
    String name;
    String color;
    int year;
    int maxspeed;

    void accelerate() {
        System.out.println("car is accelarating");
    }
}

class student {
    String name;
    int marks;

    boolean checkpass() {
        if (marks >= 40) {
            return true;
        } else {
            return false;
        }
    }
}

public class Lecture8 {
    int max(int a, int b, int c) {
        if (a > b) {
            if (a > c)
                return a;
        } else if (b > c) {
            return b;
        }
        return c;
    }

    public static void main(String[] args) {
        car polo = new car();
        polo.name = "supra";
        polo.color = "black";
        polo.year = 2019;
        polo.maxspeed = 420;
        System.out.println(polo.name = "honda");
        System.out.println(polo.color);
        System.out.println(polo.year);
        System.out.println(polo.year);

        student s1 = new student();
        s1.name = "sanjay";
        s1.marks = 30;
        student s2 = new student();
        s2.name = "matta";
        s2.marks = 90;
        System.out.println(s1.checkpass());
        System.out.println(s2.checkpass());
        Lecture8 cf = new Lecture8();
        System.out.println(cf.max(20, 10, 3));
        Scanner sc = new Scanner(System.in);
        s1.name = sc.nextLine();
        s1.marks = sc.nextInt();
        System.out.println(s1.checkpass());
        char c = 'a';
        switch (c) {
            case 'a':
                System.out.println("Hi, I am A");
                break;
            case 'b':
                System.out.println("Hi, I am B");
                break;
            default:
                System.out.println("I'm not A,B or C");
        }

        sc.close();
    }
}