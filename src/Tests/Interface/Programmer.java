package Tests.Interface;

public interface Programmer {
    String COUNTRY = "ARMENIA";
    void writeCode();
    void rewiev();
    void languages(String lName);
    default void show() {
        System.out.println("In Java 8- default method - DefaultStaticExampleInterface");
    }
    static void display() {
        System.out.println("In DefaultStaticExampleInterface I");
    }
}
