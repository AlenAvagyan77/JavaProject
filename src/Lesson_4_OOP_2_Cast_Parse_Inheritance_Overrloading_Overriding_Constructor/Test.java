package Lesson_4_OOP_2_Cast_Parse_Inheritance_Overrloading_Overriding_Constructor;

public class Test {
    public static void main(String[] args) {

        byte x = 4;
        int a = -129;
        x = (byte) a;
        System.out.println(x);

        x = 4;
        x = (byte) (x + 1);
        System.out.println(x);

        x++;
        System.out.println(x);

        x += 5;
        System.out.println(x);

        x = 1;
        System.out.println(x + 5 + " " + "Java");
        System.out.println("Hello " + x + 5 + " Java");
        System.out.println("Hello " + (x + 5) + " Java");

        String s = "7";
        int z = Integer.parseInt(s);
        System.out.println(z + 1);

        String str = "4.8";
        double w = Double.parseDouble(str);
        System.out.println(w + 1.3);


        Student s1 = new Student();
        s1.setAge(18);
        s1.setName("Alen");

        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println(s2.getName());
        System.out.println(s3.getName());

        Student s4 = new Student("Alen");
        System.out.println(s4.getName());

        Student s5 = new Student("Alen", 18);
        System.out.println(s5.getName() + " " + s5.getAge());

        Car car = new Car("88 WW 811");
        System.out.println("My car number is " + car.getNumber());
        Car car1 = new Car();

        s1.sum(5,5);
        s1.sum(10,10,10);
        s1.f(4);
        s1.f(4L);
        s1.f(4, "Alen");

        Teacher t1 = new Teacher();
        t1.setName("Hayk");
        t1.setYear(2000);
        t1.setSalary(1000);
        t1.setPhone("043444255");

        Administrator a1 = new Administrator();
        a1.setName("Anna");
        a1.setDepartment("Music");
        a1.setYear(1999);
        a1.setPhone("043444255");

        t1.printInfo();
        a1.printInfo();

































































    }
}
