package Tests.OOP.AbstractionAndPolymorphism;

public class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Waf");

    }

    @Override
    void color() {
        System.out.println("White");
    }
}
