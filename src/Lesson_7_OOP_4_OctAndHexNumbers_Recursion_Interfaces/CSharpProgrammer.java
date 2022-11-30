package Lesson_7_OOP_4_OctAndHexNumbers_Recursion_Interfaces;

public class CSharpProgrammer implements Programmer{

    @Override
    public void writeCode(String requirement) {
        System.out.println("CSharp writing code " + requirement);

    }

    @Override
    public String languages() {
        return "CSharp, Python";
    }

    @Override
    public void readCode() {
        System.out.println("reading CSharp and Python code");

    }

    @Override
    public void speakEnglish() {

    }

    @Override
    public void f() {

    }
}
