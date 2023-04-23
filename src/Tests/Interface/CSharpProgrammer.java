package Tests.Interface;

public class CSharpProgrammer implements Programmer{
    @Override
    public void writeCode() {
        System.out.println("Writing CSharp code ");

    }

    @Override
    public void rewiev() {
        System.out.println("Reviewing CSharp code");

    }

    @Override
    public void languages(String lName) {
        System.out.println("CSharp, C++" + lName);

    }

    @Override
    public void show() {
        System.out.println("Using default method from interface for CSharpProgrammer ");
    }
}
