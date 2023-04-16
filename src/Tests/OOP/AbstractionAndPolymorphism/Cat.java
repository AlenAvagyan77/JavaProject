package Tests.OOP.AbstractionAndPolymorphism;

public class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("Miyauaaaa");
    }

    @Override
    void color() {
        System.out.println("Black");

    }
}
