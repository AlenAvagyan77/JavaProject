package Lesson_8_OOP_5_Abstract_Polymorphism;

public class  Student extends Human{
    public void sum(int x, int y){
        System.out.println(x + y);
    }
    public void sum(int x, int y, int z){
        System.out.println(x + y + z);
    }

}
