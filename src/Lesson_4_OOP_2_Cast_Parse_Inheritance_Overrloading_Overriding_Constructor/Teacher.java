package Lesson_4_OOP_2_Cast_Parse_Inheritance_Overrloading_Overriding_Constructor;

public class Teacher extends Human{
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Salary " + salary);
    }
}
