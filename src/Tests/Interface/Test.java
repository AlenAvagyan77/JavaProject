package Tests.Interface;

public class Test {
    public static void main(String[] args) {
        JavaProgrammer jp = new JavaProgrammer();
        jp.languages(", JavaScript");
        jp.review();
        jp.writeCode();
        jp.interests("Fishing");
        System.out.println(Programmer.COUNTRY);
        System.out.println("---------------");
        CSharpProgrammer cSharpProgrammer = new CSharpProgrammer();
        cSharpProgrammer.writeCode();
        cSharpProgrammer.review();
        cSharpProgrammer.languages(", Node.JS");

    }
}
