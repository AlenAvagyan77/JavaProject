package Lesson_8_OOP_5_Abstract_Polymorphism;

public abstract class Guitarist implements Musician{
    @Override
    public void readNotes(String notes) {
        System.out.println("Reading guitar notes ");

    }
}
