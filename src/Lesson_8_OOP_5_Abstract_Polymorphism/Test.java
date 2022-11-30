package Lesson_8_OOP_5_Abstract_Polymorphism;

public class Test {
    public static void main(String[] args) {
        Human h = new Human();
        h.setName("dasd");
        System.out.println(h.getName());
        Pianist p = new Pianist();
        p.playMusic();
        BassGuitarist b = new BassGuitarist();
        b.playMusic();
        ClassicalGuitarist cg = new ClassicalGuitarist();
        cg.playMusic();

        Guitarist g = new BassGuitarist();
        g.playMusic();
        b.bass();
        g = new ClassicalGuitarist();
        g.playMusic();

        f(new ClassicalGuitarist());
        f(new BassGuitarist());
        f(cg);
        System.out.println("-------------------------------");
        play(new Guitarist[]{new BassGuitarist(), new ClassicalGuitarist(), new BassGuitarist()});
        h(new Human());
        h(new Student());
        p(new Pianist());
        p(new BassGuitarist());
        p(new ClassicalGuitarist());

        Student s = new Student();
        s.sum(5,5);
        s.sum(5,5,5);





    }

    static void play(Guitarist[] guitarists) {
        for (Guitarist g : guitarists) {
            g.playMusic();
            if (g instanceof BassGuitarist) {
                BassGuitarist bg = (BassGuitarist) g;
                bg.bass();
            }
        }
    }

    static void f (Guitarist c){
        c.playMusic();

    }

    private static void h(Human h) {
    }

    static void p(Musician m){
        m.playMusic();

    }

}