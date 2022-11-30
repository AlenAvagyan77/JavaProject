package Lesson_1_Primitive_Data_Types;

public class PrimitiveOperationsWithVariables {
    public static void main(String[] args) {
        System.out.println("Lesson2");

        int a = 8, b = 4;
        int c = a + b;
        System.out.println(c);
        c = a - b;
        System.out.println(c);
        System.out.println(a*b);

        int x = 7, y = 5;
        System.out.println(x / y);
        System.out.println(x % y);


        double t = 7.0, p = 5.0;
        System.out.println(t/p);

        int z = 5;
        z++;
        System.out.println(z);
        z = z +1;
        System.out.println(z);
        System.out.println(z++);
        System.out.println(z);


        int k = 3;
        int h = 4;
        int v = k++ - --h;
        System.out.println("k = " + k);
        System.out.println("h = " + h);
        System.out.println("v = " + v);


        int e = 7;
        int r = 8;
        int g = ++e + r--;//8 + 8 = 16, x = 8, y = 7
        System.out.println(e++);//print 8, x = 9
        System.out.println(g);//16
        System.out.println(e);//9
        System.out.println(--r);//r = 6, 6
        System.out.println(r);

        boolean bb = e == 9;
        System.out.println(bb);
        System.out.println(e != 9);
        System.out.println(e > 5);
        System.out.println(e <= 55);



        x = 4;
        System.out.println(x % 2 == 0);


        System.out.println(x >= 1 && x <= 9);
        boolean mianish = x >= 1 && x <=9;

        boolean vv = x < 0 || x > 100;

        vv = true;
        System.out.println(!vv);












    }
}
