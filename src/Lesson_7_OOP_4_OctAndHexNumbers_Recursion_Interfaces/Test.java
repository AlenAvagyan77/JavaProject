package Lesson_7_OOP_4_OctAndHexNumbers_Recursion_Interfaces;

public class Test {
    public static void main(String[] args) {

        int a = 0113;//erb drvac e 0 ayn 8-akan hamakargi tiv e
        System.out.println(a);
        int b = 0x4F;//erb drvac e 0x ayn 16-akan hamakargi tiv e


        //Ayn erevuyt@ vori jamanak funktion@ inqn ira mej iqn iren kanchum e kochvum e RECURSION
        //5! = 1*2*3*4*5
        //^
        //5!(5-i factoriali syntax)
        System.out.println(fact(9));
        System.out.println(factR(9));
        System.out.println(fib(7));

        JavaProgrammer j = new JavaProgrammer();
        System.out.println(Programmer.COUNTRY);
    }

    //1 1 2 3 5 8 13 21 34
    public static int fib(int n){
        if (n == 1 || n == 2)
            return 1;
        return fib(n - 1) + fib(n-2);
    }

    //fib(5) = fib(4) + fib(3)
    //fib(5) = fib(3) + fib(2) = 2 + 1 = 3
    //fib(5) = fib(2) + fib(1) = 1 + 1 = 2

    public static int factR(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factR(n-1);
    }
    //factR(5) = 5 * factR(4) = 5 * 4 * factR(R) = 5*4*3*fact(R)
    //= 5*4*3*2factR(1) = 5*4*3*2*1


        public static int fact ( int n){
            int r = 1;
            for (int i = 1; i <= n; i++) {
                r = r * i;
            }
            return r;

    }
}

