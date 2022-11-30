package Lesson_4_OOP_2_Cast_Parse_Inheritance_Overrloading_Overriding_Constructor;

public class Human {
    private String name;
    private int year;
    private String Phone;


    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printInfo(){
        System.out.println("Name " + name);
        System.out.println("Year " + year);
        System.out.println("Phone " + Phone);


    }
}
