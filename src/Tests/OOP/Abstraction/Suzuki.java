package Tests.OOP.Abstraction;

public class Suzuki extends Car {
    public static void main(String[] args) {
        Car obj = new Suzuki();
        obj.accelerate();

    }

    @Override
    void accelerate() {

    }
}
