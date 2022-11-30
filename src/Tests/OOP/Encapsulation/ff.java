package Tests.OOP.Encapsulation;

//abstract parent class
abstract class Animal {
    //abstract method
    public abstract void sound();

    public abstract void color();
}

//Dog class extends Animal class
class Cat extends Animal {


    @Override
    public void sound() {
        System.out.println("Miyau");

    }

    @Override
    public void color() {
        System.out.println("Black");

    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Woof");
    }

    public void color() {
        System.out.println("White");

    }

    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
        obj.color();
        Animal obj1 = new Cat();
        obj1.sound();
        obj1.color();

    }
}
