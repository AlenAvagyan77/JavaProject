package Tests.OOP.Abstraction;

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
