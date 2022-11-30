package Lesson_8_OOP_5_Abstract_Polymorphism;

public class Pianist implements Musician{
    @Override
    public void playMusic() {
        System.out.println("Playing Piano");
    }

    @Override
    public void readNotes(String notes) {
        System.out.println("Reading piano notes");

    }
}
