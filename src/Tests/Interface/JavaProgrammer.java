package Tests.Interface;

public class JavaProgrammer implements Programmer{
    @Override
    public void writeCode() {
        System.out.println("Writing java code ");

    }

    @Override
    public void review() {
        System.out.println("Reviewing java code");

    }

    @Override
    public void languages(String lName) {
        System.out.println("Java, C++" + lName);

    }

    @Override
    public void show() {
        System.out.println("Using default method from interface for JavaProgrammer");
    }
}
