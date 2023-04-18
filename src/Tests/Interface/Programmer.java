package Tests.Interface;

public interface Programmer {
    String COUNTRY = "ARMENIA";
    void writeCode();
    void review();
    void languages(String lName);
    default void interests(String interests) {
        System.out.println("I am interests by " + interests);
    }
}
