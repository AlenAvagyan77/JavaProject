package Tests.Interface;

public class Test {
    public static void main(String[] args) {
        JavaProgrammer jp = new JavaProgrammer();
        jp.languages(", JavaScript");
        jp.review();
        jp.writeCode();
        jp.show();
        // The static method is bound in the interface and can call only class dot name.
        Programmer.display();
        System.out.println(Programmer.COUNTRY);
        System.out.println("---------------");
        CSharpProgrammer cSharpProgrammer = new CSharpProgrammer();
        cSharpProgrammer.writeCode();
        cSharpProgrammer.review();
        cSharpProgrammer.languages(", Node.JS");
        jp.show();
        Programmer.display();

    }
}
