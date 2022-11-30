package Lesson_6_Static_Keyword;

public class Test {
    public static void main(String[] args) {
        new Human();
        System.out.println(Human.count);
        System.out.println(Human.a);
        Student s1 = new Student("Alen");
        s1.sum(5,5);
        Student s2 = new Student("Haik");
        s2.sum(5,5);

        Student.sum(5,5);

        String s = "7";
        int a = Integer.parseInt(s);
        System.out.println(a + 1);
        char c = '2';
        System.out.println(Character.isLetter(c));


        System.out.println("--------------------");
        String pass = "asd as4546 adsf";
        int count = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isLowerCase(pass.charAt(i))){
                count++;
            }
        }
        System.out.println(count);

        System.out.println(Integer.MAX_VALUE);
    }
}
