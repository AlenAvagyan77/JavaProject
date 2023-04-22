package Tests.Interface;

public interface Programmer {
    String COUNTRY = "ARMENIA";
    void writeCode();
    void rewiev();
    void languages(String lName);
    default void show() {
        System.out.println("Called a default method for an interface");
    }
    static void display() {
        System.out.println("Called a static method for an interface");
    }
}
