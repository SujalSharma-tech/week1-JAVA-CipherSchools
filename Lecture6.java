public class Lecture6 {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        System.out.println("X is: " + x);
        System.out.println("Y is: " + y);

        byte b = 10;
        System.out.println("B is: " + b);

        byte b2 = (byte) 129;
        System.out.println("B2 is: " + b2);

        byte b3 = (byte) 128;
        System.out.println("B3 is: " + b3);

        byte b4 = (byte) 256;
        System.out.println("B4 is: " + b4);

        int i = b;
        System.out.println("I is: " + i);

        float f = (float) 5.5;
        System.out.println("F is: " + f);
        float f2 = 5.5f;
        System.out.println("F2 is: " + f2);
        double d = 10.5d;
        System.out.println("D is: " + d);

        char ch = 'a';
        System.out.println(ch);

        // Task - 1

        int a = Character.getNumericValue(ch);
        System.out.println("A is: " + a); // no use
        char c = 'a';
        System.out.println(c);
        int xa = c;
        System.out.println("XA is: " + xa);

        System.out.println((int) ('a')); // 97
        System.out.println((int) ('A')); // 65

        char c3 = 'e';
        int e = c3 - 'a';
        System.out.println("E is: " + e);

        int m = 5;
        int n = m++;
        System.out.println("M is " + m);
        System.out.println("N is: " + n);

        int p = 5;
        int q = ++p;
        System.out.println("P is " + p + ", Q is: " + q);
    }
}
