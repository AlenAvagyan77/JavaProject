package Lesson_1_Primitive_Data_Types;

public class PrimitiveDataTypes1 {
    public static void main(String[] args) {
        System.out.println("Lesson1");
        // Primitive Data Types

        byte a = 127; //maximum 8 Bit
        byte b = -128;//minimum
        System.out.println(a);
        System.out.println(b);

        short c = 32767;//maximum 16 Bit
        short d = -32768;//minimum
        System.out.println(c);
        System.out.println(d);

        int e = -2147483648;//maximum 32 Bit
        int f = 2147483647;//minimum
        System.out.println(e);
        System.out.println(f);

        long k = -9223372036854775808L;//minimum 64 Bit
        long j = 9223372036854775807L;//maximum
        System.out.println(k);
        System.out.println(j);

        float m = 1.40239846f; // 32 Bit
        System.out.println(m);

        double l = 4.9406564584124654;//maximum 64 Bit [can be positive and negative]
        double q = 1.456789012345678;//minimum
        System.out.println(l);
        System.out.println(q);

        boolean v = true;
        boolean p = false;
        System.out.println(v);
        System.out.println(p);

        char t = '$';
        System.out.println(t);
        char tt = '\u003F';
        System.out.println(tt);

        String firstname = "Alen";
        String lastname = "Avagyan";
        System.out.println(firstname + " " + lastname);

        int w = 77;
        System.out.println("w = " + w);


        int num = 10;
        System.out.println(" Սա թիվ է : " + num);
        num = num * 2;
        System.out.print("num * 2 փոփոխականի արժեքը ");
        System.out.println(num);

        System.out.println("1----------------------");

        int x = 10;
        int y = 10;
        for (int i = 0; i < x; i++) {
            System.out.println("Value of x: " + i);
            System.out.println("Value of y: " + y);
            y--;

        }

        System.out.println();


    }
}
