package Lesson_9_Final_Keyword_Inner_Class.Final_Keyword;

public  class Human {
    private  String name;
    private final int year;

    public Human(int year) {
        this.year = year;
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

    public final void f(){
        System.out.println("Hello");
    }
}
