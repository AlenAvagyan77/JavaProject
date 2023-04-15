package Tests.OOP.Abstraction;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.sound();
        animal.color();
        animal = new Dog();
        animal.color();
        animal.sound();
    }
}
