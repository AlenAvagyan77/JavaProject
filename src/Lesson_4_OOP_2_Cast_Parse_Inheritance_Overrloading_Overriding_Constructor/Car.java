package Lesson_4_OOP_2_Cast_Parse_Inheritance_Overrloading_Overriding_Constructor;

public class Car {
    private String number;
    private int year;

    public Car(){

    }
    public Car(String number){
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
