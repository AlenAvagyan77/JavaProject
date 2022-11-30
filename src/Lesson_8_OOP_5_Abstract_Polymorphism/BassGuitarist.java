package Lesson_8_OOP_5_Abstract_Polymorphism;

public class BassGuitarist extends Guitarist{
    @Override
    public void playMusic() {
        System.out.println("Playing bass guitar");
    }
    public void bass(){
        System.out.println("Bass");
    }
}
