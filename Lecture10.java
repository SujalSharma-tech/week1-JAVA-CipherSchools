// this keyword
// static keyword and its uses
public class Lecture10 {
    int rollno;
    String name;
    static int count = 0;

    Lecture10(int rollno, String nameString) {
        this.rollno = rollno;
        this.name = nameString;
        count++;
    }

    static void show() {
        System.out.println(count);
    }

    public static void main(String[] args) {
        Lecture10 a = new Lecture10(1, "aman");
        System.out.println(count);
        Lecture10 b = new Lecture10(2, "harsh");
        System.out.println(count);
        Lecture10 c = new Lecture10(3, "Sujal");
        System.out.println(Lecture10.count);
        Lecture10.show();
    }
}