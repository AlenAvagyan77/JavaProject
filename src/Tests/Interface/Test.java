package Tests.Interface;

public class Test {
    public static void main(String[] args) {
        JavaProgrammer jp = new JavaProgrammer();
        jp.languages(", JavaScript");
        jp.rewiev();
        jp.writeCode();
        System.out.println("---------------");
        CSharpProgrammer cSharpProgrammer = new CSharpProgrammer();
        cSharpProgrammer.writeCode();
        cSharpProgrammer.rewiev();
        cSharpProgrammer.languages(", Node.JS");

    }
}
