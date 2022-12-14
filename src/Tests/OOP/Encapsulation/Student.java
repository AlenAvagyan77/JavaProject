package Tests.OOP.Encapsulation;

public class Student {
    private String name;
    private int age;
    private  int mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (isCorrectName(name))
            this.name = name;
        else
            System.out.println("Invalid name");
    }
    private boolean isCorrectName(String name){
        return name.matches("[A-Z][a-z]");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

}
