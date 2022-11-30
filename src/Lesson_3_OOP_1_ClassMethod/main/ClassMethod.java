package Lesson_3_OOP_1_ClassMethod.main;

import Lesson_3_OOP_1_ClassMethod.model.Car;
import Lesson_3_OOP_1_ClassMethod.model.Human;

public class ClassMethod {
    public static void main(String[] args) {
      Human human1 = new Human();
      human1.firstName = "Aram";
      human1.lastName = "Aramyan";
      human1.gender = 'm';
      human1.isArmenia = true;
      human1.year = 2000;



      Human human2 = new Human();
      human2.firstName = "Anna";
      human2.lastName = "Grigoryan";
      human2.gender = 'f';
      human2.isArmenia = true;
      human2.year = 2002;

      System.out.println(human1.firstName + " " + human1.lastName);

      if (human1.year < human2.year)
          System.out.println(human1.firstName);
      else
          System.out.println(human2.firstName);

        System.out.println(human1.year < human2.year ? human1.firstName : human2.firstName);

        Car car1 = new Car();
//        car1.model = "BMW";
          car1.setYear(2020);

        System.out.println(car1.getEngine());
        System.out.println(car1.getModel());

        Human h = new Human();
        h.firstName = "Ani";
        System.out.println(h.firstName);

        h.sayHello();
        human2.sayHello();
//      System.out.println(human1.firstName + " " + human1.lastName);
//      System.out.println(human2.firstName + " " + human2.lastName);
//      System.out.println(h.firstName + " " + h.lastName);


      human1.printFullName();
      human1.printFullName();
      h.printFullName();

      String s = human1.fullName();
      System.out.println("Full name of human1 is " + s);


      human1.sum(4,6);

      human1.print1toN(5);
      human1.print1toN(15);

      Car car = new Car();
//      car.engine = -8.8;
      car.setEngine(-8.8);
      System.out.println(car.getEngine());

      car.setModel("Jeep");
      car.setEngine(5.5);
      car.setYear(2020);
      System.out.println(car.getModel() + ", " + car.getYear());

      Car car2 = new Car();
      car2.setModel("BMW");
      car2.setEngine(3.2);

      String text = "Hello from OOP";
      System.out.println(text.length());
      System.out.println(text.charAt(0));

      for (int i = 0; i < text.length(); i++) { // text.length
        System.out.print(text.charAt(i));//text[i]
      }

      System.out.println("\n--------------------------------------");

      int countOfS= 0;
      for (int i = 0; i < text.length(); i++) {
        if (text.charAt(i) == 'l')
          countOfS++;
      }
      System.out.println(countOfS);


      System.out.println(text.toUpperCase());
      System.out.println(text.toLowerCase());
      String z = text.toUpperCase();
      System.out.println(z);



























































    }
}
