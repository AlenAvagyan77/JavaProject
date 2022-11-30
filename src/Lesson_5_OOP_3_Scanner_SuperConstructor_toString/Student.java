package Lesson_5_OOP_3_Scanner_SuperConstructor_toString;

public class Student extends Human{
    private double mark;

    public Student(String name) {
        super(name);
    }


    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
