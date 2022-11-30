package Tests.OOP.Poliymorphism;

import Tests.Human;

public class Polymorphism {

    public static void main(String[] args) {

        Polymorphism p = new Polymorphism();
        p.sumOfClass(10,20);
        p.sumOfClass("Alen", " Avagian");
//        Human h = new Human();
//        h.setBornYear(2003);
//        h.setFirstName("Alen");
//        h.setLastName("Avagyan");
//        System.out.println("My first name is " + h.getFirstName() + "\n My Last name is " + h.getLastName() + "\n My born year is a " + h.getBornYear());




    }
    void sumOfClass(int x, int b){
        System.out.println("Sum of numbers is a " + (x + b));
    }

    void sumOfClass(String s1, String s2){
        System.out.println("String is a " + (s1 + s2));
    }
}
