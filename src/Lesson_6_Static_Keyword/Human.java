package Lesson_6_Static_Keyword;

public class Human {
    public String name;
    public  int year;

    public static int count = 0;
    public Human(){
        count++;
        System.out.println("Hello");
    }

    static int a;
    public static int b;

    static {
        a = 45;
        System.out.println("Value of a is set to 45");
        b = 15;

    }



}



